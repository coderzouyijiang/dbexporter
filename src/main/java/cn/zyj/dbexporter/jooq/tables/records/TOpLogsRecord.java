/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TOpLogs;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class TOpLogsRecord extends UpdatableRecordImpl<TOpLogsRecord> implements Record9<Integer, Integer, Integer, Byte, Long, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1292361935;

    /**
     * Setter for <code>db_mall.t_op_logs.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_op_logs.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_op_logs.manager_id</code>. 操作员id
     */
    public void setManagerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_op_logs.manager_id</code>. 操作员id
     */
    public Integer getManagerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_op_logs.type_id</code>. 0:商品分类 1：商品品牌 2：商品
     */
    public void setTypeId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_op_logs.type_id</code>. 0:商品分类 1：商品品牌 2：商品
     */
    public Integer getTypeId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_op_logs.action_type</code>. 0:增加 1：修改 2：删除（假删除） 
     */
    public void setActionType(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_op_logs.action_type</code>. 0:增加 1：修改 2：删除（假删除） 
     */
    public Byte getActionType() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>db_mall.t_op_logs.ip</code>. ip地址
     */
    public void setIp(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_op_logs.ip</code>. ip地址
     */
    public Long getIp() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>db_mall.t_op_logs.agent</code>.
     */
    public void setAgent(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_op_logs.agent</code>.
     */
    public String getAgent() {
        return (String) get(5);
    }

    /**
     * Setter for <code>db_mall.t_op_logs.content</code>.
     */
    public void setContent(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_op_logs.content</code>.
     */
    public String getContent() {
        return (String) get(6);
    }

    /**
     * Setter for <code>db_mall.t_op_logs.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_op_logs.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>db_mall.t_op_logs.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_mall.t_op_logs.mdate</code>.
     */
    public Timestamp getMdate() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Byte, Long, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Integer, Integer, Byte, Long, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TOpLogs.T_OP_LOGS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TOpLogs.T_OP_LOGS.MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TOpLogs.T_OP_LOGS.TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TOpLogs.T_OP_LOGS.ACTION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return TOpLogs.T_OP_LOGS.IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TOpLogs.T_OP_LOGS.AGENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TOpLogs.T_OP_LOGS.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TOpLogs.T_OP_LOGS.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TOpLogs.T_OP_LOGS.MDATE;
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
    public Integer component2() {
        return getManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getActionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getAgent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getContent();
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
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getActionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAgent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getContent();
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
    public TOpLogsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOpLogsRecord value2(Integer value) {
        setManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOpLogsRecord value3(Integer value) {
        setTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOpLogsRecord value4(Byte value) {
        setActionType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOpLogsRecord value5(Long value) {
        setIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOpLogsRecord value6(String value) {
        setAgent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOpLogsRecord value7(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOpLogsRecord value8(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOpLogsRecord value9(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOpLogsRecord values(Integer value1, Integer value2, Integer value3, Byte value4, Long value5, String value6, String value7, Timestamp value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TOpLogsRecord
     */
    public TOpLogsRecord() {
        super(TOpLogs.T_OP_LOGS);
    }

    /**
     * Create a detached, initialised TOpLogsRecord
     */
    public TOpLogsRecord(Integer id, Integer managerId, Integer typeId, Byte actionType, Long ip, String agent, String content, Timestamp cdate, Timestamp mdate) {
        super(TOpLogs.T_OP_LOGS);

        set(0, id);
        set(1, managerId);
        set(2, typeId);
        set(3, actionType);
        set(4, ip);
        set(5, agent);
        set(6, content);
        set(7, cdate);
        set(8, mdate);
    }
}