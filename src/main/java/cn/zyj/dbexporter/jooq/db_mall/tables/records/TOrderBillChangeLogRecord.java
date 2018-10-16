/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TOrderBillChangeLog;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

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
public class TOrderBillChangeLogRecord extends UpdatableRecordImpl<TOrderBillChangeLogRecord> implements Record7<Long, Long, BigDecimal, BigDecimal, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1956353815;

    /**
     * Setter for <code>db_mall.t_order_bill_change_log.id</code>.
     */
    public TOrderBillChangeLogRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_bill_change_log.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_order_bill_change_log.bill_id</code>. 账单id
     */
    public TOrderBillChangeLogRecord setBillId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_bill_change_log.bill_id</code>. 账单id
     */
    @NotNull
    public Long getBillId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>db_mall.t_order_bill_change_log.old_amount</code>. 修改之前订单账单金额
     */
    public TOrderBillChangeLogRecord setOldAmount(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_bill_change_log.old_amount</code>. 修改之前订单账单金额
     */
    @NotNull
    public BigDecimal getOldAmount() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>db_mall.t_order_bill_change_log.new_amount</code>. 修改之后订单账单金额
     */
    public TOrderBillChangeLogRecord setNewAmount(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_bill_change_log.new_amount</code>. 修改之后订单账单金额
     */
    @NotNull
    public BigDecimal getNewAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>db_mall.t_order_bill_change_log.reason</code>. 账单金额变化原因，1：退租 2：调价
     */
    public TOrderBillChangeLogRecord setReason(Byte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_bill_change_log.reason</code>. 账单金额变化原因，1：退租 2：调价
     */
    @NotNull
    public Byte getReason() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>db_mall.t_order_bill_change_log.cdate</code>.
     */
    public TOrderBillChangeLogRecord setCdate(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_bill_change_log.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>db_mall.t_order_bill_change_log.mdate</code>.
     */
    public TOrderBillChangeLogRecord setMdate(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_bill_change_log.mdate</code>.
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
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, BigDecimal, BigDecimal, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, BigDecimal, BigDecimal, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG.BILL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG.OLD_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG.NEW_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG.REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG.MDATE;
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
        return getBillId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getOldAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getNewAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getReason();
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
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getBillId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getOldAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getNewAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getReason();
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
    public TOrderBillChangeLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderBillChangeLogRecord value2(Long value) {
        setBillId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderBillChangeLogRecord value3(BigDecimal value) {
        setOldAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderBillChangeLogRecord value4(BigDecimal value) {
        setNewAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderBillChangeLogRecord value5(Byte value) {
        setReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderBillChangeLogRecord value6(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderBillChangeLogRecord value7(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderBillChangeLogRecord values(Long value1, Long value2, BigDecimal value3, BigDecimal value4, Byte value5, Timestamp value6, Timestamp value7) {
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
     * Create a detached TOrderBillChangeLogRecord
     */
    public TOrderBillChangeLogRecord() {
        super(TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG);
    }

    /**
     * Create a detached, initialised TOrderBillChangeLogRecord
     */
    public TOrderBillChangeLogRecord(Long id, Long billId, BigDecimal oldAmount, BigDecimal newAmount, Byte reason, Timestamp cdate, Timestamp mdate) {
        super(TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG);

        set(0, id);
        set(1, billId);
        set(2, oldAmount);
        set(3, newAmount);
        set(4, reason);
        set(5, cdate);
        set(6, mdate);
    }
}