/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TOrderBalance;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TOrderBalanceRecord;

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
public class TOrderBalanceDao extends DAOImpl<TOrderBalanceRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance, String> {

    /**
     * Create a new TOrderBalanceDao without any configuration
     */
    public TOrderBalanceDao() {
        super(TOrderBalance.T_ORDER_BALANCE, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance.class);
    }

    /**
     * Create a new TOrderBalanceDao with an attached configuration
     */
    public TOrderBalanceDao(Configuration configuration) {
        super(TOrderBalance.T_ORDER_BALANCE, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance object) {
        return object.getOrderId();
    }

    /**
     * Fetch records that have <code>order_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByOrderId(String... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.ORDER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>order_id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance fetchOneByOrderId(String value) {
        return fetchOne(TOrderBalance.T_ORDER_BALANCE.ORDER_ID, value);
    }

    /**
     * Fetch records that have <code>pay_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByPayStatus(Byte... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.PAY_STATUS, values);
    }

    /**
     * Fetch records that have <code>deposit IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByDeposit(BigDecimal... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.DEPOSIT, values);
    }

    /**
     * Fetch records that have <code>credit_deposit IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByCreditDeposit(BigDecimal... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.CREDIT_DEPOSIT, values);
    }

    /**
     * Fetch records that have <code>pay_deposit IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByPayDeposit(BigDecimal... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.PAY_DEPOSIT, values);
    }

    /**
     * Fetch records that have <code>deposit_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByDepositType(Byte... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.DEPOSIT_TYPE, values);
    }

    /**
     * Fetch records that have <code>coupon_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByCouponId(Integer... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.COUPON_ID, values);
    }

    /**
     * Fetch records that have <code>coupon_amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByCouponAmount(BigDecimal... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.COUPON_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>insurance_amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByInsuranceAmount(BigDecimal... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.INSURANCE_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>added_service_amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByAddedServiceAmount(BigDecimal... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.ADDED_SERVICE_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>payed_amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByPayedAmount(BigDecimal... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.PAYED_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>e_currency_virtual IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByECurrencyVirtual(BigDecimal... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.E_CURRENCY_VIRTUAL, values);
    }

    /**
     * Fetch records that have <code>sale_amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchBySaleAmount(BigDecimal... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.SALE_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>rent IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByRent(BigDecimal... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.RENT, values);
    }

    /**
     * Fetch records that have <code>need_amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByNeedAmount(BigDecimal... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.NEED_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>use_coupon_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByUseCouponDate(Timestamp... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.USE_COUPON_DATE, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByCdate(Timestamp... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBalance> fetchByMdate(Timestamp... values) {
        return fetch(TOrderBalance.T_ORDER_BALANCE.MDATE, values);
    }
}
