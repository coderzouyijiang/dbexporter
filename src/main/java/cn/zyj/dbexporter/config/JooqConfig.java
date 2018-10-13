package cn.zyj.dbexporter.config;

import cn.zyj.dbexporter.SqlExcuteListener;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@Slf4j
public class JooqConfig {

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
