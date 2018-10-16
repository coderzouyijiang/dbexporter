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

    public int createForwardingPort(String remoteHost, int port) {
        int localPort = NetUtil.findAvailableLocalPort();
        if (localPort == -1) {
            throw new RuntimeException("建立erp通道失败");
        }
        try {
            int portForwardingL = session.setPortForwardingL(localPort, remoteHost, port);
            log.error("createForwardingPort: 127.0.0.1:{} --> {}:{}", portForwardingL, remoteHost, port);
            return portForwardingL;
        } catch (JSchException e) {
            throw new RuntimeException("建立erp通道失败", e);
        }

    }
}
