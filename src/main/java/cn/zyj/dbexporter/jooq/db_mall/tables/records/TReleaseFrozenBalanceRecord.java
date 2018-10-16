/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TReleaseFrozenBalance;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class TReleaseFrozenBalanceRecord extends UpdatableRecordImpl<TReleaseFrozenBalanceRecord> implements Record11<Long, Long, BigDecimal, Byte, Long, Byte, Long, Timestamp, Timestamp, Long, BigDecimal> {

    private static final long serialVersionUID = 280131226;

    /**
     * Setter for <code>db_mall.t_release_frozen_balance.id</code>.
     */
    public TReleaseFrozenBalanceRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_release_frozen_balance.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_release_frozen_balance.customer_id</code>. 客户id
     */
    public TReleaseFrozenBalanceRecord setCustomerId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_release_frozen_balance.customer_id</code>. 客户id
     */
    @NotNull
    public Long getCustomerId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>db_mall.t_release_frozen_balance.amount</code>. 返还的现金押金
     */
    public TReleaseFrozenBalanceRecord setAmount(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_release_frozen_balance.amount</code>. 返还的现金押金
     */
    @NotNull
    public BigDecimal getAmount() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>db_mall.t_release_frozen_balance.type</code>. 1:押金解冻 恢复余额
     */
    public TReleaseFrozenBalanceRecord setType(Byte value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_release_frozen_balance.type</code>. 1:押金解冻 恢复余额
     */
    public Byte getType() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>db_mall.t_release_frozen_balance.item_detail_id</code>. t_order_items_detail.id
     */
    public TReleaseFrozenBalanceRecord setItemDetailId(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_release_frozen_balance.item_detail_id</code>. t_order_items_detail.id
     */
    @NotNull
    public Long getItemDetailId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>db_mall.t_release_frozen_balance.process_status</code>. 0:未处理 1已处理2处理成功
     */
    public TReleaseFrozenBalanceRecord setProcessStatus(Byte value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_release_frozen_balance.process_status</code>. 0:未处理 1已处理2处理成功
     */
    @NotNull
    public Byte getProcessStatus() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>db_mall.t_release_frozen_balance.source_id</code>. t_frozenmoney2deposit.id
     */
    public TReleaseFrozenBalanceRecord setSourceId(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_release_frozen_balance.source_id</code>. t_frozenmoney2deposit.id
     */
    @NotNull
    public Long getSourceId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>db_mall.t_release_frozen_balance.cdate</code>. 创建时间
     */
    public TReleaseFrozenBalanceRecord setCdate(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_release_frozen_balance.cdate</code>. 创建时间
     */
    public Timestamp getCdate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>db_mall.t_release_frozen_balance.mdate</code>. 最后修改时间
     */
    public TReleaseFrozenBalanceRecord setMdate(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_release_frozen_balance.mdate</code>. 最后修改时间
     */
    public Timestamp getMdate() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>db_mall.t_release_frozen_balance.timestamp</code>. 时间戳 用于标识同一次解冻的操作
     */
    public TReleaseFrozenBalanceRecord setTimestamp(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_release_frozen_balance.timestamp</code>. 时间戳 用于标识同一次解冻的操作
     */
    @NotNull
    public Long getTimestamp() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>db_mall.t_release_frozen_balance.total_amount</code>.
     */
    public TReleaseFrozenBalanceRecord setTotalAmount(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_release_frozen_balance.total_amount</code>.
     */
    public BigDecimal getTotalAmount() {
        return (BigDecimal) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, BigDecimal, Byte, Long, Byte, Long, Timestamp, Timestamp, Long, BigDecimal> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, BigDecimal, Byte, Long, Byte, Long, Timestamp, Timestamp, Long, BigDecimal> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TReleaseFrozenBalance.T_RELEASE_FROZEN_BALANCE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TReleaseFrozenBalance.T_RELEASE_FROZEN_BALANCE.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return TReleaseFrozenBalance.T_RELEASE_FROZEN_BALANCE.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TReleaseFrozenBalance.T_RELEASE_FROZEN_BALANCE.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return TReleaseFrozenBalance.T_RELEASE_FROZEN_BALANCE.ITEM_DETAIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TReleaseFrozenBalance.T_RELEASE_FROZEN_BALANCE.PROCESS_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return TReleaseFrozenBalance.T_RELEASE_FROZEN_BALANCE.SOURCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TReleaseFrozenBalance.T_RELEASE_FROZEN_BALANCE.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TReleaseFrozenBalance.T_RELEASE_FROZEN_BALANCE.MDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return TReleaseFrozenBalance.T_RELEASE_FROZEN_BALANCE.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return TReleaseFrozenBalance.T_RELEASE_FROZEN_BALANCE.TOTAL_AMOUNT;
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
    public Long component2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getItemDetailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getProcessStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getSourceId();
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
    public Long component10() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component11() {
        return getTotalAmount();
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
    public Long value2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getItemDetailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getProcessStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getSourceId();
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
    public Long value10() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getTotalAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TReleaseFrozenBalanceRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TReleaseFrozenBalanceRecord value2(Long value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TReleaseFrozenBalanceRecord value3(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TReleaseFrozenBalanceRecord value4(Byte value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TReleaseFrozenBalanceRecord value5(Long value) {
        setItemDetailId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TReleaseFrozenBalanceRecord value6(Byte value) {
        setProcessStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TReleaseFrozenBalanceRecord value7(Long value) {
        setSourceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TReleaseFrozenBalanceRecord value8(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TReleaseFrozenBalanceRecord value9(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TReleaseFrozenBalanceRecord value10(Long value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TReleaseFrozenBalanceRecord value11(BigDecimal value) {
        setTotalAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TReleaseFrozenBalanceRecord values(Long value1, Long value2, BigDecimal value3, Byte value4, Long value5, Byte value6, Long value7, Timestamp value8, Timestamp value9, Long value10, BigDecimal value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TReleaseFrozenBalanceRecord
     */
    public TReleaseFrozenBalanceRecord() {
        super(TReleaseFrozenBalance.T_RELEASE_FROZEN_BALANCE);
    }

    /**
     * Create a detached, initialised TReleaseFrozenBalanceRecord
     */
    public TReleaseFrozenBalanceRecord(Long id, Long customerId, BigDecimal amount, Byte type, Long itemDetailId, Byte processStatus, Long sourceId, Timestamp cdate, Timestamp mdate, Long timestamp, BigDecimal totalAmount) {
        super(TReleaseFrozenBalance.T_RELEASE_FROZEN_BALANCE);

        set(0, id);
        set(1, customerId);
        set(2, amount);
        set(3, type);
        set(4, itemDetailId);
        set(5, processStatus);
        set(6, sourceId);
        set(7, cdate);
        set(8, mdate);
        set(9, timestamp);
        set(10, totalAmount);
    }
}