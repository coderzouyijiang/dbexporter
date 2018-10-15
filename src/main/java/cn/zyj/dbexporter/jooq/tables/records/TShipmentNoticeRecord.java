/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TShipmentNotice;

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
public class TShipmentNoticeRecord extends UpdatableRecordImpl<TShipmentNoticeRecord> implements Record7<Integer, Integer, Integer, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -434409090;

    /**
     * Setter for <code>db_mall.t_shipment_notice.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_shipment_notice.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_shipment_notice.customer_id</code>.
     */
    public void setCustomerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_shipment_notice.customer_id</code>.
     */
    public Integer getCustomerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_shipment_notice.product_id</code>.
     */
    public void setProductId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_shipment_notice.product_id</code>.
     */
    public Integer getProductId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_shipment_notice.contact_phone</code>. 联系手机号
     */
    public void setContactPhone(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_shipment_notice.contact_phone</code>. 联系手机号
     */
    public String getContactPhone() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.t_shipment_notice.is_send</code>. 是否通知
     */
    public void setIsSend(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_shipment_notice.is_send</code>. 是否通知
     */
    public Byte getIsSend() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>db_mall.t_shipment_notice.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_shipment_notice.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>db_mall.t_shipment_notice.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_shipment_notice.mdate</code>.
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
    public Row7<Integer, Integer, Integer, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TShipmentNotice.T_SHIPMENT_NOTICE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TShipmentNotice.T_SHIPMENT_NOTICE.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TShipmentNotice.T_SHIPMENT_NOTICE.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TShipmentNotice.T_SHIPMENT_NOTICE.CONTACT_PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TShipmentNotice.T_SHIPMENT_NOTICE.IS_SEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TShipmentNotice.T_SHIPMENT_NOTICE.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TShipmentNotice.T_SHIPMENT_NOTICE.MDATE;
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
    public Integer component3() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getContactPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getIsSend();
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
    public Integer value3() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getContactPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getIsSend();
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
    public TShipmentNoticeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TShipmentNoticeRecord value2(Integer value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TShipmentNoticeRecord value3(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TShipmentNoticeRecord value4(String value) {
        setContactPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TShipmentNoticeRecord value5(Byte value) {
        setIsSend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TShipmentNoticeRecord value6(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TShipmentNoticeRecord value7(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TShipmentNoticeRecord values(Integer value1, Integer value2, Integer value3, String value4, Byte value5, Timestamp value6, Timestamp value7) {
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
     * Create a detached TShipmentNoticeRecord
     */
    public TShipmentNoticeRecord() {
        super(TShipmentNotice.T_SHIPMENT_NOTICE);
    }

    /**
     * Create a detached, initialised TShipmentNoticeRecord
     */
    public TShipmentNoticeRecord(Integer id, Integer customerId, Integer productId, String contactPhone, Byte isSend, Timestamp cdate, Timestamp mdate) {
        super(TShipmentNotice.T_SHIPMENT_NOTICE);

        set(0, id);
        set(1, customerId);
        set(2, productId);
        set(3, contactPhone);
        set(4, isSend);
        set(5, cdate);
        set(6, mdate);
    }
}
