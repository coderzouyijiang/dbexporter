package cn.zyj.dbexporter.service;

import cn.zyj.dbexporter.model.MallResponse;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
@Service
public class MailService {

    private String sendAttachmentFileEmail = "http://tools01.edianzu.cn/mail/sendAttachmentFileEmail";
    private String sendHtmlEmail = "http://tools01.edianzu.cn/mail/sendHtmlEmail";
    private String sendSimpleEmail = "http://tools01.edianzu.cn/mail/sendSimpleEmail";

    private CloseableHttpClient httpClient = HttpClients.createDefault();

    private void test_sendAttachmentFileEmail() throws IOException {

        ContentType TEXT_UTF8 = ContentType.create("text/plain", Consts.UTF_8);

        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addTextBody("receivers", "zouyijiang@edianzu.com", TEXT_UTF8)
                .addTextBody("ccs", "zouyijiang@edianzu.com", TEXT_UTF8)
                .addTextBody("deliver", "dev@edianzu.com", TEXT_UTF8)  // 发送邮件用自己项目组的邮箱
                .addTextBody("subject", "乱码测试3subject", TEXT_UTF8)
                .addTextBody("content", "乱码测试3content", TEXT_UTF8)
                .addTextBody("filename", "乱码测试3filename", TEXT_UTF8)
                .addBinaryBody("file", new File("/Users/zouyijiang/data/WechatIMG11.jpeg"))
                .build();
        HttpPost post = new HttpPost(sendAttachmentFileEmail);
        post.setEntity(reqEntity);

        CloseableHttpResponse resp = httpClient.execute(post);
        int statusCode = resp.getStatusLine().getStatusCode();
        if (statusCode == HttpStatus.SC_OK) {
            HttpEntity entity = resp.getEntity();
            String body = EntityUtils.toString(entity);
            log.info("body:" + body);
            MallResponse respContent = JSON.parseObject(body, MallResponse.class);
            if (respContent.getCode() == 0) {
                log.info("call success !");
                return;
            }
        }
        log.info("call fail !");
    }

    private static final ContentType TEXT_UTF8 = ContentType.create("text/plain", Consts.UTF_8);

    private void preHandle(MailModel model) {
        if (model == null
                || model.getReceivers() == null || model.getReceivers().isEmpty()) {
            throw new RuntimeException("收件人人不能为空");
        }
        if (model.getFile() != null) {
            File file = model.getFile();
            if (!file.exists() || !file.isFile() || !file.canRead()) {
                throw new RuntimeException("附件文件不存在或不可读,file=" + model.getFile());
            }
            if (StringUtils.isBlank(model.getFilename())) {
                model.setFilename(file.getName());
            }
        }
        if (StringUtils.isBlank(model.getDeliver())) {
            model.setDeliver("dev@edianzu.com");
        }
    }

    private MallResponse sendMail(MailModel mailModel) {
        MailModel model = new MailModel();
        BeanUtils.copyProperties(mailModel, model); // 不修改传入对象
        log.info("sendMail 调用方参数：" + model);
        preHandle(model);
        log.info("sendMail  完整参数: " + model);
        MultipartEntityBuilder reqEntityBuilder = MultipartEntityBuilder.create()
                .addTextBody("receivers", StringUtils.join(model.getReceivers(), ","), TEXT_UTF8)
                .addTextBody("ccs", StringUtils.join(model.getCcs(), ","), TEXT_UTF8)
                .addTextBody("deliver", model.getDeliver(), TEXT_UTF8)  // 发送邮件用自己项目组的邮箱
                .addTextBody("subject", model.getSubject(), TEXT_UTF8)
                .addTextBody("content", model.getContent(), TEXT_UTF8);
        HttpPost post = null;
        if (model.getFile() != null) {
            post = new HttpPost(sendAttachmentFileEmail);
            reqEntityBuilder = reqEntityBuilder
                    .addTextBody("filename", model.getFilename(), TEXT_UTF8)
                    .addBinaryBody("file", model.getFile());
        } else {
            post = new HttpPost(sendHtmlEmail);
        }
        post.setEntity(reqEntityBuilder.build());

        CloseableHttpResponse resp = null;
        try {
            resp = httpClient.execute(post);
            int statusCode = resp.getStatusLine().getStatusCode();
            if (statusCode == HttpStatus.SC_OK) {
                HttpEntity entity = resp.getEntity();
                String body = EntityUtils.toString(entity);
                log.info("body:" + body);
                MallResponse respContent = JSON.parseObject(body, MallResponse.class);
                return respContent;
            }
        } catch (IOException e) {
            throw new RuntimeException("调用邮件发送服务失败.model=" + model);
        }
        log.error("call fail ! resp=" + resp);
        throw new RuntimeException("调用邮件发送服务失败.model=" + model);
    }


    private void test_sendHtmlEmail() throws IOException {

        ContentType TEXT_UTF8 = ContentType.create("text/plain", Consts.UTF_8);
        ContentType HTML_UTF8 = ContentType.create("text/html", Consts.UTF_8);

        String content = "<!DOCTYPE html><html><body><h1>haha</h1><h3>xxx的飞快的接口费</h3></body></html>";

        HttpEntity reqEntity = MultipartEntityBuilder.create()
                .addTextBody("receivers", "zouyijiang@edianzu.com", TEXT_UTF8)
                .addTextBody("ccs", "zouyijiang@edianzu.com", TEXT_UTF8)
                .addTextBody("deliver", "dev@edianzu.com", TEXT_UTF8)  // 发送邮件用自己项目组的邮箱
                .addTextBody("subject", "test_sendHtmlEmail测试", TEXT_UTF8)
                .addTextBody("content", content, TEXT_UTF8)
//                .addTextBody("content", content, HTML_UTF8)
//                .addTextBody("filename", "乱码测试3filename", TEXT_UTF8)
//                .addBinaryBody("file", new File("/Users/zouyijiang/data/WechatIMG11.jpeg"))
                .build();
        HttpPost post = new HttpPost(sendHtmlEmail);
        post.setEntity(reqEntity);

        CloseableHttpResponse resp = httpClient.execute(post);
        int statusCode = resp.getStatusLine().getStatusCode();
        if (statusCode == HttpStatus.SC_OK) {
            HttpEntity entity = resp.getEntity();
            String body = EntityUtils.toString(entity);
            log.info("body:" + body);
            MallResponse respContent = JSON.parseObject(body, MallResponse.class);
            if (respContent.getCode() == 0) {
                log.info("call success !");
                return;
            }
        }
        log.info("call fail !");
    }

    private void test_sendSimpleEmail() throws IOException {

        ContentType TEXT_UTF8 = ContentType.create("text/plain", Consts.UTF_8);
        ContentType HTML_UTF8 = ContentType.create("text/html", Consts.UTF_8);

        String content = "<!DOCTYPE html><html><body><h1>haha</h1><h3>xxx的飞快的接口费sendSimple</h3></body></html>";

        HttpEntity reqEntity = MultipartEntityBuilder.create()

//                .addTextBody("content", content, HTML_UTF8)
//                .addTextBody("filename", "乱码测试3filename", TEXT_UTF8)
//                .addBinaryBody("file", new File("/Users/zouyijiang/data/WechatIMG11.jpeg"))
                .build();
        HttpPost post = new HttpPost(sendSimpleEmail);
        post.setEntity(reqEntity);

        RequestBuilder.get(sendSimpleEmail)
                .setHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_FORM_URLENCODED.toString())
                .addParameter("receivers", "zouyijiang@edianzu.com")
                .addParameter("ccs", "zouyijiang@edianzu.com")
                .addParameter("deliver", "dev@edianzu.com")  // 发送邮件用自己项目组的邮箱
                .addParameter("subject", "test_sendHtmlEmail测试")
                .addParameter("content", content)
                .build();

        HttpGet get = new HttpGet(sendSimpleEmail);

//        CloseableHttpResponse resp = httpClient.execute(post);
        CloseableHttpResponse resp = httpClient.execute(get);
        int statusCode = resp.getStatusLine().getStatusCode();
        if (statusCode == HttpStatus.SC_OK) {
            HttpEntity entity = resp.getEntity();
            String body = EntityUtils.toString(entity);
            log.info("body:" + body);
            MallResponse respContent = JSON.parseObject(body, MallResponse.class);
            if (respContent.getCode() == 0) {
                log.info("call success !");
                return;
            }
        }
        log.info("call fail !");
    }

    private ExecutorService threadPool = Executors.newScheduledThreadPool(5);

    public void sendMailAsync(final String[] receivers, final String[] ccs, final String subject, final String content, final File file, final String filename) {
        threadPool.submit(new Runnable() {
            @Override
            public void run() {
                MailModel mailModel = new MailModel();
                mailModel.setReceivers(Arrays.asList(receivers));
                if (ccs != null && ccs.length > 0) {
                    mailModel.setCcs(Arrays.asList(ccs));
                }
                mailModel.setSubject(subject);
                mailModel.setContent(content);
                mailModel.setFile(file);
                mailModel.setFilename(filename);
                try {
                    sendMail(mailModel);
                } catch (Throwable e) {
                    log.error("发送邮件失败:model=" + mailModel, e);
                }
            }
        });
    }

    public static void main(String[] args) throws Throwable {

        MailService mailService = new MailService();
//        mailService.test_sendAttachmentFileEmail();
//        mailService.test_sendHtmlEmail();
//        mailService.test_sendSimpleEmail();
/*
        MailModel model = new MailModel();
        model.setDeliver("dev@edianzu.com");
        model.setReceivers(Arrays.asList("zouyijiang@edianzu.com"));
        model.setSubject("0000快点快点看看----abckd444");
        model.setContent("快点快点看看----abckd444");
        model.setCcs(Arrays.asList("coderzouyijiang@163.com"));
        model.setFile(new File("/Users/zouyijiang/data/WechatIMG11.jpeg"));
        MallResponse resp = mailService.sendMail(model);
*/
        String content = "<html>\n" +
                "         <p>邮件说明：</p>\n" +
                "         <span>秘钥 : 7W782IT3U4</span>    <table border='1'>\n" +
                "         <tr>\n" +
                "         <td>提交时间</td>\n" +
                "         <td>商品ID</td>\n" +
                "         <td>标题</td>\n" +
                "         <td>押金</td>\n" +
                "         <td>预售库存</td>\n" +
                "         <td>专属手机号</td>\n" +
                "         <td>授信额度</td>\n" +
                "         </tr>\n" +
                "         <tr>\n" +
                "         <td>2018-12-06 21:56:57</td>\n" +
                "         <td>119297</td>\n" +
                "         <td>全新 爱普生/EPSON LQ-690K针式打印机(106列平推式)</td>\n" +
                "         <td>12000.0</td>\n" +
                "         <td>2</td>\n" +
                "         <td>18911992288</td>\n" +
                "         <td>100000.0</td>\n" +
                "         </tr>\n" +
                "         </table>\n" +
                "         <p>邮件说明：</p>\n" +
                "         <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;产品部创建非标品非电脑的融租幽灵商品时，若融租额度（押金x预售库存） 大于5万，或者融租额度/授信额度\n" +
                "         </html>";

        mailService.sendMailAsync(new String[]{"zouyijiang@edianzu.com", "liyanhao@edianzu.com", "zouminjie@edianzu.com"},
                new String[]{"zouyijiang@edianzu.com", "liyanhao@edianzu.com", "zouminjie@edianzu.com"},
                "双非融租幽灵商品秘钥", content, null, null);
//                "jksfdsjflsjdfsk",
//                new File("/Users/zouyijiang/data/WechatIMG11.jpeg"), "dkfdkf");

        /***
         MailModel(receivers=[dongkang@edianzu.com, liyanhao@edianzu.com, zouminjie@edianzu.com
         content=
         <html>
         <p>邮件说明：</p>
         <span>秘钥 : 7W782IT3U4</span>    <table border='1'>
         <tr>
         <td>提交时间</td>
         <td>商品ID</td>
         <td>标题</td>
         <td>押金</td>
         <td>预售库存</td>
         <td>专属手机号</td>
         <td>授信额度</td>
         </tr>
         <tr>
         <td>2018-12-06 21:56:57</td>
         <td>119297</td>
         <td>全新 爱普生/EPSON LQ-690K针式打印机(106列平推式)</td>
         <td>12000.0</td>
         <td>2</td>
         <td>18911992288</td>
         <td>100000.0</td>
         </tr>
         </table>
         <p>邮件说明：</p>
         <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;产品部创建非标品非电脑的融租幽灵商品时，若融租额度（押金x预售库存） 大于5万，或者融租额度/授信额度
         </html>, filename=null, file=null)
         */
    }
}
