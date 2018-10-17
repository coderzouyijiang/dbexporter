package cn.zyj.dbexporter;

import cn.zyj.dbexporter.jooq.db_calculator.tables.TCalculator;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TResource;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TSkuRelation;
import cn.zyj.dbexporter.jooq.db_calculator.tables.records.TCalculatorRecord;
import cn.zyj.dbexporter.jooq.db_calculator.tables.records.TResourceRecord;
import cn.zyj.dbexporter.service.ExportService;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.*;

/**
 * 导入导出计算器数据
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DbexporterApplication.class})
public class DbexporterApplicationTests {

    @Autowired
    ExportService exportService;

    @Autowired
    DSLContext dsl;

    @Test
    public void contextLoads() throws IOException {

        String fileName = "/Users/zouyijiang/data/资源池-20181010.xls";
        exportService.exportExcelForTResource(fileName);
    }

    @ToString(of = {"rowIndex", "resourceId", "sku", "rentOrSale"})
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode(of = {"resourceId", "sku", "rentOrSale"})
    @Data
    public static class ResourceDTO {
        private Integer resourceId;
        private String sku;
        private Byte rentOrSale;
        private Row row;
        private int rowIndex;
    }

    @Test
    public void importInitData() throws Throwable {
        TCalculator cal = new TCalculator("cal");
        TResource res = new TResource("res");
        TSkuRelation sr = new TSkuRelation("sr");

        Condition calNotDelete = cal.DATA_STATUS.eq(0);
        Condition calNotHistory = cal.IS_HISTORY.eq(0);

        Condition resNotDelete = res.DATA_STATUS.eq(0);
        Condition resIsGroup = res.IS_GROUP.eq(1);

        Byte RENT = Byte.valueOf("1");
        Byte SALE = Byte.valueOf("2");
        Byte ALL = Byte.valueOf("3");

        Byte STATUS_NORMAL = Byte.valueOf("0");
        Byte STATUS_TOUPDATE = Byte.valueOf("1");

        List<ResourceDTO> correctList = new LinkedList<>();
        List<ResourceDTO> errorList = new LinkedList<>();

        Map<Integer, ResourceDTO> idMap = new HashMap<>();

        String filename = "/Users/zouyijiang/data/资源池数据整理-2018-10-16-洪斌.xls";
        try (FileInputStream fos = new FileInputStream(filename)) {
            HSSFWorkbook workbook = new HSSFWorkbook(fos);
            HSSFSheet sheet0 = workbook.getSheetAt(0);
            Iterator<Row> it = sheet0.iterator();
            if (it.hasNext()) it.next();
            if (it.hasNext()) it.next();
            int i = 0;
            while (it.hasNext()) {
                Row row = it.next();
                try {
                    Integer resourceId = Integer.valueOf(row.getCell(0).getStringCellValue());
                    String sku = row.getCell(1).getStringCellValue();
                    Byte rentOrSale = Double.valueOf(row.getCell(4).getNumericCellValue()).byteValue();

                    if (sku == null || sku.isEmpty()) throw new RuntimeException("sku empty");
                    ResourceDTO resourceDTO = new ResourceDTO(resourceId, sku, rentOrSale, row, i);
                    correctList.add(resourceDTO);
                    idMap.put(Integer.valueOf(resourceId), resourceDTO);
                } catch (Throwable e) {
                    log.error("第 " + i + " 行格式错误:" + row, e);
                    errorList.add(new ResourceDTO(null, null, null, row, i));
                }
                i++;
            }
            log.error("correctList:" + correctList.size());
            log.error("errorList:" + errorList.size());
        }
        List<ResourceDTO> notExistList = new LinkedList<>();
        List<ResourceDTO> conflictList = new LinkedList<>();

        FileOutputStream fos = new FileOutputStream(filename + ".sql");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(fos));
        int i = 0;
        for (ResourceDTO dto : correctList) {
            TResourceRecord resourceRecord = dsl
                    .selectFrom(res)
                    .where(resNotDelete
                            .and(res.ID.eq(dto.getResourceId()))
                    ).fetchAny();
            if (resourceRecord == null) {
                notExistList.add(dto);
                continue;
            }
            if (resourceRecord.getIsGroup() == 1 && dto.getRentOrSale().equals(SALE)) {
                log.info(i + " " + dto.getSku() + " : isGroup==1 and rentOrSale=2");
                // 检查子SKU
                Boolean childrenHasSale = dsl
                        .select(sr.PART_RESOURCE_ID)
                        .from(sr)
                        .where(sr.GROUP_RESOURCE_ID.eq(dto.getResourceId()))
                        .fetch()
                        .stream()
                        .map(it -> {
                            log.info("子资源id=" + it.component1());
                            ResourceDTO childDto = idMap.get(it.component1());
                            log.info("子资源 : " + childDto);
                            return childDto;
                        })
                        .filter(it -> it != null)
                        .map(it -> it.getRentOrSale().equals(SALE))
                        .reduce((a, b) -> a || b)
                        .orElse(false);
                if (childrenHasSale) {
                    conflictList.add(dto);
                    continue;
                }
            }
            UpdateConditionStep<TResourceRecord> updateRes = dsl
                    .update(res)
                    .set(res.RENT_OR_SALE, DSL.inline(dto.getRentOrSale()))
                    .set(res.RENT_OR_SALE_STATUS, DSL.inline(dto.getRentOrSale().equals(RENT) ? STATUS_NORMAL : STATUS_TOUPDATE))
                    .where(res.ID.eq(DSL.inline(dto.getResourceId())));
            String updateResSql = updateRes.getSQL();
            out.println(updateResSql);

            UpdateConditionStep<TCalculatorRecord> updateCal = dsl
                    .update(cal)
                    .set(cal.SKU_RENT_OR_SALE, DSL.inline(dto.getRentOrSale()))
                    .where(calNotDelete
                            .and(calNotHistory)
                            .and(cal.SKU.eq(DSL.inline(dto.getSku()))));
            String updateCalSql = updateCal.getSQL();
            out.println(updateCalSql);

            if (i % 100 == 0) {
                log.info("i:" + i);
                log.error("notExistList:" + notExistList.size());
                log.error("conflictList:" + conflictList.size());
            }
            i++;
        }
        log.info("total:" + i);
        log.error("notExistList:" + notExistList.size());
        log.error("conflictList:" + conflictList.size());

        out.close();
    }

}
