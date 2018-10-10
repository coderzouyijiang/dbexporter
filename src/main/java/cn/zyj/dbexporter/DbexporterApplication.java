package cn.zyj.dbexporter;

import cn.zyj.dbexporter.constant.TableFieldInfo;
import cn.zyj.dbexporter.constant.TableFieldInfos;
import cn.zyj.dbexporter.constant.ToTextPurpose;
import cn.zyj.dbexporter.jooq.tables.records.TResourceRecord;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.jooq.*;
import org.jooq.types.UByte;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.*;
import java.sql.Timestamp;
import java.util.*;
import java.util.stream.Collectors;

import static cn.zyj.dbexporter.jooq.Tables.*;

@Slf4j
@SpringBootApplication
public class DbexporterApplication {

    public static void main(String[] args) throws Throwable {
        ConfigurableApplicationContext ctx = SpringApplication.run(DbexporterApplication.class, args);
    }



    }