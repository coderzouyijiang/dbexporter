package cn.zyj.dbexporter.config;

import cn.zyj.dbexporter.util.NetUtil;
import cn.zyj.dbexporter.SqlExcuteListener;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.annotation.Resources;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 配置数据源与事务
 */
@Configuration
@Slf4j
public class DbConfig {

    @Value("${hikari.profile:}")
    String hikariProfile;

    @Bean
    Properties hikariConfig(@Autowired ApplicationContext context,
                            @Autowired(required = false) JschHolder jschHolder) throws IOException {
        Properties prop = new Properties();
        String postFix = hikariProfile.trim().isEmpty() ? "" : ("-" + hikariProfile);
        String filePath = String.format("classpath:db/hikari%s.properties", postFix);
        log.info("hikariConfigFileName:" + filePath);
        Resource resource = context.getResource(filePath);
        prop.load(resource.getInputStream());

        // 连接本地以外的数据库，都使用ssh
        if (jschHolder != null) {
            String jdbcUrl = prop.getProperty("jdbcUrl");
//            根据jdbcUrl获取数据库ip和port，生成通过跳板机ssh连接数据库的jdbcUrl
            String hostAndIp = NetUtil.getHostAndIpFromUrl(jdbcUrl);
            String[] hostAndIpArr = hostAndIp.split(":");
            assert hostAndIpArr.length > 0;
            String remoteHost = hostAndIpArr[0];
            int remotePort = hostAndIpArr.length > 1 ? Integer.valueOf(hostAndIpArr[1]) : 3306;
            int localPort = jschHolder.createForwardingPort(remoteHost, remotePort);
            String newJdbcUrl = jdbcUrl.replaceFirst(hostAndIp, "127.0.0.1" + ":" + localPort);
            log.info("newJdbcUrl:" + newJdbcUrl);
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
    DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource) {
        DataSourceTransactionManager manager = new DataSourceTransactionManager();
        manager.setDataSource(dataSource);
        return manager;
    }

}
