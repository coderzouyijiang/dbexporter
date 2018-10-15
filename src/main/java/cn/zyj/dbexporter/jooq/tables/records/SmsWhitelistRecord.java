/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.SmsWhitelist;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class SmsWhitelistRecord extends UpdatableRecordImpl<SmsWhitelistRecord> implements Record3<Integer, String, Byte> {

    private static final long serialVersionUID = -1476546941;

    /**
     * Setter for <code>db_mall.sms_whitelist.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.sms_whitelist.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.sms_whitelist.phone</code>.
     */
    public void setPhone(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.sms_whitelist.phone</code>.
     */
    public String getPhone() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.sms_whitelist.status</code>. 0：启用 1：禁用
     */
    public void setStatus(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.sms_whitelist.status</code>. 0：启用 1：禁用
     */
    public Byte getStatus() {
        return (Byte) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Byte> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Byte> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SmsWhitelist.SMS_WHITELIST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SmsWhitelist.SMS_WHITELIST.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return SmsWhitelist.SMS_WHITELIST.STATUS;
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
    public String component2() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getStatus();
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
    public String value2() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsWhitelistRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsWhitelistRecord value2(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsWhitelistRecord value3(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsWhitelistRecord values(Integer value1, String value2, Byte value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SmsWhitelistRecord
     */
    public SmsWhitelistRecord() {
        super(SmsWhitelist.SMS_WHITELIST);
    }

    /**
     * Create a detached, initialised SmsWhitelistRecord
     */
    public SmsWhitelistRecord(Integer id, String phone, Byte status) {
        super(SmsWhitelist.SMS_WHITELIST);

        set(0, id);
        set(1, phone);
        set(2, status);
    }
}
