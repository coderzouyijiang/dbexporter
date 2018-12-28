package cn.zyj.dbexporter;

import cn.zyj.dbexporter.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.ContextLoader;

import java.io.File;


class MailUtil {
    private static MailService mailService = ContextLoader.getCurrentWebApplicationContext().getBean(MailService.class);
    public static void sendMail(){
        mailService.sendMailAsync(new String[]{"zouyijiang@edianzu.com"},
                null,
                "--xxx88开发贷款x8x8x8",
                "--jksfdsjflsjdfsk",
                new File("/Users/zouyijiang/data/WechatIMG11.jpeg"), "dkfdkf");
    }
}

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DbexporterApplication.class})
public class MailServiceTest {

    @Test
    public void test() {
        MailUtil.sendMail();
    }
}
