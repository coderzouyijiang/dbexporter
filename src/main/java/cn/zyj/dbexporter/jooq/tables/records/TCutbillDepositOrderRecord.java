/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TCutbillDepositOrder;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 押金全付+用押金抵扣租金的方式的订单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCutbillDepositOrderRecord extends UpdatableRecordImpl<TCutbillDepositOrderRecord> implements Record9<Integer, String, Integer, Integer, String, Byte, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1332693507;

    /**
     * Setter for <code>db_mall.t_cutbill_deposit_order.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_cutbill_deposit_order.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_cutbill_deposit_order.order_id</code>. 子订单号
     */
    public void setOrderId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_cutbill_deposit_order.order_id</code>. 子订单号
     */
    public String getOrderId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_cutbill_deposit_order.product_id</code>. 商品ID
     */
    public void setProductId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_cutbill_deposit_order.product_id</code>. 商品ID
     */
    public Integer getProductId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_cutbill_deposit_order.customer_id</code>. 用户id
     */
    public void setCustomerId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_cutbill_deposit_order.customer_id</code>. 用户id
     */
    public Integer getCustomerId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_mall.t_cutbill_deposit_order.title</code>. 主标题
     */
    public void setTitle(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_cutbill_deposit_order.title</code>. 主标题
     */
    public String getTitle() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_cutbill_deposit_order.rent_type</code>. 为方便以后扩展别的方式的订单，0销售 1：随租随还 2：经营租赁 3：融资租赁,4押金全付+押金自动抵扣租金
     */
    public void setRentType(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_cutbill_deposit_order.rent_type</code>. 为方便以后扩展别的方式的订单，0销售 1：随租随还 2：经营租赁 3：融资租赁,4押金全付+押金自动抵扣租金
     */
    public Byte getRentType() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>db_mall.t_cutbill_deposit_order.status</code>. 状态：0无效，1有效  (有效订单才会去刷账单)
     */
    public void setStatus(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_cutbill_deposit_order.status</code>. 状态：0无效，1有效  (有效订单才会去刷账单)
     */
    public Byte getStatus() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>db_mall.t_cutbill_deposit_order.cdate</code>. 订单创建时间
     */
    public void setCdate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_cutbill_deposit_order.cdate</code>. 订单创建时间
     */
    public Timestamp getCdate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>db_mall.t_cutbill_deposit_order.mdate</code>. 订单修改时间
     */
    public void setMdate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_mall.t_cutbill_deposit_order.mdate</code>. 订单修改时间
     */
    public Timestamp getMdate() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, Integer, Integer, String, Byte, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, Integer, Integer, String, Byte, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TCutbillDepositOrder.T_CUTBILL_DEPOSIT_ORDER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TCutbillDepositOrder.T_CUTBILL_DEPOSIT_ORDER.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TCutbillDepositOrder.T_CUTBILL_DEPOSIT_ORDER.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TCutbillDepositOrder.T_CUTBILL_DEPOSIT_ORDER.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TCutbillDepositOrder.T_CUTBILL_DEPOSIT_ORDER.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TCutbillDepositOrder.T_CUTBILL_DEPOSIT_ORDER.RENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return TCutbillDepositOrder.T_CUTBILL_DEPOSIT_ORDER.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TCutbillDepositOrder.T_CUTBILL_DEPOSIT_ORDER.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TCutbillDepositOrder.T_CUTBILL_DEPOSIT_ORDER.MDATE;
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
        return getOrderId();
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
    public Integer component4() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getRentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
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
    public String value2() {
        return getOrderId();
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
    public Integer value4() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getRentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCutbillDepositOrderRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCutbillDepositOrderRecord value2(String value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCutbillDepositOrderRecord value3(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCutbillDepositOrderRecord value4(Integer value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCutbillDepositOrderRecord value5(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCutbillDepositOrderRecord value6(Byte value) {
        setRentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCutbillDepositOrderRecord value7(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCutbillDepositOrderRecord value8(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCutbillDepositOrderRecord value9(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCutbillDepositOrderRecord values(Integer value1, String value2, Integer value3, Integer value4, String value5, Byte value6, Byte value7, Timestamp value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TCutbillDepositOrderRecord
     */
    public TCutbillDepositOrderRecord() {
        super(TCutbillDepositOrder.T_CUTBILL_DEPOSIT_ORDER);
    }

    /**
     * Create a detached, initialised TCutbillDepositOrderRecord
     */
    public TCutbillDepositOrderRecord(Integer id, String orderId, Integer productId, Integer customerId, String title, Byte rentType, Byte status, Timestamp cdate, Timestamp mdate) {
        super(TCutbillDepositOrder.T_CUTBILL_DEPOSIT_ORDER);

        set(0, id);
        set(1, orderId);
        set(2, productId);
        set(3, customerId);
        set(4, title);
        set(5, rentType);
        set(6, status);
        set(7, cdate);
        set(8, mdate);
    }
}