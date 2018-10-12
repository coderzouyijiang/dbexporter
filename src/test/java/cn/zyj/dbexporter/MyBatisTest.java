package cn.zyj.dbexporter;

import cn.zyj.dbexporter.mybatis.dao.DCustomerMemberDao;
import cn.zyj.dbexporter.mybatis.model.CustomerMemberInvite;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static cn.zyj.dbexporter.mybatis.model.CustomerMemberInvite.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DbexporterApplication.class})
public class MyBatisTest {

    @Autowired
    DCustomerMemberDao customerMemberDao;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void getInvites() throws JsonProcessingException {
        CustomerMemberInvite invite = new CustomerMemberInvite();
        invite.setDataStatus(DATA_NORMAL);
        List<CustomerMemberInvite> invites = customerMemberDao.getInvites(invite);
//        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        log.info("invites:{}", objectMapper.writeValueAsString(invites));
    }

    @Test
    public void saveInvite() {
        CustomerMemberInvite invite = new CustomerMemberInvite();
        invite.setGroupCustomerId(10001L);
        invite.setCustomerId(10002L);
        invite.setRemarkName("无心");
        invite.setType(TYPE_APPLY);
        invite.setStatus(STATUS_SUCCESS);
        invite.setHandleTime(new Date());
        Integer save = customerMemberDao.saveInvite(invite);
        log.info("saveInvite:{},id={}", save, invite.getId());
    }

}
