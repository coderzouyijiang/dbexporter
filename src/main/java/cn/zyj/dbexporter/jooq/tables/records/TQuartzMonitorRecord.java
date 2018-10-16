/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TQuartzMonitor;

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
public class TQuartzMonitorRecord extends UpdatableRecordImpl<TQuartzMonitorRecord> implements Record5<Long, String, Short, Timestamp, Timestamp> {

    private static final long serialVersionUID = -262187584;

    /**
     * Setter for <code>db_mall.t_quartz_monitor.id</code>. 主键
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_quartz_monitor.id</code>. 主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_quartz_monitor.task_name</code>. 定时任务类名
     */
    public void setTaskName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_quartz_monitor.task_name</code>. 定时任务类名
     */
    public String getTaskName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_quartz_monitor.status</code>. 定时任务执行状态（0、未成功，1、已成功）
     */
    public void setStatus(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_quartz_monitor.status</code>. 定时任务执行状态（0、未成功，1、已成功）
     */
    public Short getStatus() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>db_mall.t_quartz_monitor.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_quartz_monitor.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>db_mall.t_quartz_monitor.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_quartz_monitor.mdate</code>.
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
    public Row5<Long, String, Short, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, Short, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TQuartzMonitor.T_QUARTZ_MONITOR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TQuartzMonitor.T_QUARTZ_MONITOR.TASK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TQuartzMonitor.T_QUARTZ_MONITOR.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TQuartzMonitor.T_QUARTZ_MONITOR.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TQuartzMonitor.T_QUARTZ_MONITOR.MDATE;
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
        return getTaskName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getStatus();
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
        return getTaskName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getStatus();
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
    public TQuartzMonitorRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQuartzMonitorRecord value2(String value) {
        setTaskName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQuartzMonitorRecord value3(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQuartzMonitorRecord value4(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQuartzMonitorRecord value5(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQuartzMonitorRecord values(Long value1, String value2, Short value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached TQuartzMonitorRecord
     */
    public TQuartzMonitorRecord() {
        super(TQuartzMonitor.T_QUARTZ_MONITOR);
    }

    /**
     * Create a detached, initialised TQuartzMonitorRecord
     */
    public TQuartzMonitorRecord(Long id, String taskName, Short status, Timestamp cdate, Timestamp mdate) {
        super(TQuartzMonitor.T_QUARTZ_MONITOR);

        set(0, id);
        set(1, taskName);
        set(2, status);
        set(3, cdate);
        set(4, mdate);
    }
}