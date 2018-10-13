package cn.zyj.dbexporter.config;

import cn.zyj.dbexporter.util.NetUtil;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * 读取配置并实例化Jsch并建立连接
 */
@ConditionalOnExpression("${hikari.use-ssh:true}")
@Component
@Slf4j
public class JschHolder {

    @Getter
    private final JSch jsch;
    @Getter
    private final Session session;

    public JschHolder(@Value("${ssh.host}") String sshHost,
                      @Value("${ssh.port}") Integer sshPort,
                      @Value("${ssh.usr}") String sshUsr,
                      @Value("${ssh.pwd}") String sshPwd) throws JSchException {

        this.jsch = new JSch();
//        ssh zouyijiang@fortress.edianzu.cn
//                JPumpBicG9lUlZq8
        // stage
//        mysql -h10.44.63.143 -umall -p
//        密码：cm1ZwY0MrMZSoUvcowr5
        this.session = jsch.getSession(sshUsr, sshHost, sshPort);
        session.setPassword(sshPwd);

        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);
        session.connect(); //ssh connection established!

        //by security policy, you must connect through a fowarded port
//        int portForwardingL = session.setPortForwardingL(localPort, remoteHost, remotePort);
//        log.info("portForwardingL:{}", portForwardingL);
    }

    /**
     * 根据jdbcUrl获取数据库ip和port，生成通过跳板机ssh连接数据库的jdbcUrl
     *
     * @param url         原jdbcUrl
     * @param defaultPort 数据库的默认端口号，如果url中没有，就用这个
     * @return
     */
    public String getJdbcUrlBySsh(String url, int defaultPort) {
        log.info("oldUrl:" + url);
        // jdbcUrl=jdbc:mysql://10.172.216.113:3306/db_calculator?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false&maxReconnects=10
        // jdbcUrl=jdbc:mysql://127.0.0.1:3307/db_calculator?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false&maxReconnects=10
/*
        String sshHost = "fortress.edianzu.cn";
        int sshPort = 22;
        String sshUsr = "zouyijiang";
        String sshPwd = "JPumpBicG9lUlZq8";
*/
        String hostAndIp = NetUtil.getHostAndIpFromUrl(url);
        String[] hostAndIpArr = hostAndIp.split(":");
        assert hostAndIpArr.length > 0;
        String remoteHost = hostAndIpArr[0];
        int remotePort = hostAndIpArr.length > 1 ? Integer.valueOf(hostAndIpArr[1]) : defaultPort;

        int localPort = NetUtil.findAvailableLocalPort();
        assert localPort != -1;
        try {
//            NetUtil.connectBySSH(localPort, remoteHost, remotePort, sshHost, sshPort, sshUsr, sshPwd);
            int portForwardingL = this.session.setPortForwardingL(localPort, remoteHost, remotePort);
            log.info("portForwardingL:{}", portForwardingL);
        } catch (Exception e) {
            throw new RuntimeException("getJdbcUrlBySSH", e);
        }
        String newUrl = url.replaceFirst(hostAndIp, "127.0.0.1" + ":" + localPort);
        log.info("newUrl:" + newUrl);
        return newUrl;
    }
}
