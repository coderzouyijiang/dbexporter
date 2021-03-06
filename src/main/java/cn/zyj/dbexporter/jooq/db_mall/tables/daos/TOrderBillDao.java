/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TOrderBill;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TOrderBillRecord;

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
public class TOrderBillDao extends DAOImpl<TOrderBillRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill, Long> {

    /**
     * Create a new TOrderBillDao without any configuration
     */
    public TOrderBillDao() {
        super(TOrderBill.T_ORDER_BILL, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill.class);
    }

    /**
     * Create a new TOrderBillDao with an attached configuration
     */
    public TOrderBillDao(Configuration configuration) {
        super(TOrderBill.T_ORDER_BILL, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchById(Long... values) {
        return fetch(TOrderBill.T_ORDER_BILL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill fetchOneById(Long value) {
        return fetchOne(TOrderBill.T_ORDER_BILL.ID, value);
    }

    /**
     * Fetch records that have <code>bill_code IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByBillCode(String... values) {
        return fetch(TOrderBill.T_ORDER_BILL.BILL_CODE, values);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByCustomerId(Integer... values) {
        return fetch(TOrderBill.T_ORDER_BILL.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>order_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByOrderId(String... values) {
        return fetch(TOrderBill.T_ORDER_BILL.ORDER_ID, values);
    }

    /**
     * Fetch records that have <code>main_order_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByMainOrderId(String... values) {
        return fetch(TOrderBill.T_ORDER_BILL.MAIN_ORDER_ID, values);
    }

    /**
     * Fetch records that have <code>coupon_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByCouponId(Integer... values) {
        return fetch(TOrderBill.T_ORDER_BILL.COUPON_ID, values);
    }

    /**
     * Fetch records that have <code>coupon_amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByCouponAmount(BigDecimal... values) {
        return fetch(TOrderBill.T_ORDER_BILL.COUPON_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByAmount(BigDecimal... values) {
        return fetch(TOrderBill.T_ORDER_BILL.AMOUNT, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByStatus(Byte... values) {
        return fetch(TOrderBill.T_ORDER_BILL.STATUS, values);
    }

    /**
     * Fetch records that have <code>type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByTypeId(Integer... values) {
        return fetch(TOrderBill.T_ORDER_BILL.TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>source IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchBySource(Integer... values) {
        return fetch(TOrderBill.T_ORDER_BILL.SOURCE, values);
    }

    /**
     * Fetch records that have <code>month IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByMonth(Integer... values) {
        return fetch(TOrderBill.T_ORDER_BILL.MONTH, values);
    }

    /**
     * Fetch records that have <code>remark IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByRemark(String... values) {
        return fetch(TOrderBill.T_ORDER_BILL.REMARK, values);
    }

    /**
     * Fetch records that have <code>pay_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByPayDate(Timestamp... values) {
        return fetch(TOrderBill.T_ORDER_BILL.PAY_DATE, values);
    }

    /**
     * Fetch records that have <code>balance_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByBalanceDate(Integer... values) {
        return fetch(TOrderBill.T_ORDER_BILL.BALANCE_DATE, values);
    }

    /**
     * Fetch records that have <code>cut_money_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByCutMoneyDate(Integer... values) {
        return fetch(TOrderBill.T_ORDER_BILL.CUT_MONEY_DATE, values);
    }

    /**
     * Fetch records that have <code>bill_month IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByBillMonth(Integer... values) {
        return fetch(TOrderBill.T_ORDER_BILL.BILL_MONTH, values);
    }

    /**
     * Fetch records that have <code>source_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchBySourceId(Integer... values) {
        return fetch(TOrderBill.T_ORDER_BILL.SOURCE_ID, values);
    }

    /**
     * Fetch records that have <code>deposit IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByDeposit(BigDecimal... values) {
        return fetch(TOrderBill.T_ORDER_BILL.DEPOSIT, values);
    }

    /**
     * Fetch records that have <code>credit_deposit IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByCreditDeposit(BigDecimal... values) {
        return fetch(TOrderBill.T_ORDER_BILL.CREDIT_DEPOSIT, values);
    }

    /**
     * Fetch records that have <code>is_expire IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByIsExpire(Byte... values) {
        return fetch(TOrderBill.T_ORDER_BILL.IS_EXPIRE, values);
    }

    /**
     * Fetch records that have <code>sms_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchBySmsDate(Integer... values) {
        return fetch(TOrderBill.T_ORDER_BILL.SMS_DATE, values);
    }

    /**
     * Fetch records that have <code>payed_amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByPayedAmount(BigDecimal... values) {
        return fetch(TOrderBill.T_ORDER_BILL.PAYED_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>e_currency_virtual IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByECurrencyVirtual(BigDecimal... values) {
        return fetch(TOrderBill.T_ORDER_BILL.E_CURRENCY_VIRTUAL, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByCdate(Timestamp... values) {
        return fetch(TOrderBill.T_ORDER_BILL.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByMdate(Timestamp... values) {
        return fetch(TOrderBill.T_ORDER_BILL.MDATE, values);
    }

    /**
     * Fetch records that have <code>sync_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchBySyncStatus(Short... values) {
        return fetch(TOrderBill.T_ORDER_BILL.SYNC_STATUS, values);
    }

    /**
     * Fetch records that have <code>bill_group IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByBillGroup(Long... values) {
        return fetch(TOrderBill.T_ORDER_BILL.BILL_GROUP, values);
    }

    /**
     * Fetch records that have <code>batch_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByBatchId(Long... values) {
        return fetch(TOrderBill.T_ORDER_BILL.BATCH_ID, values);
    }

    /**
     * Fetch records that have <code>after_payed IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByAfterPayed(Byte... values) {
        return fetch(TOrderBill.T_ORDER_BILL.AFTER_PAYED, values);
    }

    /**
     * Fetch records that have <code>effect IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBill> fetchByEffect(Integer... values) {
        return fetch(TOrderBill.T_ORDER_BILL.EFFECT, values);
    }
}
