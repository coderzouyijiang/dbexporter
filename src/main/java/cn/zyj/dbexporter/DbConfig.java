package cn.zyj.dbexporter;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.ExecuteContext;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultExecuteListener;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Properties;

@Configuration
@Slf4j
public class DbConfig {

    @Value("${hikari.profile:}")
    String hikariProfile;

    @Value("${hikari.use-ssh:false}")
    Boolean hikariUseSSH;

    @Bean("hikariConfig")
    Properties hikariConfig() throws IOException {
        Properties prop = new Properties();
        String postFix = hikariProfile.trim().isEmpty() ? "" : ("-" + hikariProfile);
        String fileName = String.format("hikari%s.properties", postFix);
        log.info("hikariConfigFileName:" + fileName);
        InputStream inputStream = DbConfig.class.getClassLoader().getResourceAsStream(fileName);
        prop.load(inputStream);
        // 连接本地以外的数据库，都使用ssh
        if (hikariUseSSH != null && hikariUseSSH) {
            String jdbcUrl = prop.getProperty("jdbcUrl");
            String newJdbcUrl = NetUtil.getJdbcUrlBySSH(jdbcUrl, 3306);
            prop.setProperty("jdbcUrl", newJdbcUrl);
        }
        return prop;
    }

    @Bean
    DataSource dataSource(@Qualifier("hikariConfig") Properties prop) {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName(prop.getProperty("driverClassName"));
        config.setJdbcUrl(prop.getProperty("jdbcUrl"));
        config.setUsername(prop.getProperty("username"));
        config.setPassword(prop.getProperty("password"));
//        config.setDataSourceClassName(prop.getProperty("dataSourceClassName"));

        config.setAutoCommit(true);
        config.setConnectionTimeout(1000 * 30);
        config.setIdleTimeout(1000 * 60 * 30);

        HikariDataSource dataSource = new HikariDataSource(config);
        return dataSource;
    }

    @Bean
    DSLContext dsl(@Qualifier("dataSource") DataSource dataSource, @Autowired SqlExcuteListener listener) {
        Settings settings = new Settings();
        DefaultConfiguration dslConfig = new DefaultConfiguration();
        dslConfig.set(dataSource)
                .set(SQLDialect.MYSQL_5_7)
                .set(settings);
        dslConfig.set(new DefaultExecuteListenerProvider(listener));
        DSLContext dsl = DSL.using(dslConfig);
        return dsl;
    }

}
