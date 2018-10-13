package cn.zyj.dbexporter.config;

import cn.zyj.dbexporter.util.NetUtil;
import cn.zyj.dbexporter.SqlExcuteListener;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Configuration
@Slf4j
public class DbConfig {

    @Value("${hikari.profile:}")
    String hikariProfile;

    @Value("${hikari.use-ssh:false}")
    Boolean hikariUseSSH;

    @Bean
    Properties hikariConfig(@Autowired ApplicationContext context) throws IOException {
        Properties prop = new Properties();
        String postFix = hikariProfile.trim().isEmpty() ? "" : ("-" + hikariProfile);
        String filePath = String.format("classpath:hikari%s.properties", postFix);
        log.info("hikariConfigFileName:" + filePath);
        Resource resource = context.getResource(filePath);
        prop.load(resource.getInputStream());

        // 连接本地以外的数据库，都使用ssh
        if (hikariUseSSH != null && hikariUseSSH) {
            String jdbcUrl = prop.getProperty("jdbcUrl");
            String newJdbcUrl = getJdbcUrlBySSH(sshSession(), jdbcUrl, 3306);
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

    @Bean
    Session sshSession() {
        try {
            JSch jsch = new JSch();
//        ssh zouyijiang@fortress.edianzu.cn
//                JPumpBicG9lUlZq8
            // stage
//        mysql -h10.44.63.143 -umall -p
//        密码：cm1ZwY0MrMZSoUvcowr5
            Session session = jsch.getSession(sshUsr, sshHost, sshPort);
            session.setPassword(sshPwd);

            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect(); //ssh connection established!

            //by security policy, you must connect through a fowarded port
//        int portForwardingL = session.setPortForwardingL(localPort, remoteHost, remotePort);
//        log.info("portForwardingL:{}", portForwardingL);

            return session;
        } catch (JSchException e) {
            throw new RuntimeException("sshSession", e);
        }
    }

//    @Bean
//    Object dubboBridge(){
//        sshSession().setPortForwardingL()
//    }

    public String getJdbcUrlBySSH(Session sshSession, String url, int defaultPort) {
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
//            NetUtil.connectBySSH(localPort, remoteHost, remotePort, sshHost, sshPort, sshUsr, sshPwd);
            int portForwardingL = sshSession.setPortForwardingL(localPort, remoteHost, remotePort);
            log.info("portForwardingL:{}", portForwardingL);
        } catch (Exception e) {
            throw new RuntimeException("getJdbcUrlBySSH", e);
        }
        String newUrl = url.replaceFirst(hostAndIp, "127.0.0.1" + ":" + localPort);
        log.info("newUrl:" + newUrl);
        return newUrl;
    }
}
