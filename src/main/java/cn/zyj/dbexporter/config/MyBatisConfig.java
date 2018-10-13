package cn.zyj.dbexporter.config;

import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.apache.ibatis.logging.slf4j.Slf4jImpl;
import org.apache.ibatis.session.AutoMappingUnknownColumnBehavior;
import org.apache.ibatis.session.ExecutorType;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class MyBatisConfig {

    @Bean
    SqlSessionFactoryBean sqlSessionFactory(@Autowired ApplicationContext context,
                                            @Qualifier("dataSource") DataSource dataSource) throws IOException {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        // classpath 加载一个资源； classpath* 同时加载多个资源
        Resource[] resources = context.getResources("classpath*:mapper/**/*.xml");
        bean.setMapperLocations(resources);
        org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration();
//        http://www.mybatis.org/mybatis-3/zh/configuration.html#settings
        config.setMapUnderscoreToCamelCase(true);
        config.setDefaultExecutorType(ExecutorType.REUSE);
        config.setAutoMappingUnknownColumnBehavior(AutoMappingUnknownColumnBehavior.WARNING);
        config.setUseGeneratedKeys(true);
        config.setLogImpl(Slf4jImpl.class);
        bean.setConfiguration(config);
        return bean;
    }

    @Bean
    MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer config = new MapperScannerConfigurer();
        config.setBasePackage("cn.zyj.dbexporter.mybatis.dao");
        config.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return config;
    }


}
