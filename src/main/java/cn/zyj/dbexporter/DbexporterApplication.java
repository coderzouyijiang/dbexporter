package cn.zyj.dbexporter;

import cn.zyj.dbexporter.constant.TableFieldInfos;
import cn.zyj.dbexporter.jooq.DbCalculator;
import cn.zyj.dbexporter.jooq.tables.TResource;
import cn.zyj.dbexporter.jooq.tables.records.TResourceRecord;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;
import java.io.FileOutputStream;
import java.net.DatagramSocket;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static cn.zyj.dbexporter.jooq.Tables.*;

@Slf4j
@SpringBootApplication
public class DbexporterApplication {

    public static void main(String[] args) throws Throwable {
        ConfigurableApplicationContext ctx = SpringApplication.run(DbexporterApplication.class, args);

        DSLContext dsl = ctx.getBean(DSLContext.class);

        SelectWithTiesAfterOffsetStep<TResourceRecord> sql = dsl
                .selectFrom(T_RESOURCE)
                .orderBy(T_RESOURCE.CDATE.desc())
                .limit(10, 10);

        Result<TResourceRecord> result = sql.fetch();
//        Iterator<TResourceRecord> it = result.iterator();
//        while (it.hasNext()) {
//            TResourceRecord res = it.next();
//            log.info("{}", res);
//        }
        log.info("--------------------");
        Cursor<TResourceRecord> cursor = sql.fetchLazy();

        while (cursor.hasNext()) {
            TResourceRecord res = cursor.fetchNext();
            log.info("{}", res);

        }
        /*log.info("-------------------");
        Set<Field<?>> allField = DbCalculator.DB_CALCULATOR.getTables()
                .stream().flatMap(tb -> tb.fieldStream())
                .collect(Collectors.toSet());
        int i = 0;
        for (Field f : allField) {
            log.info("{}:{},{}", i++, f,f.getComment());
        }*/

    }

    public static void getExcel(List<Field> fields) {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet();
        workbook.setSheetName(1, "");
        // 生成一个样式
        HSSFCellStyle style = workbook.createCellStyle();
        // 设置这些样式
        style.setFillForegroundColor(HSSFColor.PALE_BLUE.index);
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        // 生成一个字体
        HSSFFont font = workbook.createFont();
        font.setColor(HSSFColor.BLACK.index);
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        // 把字体应用到当前的样式
        style.setFont(font);
        style.setWrapText(true);

        //产生标题行
        HSSFRow row = sheet.createRow(0);

        for (Field field : fields) {
            TableFieldInfos.
        }
        for (int i = 0; i < titles.length; i++) {
            if (i == 5) {
                sheet.setColumnWidth(i, (short) 5000);
            } else if (i == 2) {
                sheet.setColumnWidth(i, (short) 4500);
            } else {
                sheet.setColumnWidth(i, (short) 3600);
            }
            HSSFCell cell = row.createCell(i);
            cell.setCellStyle(style);
            HSSFRichTextString text = new HSSFRichTextString(titles[i]);
            cell.setCellValue(text.toString());
        }
        List<Category> categoryList = iCategoryService.queryByCategoryName(null);
        List<Brand> bandList = iBrandService.queryByBrandName(null);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        // 遍历集合数据，产生数据行
        if (calculatorList != null) {
            int index = 1;
            for (Calculator cal : calculatorList) {
                JSONArray myJsonArray = JSONArray.parseArray(cal.getCalculationResult());
                int columns = 0;
                if (sheetNum == 0) {
                    columns = myJsonArray.size();
                }
                if (sheetNum == 1 || sheetNum == 2) {
                    columns = 2;
                }
                if (sheetNum == 3) {
                    columns = 1;
                }
                for (int i = 0; i < columns; i++) {
                    row = sheet.createRow(index);
                    cellIndex = 0;
                    if (titles[0].equals("报价单号")) {
                        createCell(row, cal.getSheetNo());  // 报价单号
                    }
                    createCell(row, cal.getCdate() == null ? "" : sdf.format(cal.getCdate())); // 生效时间
                    createCell(row, cal.getSku());
                    // 5期，加上 租售属性
                    createCell(row, RentOrSaleEnum.code2Description(cal.getRentOrSale()));
                    createCell(row, calculatorService.getProductTypeEnumDescription(cal.getProductType(), categoryList));
                    createCell(row, ProductConditionEnum.code2Description(cal.getQuality()));
                    createCell(row, calculatorService.getProductBandEnumDescription(cal.getBrand(), bandList));
                    createCell(row, cal.getModel());
                    createCell(row, cal.getCoreConfig());

                    createCell(row, enumConfigService.getEnumSelectLable(cal.getCpuType(), EnumType.CPU_TYPE.getCode()));      // 枚举类型处理
                    createCell(row, enumConfigService.getEnumSelectLable(cal.getCpuModel(), EnumType.CPU_MODEL.getCode()));
                    createCell(row, enumConfigService.getEnumSelectLable(cal.getRam(), EnumType.RAM.getCode()));
                    createCell(row, enumConfigService.getEnumSelectLable(cal.getHd1(), EnumType.HD1.getCode()));
                    createCell(row, enumConfigService.getEnumSelectLable(cal.getHd2(), EnumType.HD2.getCode()));
                    createCell(row, enumConfigService.getEnumSelectLable(cal.getGpu(), EnumType.GPU.getCode()));
                    createCell(row, enumConfigService.getEnumSelectLable(cal.getScreenSize(), EnumType.SCREEN_SIZE.getCode()));
                    createCell(row, enumConfigService.getEnumSelectLable(cal.getResolution(), EnumType.RESOLUTION.getCode()));

                    createCell(row, cal.getUncoreConfig());
                    createCell(row, OperatingSystemEnum.code2Description(cal.getOs()));
                    createCell(row, ServiceStandardsEnum.code2Description(cal.getServiceStandard()));
                    if (sheetNum == 0 || sheetNum == 2) {//销售经理、销售总监显示采购价
                        createCell(row, cal.getPurchasePrice());
                    }
                    createCell(row, cal.getDeposit()); // 5期 加上"押金"
                    if (sheetNum != 3) {//普通销售没有利润参数
                        createCell(row, myJsonArray.getJSONObject(i).get("priceLineText").toString());
                    }
                    createCell(row, cal.getResidualAfterYear1() == -1 ? "不提供" : cal.getResidualAfterYear1());
                    createCell(row, cal.getResidualAfterYear2() == -1 ? "不提供" : cal.getResidualAfterYear2());
                    createCell(row, cal.getResidualAfterYear3() == -1 ? "不提供" : cal.getResidualAfterYear3());
                    createCell(row, cal.getResidualAfterYear4() == -1 ? "不提供" : cal.getResidualAfterYear4());
                    createCell(row, cal.getResidualAfterYear5() == -1 ? "不提供" : cal.getResidualAfterYear5());

                    createCell(row, myJsonArray.getJSONObject(i).getDouble("priceFix1Year") == -1 ? "不提供" : myJsonArray.getJSONObject(i).getDouble("priceFix1Year"));
                    createCell(row, myJsonArray.getJSONObject(i).getDouble("priceFix2Year") == -1 ? "不提供" : myJsonArray.getJSONObject(i).getDouble("priceFix2Year"));
                    createCell(row, myJsonArray.getJSONObject(i).getDouble("priceFix3Year") == -1 ? "不提供" : myJsonArray.getJSONObject(i).getDouble("priceFix3Year"));
                    createCell(row, myJsonArray.getJSONObject(i).getDouble("priceFix4Year") == -1 ? "不提供" : myJsonArray.getJSONObject(i).getDouble("priceFix4Year"));
                    createCell(row, myJsonArray.getJSONObject(i).getDouble("priceFix5Year") == -1 ? "不提供" : myJsonArray.getJSONObject(i).getDouble("priceFix5Year"));

                    createCell(row, myJsonArray.getJSONObject(i).getDouble("priceFree2Year") == -1 ? "不提供" : myJsonArray.getJSONObject(i).getDouble("priceFree2Year"));
                    createCell(row, myJsonArray.getJSONObject(i).getDouble("priceFree3Year") == -1 ? "不提供" : myJsonArray.getJSONObject(i).getDouble("priceFree3Year"));
                    createCell(row, myJsonArray.getJSONObject(i).getDouble("priceFree4Year") == -1 ? "不提供" : myJsonArray.getJSONObject(i).getDouble("priceFree4Year"));
                    createCell(row, myJsonArray.getJSONObject(i).getDouble("priceFree5Year") == -1 ? "不提供" : myJsonArray.getJSONObject(i).getDouble("priceFree5Year"));

                    createCell(row, myJsonArray.getJSONObject(i).getDouble("priceFix1YearLeasing") == -1 ? "不提供" : myJsonArray.getJSONObject(i).getDouble("priceFix1YearLeasing"));
                    createCell(row, myJsonArray.getJSONObject(i).getDouble("priceFix2YearLeasing") == -1 ? "不提供" : myJsonArray.getJSONObject(i).getDouble("priceFix2YearLeasing"));
                    createCell(row, myJsonArray.getJSONObject(i).getDouble("priceFix3YearLeasing") == -1 ? "不提供" : myJsonArray.getJSONObject(i).getDouble("priceFix3YearLeasing"));
                    createCell(row, myJsonArray.getJSONObject(i).getDouble("priceFix4YearLeasing") == -1 ? "不提供" : myJsonArray.getJSONObject(i).getDouble("priceFix4YearLeasing"));
                    createCell(row, myJsonArray.getJSONObject(i).getDouble("priceFix5YearLeasing") == -1 ? "不提供" : myJsonArray.getJSONObject(i).getDouble("priceFix5YearLeasing"));

                    // 报价单含有 销售 时，才显示对应的行
                    if (sheetNum != 3) {// 5期 普通销售没有 利润起算点	销售底价
                        createCell(row, cal.getProfitStartCounting() == -1 ? "不提供" : cal.getProfitStartCounting());
                        createCell(row, cal.getMinSalePrice() == -1 ? "不提供" : cal.getMinSalePrice());
                    }
                    createCell(row, cal.getRealSalePrice() == -1 ? "不提供" : cal.getRealSalePrice());

                    index++;
                }
            }
        }

        /**
         * 创建cell
         */
        private static void createCell (HSSFRow row, Object obj){
            HSSFCell cell = row.createCell(cellIndex);
            if (obj != null) {
                cell.setCellValue(obj.toString());
            }
            cellIndex++;
        }
    }
