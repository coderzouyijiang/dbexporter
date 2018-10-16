/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TGroupChildOrderVerify;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class TGroupChildOrderVerifyRecord extends UpdatableRecordImpl<TGroupChildOrderVerifyRecord> implements Record8<Long, String, String, Integer, Byte, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -2099207333;

    /**
     * Setter for <code>db_mall.t_group_child_order_verify.id</code>. 自增主键
     */
    public TGroupChildOrderVerifyRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_group_child_order_verify.id</code>. 自增主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_group_child_order_verify.main_order_id</code>. 主订单号
     */
    public TGroupChildOrderVerifyRecord setMainOrderId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_group_child_order_verify.main_order_id</code>. 主订单号
     */
    @NotNull
    @Size(max = 20)
    public String getMainOrderId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_group_child_order_verify.order_id</code>. 订单号
     */
    public TGroupChildOrderVerifyRecord setOrderId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_group_child_order_verify.order_id</code>. 订单号
     */
    @NotNull
    @Size(max = 20)
    public String getOrderId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_group_child_order_verify.customer_id</code>. 用户id
     */
    public TGroupChildOrderVerifyRecord setCustomerId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_group_child_order_verify.customer_id</code>. 用户id
     */
    @NotNull
    public Integer getCustomerId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_mall.t_group_child_order_verify.verify_status</code>. 集团下单审核状态 0无 1不通过 2待审核 3已通过
     */
    public TGroupChildOrderVerifyRecord setVerifyStatus(Byte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_group_child_order_verify.verify_status</code>. 集团下单审核状态 0无 1不通过 2待审核 3已通过
     */
    @NotNull
    public Byte getVerifyStatus() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>db_mall.t_group_child_order_verify.fail_verify_reason</code>. 审核不通过原因  0 无 1 规格不符合公司标准；2 金额不符合公司标准；3 租期不符合公司标准；4 申请原因不明；5 申请原因不接受；6 超过五天未审核系统自动取消；7 其它
     */
    public TGroupChildOrderVerifyRecord setFailVerifyReason(Byte value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_group_child_order_verify.fail_verify_reason</code>. 审核不通过原因  0 无 1 规格不符合公司标准；2 金额不符合公司标准；3 租期不符合公司标准；4 申请原因不明；5 申请原因不接受；6 超过五天未审核系统自动取消；7 其它
     */
    public Byte getFailVerifyReason() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>db_mall.t_group_child_order_verify.cdate</code>.
     */
    public TGroupChildOrderVerifyRecord setCdate(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_group_child_order_verify.cdate</code>.
     */
    @NotNull
    public Timestamp getCdate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>db_mall.t_group_child_order_verify.mdate</code>.
     */
    public TGroupChildOrderVerifyRecord setMdate(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_group_child_order_verify.mdate</code>.
     */
    @NotNull
    public Timestamp getMdate() {
        return (Timestamp) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, String, Integer, Byte, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, String, Integer, Byte, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TGroupChildOrderVerify.T_GROUP_CHILD_ORDER_VERIFY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TGroupChildOrderVerify.T_GROUP_CHILD_ORDER_VERIFY.MAIN_ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TGroupChildOrderVerify.T_GROUP_CHILD_ORDER_VERIFY.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TGroupChildOrderVerify.T_GROUP_CHILD_ORDER_VERIFY.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TGroupChildOrderVerify.T_GROUP_CHILD_ORDER_VERIFY.VERIFY_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TGroupChildOrderVerify.T_GROUP_CHILD_ORDER_VERIFY.FAIL_VERIFY_REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TGroupChildOrderVerify.T_GROUP_CHILD_ORDER_VERIFY.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TGroupChildOrderVerify.T_GROUP_CHILD_ORDER_VERIFY.MDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getMainOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getOrderId();
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
    public Byte component5() {
        return getVerifyStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getFailVerifyReason();
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
    public Timestamp component8() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getMainOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOrderId();
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
    public Byte value5() {
        return getVerifyStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getFailVerifyReason();
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
    public Timestamp value8() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupChildOrderVerifyRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupChildOrderVerifyRecord value2(String value) {
        setMainOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupChildOrderVerifyRecord value3(String value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupChildOrderVerifyRecord value4(Integer value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupChildOrderVerifyRecord value5(Byte value) {
        setVerifyStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupChildOrderVerifyRecord value6(Byte value) {
        setFailVerifyReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupChildOrderVerifyRecord value7(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupChildOrderVerifyRecord value8(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupChildOrderVerifyRecord values(Long value1, String value2, String value3, Integer value4, Byte value5, Byte value6, Timestamp value7, Timestamp value8) {
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
     * Create a detached TGroupChildOrderVerifyRecord
     */
    public TGroupChildOrderVerifyRecord() {
        super(TGroupChildOrderVerify.T_GROUP_CHILD_ORDER_VERIFY);
    }

    /**
     * Create a detached, initialised TGroupChildOrderVerifyRecord
     */
    public TGroupChildOrderVerifyRecord(Long id, String mainOrderId, String orderId, Integer customerId, Byte verifyStatus, Byte failVerifyReason, Timestamp cdate, Timestamp mdate) {
        super(TGroupChildOrderVerify.T_GROUP_CHILD_ORDER_VERIFY);

        set(0, id);
        set(1, mainOrderId);
        set(2, orderId);
        set(3, customerId);
        set(4, verifyStatus);
        set(5, failVerifyReason);
        set(6, cdate);
        set(7, mdate);
    }
}