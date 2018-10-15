/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TCronLog;

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
public class TCronLogRecord extends UpdatableRecordImpl<TCronLogRecord> implements Record5<Long, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 832284857;

    /**
     * Setter for <code>db_mall.t_cron_log.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_cron_log.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_cron_log.content</code>.
     */
    public void setContent(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_cron_log.content</code>.
     */
    public String getContent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_cron_log.sync_status</code>.
     */
    public void setSyncStatus(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_cron_log.sync_status</code>.
     */
    public Byte getSyncStatus() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>db_mall.t_cron_log.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_cron_log.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>db_mall.t_cron_log.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_cron_log.mdate</code>.
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
    public Row5<Long, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TCronLog.T_CRON_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TCronLog.T_CRON_LOG.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return TCronLog.T_CRON_LOG.SYNC_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TCronLog.T_CRON_LOG.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TCronLog.T_CRON_LOG.MDATE;
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
        return getContent();
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
    public String value2() {
        return getContent();
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
    public TCronLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCronLogRecord value2(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCronLogRecord value3(Byte value) {
        setSyncStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCronLogRecord value4(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCronLogRecord value5(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCronLogRecord values(Long value1, String value2, Byte value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached TCronLogRecord
     */
    public TCronLogRecord() {
        super(TCronLog.T_CRON_LOG);
    }

    /**
     * Create a detached, initialised TCronLogRecord
     */
    public TCronLogRecord(Long id, String content, Byte syncStatus, Timestamp cdate, Timestamp mdate) {
        super(TCronLog.T_CRON_LOG);

        set(0, id);
        set(1, content);
        set(2, syncStatus);
        set(3, cdate);
        set(4, mdate);
    }
}
