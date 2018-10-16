/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCustomer;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCustomerRecord;

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
public class TCustomerDao extends DAOImpl<TCustomerRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer, Integer> {

    /**
     * Create a new TCustomerDao without any configuration
     */
    public TCustomerDao() {
        super(TCustomer.T_CUSTOMER, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer.class);
    }

    /**
     * Create a new TCustomerDao with an attached configuration
     */
    public TCustomerDao(Configuration configuration) {
        super(TCustomer.T_CUSTOMER, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchById(Integer... values) {
        return fetch(TCustomer.T_CUSTOMER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer fetchOneById(Integer value) {
        return fetchOne(TCustomer.T_CUSTOMER.ID, value);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByPhone(String... values) {
        return fetch(TCustomer.T_CUSTOMER.PHONE, values);
    }

    /**
     * Fetch records that have <code>receive_phone IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByReceivePhone(String... values) {
        return fetch(TCustomer.T_CUSTOMER.RECEIVE_PHONE, values);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByEmail(String... values) {
        return fetch(TCustomer.T_CUSTOMER.EMAIL, values);
    }

    /**
     * Fetch records that have <code>password IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByPassword(String... values) {
        return fetch(TCustomer.T_CUSTOMER.PASSWORD, values);
    }

    /**
     * Fetch records that have <code>salt IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchBySalt(String... values) {
        return fetch(TCustomer.T_CUSTOMER.SALT, values);
    }

    /**
     * Fetch records that have <code>register_ip IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByRegisterIp(Long... values) {
        return fetch(TCustomer.T_CUSTOMER.REGISTER_IP, values);
    }

    /**
     * Fetch records that have <code>first_order_time IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByFirstOrderTime(Timestamp... values) {
        return fetch(TCustomer.T_CUSTOMER.FIRST_ORDER_TIME, values);
    }

    /**
     * Fetch records that have <code>pay_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByPayType(Byte... values) {
        return fetch(TCustomer.T_CUSTOMER.PAY_TYPE, values);
    }

    /**
     * Fetch records that have <code>band_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByBandId(Integer... values) {
        return fetch(TCustomer.T_CUSTOMER.BAND_ID, values);
    }

    /**
     * Fetch records that have <code>balance_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByBalanceDate(Integer... values) {
        return fetch(TCustomer.T_CUSTOMER.BALANCE_DATE, values);
    }

    /**
     * Fetch records that have <code>is_expire IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByIsExpire(Byte... values) {
        return fetch(TCustomer.T_CUSTOMER.IS_EXPIRE, values);
    }

    /**
     * Fetch records that have <code>source IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchBySource(Byte... values) {
        return fetch(TCustomer.T_CUSTOMER.SOURCE, values);
    }

    /**
     * Fetch records that have <code>true_name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByTrueName(String... values) {
        return fetch(TCustomer.T_CUSTOMER.TRUE_NAME, values);
    }

    /**
     * Fetch records that have <code>card_no IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByCardNo(String... values) {
        return fetch(TCustomer.T_CUSTOMER.CARD_NO, values);
    }

    /**
     * Fetch records that have <code>company_name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByCompanyName(String... values) {
        return fetch(TCustomer.T_CUSTOMER.COMPANY_NAME, values);
    }

    /**
     * Fetch records that have <code>server_remark IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByServerRemark(String... values) {
        return fetch(TCustomer.T_CUSTOMER.SERVER_REMARK, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByStatus(Byte... values) {
        return fetch(TCustomer.T_CUSTOMER.STATUS, values);
    }

    /**
     * Fetch records that have <code>wx_open_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByWxOpenId(String... values) {
        return fetch(TCustomer.T_CUSTOMER.WX_OPEN_ID, values);
    }

    /**
     * Fetch records that have <code>available_balance IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByAvailableBalance(BigDecimal... values) {
        return fetch(TCustomer.T_CUSTOMER.AVAILABLE_BALANCE, values);
    }

    /**
     * Fetch records that have <code>exchange_frozen_balance IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByExchangeFrozenBalance(BigDecimal... values) {
        return fetch(TCustomer.T_CUSTOMER.EXCHANGE_FROZEN_BALANCE, values);
    }

    /**
     * Fetch records that have <code>frozen_balance IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByFrozenBalance(BigDecimal... values) {
        return fetch(TCustomer.T_CUSTOMER.FROZEN_BALANCE, values);
    }

    /**
     * Fetch records that have <code>total_invoice_balance IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByTotalInvoiceBalance(BigDecimal... values) {
        return fetch(TCustomer.T_CUSTOMER.TOTAL_INVOICE_BALANCE, values);
    }

    /**
     * Fetch records that have <code>error_login_time IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByErrorLoginTime(Integer... values) {
        return fetch(TCustomer.T_CUSTOMER.ERROR_LOGIN_TIME, values);
    }

    /**
     * Fetch records that have <code>demand_withdraw_balance IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByDemandWithdrawBalance(BigDecimal... values) {
        return fetch(TCustomer.T_CUSTOMER.DEMAND_WITHDRAW_BALANCE, values);
    }

    /**
     * Fetch records that have <code>available_invoice_balance IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByAvailableInvoiceBalance(BigDecimal... values) {
        return fetch(TCustomer.T_CUSTOMER.AVAILABLE_INVOICE_BALANCE, values);
    }

    /**
     * Fetch records that have <code>e_currency_virtual IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByECurrencyVirtual(BigDecimal... values) {
        return fetch(TCustomer.T_CUSTOMER.E_CURRENCY_VIRTUAL, values);
    }

    /**
     * Fetch records that have <code>e_currency_true IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByECurrencyTrue(BigDecimal... values) {
        return fetch(TCustomer.T_CUSTOMER.E_CURRENCY_TRUE, values);
    }

    /**
     * Fetch records that have <code>expire_invoice_balance IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByExpireInvoiceBalance(BigDecimal... values) {
        return fetch(TCustomer.T_CUSTOMER.EXPIRE_INVOICE_BALANCE, values);
    }

    /**
     * Fetch records that have <code>demand_invoice_balance IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByDemandInvoiceBalance(BigDecimal... values) {
        return fetch(TCustomer.T_CUSTOMER.DEMAND_INVOICE_BALANCE, values);
    }

    /**
     * Fetch records that have <code>sync_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchBySyncStatus(Byte... values) {
        return fetch(TCustomer.T_CUSTOMER.SYNC_STATUS, values);
    }

    /**
     * Fetch records that have <code>from_ad_source IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByFromAdSource(String... values) {
        return fetch(TCustomer.T_CUSTOMER.FROM_AD_SOURCE, values);
    }

    /**
     * Fetch records that have <code>reg_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByRegDate(Integer... values) {
        return fetch(TCustomer.T_CUSTOMER.REG_DATE, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByCdate(Timestamp... values) {
        return fetch(TCustomer.T_CUSTOMER.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByMdate(Timestamp... values) {
        return fetch(TCustomer.T_CUSTOMER.MDATE, values);
    }

    /**
     * Fetch records that have <code>debit_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByDebitDate(Integer... values) {
        return fetch(TCustomer.T_CUSTOMER.DEBIT_DATE, values);
    }

    /**
     * Fetch records that have <code>is_pilot IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByIsPilot(Byte... values) {
        return fetch(TCustomer.T_CUSTOMER.IS_PILOT, values);
    }

    /**
     * Fetch records that have <code>account IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByAccount(String... values) {
        return fetch(TCustomer.T_CUSTOMER.ACCOUNT, values);
    }

    /**
     * Fetch records that have <code>is_activate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByIsActivate(Byte... values) {
        return fetch(TCustomer.T_CUSTOMER.IS_ACTIVATE, values);
    }

    /**
     * Fetch records that have <code>auth_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByAuthType(Integer... values) {
        return fetch(TCustomer.T_CUSTOMER.AUTH_TYPE, values);
    }

    /**
     * Fetch records that have <code>bill_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByBillType(Byte... values) {
        return fetch(TCustomer.T_CUSTOMER.BILL_TYPE, values);
    }

    /**
     * Fetch records that have <code>test IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByTest(Boolean... values) {
        return fetch(TCustomer.T_CUSTOMER.TEST, values);
    }

    /**
     * Fetch records that have <code>past_available_invoice_balance IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByPastAvailableInvoiceBalance(BigDecimal... values) {
        return fetch(TCustomer.T_CUSTOMER.PAST_AVAILABLE_INVOICE_BALANCE, values);
    }

    /**
     * Fetch records that have <code>is_dynamic_pay_date_customer IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByIsDynamicPayDateCustomer(Byte... values) {
        return fetch(TCustomer.T_CUSTOMER.IS_DYNAMIC_PAY_DATE_CUSTOMER, values);
    }

    /**
     * Fetch records that have <code>days_after_workdays IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomer> fetchByDaysAfterWorkdays(Integer... values) {
        return fetch(TCustomer.T_CUSTOMER.DAYS_AFTER_WORKDAYS, values);
    }
}