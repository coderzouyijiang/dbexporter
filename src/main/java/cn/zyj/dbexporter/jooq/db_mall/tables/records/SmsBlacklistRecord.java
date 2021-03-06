/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.SmsBlacklist;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class SmsBlacklistRecord extends UpdatableRecordImpl<SmsBlacklistRecord> implements Record3<Integer, String, Byte> {

    private static final long serialVersionUID = 1191770767;

    /**
     * Setter for <code>db_mall.sms_blacklist.id</code>.
     */
    public SmsBlacklistRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.sms_blacklist.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.sms_blacklist.phone</code>.
     */
    public SmsBlacklistRecord setPhone(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.sms_blacklist.phone</code>.
     */
    @NotNull
    @Size(max = 11)
    public String getPhone() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.sms_blacklist.status</code>. 1：启用 0：禁用
     */
    public SmsBlacklistRecord setStatus(Byte value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.sms_blacklist.status</code>. 1：启用 0：禁用
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
        return SmsBlacklist.SMS_BLACKLIST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SmsBlacklist.SMS_BLACKLIST.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return SmsBlacklist.SMS_BLACKLIST.STATUS;
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
    public SmsBlacklistRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsBlacklistRecord value2(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsBlacklistRecord value3(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsBlacklistRecord values(Integer value1, String value2, Byte value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SmsBlacklistRecord
     */
    public SmsBlacklistRecord() {
        super(SmsBlacklist.SMS_BLACKLIST);
    }

    /**
     * Create a detached, initialised SmsBlacklistRecord
     */
    public SmsBlacklistRecord(Integer id, String phone, Byte status) {
        super(SmsBlacklist.SMS_BLACKLIST);

        set(0, id);
        set(1, phone);
        set(2, status);
    }
}
