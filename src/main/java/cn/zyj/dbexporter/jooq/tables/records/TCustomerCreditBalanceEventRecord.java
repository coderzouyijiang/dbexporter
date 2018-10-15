/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TCustomerCreditBalanceEvent;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class TCustomerCreditBalanceEventRecord extends UpdatableRecordImpl<TCustomerCreditBalanceEventRecord> implements Record5<Long, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 207791103;

    /**
     * Setter for <code>db_mall.t_customer_credit_balance_event.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_credit_balance_event.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_customer_credit_balance_event.customer_id</code>.
     */
    public void setCustomerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_credit_balance_event.customer_id</code>.
     */
    public Integer getCustomerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_customer_credit_balance_event.sync_status</code>.
     */
    public void setSyncStatus(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_credit_balance_event.sync_status</code>.
     */
    public Byte getSyncStatus() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>db_mall.t_customer_credit_balance_event.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_credit_balance_event.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>db_mall.t_customer_credit_balance_event.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_customer_credit_balance_event.mdate</code>.
     */
    public Timestamp getMdate() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TCustomerCreditBalanceEvent.T_CUSTOMER_CREDIT_BALANCE_EVENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TCustomerCreditBalanceEvent.T_CUSTOMER_CREDIT_BALANCE_EVENT.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return TCustomerCreditBalanceEvent.T_CUSTOMER_CREDIT_BALANCE_EVENT.SYNC_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TCustomerCreditBalanceEvent.T_CUSTOMER_CREDIT_BALANCE_EVENT.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TCustomerCreditBalanceEvent.T_CUSTOMER_CREDIT_BALANCE_EVENT.MDATE;
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
    public Integer component2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getSyncStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
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
    public Integer value2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getSyncStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerCreditBalanceEventRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerCreditBalanceEventRecord value2(Integer value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerCreditBalanceEventRecord value3(Byte value) {
        setSyncStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerCreditBalanceEventRecord value4(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerCreditBalanceEventRecord value5(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerCreditBalanceEventRecord values(Long value1, Integer value2, Byte value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TCustomerCreditBalanceEventRecord
     */
    public TCustomerCreditBalanceEventRecord() {
        super(TCustomerCreditBalanceEvent.T_CUSTOMER_CREDIT_BALANCE_EVENT);
    }

    /**
     * Create a detached, initialised TCustomerCreditBalanceEventRecord
     */
    public TCustomerCreditBalanceEventRecord(Long id, Integer customerId, Byte syncStatus, Timestamp cdate, Timestamp mdate) {
        super(TCustomerCreditBalanceEvent.T_CUSTOMER_CREDIT_BALANCE_EVENT);

        set(0, id);
        set(1, customerId);
        set(2, syncStatus);
        set(3, cdate);
        set(4, mdate);
    }
}
