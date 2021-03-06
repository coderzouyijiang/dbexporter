/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TOrderRefund;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TOrderRefundRecord;

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
public class TOrderRefundDao extends DAOImpl<TOrderRefundRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund, Integer> {

    /**
     * Create a new TOrderRefundDao without any configuration
     */
    public TOrderRefundDao() {
        super(TOrderRefund.T_ORDER_REFUND, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund.class);
    }

    /**
     * Create a new TOrderRefundDao with an attached configuration
     */
    public TOrderRefundDao(Configuration configuration) {
        super(TOrderRefund.T_ORDER_REFUND, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund> fetchById(Integer... values) {
        return fetch(TOrderRefund.T_ORDER_REFUND.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund fetchOneById(Integer value) {
        return fetchOne(TOrderRefund.T_ORDER_REFUND.ID, value);
    }

    /**
     * Fetch records that have <code>item_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund> fetchByItemId(Long... values) {
        return fetch(TOrderRefund.T_ORDER_REFUND.ITEM_ID, values);
    }

    /**
     * Fetch records that have <code>item_detail_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund> fetchByItemDetailId(Long... values) {
        return fetch(TOrderRefund.T_ORDER_REFUND.ITEM_DETAIL_ID, values);
    }

    /**
     * Fetch records that have <code>order_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund> fetchByOrderId(String... values) {
        return fetch(TOrderRefund.T_ORDER_REFUND.ORDER_ID, values);
    }

    /**
     * Fetch records that have <code>amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund> fetchByAmount(BigDecimal... values) {
        return fetch(TOrderRefund.T_ORDER_REFUND.AMOUNT, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund> fetchByType(Integer... values) {
        return fetch(TOrderRefund.T_ORDER_REFUND.TYPE, values);
    }

    /**
     * Fetch records that have <code>month IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund> fetchByMonth(Integer... values) {
        return fetch(TOrderRefund.T_ORDER_REFUND.MONTH, values);
    }

    /**
     * Fetch records that have <code>money_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund> fetchByMoneyType(Integer... values) {
        return fetch(TOrderRefund.T_ORDER_REFUND.MONEY_TYPE, values);
    }

    /**
     * Fetch records that have <code>reason IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund> fetchByReason(String... values) {
        return fetch(TOrderRefund.T_ORDER_REFUND.REASON, values);
    }

    /**
     * Fetch records that have <code>remark IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund> fetchByRemark(String... values) {
        return fetch(TOrderRefund.T_ORDER_REFUND.REMARK, values);
    }

    /**
     * Fetch records that have <code>bill_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund> fetchByBillId(Long... values) {
        return fetch(TOrderRefund.T_ORDER_REFUND.BILL_ID, values);
    }

    /**
     * Fetch records that have <code>sns IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund> fetchBySns(String... values) {
        return fetch(TOrderRefund.T_ORDER_REFUND.SNS, values);
    }

    /**
     * Fetch records that have <code>sync_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund> fetchBySyncStatus(Byte... values) {
        return fetch(TOrderRefund.T_ORDER_REFUND.SYNC_STATUS, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund> fetchByCdate(Timestamp... values) {
        return fetch(TOrderRefund.T_ORDER_REFUND.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRefund> fetchByMdate(Timestamp... values) {
        return fetch(TOrderRefund.T_ORDER_REFUND.MDATE, values);
    }
}
