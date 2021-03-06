package cn.zyj.dbexporter;

import cn.zyj.dbexporter.jooq.db_mall.tables.TCustomer;
import cn.zyj.dbexporter.jooq.db_mall.tables.TCustomerAccount;
import cn.zyj.dbexporter.jooq.db_mall.tables.TCustomerMemberInvite;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCustomerAccountRecord;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCustomerMemberInviteRecord;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCustomerRecord;
import cn.zyj.dbexporter.mybatis.dao.DCustomerMemberDao;
import cn.zyj.dbexporter.mybatis.model.CustomerMember;
import cn.zyj.dbexporter.mybatis.model.CustomerMemberDTO;
import cn.zyj.dbexporter.mybatis.model.CustomerMemberInvite;
import cn.zyj.dbexporter.mybatis.model.UserPayment;
import cn.zyj.dbexporter.util.AssertUtil;
import cn.zyj.dbexporter.util.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.imageio.plugins.common.I18N;
import lombok.extern.slf4j.Slf4j;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

import static cn.zyj.dbexporter.mybatis.model.CustomerMemberInvite.*;

/**
 * 测试成员管理dao
 * beta
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DbexporterApplication.class})
public class CustomerMemberDaoTest {

    @Autowired
    DCustomerMemberDao customerMemberDao;

    @Autowired
    JsonUtil jsonUtil;

    @Test
    public void getInvites() {
        CustomerMemberInvite invite = new CustomerMemberInvite();
        invite.setDataStatus(DATA_NORMAL);
        List<CustomerMemberInvite> invites = customerMemberDao.getInvites(invite);
//        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        log.error("invites:{}", jsonUtil.toString(invites));
    }

    @Test
    public void getInviteById() {
        CustomerMemberInvite invite = customerMemberDao.getInviteById(3L);
        log.error("invite:{}", jsonUtil.toString(invite));
    }

    @Test
    public void test_invite_CRUD() {
        CustomerMemberInvite input = new CustomerMemberInvite();
        input.setGroupCustomerId(10001L);
        input.setDataStatus(DATA_NORMAL);
        List<CustomerMemberInvite> invites = customerMemberDao.getInvites(input);
        log.error("invites:{}", jsonUtil.toString(invites));

        CustomerMemberInvite invite = new CustomerMemberInvite();
        invite.setGroupCustomerId(10001L);
        invite.setCustomerId(10000000L + new Random().nextInt(10000));
        invite.setRemarkName("无心" + new Random().nextInt(10000));
        invite.setType(TYPE_APPLY);
        invite.setStatus(STATUS_SUCCESS);
        invite.setHandleTime(new Date());
        long save = customerMemberDao.saveInvite(invite);
        log.error("saveInvite:{},id={}", save, invite.getId());
        Assert.assertEquals(save, 1L);

        CustomerMemberInvite invite2 = customerMemberDao.getInviteById(invite.getId());
        Assert.assertNotNull(invite2.getId());
        Assert.assertEquals(invite.getGroupCustomerId(), invite2.getGroupCustomerId());
        Assert.assertEquals(invite.getCustomerId(), invite2.getCustomerId());
        Assert.assertEquals(invite.getRemarkName(), invite2.getRemarkName());
        Assert.assertEquals(invite.getType(), invite2.getType());
        Assert.assertEquals(invite.getStatus(), invite2.getStatus());
//        AssertUtil.dateEquals(invite.getHandleTime(), invite2.getHandleTime());

        CustomerMemberInvite inviteUpdate = new CustomerMemberInvite();
//        inviteUpdate.setId(invite2.getId());
        inviteUpdate.setRemarkName("xyz" + (new Random().nextInt(100000)));
        inviteUpdate.setHandleTime(new Date());
//        long upate = customerMemberDao.updateInvite(inviteUpdate);
        long upate = customerMemberDao.updateInviteById(inviteUpdate, null, invite2.getId());
        Assert.assertEquals(upate, 1);

        List<CustomerMemberInvite> invites2 = customerMemberDao.getInvites(input);
        log.error("invites2:{}", jsonUtil.toString(invites2));
        Assert.assertEquals(invites.size() + 1, invites2.size());

        CustomerMemberInvite invite3 = invites2.stream()
                .filter(it -> it.getId().equals(invite2.getId()))
                .findAny().orElseGet(null);
        Assert.assertNotNull(invite3);
        Assert.assertEquals(inviteUpdate.getRemarkName(), invite3.getRemarkName());
//        AssertUtil.dateEquals(inviteUpdate.getHandleTime(), invite3.getHandleTime());

        long delete = customerMemberDao.deleteInviteById(invite.getId());
        log.error("deleteInviteById:{}", delete);
        Assert.assertEquals(delete, 1L);
    }

    @Autowired
    DSLContext dsl;

    @Test
    public void test_create_customer_by_invite() {
        Random random = new Random();

        TCustomerMemberInvite tmi = new TCustomerMemberInvite();
        TCustomerAccount ca = new TCustomerAccount();
        TCustomer c = new TCustomer();

        List<TCustomerMemberInviteRecord> invites = dsl.selectFrom(tmi)
                .where(tmi.DATA_STATUS.eq((byte) 0))
                .fetch()
                .into(TCustomerMemberInviteRecord.class);
        for (TCustomerMemberInviteRecord invite : invites) {
            TCustomerRecord customer = dsl.selectFrom(c)
                    .where(c.STATUS.notEqual((byte) 1)
                            .and(c.ID.eq(invite.getCustomerId().intValue())))
                    .fetchAny();
//            TCustomerAccountRecord account = dsl.selectFrom(ca)
//                    .where(ca.STATUS.notEqual(0)
//                            .and(ca.OLD_CUSTOMER_ID.eq(invite.getCustomerId())))
//                    .fetchAny();
            if (customer != null) continue;
            customer = new TCustomerRecord();
            customer.setPhone("111" + (random.nextInt(90000000) + 10000000));
            customer.setReceivePhone(customer.getPhone());
            customer.setPassword("123456");
            customer.setRegisterIp(127L);
            customer.setPayType((byte) 1);

            customer = dsl.insertInto(c)
                    .set(customer)
                    .returning(c.ID)
                    .fetchOne();
            Assert.assertNotNull(customer);
            Assert.assertNotNull(customer.getId());
        }
    }

    /**
     * 为已经存在的公司成员创建邀请
     */
    @Test
    public void initData() {
        TCustomerAccount ca = new TCustomerAccount("ca");
        Condition caNotDelete = ca.STATUS.notEqual(2);
        Condition caNotManager = ca.CUSTOMER_ID.notEqual(ca.OLD_CUSTOMER_ID);

        TCustomerMemberInvite cmi = new TCustomerMemberInvite("cmi");
        Condition cmiNotDelete = cmi.DATA_STATUS.notEqual(Byte.valueOf("1"));

        Result<TCustomerAccountRecord> result = dsl
                .selectFrom(ca)
                .where(caNotDelete
                        .and(caNotManager)
                ).fetch();
        for (TCustomerAccountRecord account : result) {
            /*Integer count = dsl.selectCount()
                    .from(cmi)
                    .where(cmiNotDelete
                            .and(cmi.GROUP_CUSTOMER_ID.eq(account.getCustomerId()))
                            .and(cmi.CUSTOMER_ID.eq(account.getOldCustomerId()))
                    ).fetchAny()
                    .component1();*/
            CustomerMemberInvite invite = new CustomerMemberInvite();
            invite.setGroupCustomerId(account.getCustomerId());
            invite.setCustomerId(account.getOldCustomerId());
            invite.setDataStatus(CustomerMemberInvite.DATA_NORMAL);
            List<CustomerMemberInvite> invites = customerMemberDao.getInvites(invite);
            if (invites.size() == 0) {
                log.info("invite已经存在:{}", invite);
                continue;
            }
            invite.setType(CustomerMemberInvite.TYPE_APPLY);
            invite.setStatus(CustomerMemberInvite.STATUS_SUCCESS);
            customerMemberDao.saveInvite(invite);
            log.info("创建invite成功:{}", invite);
        }
    }

    @Test
    public void test_member_CRUD() {
        CustomerMemberDTO dto = new CustomerMemberDTO();
        dto.setGroupCustomerId(10000347L);
        dto.setPageIndex(0);
        dto.setPageSize(100);
        long totalCount = customerMemberDao.getCustomerMemberTotalCount(dto);
        log.info("totalCount:{}", totalCount);
        List<CustomerMember> list = customerMemberDao.getCustomerMemberPage(dto);
        log.info("list:{}", list);
        for (CustomerMember member : list) {
            CustomerMember memberByAccountId = customerMemberDao.getCustomerMemberByAccountId(member.getAccountId());
            Assert.assertNotNull(memberByAccountId);
            CustomerMember memberByInviteId = customerMemberDao.getCustomerMemberByInviteId(member.getId());
            Assert.assertNotNull(memberByInviteId);
        }

    }

    @Test
    public void test_getUserPayAmount() {
        List<UserPayment> list = customerMemberDao.getUserPayAmount(Arrays.asList(10049722L, 1000239L),
                "2018-11-07 00:00:00", "2018-11-08 00:00:00");
        log.info("userPayment:" + list);
    }

    @Test
    public void test_countLoginLog() {
        long count = customerMemberDao.countLoginLog(7392L, 2, null, null);
        log.info("countLoginLog:" + count);

        Calendar cal = Calendar.getInstance();
        String startDate = getDate(cal);
        cal.add(Calendar.DATE, 1);
        String endDate = getDate(cal);

        count = customerMemberDao.countLoginLog(76906L, 2, startDate, endDate);
        log.info("countLoginLog:" + count);
    }

    private String getDate(Calendar cal) {
        String dateFormat = "%04d-%02d-%02d";
        String date = String.format(dateFormat, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH));
        return date;
    }

    @Test
    public void test_update() {
        CustomerMemberInvite invite = new CustomerMemberInvite();
        invite.setRemarkName("ijk_123");
        long update = customerMemberDao.updateInvite(invite, DATA_NORMAL, 10000967L, 10001531L);
        log.info("update:" + update);
    }

}
