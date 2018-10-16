/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TSmsUploadLog;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 畅卓上行短信
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TSmsUploadLogRecord extends UpdatableRecordImpl<TSmsUploadLogRecord> implements Record7<Long, String, String, Timestamp, String, String, Timestamp> {

    private static final long serialVersionUID = 1808303736;

    /**
     * Setter for <code>db_mall.t_sms_upload_log.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_sms_upload_log.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_sms_upload_log.mobile</code>. 手机号
     */
    public void setMobile(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_sms_upload_log.mobile</code>. 手机号
     */
    public String getMobile() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_sms_upload_log.taskId</code>. 任务id
     */
    public void setTaskid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_sms_upload_log.taskId</code>. 任务id
     */
    public String getTaskid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_sms_upload_log.receiveTime</code>.
     */
    public void setReceivetime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_sms_upload_log.receiveTime</code>.
     */
    public Timestamp getReceivetime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>db_mall.t_sms_upload_log.extno</code>.
     */
    public void setExtno(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_sms_upload_log.extno</code>.
     */
    public String getExtno() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_sms_upload_log.content</code>.
     */
    public void setContent(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_sms_upload_log.content</code>.
     */
    public String getContent() {
        return (String) get(5);
    }

    /**
     * Setter for <code>db_mall.t_sms_upload_log.cdate</code>. 创建时间
     */
    public void setCdate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_sms_upload_log.cdate</code>. 创建时间
     */
    public Timestamp getCdate() {
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
    public Row7<Long, String, String, Timestamp, String, String, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, String, String, Timestamp, String, String, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TSmsUploadLog.T_SMS_UPLOAD_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TSmsUploadLog.T_SMS_UPLOAD_LOG.MOBILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TSmsUploadLog.T_SMS_UPLOAD_LOG.TASKID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TSmsUploadLog.T_SMS_UPLOAD_LOG.RECEIVETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TSmsUploadLog.T_SMS_UPLOAD_LOG.EXTNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TSmsUploadLog.T_SMS_UPLOAD_LOG.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TSmsUploadLog.T_SMS_UPLOAD_LOG.CDATE;
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
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTaskid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getReceivetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getExtno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getContent();
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
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getMobile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTaskid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getReceivetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getExtno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getContent();
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
    public TSmsUploadLogRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsUploadLogRecord value2(String value) {
        setMobile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsUploadLogRecord value3(String value) {
        setTaskid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsUploadLogRecord value4(Timestamp value) {
        setReceivetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsUploadLogRecord value5(String value) {
        setExtno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsUploadLogRecord value6(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsUploadLogRecord value7(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsUploadLogRecord values(Long value1, String value2, String value3, Timestamp value4, String value5, String value6, Timestamp value7) {
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
     * Create a detached TSmsUploadLogRecord
     */
    public TSmsUploadLogRecord() {
        super(TSmsUploadLog.T_SMS_UPLOAD_LOG);
    }

    /**
     * Create a detached, initialised TSmsUploadLogRecord
     */
    public TSmsUploadLogRecord(Long id, String mobile, String taskid, Timestamp receivetime, String extno, String content, Timestamp cdate) {
        super(TSmsUploadLog.T_SMS_UPLOAD_LOG);

        set(0, id);
        set(1, mobile);
        set(2, taskid);
        set(3, receivetime);
        set(4, extno);
        set(5, content);
        set(6, cdate);
    }
}