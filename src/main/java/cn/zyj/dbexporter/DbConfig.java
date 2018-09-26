package cn.zyj.dbexporter;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.Value;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Configuration
public class DbConfig{

    @Bean("hikariConfig")
    Properties hikariConfig() throws IOException {
        Properties prop = new Properties();
        InputStream inputStream = DbConfig.class.getClassLoader().getResourceAsStream("hikari.properties");
        prop.load(inputStream);
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
    DSLContext dsl(@Qualifier("dataSource") DataSource dataSource){
        Settings settings = new Settings();
        DSLContext dsl = DSL.using(dataSource, SQLDialect.MYSQL_5_7, settings);
        return dsl;
    }

}
