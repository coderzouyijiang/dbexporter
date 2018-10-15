/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TSmsFilter;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


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
public class TSmsFilterRecord extends UpdatableRecordImpl<TSmsFilterRecord> implements Record8<ULong, String, String, Byte, UByte, UByte, Timestamp, String> {

    private static final long serialVersionUID = -1511272395;

    /**
     * Setter for <code>db_mall.t_sms_filter.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_sms_filter.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>db_mall.t_sms_filter.phone</code>.
     */
    public void setPhone(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_sms_filter.phone</code>.
     */
    public String getPhone() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_sms_filter.content</code>.
     */
    public void setContent(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_sms_filter.content</code>.
     */
    public String getContent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_sms_filter.type_id</code>.
     */
    public void setTypeId(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_sms_filter.type_id</code>.
     */
    public Byte getTypeId() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>db_mall.t_sms_filter.sys_type</code>.
     */
    public void setSysType(UByte value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_sms_filter.sys_type</code>.
     */
    public UByte getSysType() {
        return (UByte) get(4);
    }

    /**
     * Setter for <code>db_mall.t_sms_filter.biz_type</code>.
     */
    public void setBizType(UByte value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_sms_filter.biz_type</code>.
     */
    public UByte getBizType() {
        return (UByte) get(5);
    }

    /**
     * Setter for <code>db_mall.t_sms_filter.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_sms_filter.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>db_mall.t_sms_filter.reason</code>.
     */
    public void setReason(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_sms_filter.reason</code>.
     */
    public String getReason() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, String, String, Byte, UByte, UByte, Timestamp, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<ULong, String, String, Byte, UByte, UByte, Timestamp, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TSmsFilter.T_SMS_FILTER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TSmsFilter.T_SMS_FILTER.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TSmsFilter.T_SMS_FILTER.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TSmsFilter.T_SMS_FILTER.TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field5() {
        return TSmsFilter.T_SMS_FILTER.SYS_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field6() {
        return TSmsFilter.T_SMS_FILTER.BIZ_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TSmsFilter.T_SMS_FILTER.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TSmsFilter.T_SMS_FILTER.REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
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
    public String component3() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component5() {
        return getSysType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component6() {
        return getBizType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
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
    public String value3() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value5() {
        return getSysType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value6() {
        return getBizType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsFilterRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsFilterRecord value2(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsFilterRecord value3(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsFilterRecord value4(Byte value) {
        setTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsFilterRecord value5(UByte value) {
        setSysType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsFilterRecord value6(UByte value) {
        setBizType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsFilterRecord value7(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsFilterRecord value8(String value) {
        setReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsFilterRecord values(ULong value1, String value2, String value3, Byte value4, UByte value5, UByte value6, Timestamp value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TSmsFilterRecord
     */
    public TSmsFilterRecord() {
        super(TSmsFilter.T_SMS_FILTER);
    }

    /**
     * Create a detached, initialised TSmsFilterRecord
     */
    public TSmsFilterRecord(ULong id, String phone, String content, Byte typeId, UByte sysType, UByte bizType, Timestamp cdate, String reason) {
        super(TSmsFilter.T_SMS_FILTER);

        set(0, id);
        set(1, phone);
        set(2, content);
        set(3, typeId);
        set(4, sysType);
        set(5, bizType);
        set(6, cdate);
        set(7, reason);
    }
}
