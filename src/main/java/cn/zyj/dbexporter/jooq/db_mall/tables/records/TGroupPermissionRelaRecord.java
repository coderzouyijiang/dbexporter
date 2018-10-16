/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TGroupPermissionRela;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

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
public class TGroupPermissionRelaRecord extends UpdatableRecordImpl<TGroupPermissionRelaRecord> implements Record6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -2104411709;

    /**
     * Setter for <code>db_mall.t_group_permission_rela.id</code>.
     */
    public TGroupPermissionRelaRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_group_permission_rela.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_group_permission_rela.group_id</code>. 集团id
     */
    public TGroupPermissionRelaRecord setGroupId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_group_permission_rela.group_id</code>. 集团id
     */
    @NotNull
    public Integer getGroupId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_group_permission_rela.group_permissions_id</code>. 权限id
     */
    public TGroupPermissionRelaRecord setGroupPermissionsId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_group_permission_rela.group_permissions_id</code>. 权限id
     */
    @NotNull
    public Integer getGroupPermissionsId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_group_permission_rela.group_permissions_value</code>. 0:不可用 1:可用
     */
    public TGroupPermissionRelaRecord setGroupPermissionsValue(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_group_permission_rela.group_permissions_value</code>. 0:不可用 1:可用
     */
    public Integer getGroupPermissionsValue() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_mall.t_group_permission_rela.cdate</code>. 创建时间
     */
    public TGroupPermissionRelaRecord setCdate(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_group_permission_rela.cdate</code>. 创建时间
     */
    public Timestamp getCdate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>db_mall.t_group_permission_rela.mdate</code>. 修改时间
     */
    public TGroupPermissionRelaRecord setMdate(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_group_permission_rela.mdate</code>. 修改时间
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
    public Row6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TGroupPermissionRela.T_GROUP_PERMISSION_RELA.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TGroupPermissionRela.T_GROUP_PERMISSION_RELA.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TGroupPermissionRela.T_GROUP_PERMISSION_RELA.GROUP_PERMISSIONS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TGroupPermissionRela.T_GROUP_PERMISSION_RELA.GROUP_PERMISSIONS_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TGroupPermissionRela.T_GROUP_PERMISSION_RELA.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TGroupPermissionRela.T_GROUP_PERMISSION_RELA.MDATE;
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
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getGroupPermissionsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getGroupPermissionsValue();
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
    public Integer value2() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getGroupPermissionsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getGroupPermissionsValue();
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
    public TGroupPermissionRelaRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupPermissionRelaRecord value2(Integer value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupPermissionRelaRecord value3(Integer value) {
        setGroupPermissionsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupPermissionRelaRecord value4(Integer value) {
        setGroupPermissionsValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupPermissionRelaRecord value5(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupPermissionRelaRecord value6(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupPermissionRelaRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached TGroupPermissionRelaRecord
     */
    public TGroupPermissionRelaRecord() {
        super(TGroupPermissionRela.T_GROUP_PERMISSION_RELA);
    }

    /**
     * Create a detached, initialised TGroupPermissionRelaRecord
     */
    public TGroupPermissionRelaRecord(Integer id, Integer groupId, Integer groupPermissionsId, Integer groupPermissionsValue, Timestamp cdate, Timestamp mdate) {
        super(TGroupPermissionRela.T_GROUP_PERMISSION_RELA);

        set(0, id);
        set(1, groupId);
        set(2, groupPermissionsId);
        set(3, groupPermissionsValue);
        set(4, cdate);
        set(5, mdate);
    }
}