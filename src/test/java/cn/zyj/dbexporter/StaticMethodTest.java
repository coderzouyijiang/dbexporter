package cn.zyj.dbexporter;

import cn.zyj.dbexporter.util.NetUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

@Slf4j
@RunWith(JUnit4.class)
public class StaticMethodTest {

    @Test
    public void testNetUtil() {
        int localPort = NetUtil.findAvailableLocalPort();
        log.info("localPort:{}" + localPort);
    }

    @Test
    public void testURL() throws MalformedURLException, URISyntaxException {
        String urlStr = "jdbc:mysql://10.172.216.113:3306/db_calculator?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false&maxReconnects=10";
        int i = urlStr.indexOf("//");
        i += 2;
        int j = urlStr.indexOf('/', i);
        String hostAndIp = urlStr.substring(i, j);
        log.info("hostAndIp:" + hostAndIp);
    }
}
