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
        DSLContext dsl = ctx.getBean(DSLContext.class);
        String fileName = "/Users/zouyijiang/data/资源池-20180927.xls";
        exportExcelForTResource(dsl,fileName);
//        importExcelForTResource(dsl, fileName);
    }

    /**
     * 导入并更新资源池
     * @param dsl
     * @param fileName
     * @throws IOException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static void importExcelForTResource(DSLContext dsl, String fileName) throws IOException, InstantiationException, IllegalAccessException {
        FileInputStream fi = new FileInputStream(fileName);
        List<TResourceRecord> records = readExcel(Arrays.asList(T_RESOURCE.fields()), TResourceRecord.class, fi);
        log.info("records:{}", records.size());
        int[] updates = dsl.batchUpdate(records)
                .execute();
        log.info("updates:{}", Arrays.toString(updates));
        int sum = Arrays.stream(updates).filter(x -> x > 0)
                .map(x -> 1).reduce((left, right) -> left + right).orElse(0);
        log.info("sum:{}", sum);
    }

    /**
     * 导出资源池
     * @param dsl
     * @param fileName
     * @throws IOException
     */
    public static void exportExcelForTResource(DSLContext dsl, String fileName) throws IOException {
        SelectSeekStep1<TResourceRecord, Timestamp> sql = dsl
                .selectFrom(T_RESOURCE)
                .where(T_RESOURCE.DATA_STATUS.eq(0))
                .orderBy(T_RESOURCE.CDATE.desc());
        Cursor<TResourceRecord> cursor = sql.fetchLazy();

        HSSFWorkbook workbook = createExcel(Arrays.asList(T_RESOURCE.fields()), cursor);
        FileOutputStream fos = new FileOutputStream(fileName);
        workbook.write(fos);
        fos.close();
    }

    public static HSSFWorkbook createExcel(List<Field> fields, Iterable<? extends Record> data) {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet0 = workbook.createSheet("sheet0");
        int rowIndex = 0;
        int cellIndex = 0;

        HSSFRow head0 = sheet0.createRow(rowIndex);
        cellIndex = 0;
        for (Field field : fields) {
            HSSFCell cell = head0.createCell(cellIndex);

            cell.setCellValue(field.getName());
            cellIndex++;
        }
        rowIndex++;

        HSSFRow head1 = sheet0.createRow(rowIndex);
        cellIndex = 0;
        for (Field field : fields) {
            HSSFCell cell = head1.createCell(cellIndex);

            TableFieldInfo fieldInfo = TableFieldInfos.getTableFieldInfo(field);
            String nameText = fieldInfo.getNameText();
            cell.setCellValue(nameText);
            cellIndex++;
        }
        rowIndex++;

        for (Record record : data) {
            HSSFRow row = sheet0.createRow(rowIndex);
            cellIndex = 0;
            for (Field field : fields) {
                HSSFCell cell = row.createCell(cellIndex);

                TableFieldInfo fieldInfo = TableFieldInfos.getTableFieldInfo(field);
                String valueText = fieldInfo.getValueText(record.getValue(field), ToTextPurpose.EXPORT);
                cell.setCellValue(valueText);
                cellIndex++;
            }
            rowIndex++;
        }
        return workbook;
    }

    public static <T extends Record> List<T> readExcel(List<Field> fields, Class<T> recordClass, InputStream inputStream) throws IOException, IllegalAccessException, InstantiationException {
        Map<String, Field> fieldMap = fields.stream().collect(Collectors.toMap(Field::getName, f -> f));
        HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
        HSSFSheet sheet0 = workbook.getSheetAt(0);
        Iterator<Row> it = sheet0.iterator();
        if (!it.hasNext()) return Collections.EMPTY_LIST;
        Row head0 = it.next();
        fields = new ArrayList<>();
        for (Cell headCell : head0) {
            String name = headCell.getStringCellValue();
            fields.add(fieldMap.get(name));
        }

        if (!it.hasNext()) return Collections.EMPTY_LIST;
        it.next(); // 跳过
        List<T> list = new LinkedList<>();
        while (it.hasNext()) {
            T record = recordClass.newInstance();
            int cellIndex = 0;
            for (Cell cell : it.next()) {
                String value = cell.getStringCellValue();
                Field field = fields.get(cellIndex);
                record.set(field, value);
                cellIndex++;
            }
            list.add(record);
        }
        return list;
    }
}