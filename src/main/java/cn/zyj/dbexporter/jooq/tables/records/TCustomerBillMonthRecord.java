/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TCustomerBillMonth;

import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class TCustomerBillMonthRecord extends UpdatableRecordImpl<TCustomerBillMonthRecord> implements Record8<Long, Long, Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -850263134;

    /**
     * Setter for <code>db_mall.t_customer_bill_month.id</code>. id
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_bill_month.id</code>. id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_customer_bill_month.customer_id</code>. 客户id
     */
    public void setCustomerId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_bill_month.customer_id</code>. 客户id
     */
    public Long getCustomerId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>db_mall.t_customer_bill_month.balance_date</code>. 账单日（生成往期账单账单日）
     */
    public void setBalanceDate(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_bill_month.balance_date</code>. 账单日（生成往期账单账单日）
     */
    public Integer getBalanceDate() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_customer_bill_month.bill_month</code>. 客户所在账期（如201711）
     */
    public void setBillMonth(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_bill_month.bill_month</code>. 客户所在账期（如201711）
     */
    public Integer getBillMonth() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_mall.t_customer_bill_month.bill_month_begin</code>. 账期开始时间
     */
    public void setBillMonthBegin(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_bill_month.bill_month_begin</code>. 账期开始时间
     */
    public Integer getBillMonthBegin() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>db_mall.t_customer_bill_month.bill_month_end</code>. 账期结束时间
     */
    public void setBillMonthEnd(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_bill_month.bill_month_end</code>. 账期结束时间
     */
    public Integer getBillMonthEnd() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>db_mall.t_customer_bill_month.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_bill_month.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>db_mall.t_customer_bill_month.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_bill_month.mdate</code>.
     */
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
    public Row8<Long, Long, Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TCustomerBillMonth.T_CUSTOMER_BILL_MONTH.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TCustomerBillMonth.T_CUSTOMER_BILL_MONTH.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TCustomerBillMonth.T_CUSTOMER_BILL_MONTH.BALANCE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TCustomerBillMonth.T_CUSTOMER_BILL_MONTH.BILL_MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TCustomerBillMonth.T_CUSTOMER_BILL_MONTH.BILL_MONTH_BEGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TCustomerBillMonth.T_CUSTOMER_BILL_MONTH.BILL_MONTH_END;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TCustomerBillMonth.T_CUSTOMER_BILL_MONTH.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TCustomerBillMonth.T_CUSTOMER_BILL_MONTH.MDATE;
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
    public Integer component3() {
        return getBalanceDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getBillMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getBillMonthBegin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getBillMonthEnd();
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
    public Long value2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getBalanceDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getBillMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getBillMonthBegin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getBillMonthEnd();
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
    public TCustomerBillMonthRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerBillMonthRecord value2(Long value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerBillMonthRecord value3(Integer value) {
        setBalanceDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerBillMonthRecord value4(Integer value) {
        setBillMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerBillMonthRecord value5(Integer value) {
        setBillMonthBegin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerBillMonthRecord value6(Integer value) {
        setBillMonthEnd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerBillMonthRecord value7(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerBillMonthRecord value8(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerBillMonthRecord values(Long value1, Long value2, Integer value3, Integer value4, Integer value5, Integer value6, Timestamp value7, Timestamp value8) {
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
     * Create a detached TCustomerBillMonthRecord
     */
    public TCustomerBillMonthRecord() {
        super(TCustomerBillMonth.T_CUSTOMER_BILL_MONTH);
    }

    /**
     * Create a detached, initialised TCustomerBillMonthRecord
     */
    public TCustomerBillMonthRecord(Long id, Long customerId, Integer balanceDate, Integer billMonth, Integer billMonthBegin, Integer billMonthEnd, Timestamp cdate, Timestamp mdate) {
        super(TCustomerBillMonth.T_CUSTOMER_BILL_MONTH);

        set(0, id);
        set(1, customerId);
        set(2, balanceDate);
        set(3, billMonth);
        set(4, billMonthBegin);
        set(5, billMonthEnd);
        set(6, cdate);
        set(7, mdate);
    }
}
