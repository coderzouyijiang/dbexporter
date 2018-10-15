/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TOrderChangeStartRentLog;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class TOrderChangeStartRentLogRecord extends UpdatableRecordImpl<TOrderChangeStartRentLogRecord> implements Record6<Integer, String, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1050159976;

    /**
     * Setter for <code>db_mall.t_order_change_start_rent_log.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_order_change_start_rent_log.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_order_change_start_rent_log.order_id</code>.
     */
    public void setOrderId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_order_change_start_rent_log.order_id</code>.
     */
    public String getOrderId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_order_change_start_rent_log.start_date</code>.
     */
    public void setStartDate(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_order_change_start_rent_log.start_date</code>.
     */
    public Integer getStartDate() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_order_change_start_rent_log.sync_status</code>.
     */
    public void setSyncStatus(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_order_change_start_rent_log.sync_status</code>.
     */
    public Byte getSyncStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>db_mall.t_order_change_start_rent_log.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_order_change_start_rent_log.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>db_mall.t_order_change_start_rent_log.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_order_change_start_rent_log.mdate</code>.
     */
    public Timestamp getMdate() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TOrderChangeStartRentLog.T_ORDER_CHANGE_START_RENT_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TOrderChangeStartRentLog.T_ORDER_CHANGE_START_RENT_LOG.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TOrderChangeStartRentLog.T_ORDER_CHANGE_START_RENT_LOG.START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TOrderChangeStartRentLog.T_ORDER_CHANGE_START_RENT_LOG.SYNC_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TOrderChangeStartRentLog.T_ORDER_CHANGE_START_RENT_LOG.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TOrderChangeStartRentLog.T_ORDER_CHANGE_START_RENT_LOG.MDATE;
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
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getSyncStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
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
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getSyncStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeStartRentLogRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeStartRentLogRecord value2(String value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeStartRentLogRecord value3(Integer value) {
        setStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeStartRentLogRecord value4(Byte value) {
        setSyncStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeStartRentLogRecord value5(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeStartRentLogRecord value6(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeStartRentLogRecord values(Integer value1, String value2, Integer value3, Byte value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached TOrderChangeStartRentLogRecord
     */
    public TOrderChangeStartRentLogRecord() {
        super(TOrderChangeStartRentLog.T_ORDER_CHANGE_START_RENT_LOG);
    }

    /**
     * Create a detached, initialised TOrderChangeStartRentLogRecord
     */
    public TOrderChangeStartRentLogRecord(Integer id, String orderId, Integer startDate, Byte syncStatus, Timestamp cdate, Timestamp mdate) {
        super(TOrderChangeStartRentLog.T_ORDER_CHANGE_START_RENT_LOG);

        set(0, id);
        set(1, orderId);
        set(2, startDate);
        set(3, syncStatus);
        set(4, cdate);
        set(5, mdate);
    }
}
