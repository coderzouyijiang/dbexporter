package cn.zyj.dbexporter;

import cn.zyj.dbexporter.jooq.db_calculator.tables.TCalculator;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TResource;
import cn.zyj.dbexporter.jooq.db_calculator.tables.records.TCalculatorRecord;
import cn.zyj.dbexporter.service.ExportService;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 修改t_calculator生产数据
 * inner
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DbexporterApplication.class})
public class ModifyProdEnvData {

    @Autowired
    DSLContext dsl;

    @Autowired
    ExportService exportService;

    /*
        select r.*,c.* from t_resource r,t_calculator c
        where r.sku=c.sku
        and r.data_status=0
        and c.data_status=0 and c.is_history=0 and c.is_valid=0
        and ( r.product_type!=c.product_type
                or r.quality!=c.quality or r.brand!=c.brand or r.model!=c.model or r.service_standard!=c.service_standard or r.os!=c.os
                or r.core_config!=c.core_config or r.uncore_config!=c.uncore_config or r.cpu_type!=c.cpu_type or r.cpu_model!=c.cpu_model
                or r.ram!=c.ram or r.hd1!=c.hd1 or r.gpu!=c.gpu or r.screen_size!=c.screen_size or r.resolution!=c.resolution or r.offer_validity!=c.offer_validity)
        */
    @Test
    public void exportDiff_calculator_resource() {
        TCalculator cal = new TCalculator("cal");
        TResource res = new TResource("res");

        Map<Field, Condition> conditions = new LinkedHashMap<>();
        Map<String, ? extends Field<?>> resFieldmap = Arrays.stream(res.fields())
                .collect(Collectors.toMap(f -> f.getName(), f -> f));
        // 除了这些以外的字段都要同步
//        List<Field> excludeFields = Arrays.asList(cal.ID, cal.SKU, cal.RENT_OR_SALE, cal.DATA_STATUS,
//                cal.OFFER_VALIDITY, cal.CREATER_ID, cal.CREATER_NAME, cal.CDATE, cal.MDATE);
        List<? extends TableField<TCalculatorRecord, ? extends Serializable>> fields = Arrays.asList(
                cal.PRODUCT_TYPE, cal.RESOURCE_TYPE, cal.QUALITY, cal.BRAND, cal.MODEL, cal.SERVICE_STANDARD,
                cal.CORE_CONFIG, cal.UNCORE_CONFIG,
                cal.PURCHASE_PRICE, cal.DEPOSIT,
                cal.OS, cal.CPU_TYPE, cal.CPU_MODEL, cal.GPU, cal.RAM, cal.HD1, cal.HD2,
                cal.SCREEN_SIZE, cal.RESOLUTION);
        for (Field calField : cal.fields()) {
            if (!fields.contains(calField)) continue;
            Field<?> resField = resFieldmap.get(calField.getName());
            if (resField == null) continue;
            conditions.put(calField, calField.notEqual(resField));
        }

        List<Record3<String, String, Integer>> records = new LinkedList<>();
        for (Map.Entry<Field, Condition> conditionEntry : conditions.entrySet()) {

            Field<String> nameField = DSL.value(conditionEntry.getKey().getName()).as("name");
            Field<String> descField = DSL.value(conditionEntry.getKey().getComment()).as("desc");
            Field<Integer> numField = DSL.count(cal.ID).as("num");

            Record3<String, String, Integer> record = dsl
                    .select(nameField, descField, numField)
                    .from(cal)
                    .join(res)
                    .on(res.DATA_STATUS.eq(0)
                            .and(res.SKU.eq(cal.SKU)))
                    .where(cal.DATA_STATUS.eq(0)
                            .and(cal.IS_HISTORY.eq(0))
                            .and(conditionEntry.getValue())
                    )
                    .fetchOne();
            records.add(record);
            log.info("比较 " + record.component1() + " : " + record.component2());
        }
        Field<String> nameField = DSL.value("").as("name");
        Field<String> descField = DSL.value("").as("name");
        Field<Integer> numField = DSL.value(0).as("num");
        HSSFWorkbook excel = exportService.createExcel(Arrays.asList(nameField, descField, numField), records);
        try (FileOutputStream fos = new FileOutputStream("/Users/zouyijiang/data/同SKU的报价单与资源字段比较.xls")) {
            excel.write(fos);
        } catch (IOException e) {
            log.error("", e);
        }
    }

    @Test
    public void exportDiff_purchaserice() {

        TCalculator cal = new TCalculator("cal");
        TResource res = new TResource("res");

//        List<? extends TableField<TCalculatorRecord, ? extends Serializable>> fields = Arrays.asList(
//                cal.PRODUCT_TYPE, cal.RESOURCE_TYPE, cal.QUALITY, cal.BRAND, cal.MODEL, cal.SERVICE_STANDARD,
//                cal.CORE_CONFIG, cal.UNCORE_CONFIG,
//                cal.PURCHASE_PRICE, cal.DEPOSIT,
//                cal.OS, cal.CPU_TYPE, cal.CPU_MODEL, cal.GPU, cal.RAM, cal.HD1, cal.HD2,
//                cal.SCREEN_SIZE, cal.RESOLUTION);

        Field[] fields = new Field[]{
                cal.ID, cal.SKU, cal.CDATE, cal.MDATE, cal.PURCHASE_PRICE,
                res.PURCHASE_PRICE, res.ID, res.CDATE, res.MDATE
        };
        Result<Record> result = dsl
                .select(fields)
                .from(cal)
                .join(res)
                .on(res.DATA_STATUS.eq(0)
                        .and(res.SKU.eq(cal.SKU)))
                .where(cal.DATA_STATUS.eq(0)
                        .and(cal.IS_HISTORY.eq(0))
                        .and(cal.PURCHASE_PRICE.notEqual(res.PURCHASE_PRICE))
                ).fetch();
        HSSFWorkbook excel = exportService.createExcel(Arrays.asList(fields), result);
        try (FileOutputStream fos = new FileOutputStream("/Users/zouyijiang/data/同SKU的报价单与资源字段比较-采购价不同.xls")) {
            excel.write(fos);
        } catch (IOException e) {
            log.error("", e);
        }
    }

//    @Test
    public void debug_online() {

        TCalculator cal = new TCalculator("cal");
        TResource res = new TResource("res");

        Map<String, ? extends Field<?>> resFieldmap = Arrays.stream(res.fields())
                .collect(Collectors.toMap(f -> f.getName(), f -> f));

        List<? extends TableField<TCalculatorRecord, ? extends Serializable>> fields = Arrays.asList(
                cal.PRODUCT_TYPE, cal.RESOURCE_TYPE, cal.QUALITY, cal.BRAND, cal.MODEL, cal.SERVICE_STANDARD,
                cal.CORE_CONFIG, cal.UNCORE_CONFIG,
                cal.PURCHASE_PRICE, cal.DEPOSIT,
                cal.OS, cal.CPU_TYPE, cal.CPU_MODEL, cal.GPU, cal.RAM, cal.HD1, cal.HD2,
                cal.SCREEN_SIZE, cal.RESOLUTION);

        UpdateConditionStep<TCalculatorRecord> step = dsl
                .update(cal)
                .set(cal.PRODUCT_TYPE, res.PRODUCT_TYPE)
                .set(cal.RESOURCE_TYPE, res.RESOURCE_TYPE)
                .set(cal.QUALITY, res.QUALITY)
                .set(cal.BRAND, res.BRAND)
                .set(cal.MODEL, res.MODEL)
                .set(cal.SERVICE_STANDARD, res.SERVICE_STANDARD)
                .set(cal.CORE_CONFIG, res.CORE_CONFIG)
                .set(cal.UNCORE_CONFIG, res.UNCORE_CONFIG)
                .set(cal.PURCHASE_PRICE, res.PURCHASE_PRICE)
                .set(cal.DEPOSIT, res.DEPOSIT)
                .set(cal.OS, res.OS)
                .set(cal.CPU_TYPE, res.CPU_TYPE)
                .set(cal.CPU_MODEL, res.CPU_MODEL)
                .set(cal.GPU, res.GPU)
                .set(cal.RAM, res.RAM)
                .set(cal.HD1, res.HD1)
                .set(cal.HD2, res.HD2)
                .set(cal.SCREEN_SIZE, res.SCREEN_SIZE)
                .set(cal.RESOLUTION, res.RESOLUTION)
                .from(res)
                .where(cal.SKU.eq(res.SKU)
                        .and(cal.DATA_STATUS.eq(0))
                        .and(cal.IS_HISTORY.eq(0))
                        .and(res.DATA_STATUS.eq(0))
                );
        String sql = step.getSQL();
        log.info("sql:" + sql);
//        int execute = step.execute();
//        log.info("execute:" + execute);
    }

}
