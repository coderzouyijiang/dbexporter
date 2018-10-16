package cn.zyj.dbexporter.controller;

import cn.zyj.dbexporter.jooq.db_calculator.tables.records.TResourceRecord;
import cn.zyj.dbexporter.service.ExportService;
import org.jooq.Cursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@RequestMapping("/resource")
@Controller
public class ResourceController {

    @Autowired
    ExportService exportService;

    private static final SimpleDateFormat FORMAT_yyyyMMdd = new SimpleDateFormat("yyyyMMdd");

    @RequestMapping(path = "/exportExcel")
    public void exportExcel(HttpServletResponse resp) throws IOException {
        Calendar.getInstance();

        Calendar now = Calendar.getInstance();
        String today = FORMAT_yyyyMMdd.format(now.getTime());
        String filename = "资源池_" + today;
        String encodedFilename = URLEncoder.encode(filename, "UTF-8");
        resp.setContentType("application/vnd.ms-excel;charset=UTF-8");
        resp.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + encodedFilename);
        ServletOutputStream os = resp.getOutputStream();
        exportService.exportExcelForTResource(os);
    }
}
