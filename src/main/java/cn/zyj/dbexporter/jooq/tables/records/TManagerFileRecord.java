/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TManagerFile;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 管理员文件表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TManagerFileRecord extends UpdatableRecordImpl<TManagerFileRecord> implements Record8<Long, Long, Byte, String, Long, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -2136939181;

    /**
     * Setter for <code>db_mall.t_manager_file.id</code>. 文件标识
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_manager_file.id</code>. 文件标识
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_manager_file.manager_id</code>. 管理员标识
     */
    public void setManagerId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_manager_file.manager_id</code>. 管理员标识
     */
    public Long getManagerId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>db_mall.t_manager_file.status</code>. 文件状态(0:删除;1:正常)
     */
    public void setStatus(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_manager_file.status</code>. 文件状态(0:删除;1:正常)
     */
    public Byte getStatus() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>db_mall.t_manager_file.name</code>. 文件名称
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_manager_file.name</code>. 文件名称
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.t_manager_file.size</code>. 文件大小(字节)
     */
    public void setSize(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_manager_file.size</code>. 文件大小(字节)
     */
    public Long getSize() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>db_mall.t_manager_file.suffix</code>. 文件后缀
     */
    public void setSuffix(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_manager_file.suffix</code>. 文件后缀
     */
    public String getSuffix() {
        return (String) get(5);
    }

    /**
     * Setter for <code>db_mall.t_manager_file.created_time</code>. 创建时间
     */
    public void setCreatedTime(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_manager_file.created_time</code>. 创建时间
     */
    public Timestamp getCreatedTime() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>db_mall.t_manager_file.modified_time</code>. 修改时间
     */
    public void setModifiedTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_manager_file.modified_time</code>. 修改时间
     */
    public Timestamp getModifiedTime() {
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
    public Row8<Long, Long, Byte, String, Long, String, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, Long, Byte, String, Long, String, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TManagerFile.T_MANAGER_FILE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TManagerFile.T_MANAGER_FILE.MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return TManagerFile.T_MANAGER_FILE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TManagerFile.T_MANAGER_FILE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return TManagerFile.T_MANAGER_FILE.SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TManagerFile.T_MANAGER_FILE.SUFFIX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TManagerFile.T_MANAGER_FILE.CREATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TManagerFile.T_MANAGER_FILE.MODIFIED_TIME;
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
        return getManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSuffix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getModifiedTime();
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
        return getManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSuffix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCreatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getModifiedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TManagerFileRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TManagerFileRecord value2(Long value) {
        setManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TManagerFileRecord value3(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TManagerFileRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TManagerFileRecord value5(Long value) {
        setSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TManagerFileRecord value6(String value) {
        setSuffix(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TManagerFileRecord value7(Timestamp value) {
        setCreatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TManagerFileRecord value8(Timestamp value) {
        setModifiedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TManagerFileRecord values(Long value1, Long value2, Byte value3, String value4, Long value5, String value6, Timestamp value7, Timestamp value8) {
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
     * Create a detached TManagerFileRecord
     */
    public TManagerFileRecord() {
        super(TManagerFile.T_MANAGER_FILE);
    }

    /**
     * Create a detached, initialised TManagerFileRecord
     */
    public TManagerFileRecord(Long id, Long managerId, Byte status, String name, Long size, String suffix, Timestamp createdTime, Timestamp modifiedTime) {
        super(TManagerFile.T_MANAGER_FILE);

        set(0, id);
        set(1, managerId);
        set(2, status);
        set(3, name);
        set(4, size);
        set(5, suffix);
        set(6, createdTime);
        set(7, modifiedTime);
    }
}