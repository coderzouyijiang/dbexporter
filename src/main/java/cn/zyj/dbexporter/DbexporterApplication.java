package cn.zyj.dbexporter;

import cn.zyj.dbexporter.constant.TableFieldInfo;
import cn.zyj.dbexporter.constant.TableFieldInfos;
import cn.zyj.dbexporter.constant.ToTextPurpose;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.jooq.*;
import org.jooq.types.UByte;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;

import java.io.*;
import java.sql.Timestamp;
import java.util.*;
import java.util.stream.Collectors;


@Slf4j
@Configuration
@SpringBootApplication
public class DbexporterApplication implements InitializingBean {

    public static void main(String[] args) throws Throwable {
        ConfigurableApplicationContext ctx = SpringApplication.run(DbexporterApplication.class, args);
    }

    @Autowired
    public ApplicationContext appContext;

    @Override
    public void afterPropertiesSet() throws Exception {
        Environment env = appContext.getEnvironment();
        log.info("env:" + env);
    }
}