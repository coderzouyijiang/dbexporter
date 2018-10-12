package cn.zyj.dbexporter;

import cn.zyj.dbexporter.service.ExportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DbexporterApplicationTests {

    @Autowired
    ExportService exportService;

    @Test
    public void contextLoads() throws IOException {

        String fileName = "/Users/zouyijiang/data/资源池-20181010.xls";
        exportService.exportExcelForTResource(fileName);
    }

}
