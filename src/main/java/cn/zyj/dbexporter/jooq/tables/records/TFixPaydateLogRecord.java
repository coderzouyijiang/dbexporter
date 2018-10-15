/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TFixPaydateLog;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
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
public class TFixPaydateLogRecord extends UpdatableRecordImpl<TFixPaydateLogRecord> implements Record6<ULong, ULong, String, ULong, ULong, Timestamp> {

    private static final long serialVersionUID = -2020240800;

    /**
     * Setter for <code>db_mall.t_fix_paydate_log.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_fix_paydate_log.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>db_mall.t_fix_paydate_log.customer_id</code>.
     */
    public void setCustomerId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_fix_paydate_log.customer_id</code>.
     */
    public ULong getCustomerId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>db_mall.t_fix_paydate_log.order_id</code>.
     */
    public void setOrderId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_fix_paydate_log.order_id</code>.
     */
    public String getOrderId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_fix_paydate_log.order_bill_id</code>.
     */
    public void setOrderBillId(ULong value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_fix_paydate_log.order_bill_id</code>.
     */
    public ULong getOrderBillId() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>db_mall.t_fix_paydate_log.customer_bill_id</code>.
     */
    public void setCustomerBillId(ULong value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_fix_paydate_log.customer_bill_id</code>.
     */
    public ULong getCustomerBillId() {
        return (ULong) get(4);
    }

    /**
     * Setter for <code>db_mall.t_fix_paydate_log.pay_date</code>.
     */
    public void setPayDate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_fix_paydate_log.pay_date</code>.
     */
    public Timestamp getPayDate() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, ULong, String, ULong, ULong, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<ULong, ULong, String, ULong, ULong, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TFixPaydateLog.T_FIX_PAYDATE_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field2() {
        return TFixPaydateLog.T_FIX_PAYDATE_LOG.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TFixPaydateLog.T_FIX_PAYDATE_LOG.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field4() {
        return TFixPaydateLog.T_FIX_PAYDATE_LOG.ORDER_BILL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field5() {
        return TFixPaydateLog.T_FIX_PAYDATE_LOG.CUSTOMER_BILL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TFixPaydateLog.T_FIX_PAYDATE_LOG.PAY_DATE;
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
    public ULong component2() {
        return getCustomerId();
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
    public ULong component4() {
        return getOrderBillId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component5() {
        return getCustomerBillId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getPayDate();
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
    public ULong value2() {
        return getCustomerId();
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
    public ULong value4() {
        return getOrderBillId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value5() {
        return getCustomerBillId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getPayDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFixPaydateLogRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFixPaydateLogRecord value2(ULong value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFixPaydateLogRecord value3(String value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFixPaydateLogRecord value4(ULong value) {
        setOrderBillId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFixPaydateLogRecord value5(ULong value) {
        setCustomerBillId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFixPaydateLogRecord value6(Timestamp value) {
        setPayDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFixPaydateLogRecord values(ULong value1, ULong value2, String value3, ULong value4, ULong value5, Timestamp value6) {
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
     * Create a detached TFixPaydateLogRecord
     */
    public TFixPaydateLogRecord() {
        super(TFixPaydateLog.T_FIX_PAYDATE_LOG);
    }

    /**
     * Create a detached, initialised TFixPaydateLogRecord
     */
    public TFixPaydateLogRecord(ULong id, ULong customerId, String orderId, ULong orderBillId, ULong customerBillId, Timestamp payDate) {
        super(TFixPaydateLog.T_FIX_PAYDATE_LOG);

        set(0, id);
        set(1, customerId);
        set(2, orderId);
        set(3, orderBillId);
        set(4, customerBillId);
        set(5, payDate);
    }
}
