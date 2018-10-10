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
            String newJdbcUrl = getJdbcUrlBySSH(jdbcUrl, 3306);
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

    @Value("${ssh.host}")
    String sshHost;
    @Value("${ssh.port}")
    int sshPort;
    @Value("${ssh.usr}")
    String sshUsr;
    @Value("${ssh.pwd}")
    String sshPwd;

    public String getJdbcUrlBySSH(String url, int defaultPort) {
        log.info("oldUrl:" + url);
        // jdbcUrl=jdbc:mysql://10.172.216.113:3306/db_calculator?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false&maxReconnects=10
        // jdbcUrl=jdbc:mysql://127.0.0.1:3307/db_calculator?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false&maxReconnects=10
/*
        String sshHost = "fortress.edianzu.cn";
        int sshPort = 22;
        String sshUsr = "zouyijiang";
        String sshPwd = "JPumpBicG9lUlZq8";
*/
        String hostAndIp = NetUtil.getHostAndIpFromUrl(url);
        String[] hostAndIpArr = hostAndIp.split(":");
        assert hostAndIpArr.length > 0;
        String remoteHost = hostAndIpArr[0];
        int remotePort = hostAndIpArr.length > 1 ? Integer.valueOf(hostAndIpArr[1]) : defaultPort;

        int localPort = NetUtil.findAvailableLocalPort();
        assert localPort != -1;
        try {
            NetUtil.connectBySSH(localPort, remoteHost, remotePort, sshHost, sshPort, sshUsr, sshPwd);
        } catch (Exception e) {
            throw new RuntimeException("connectBySSH", e);
        }
        String newUrl = url.replaceFirst(hostAndIp, "127.0.0.1" + ":" + localPort);
        log.info("newUrl:" + newUrl);
        return newUrl;
    }
}
