/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TNetRechargeRequest;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TNetRechargeRequestRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TNetRechargeRequestDao extends DAOImpl<TNetRechargeRequestRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest, Long> {

    /**
     * Create a new TNetRechargeRequestDao without any configuration
     */
    public TNetRechargeRequestDao() {
        super(TNetRechargeRequest.T_NET_RECHARGE_REQUEST, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest.class);
    }

    /**
     * Create a new TNetRechargeRequestDao with an attached configuration
     */
    public TNetRechargeRequestDao(Configuration configuration) {
        super(TNetRechargeRequest.T_NET_RECHARGE_REQUEST, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest> fetchById(Long... values) {
        return fetch(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest fetchOneById(Long value) {
        return fetchOne(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.ID, value);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest> fetchByCustomerId(Integer... values) {
        return fetch(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest> fetchByStatus(Byte... values) {
        return fetch(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.STATUS, values);
    }

    /**
     * Fetch records that have <code>pay_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest> fetchByPayType(Byte... values) {
        return fetch(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.PAY_TYPE, values);
    }

    /**
     * Fetch records that have <code>type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest> fetchByTypeId(Byte... values) {
        return fetch(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest> fetchByAmount(BigDecimal... values) {
        return fetch(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.AMOUNT, values);
    }

    /**
     * Fetch records that have <code>order_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest> fetchByOrderId(String... values) {
        return fetch(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.ORDER_ID, values);
    }

    /**
     * Fetch records that have <code>response IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest> fetchByResponse(String... values) {
        return fetch(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.RESPONSE, values);
    }

    /**
     * Fetch records that have <code>source IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest> fetchBySource(Byte... values) {
        return fetch(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.SOURCE, values);
    }

    /**
     * Fetch records that have <code>ip IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest> fetchByIp(Long... values) {
        return fetch(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.IP, values);
    }

    /**
     * Fetch records that have <code>user_agent IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest> fetchByUserAgent(String... values) {
        return fetch(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.USER_AGENT, values);
    }

    /**
     * Fetch records that have <code>sync_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest> fetchBySyncStatus(Byte... values) {
        return fetch(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.SYNC_STATUS, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest> fetchByCdate(Timestamp... values) {
        return fetch(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest> fetchByMdate(Timestamp... values) {
        return fetch(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.MDATE, values);
    }

    /**
     * Fetch records that have <code>notify_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TNetRechargeRequest> fetchByNotifyStatus(Byte... values) {
        return fetch(TNetRechargeRequest.T_NET_RECHARGE_REQUEST.NOTIFY_STATUS, values);
    }
}
