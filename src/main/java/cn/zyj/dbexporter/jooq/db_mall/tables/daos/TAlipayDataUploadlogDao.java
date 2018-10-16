/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TAlipayDataUploadlog;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TAlipayDataUploadlogRecord;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 支付宝回传数据日志记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAlipayDataUploadlogDao extends DAOImpl<TAlipayDataUploadlogRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog, Integer> {

    /**
     * Create a new TAlipayDataUploadlogDao without any configuration
     */
    public TAlipayDataUploadlogDao() {
        super(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog.class);
    }

    /**
     * Create a new TAlipayDataUploadlogDao with an attached configuration
     */
    public TAlipayDataUploadlogDao(Configuration configuration) {
        super(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchById(Integer... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog fetchOneById(Integer value) {
        return fetchOne(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.ID, value);
    }

    /**
     * Fetch records that have <code>main_order_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByMainOrderId(String... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.MAIN_ORDER_ID, values);
    }

    /**
     * Fetch records that have <code>order_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByOrderId(String... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.ORDER_ID, values);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByCustomerId(Integer... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>biz_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByBizDate(Date... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.BIZ_DATE, values);
    }

    /**
     * Fetch records that have <code>upload_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByUploadStatus(Byte... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.UPLOAD_STATUS, values);
    }

    /**
     * Fetch records that have <code>upload_situation IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByUploadSituation(Byte... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.UPLOAD_SITUATION, values);
    }

    /**
     * Fetch records that have <code>bill_no IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByBillNo(Integer... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.BILL_NO, values);
    }

    /**
     * Fetch records that have <code>user_credentials_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByUserCredentialsType(String... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.USER_CREDENTIALS_TYPE, values);
    }

    /**
     * Fetch records that have <code>user_credentials_no IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByUserCredentialsNo(String... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.USER_CREDENTIALS_NO, values);
    }

    /**
     * Fetch records that have <code>user_name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByUserName(String... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.USER_NAME, values);
    }

    /**
     * Fetch records that have <code>ent_credentials_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByEntCredentialsType(Byte... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.ENT_CREDENTIALS_TYPE, values);
    }

    /**
     * Fetch records that have <code>ent_credentials_no IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByEntCredentialsNo(String... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.ENT_CREDENTIALS_NO, values);
    }

    /**
     * Fetch records that have <code>ent_name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByEntName(String... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.ENT_NAME, values);
    }

    /**
     * Fetch records that have <code>guarantee_flag IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByGuaranteeFlag(Byte... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.GUARANTEE_FLAG, values);
    }

    /**
     * Fetch records that have <code>order_no IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByOrderNo(String... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.ORDER_NO, values);
    }

    /**
     * Fetch records that have <code>credit_no IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByCreditNo(String... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.CREDIT_NO, values);
    }

    /**
     * Fetch records that have <code>business_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByBusinessType(Byte... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.BUSINESS_TYPE, values);
    }

    /**
     * Fetch records that have <code>order_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByOrderStatus(Byte... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.ORDER_STATUS, values);
    }

    /**
     * Fetch records that have <code>order_start_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByOrderStartDate(Date... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.ORDER_START_DATE, values);
    }

    /**
     * Fetch records that have <code>order_due_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByOrderDueDate(Date... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.ORDER_DUE_DATE, values);
    }

    /**
     * Fetch records that have <code>order_end_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByOrderEndDate(Date... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.ORDER_END_DATE, values);
    }

    /**
     * Fetch records that have <code>reject_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByRejectType(Integer... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.REJECT_TYPE, values);
    }

    /**
     * Fetch records that have <code>create_amt IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByCreateAmt(BigDecimal... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.CREATE_AMT, values);
    }

    /**
     * Fetch records that have <code>review_flag IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByReviewFlag(Byte... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.REVIEW_FLAG, values);
    }

    /**
     * Fetch records that have <code>review_address IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByReviewAddress(String... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.REVIEW_ADDRESS, values);
    }

    /**
     * Fetch records that have <code>bill_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByBillType(Short... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.BILL_TYPE, values);
    }

    /**
     * Fetch records that have <code>bill_installment IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByBillInstallment(Integer... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.BILL_INSTALLMENT, values);
    }

    /**
     * Fetch records that have <code>bill_amt IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByBillAmt(BigDecimal... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.BILL_AMT, values);
    }

    /**
     * Fetch records that have <code>bill_last_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByBillLastDate(Date... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.BILL_LAST_DATE, values);
    }

    /**
     * Fetch records that have <code>bill_payoff_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByBillPayoffDate(Date... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.BILL_PAYOFF_DATE, values);
    }

    /**
     * Fetch records that have <code>bill_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByBillStatus(Byte... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.BILL_STATUS, values);
    }

    /**
     * Fetch records that have <code>bill_type_ovd_amt IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByBillTypeOvdAmt(BigDecimal... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.BILL_TYPE_OVD_AMT, values);
    }

    /**
     * Fetch records that have <code>bill_type_ovd_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByBillTypeOvdDate(Date... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.BILL_TYPE_OVD_DATE, values);
    }

    /**
     * Fetch records that have <code>memo IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByMemo(String... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.MEMO, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByCreateTime(Timestamp... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>update_time IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByUpdateTime(Timestamp... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.UPDATE_TIME, values);
    }

    /**
     * Fetch records that have <code>task_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAlipayDataUploadlog> fetchByTaskId(String... values) {
        return fetch(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG.TASK_ID, values);
    }
}