/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCustomerToSaasLog;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 客户跳转至saas日志记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCustomerToSaasLogRecord extends UpdatableRecordImpl<TCustomerToSaasLogRecord> implements Record6<Integer, Integer, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1931966862;

    /**
     * Setter for <code>db_mall.t_customer_to_saas_log.id</code>. 主键id
     */
    public TCustomerToSaasLogRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_to_saas_log.id</code>. 主键id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_customer_to_saas_log.customer_id</code>. 客户id
     */
    public TCustomerToSaasLogRecord setCustomerId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_to_saas_log.customer_id</code>. 客户id
     */
    @NotNull
    public Integer getCustomerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_customer_to_saas_log.company_name</code>. 客户名称
     */
    public TCustomerToSaasLogRecord setCompanyName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_to_saas_log.company_name</code>. 客户名称
     */
    @Size(max = 300)
    public String getCompanyName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_customer_to_saas_log.day_time</code>. 所在天,格式yyyyMMdd
     */
    public TCustomerToSaasLogRecord setDayTime(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_to_saas_log.day_time</code>. 所在天,格式yyyyMMdd
     */
    @NotNull
    public Integer getDayTime() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_mall.t_customer_to_saas_log.cdate</code>. 创建时间
     */
    public TCustomerToSaasLogRecord setCdate(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_to_saas_log.cdate</code>. 创建时间
     */
    @NotNull
    public Timestamp getCdate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>db_mall.t_customer_to_saas_log.mdate</code>. 修改时间
     */
    public TCustomerToSaasLogRecord setMdate(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_to_saas_log.mdate</code>. 修改时间
     */
    @NotNull
    public Timestamp getMdate() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG.COMPANY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG.DAY_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG.MDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getDayTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDayTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerToSaasLogRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerToSaasLogRecord value2(Integer value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerToSaasLogRecord value3(String value) {
        setCompanyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerToSaasLogRecord value4(Integer value) {
        setDayTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerToSaasLogRecord value5(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerToSaasLogRecord value6(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerToSaasLogRecord values(Integer value1, Integer value2, String value3, Integer value4, Timestamp value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TCustomerToSaasLogRecord
     */
    public TCustomerToSaasLogRecord() {
        super(TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG);
    }

    /**
     * Create a detached, initialised TCustomerToSaasLogRecord
     */
    public TCustomerToSaasLogRecord(Integer id, Integer customerId, String companyName, Integer dayTime, Timestamp cdate, Timestamp mdate) {
        super(TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG);

        set(0, id);
        set(1, customerId);
        set(2, companyName);
        set(3, dayTime);
        set(4, cdate);
        set(5, mdate);
    }
}
