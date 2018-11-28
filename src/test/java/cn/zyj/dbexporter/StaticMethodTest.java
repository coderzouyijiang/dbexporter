package cn.zyj.dbexporter;

import cn.zyj.dbexporter.common.EncryptHelper;
import cn.zyj.dbexporter.model.CustomerSearchModel;
import cn.zyj.dbexporter.model.CustomerSearchResultItem;
import cn.zyj.dbexporter.model.SoPageData;
import cn.zyj.dbexporter.model.SoResponse;
import cn.zyj.dbexporter.mybatis.model.CustomerMember;
import cn.zyj.dbexporter.util.NetUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.sun.org.apache.xpath.internal.operations.Mod;
import lombok.Lombok;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.convert.Delimiter;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.*;

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

    @Test
    public void test_fasejson() throws Throwable {
        String content = "{\"_shards\":{\"total\":5,\"failed\":0,\"successful\":5},\"hits\":{\"hits\":[{\"_index\":\"customer\",\"_type\":\"customer\",\"_source\":{\"band_id\":\"11\",\"from_ad_source\":\"\",\"is_expire\":\"0\",\"available_balance\":\"0.00\",\"bind_id\":11,\"cdate\":1542873726,\"phone\":\"f4050ff3185233286f71291be870e7920708ab5a0515ca6a216e838625924c0f\",\"true_name\":\"张三\",\"company_name\":\"张蓬刚有限公司3\",\"bill_type\":\"0\",\"pay_type\":\"2\",\"account\":\"edz181122\",\"status\":\"1\",\"rent_num\":\"0\"},\"_id\":\"10049864\",\"sort\":[1542873726]},{\"_index\":\"customer\",\"_type\":\"customer\",\"_source\":{\"band_id\":\"13\",\"from_ad_source\":\"\",\"is_expire\":\"0\",\"available_balance\":\"0.00\",\"bind_id\":0,\"cdate\":1542870529,\"phone\":\"a90c68b714ad8b19c139ba726e69b93fd981ea47e88fd760287543b1220092fd\",\"true_name\":\"测试\",\"company_name\":\"测试zy大连线索\",\"bill_type\":\"0\",\"pay_type\":\"2\",\"account\":\"edz000006\",\"status\":\"1\",\"rent_num\":\"0\"},\"_id\":\"10049863\",\"sort\":[1542870529]},{\"_index\":\"customer\",\"_type\":\"customer\",\"_source\":{\"band_id\":\"13\",\"from_ad_source\":\"\",\"bind_id\":0,\"cdate\":1542869026,\"is_expire\":\"0\",\"phone\":\"0eed1ce9eb3b5e622edc5414502e1b937bad6299fd671ec99cd9389c79b45e9a\",\"bill_type\":\"0\",\"pay_type\":\"2\",\"available_balance\":\"0.00\",\"account\":\"edz745484\",\"status\":\"1\",\"rent_num\":\"0\"},\"_id\":\"10049862\",\"sort\":[1542869026]},{\"_index\":\"customer\",\"_type\":\"customer\",\"_source\":{\"band_id\":\"13\",\"from_ad_source\":\"\",\"bind_id\":0,\"cdate\":1542857292,\"is_expire\":\"0\",\"phone\":\"b90bf5a35b258ef58b4bef49eed5555f16cc7b32f39bd4082720b50e90670631\",\"bill_type\":\"0\",\"pay_type\":\"2\",\"available_balance\":\"0.00\",\"account\":\"edz192345\",\"status\":\"1\",\"rent_num\":\"0\"},\"_id\":\"10049861\",\"sort\":[1542857292]},{\"_index\":\"customer\",\"_type\":\"customer\",\"_source\":{\"band_id\":\"11\",\"from_ad_source\":\"\",\"is_expire\":\"0\",\"available_balance\":\"200000.00\",\"bind_id\":11,\"cdate\":1542854407,\"phone\":\"e203b7bcdfb94fd67e0ee3780da9e8485eb33b041d04ecb5b8f24741dace429f\",\"true_name\":\"冯德平\",\"company_name\":\"测试环境冯德平商城D\",\"bill_type\":\"0\",\"pay_type\":\"2\",\"account\":\"edz192797\",\"status\":\"1\",\"rent_num\":\"1\"},\"_id\":\"10049860\",\"sort\":[1542854407]},{\"_index\":\"customer\",\"_type\":\"customer\",\"_source\":{\"band_id\":\"13\",\"from_ad_source\":\"\",\"is_expire\":\"0\",\"available_balance\":\"10001.00\",\"bind_id\":0,\"cdate\":1542803166,\"phone\":\"085ce0ee442d1af924b1d37cd1f0dd387457f17160c09a505b7f8604c230b134\",\"true_name\":\"强无敌\",\"company_name\":\"坎坎坷坷处\",\"bill_type\":\"0\",\"pay_type\":\"2\",\"account\":\"edz122233\",\"status\":\"1\",\"rent_num\":\"0\"},\"_id\":\"10049859\",\"sort\":[1542803166]},{\"_index\":\"customer\",\"_type\":\"customer\",\"_source\":{\"band_id\":\"13\",\"from_ad_source\":\"\",\"bind_id\":0,\"cdate\":1542802348,\"is_expire\":\"0\",\"phone\":\"703b6a29c6bea1585a97b37b9d21740049ef296410ab9371f276e7fc800f4da6\",\"bill_type\":\"0\",\"pay_type\":\"2\",\"available_balance\":\"0.00\",\"account\":\"edz249003\",\"status\":\"1\",\"rent_num\":\"0\"},\"_id\":\"10049858\",\"sort\":[1542802348]},{\"_index\":\"customer\",\"_type\":\"customer\",\"_source\":{\"band_id\":\"13\",\"from_ad_source\":\"\",\"bind_id\":0,\"cdate\":1542797496,\"is_expire\":\"0\",\"phone\":\"d129fb2eb06e30c0ed6a8ba74e924a309d0e29cb8608fdb478f285c0017fdec4\",\"bill_type\":\"0\",\"pay_type\":\"2\",\"available_balance\":\"0.00\",\"account\":\"edz249002\",\"status\":\"1\",\"rent_num\":\"0\"},\"_id\":\"10049857\",\"sort\":[1542797496]},{\"_index\":\"customer\",\"_type\":\"customer\",\"_source\":{\"band_id\":\"13\",\"from_ad_source\":\"\",\"is_expire\":\"1\",\"available_balance\":\"0.00\",\"bind_id\":0,\"cdate\":1542793399,\"phone\":\"72f0ada4767498fcd81dc9fee1e36c59898024fa8992781ec79f6ce9071a47b5\",\"true_name\":\"李刚\",\"company_name\":\"李刚测试公司004\",\"bill_type\":\"0\",\"pay_type\":\"2\",\"account\":\"edz339988\",\"status\":\"1\",\"rent_num\":\"3\"},\"_id\":\"10049856\",\"sort\":[1542793399]},{\"_index\":\"customer\",\"_type\":\"customer\",\"_source\":{\"band_id\":\"13\",\"from_ad_source\":\"\",\"bind_id\":0,\"cdate\":1542792648,\"is_expire\":\"0\",\"phone\":\"c4805da381ab5bf82f958037b2c040e70631f3cad7a74954772630113befaec0\",\"bill_type\":\"0\",\"pay_type\":\"2\",\"available_balance\":\"996000.00\",\"account\":\"edz345432\",\"status\":\"1\",\"rent_num\":\"1\"},\"_id\":\"10049855\",\"sort\":[1542792648]}],\"total\":79403},\"took\":5,\"timed_out\":false,\"time\":0.011183977127075}";
        JSONObject jsonObject = JSONObject.parseObject(content);

        /**
         * 接口数据用php从elasticSearch查询，
         * 从crm获取客户等级数据后覆盖掉原数据中的bind_id
         */
        JSONArray hits = jsonObject.getJSONObject("hits").getJSONArray("hits");
        List<Long> customerIds = new LinkedList<>();
        for (Object obj : hits) {
            JSONObject item = (JSONObject) obj;
            if (!"customer".equals(item.getString("_index"))) continue;
            customerIds.add(Long.valueOf(item.getString("_id")));
        }
        log.info("getCustomerMassageList customerIds:" + customerIds);
        String customerIdsStr = customerIds.stream().map(Object::toString).reduce((a, b) -> a + "," + b).orElse("");
        String invokeStr = "invoke com.edianzu.mall.customer.service.CustomerService.queryCustomerLevel([" + customerIdsStr + "])";
        log.info(invokeStr);
        if (customerIds.size() > 0) {
            // { "code" : "0", "data" : [ { "level" : 11, "customerId" : 10049860 }, { "level" : 11, "customerId" : 10049864 } ] }
            Map<Long, Integer> map = new HashMap<>();
            map.put(10049860L, 11);
            map.put(10049864L, 11);
//            Map<Long, Integer> map = customerService.queryCustomerLevel(customerIds);
            log.info("getCustomerMassageList customerLevels:" + map);
            for (Object obj : hits) {
                JSONObject item = (JSONObject) obj;
                if (!"customer".equals(item.getString("_index"))) continue;
                Long customerId = Long.valueOf(item.getString("_id"));
                Integer level = map.getOrDefault(customerId, 0);
                JSONObject source = item.getJSONObject("_source");
                log.info("band_id:" + source.get("band_id") + "," + level);
                source.put("band_id", level);
            }
        }
        log.info("getCustomerMassageList json after:" + jsonObject);
    }

    @Test
    public void testBeanUtils() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        CustomerMember mode = new CustomerMember();
        mode.setAccountId(111L);
        mode.setJoinTime("abcd");
//        Map<String,Object> map=new HashMap<>();
        Map<String, String> map = org.apache.commons.beanutils.BeanUtils.describe(mode);
        log.info("" + map);
    }

    private String soApiSeachCustomer = "http://beta.so.edianzu.com/sc/customer";
    private String soApiSecret = "&#EFKFddKKA*#@H$awc";

    public Object search(CustomerSearchModel input) throws Throwable {
//        MallResponse resp = validate(input);
        CustomerSearchModel model = new CustomerSearchModel();
        BeanUtils.copyProperties(input, model);
//        if (resp.getCode() != 0) return resp;
        if (model.getTime() == null) {
            model.setTime(System.currentTimeMillis());
        }
        model.setCode(EncryptHelper.toMD5(model.getTime() + soApiSecret));
        model.setCallback(null);
        String queryString = toQueryString(toMap(model));
        String url = soApiSeachCustomer + "?" + queryString;
        log.info("url:" + url);
//        String respBody = HttpHelper.doGet(url, null);
        String respBody = "{}";
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(url);
            CloseableHttpResponse httpResp = httpClient.execute(httpGet);
            respBody = EntityUtils.toString(httpResp.getEntity());
        } catch (Exception e) {
            log.error("", e);
        }
//        JSONObject root = JSON.parseObject(respBody);
//        Integer code = root.getInteger("code");
//        if (code != 0) {
//            log.error(respBody);
//            throw new RuntimeException("调用数据环查询用户接口返回code=" + code);
//        }
//        Boolean hasResult = root.getBoolean("hasResult");
//        if (hasResult != null && hasResult) {
//            Object data = root.getString("data");
//            return data;
//        }
        Type type = new TypeReference<SoResponse<SoPageData<CustomerSearchResultItem>>>() {}.getType();
        SoResponse<SoPageData<CustomerSearchResultItem>> soResp = JSON.parseObject(respBody, type);
        return soResp;
    }

    private String toQueryString(Map<String, Object> params) {
        return params.entrySet().stream()
                .filter(en -> en.getValue() != null && !en.toString().trim().isEmpty())
                .map(en -> en.getKey() + "=" + en.getValue())
                .reduce((a, b) -> a + "&" + b)
                .orElse("");
    }

    private Map<String, Object> toMap(Object bean) {
        try {
            Map<String, Object> map = new LinkedHashMap<>();
            PropertyDescriptor[] pds = BeanUtils.getPropertyDescriptors(bean.getClass());
            for (PropertyDescriptor pd : pds) {
                if (pd.getReadMethod().getModifiers() == Modifier.PUBLIC) {
                    map.put(pd.getName(), pd.getReadMethod().invoke(bean));
                }
            }
            return map;
        } catch (Exception e) {
            throw new RuntimeException("", e);
        }
    }

    @Test
    public void testSoApiCustomerSearch() throws Throwable {

        CustomerSearchModel model = new CustomerSearchModel();
        model.setPlat(4);
        model.setPage(1);
        model.setSize(10);
        Object obj = search(model);
        log.info("" + obj);
        /**
         {
         "pageInfo": {
         "total": 3000,
         "size": 10,
         "totalPage": 300,
         "page": 1
         },
         "items": [{
         "newSource": "tg_wap",
         "registerTime": 1542869552000,
         "billType": "0",
         "source": "tg_wap",
         "rentNum": 0,
         "availableBalance": 0.0,
         "customerStatus": 1,
         "payType": 2,
         "bandId": 13,
         "phone": "18611595526",
         "expireStatus": 0,
         "id": 10057472,
         "account": "edz595526"
         }]
         }
         */
    }
}
