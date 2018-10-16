/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TCustomerPasswdChangeLog;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TCustomerPasswdChangeLogRecord extends UpdatableRecordImpl<TCustomerPasswdChangeLogRecord> implements Record7<Integer, Integer, Byte, Long, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1357920651;

    /**
     * Setter for <code>db_mall.t_customer_passwd_change_log.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_passwd_change_log.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_customer_passwd_change_log.customer_id</code>.
     */
    public void setCustomerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_passwd_change_log.customer_id</code>.
     */
    public Integer getCustomerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_customer_passwd_change_log.type_id</code>.
     */
    public void setTypeId(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_passwd_change_log.type_id</code>.
     */
    public Byte getTypeId() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>db_mall.t_customer_passwd_change_log.ip</code>.
     */
    public void setIp(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_passwd_change_log.ip</code>.
     */
    public Long getIp() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>db_mall.t_customer_passwd_change_log.user_agent</code>.
     */
    public void setUserAgent(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_passwd_change_log.user_agent</code>.
     */
    public String getUserAgent() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_customer_passwd_change_log.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_passwd_change_log.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>db_mall.t_customer_passwd_change_log.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_passwd_change_log.mdate</code>.
     */
    public Timestamp getMdate() {
        return (Timestamp) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Byte, Long, String, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Byte, Long, String, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG.TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG.IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG.USER_AGENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG.MDATE;
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
    public Byte component3() {
        return getTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUserAgent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
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
    public Byte value3() {
        return getTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUserAgent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerPasswdChangeLogRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerPasswdChangeLogRecord value2(Integer value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerPasswdChangeLogRecord value3(Byte value) {
        setTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerPasswdChangeLogRecord value4(Long value) {
        setIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerPasswdChangeLogRecord value5(String value) {
        setUserAgent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerPasswdChangeLogRecord value6(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerPasswdChangeLogRecord value7(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerPasswdChangeLogRecord values(Integer value1, Integer value2, Byte value3, Long value4, String value5, Timestamp value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TCustomerPasswdChangeLogRecord
     */
    public TCustomerPasswdChangeLogRecord() {
        super(TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG);
    }

    /**
     * Create a detached, initialised TCustomerPasswdChangeLogRecord
     */
    public TCustomerPasswdChangeLogRecord(Integer id, Integer customerId, Byte typeId, Long ip, String userAgent, Timestamp cdate, Timestamp mdate) {
        super(TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG);

        set(0, id);
        set(1, customerId);
        set(2, typeId);
        set(3, ip);
        set(4, userAgent);
        set(5, cdate);
        set(6, mdate);
    }
}