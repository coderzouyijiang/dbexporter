package cn.zyj.dbexporter;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import lombok.extern.slf4j.Slf4j;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Properties;

@Slf4j
public class NetUtil {

    private static boolean bindPort(String host, int port) {
        try (Socket s = new Socket()) {
            s.bind(new InetSocketAddress(host, port));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static boolean isPortAvailable(int port) {
        try {
            return bindPort("0.0.0.0", port)
                    && bindPort(InetAddress.getLocalHost().getHostAddress(), port);
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 获取可用端口号
     *
     * @return
     */
    public static int findAvailableLocalPort() {
        int port = 3307;
//        int port = 1026;
        while (port < 65534) {
            if (isPortAvailable(port)) {
                return port;
            }
            port++;
        }
        return -1;
    }

    public static Session connectBySSH(int localPort, String remoteHost, int remotePort, String sshHost, int sshPort, String sshUsr, String sshPwd) throws Exception {
        JSch jsch = new JSch();
//        ssh zouyijiang@fortress.edianzu.cn
//                JPumpBicG9lUlZq8
        // stage
//        mysql -h10.44.63.143 -umall -p
//        密码：cm1ZwY0MrMZSoUvcowr5
        Session session = jsch.getSession(sshUsr, sshHost, sshPort);
        session.setPassword(sshPwd);

        Properties config = new Properties();
        config.put("StrictHostKeyChecking", "no");
        session.setConfig(config);
        session.connect(); //ssh connection established!

        //by security policy, you must connect through a fowarded port
        int portForwardingL = session.setPortForwardingL(localPort, remoteHost, remotePort);
        log.info("portForwardingL:{}", portForwardingL);

        return session;
    }

    public static String getHostAndIpFromUrl(String urlStr) {
        int i = urlStr.indexOf("//");
        i += 2;
        int j = urlStr.indexOf('/', i);
        String hostAndIp = urlStr.substring(i, j);
        log.info("hostAndIp:" + hostAndIp);
        return hostAndIp;
    }

}
