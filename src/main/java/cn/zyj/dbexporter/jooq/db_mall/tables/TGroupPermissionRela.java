/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TGroupPermissionRelaRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class TGroupPermissionRela extends TableImpl<TGroupPermissionRelaRecord> {

    private static final long serialVersionUID = 1016805370;

    /**
     * The reference instance of <code>db_mall.t_group_permission_rela</code>
     */
    public static final TGroupPermissionRela T_GROUP_PERMISSION_RELA = new TGroupPermissionRela();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TGroupPermissionRelaRecord> getRecordType() {
        return TGroupPermissionRelaRecord.class;
    }

    /**
     * The column <code>db_mall.t_group_permission_rela.id</code>.
     */
    public final TableField<TGroupPermissionRelaRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_group_permission_rela.group_id</code>. 集团id
     */
    public final TableField<TGroupPermissionRelaRecord, Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "集团id");

    /**
     * The column <code>db_mall.t_group_permission_rela.group_permissions_id</code>. 权限id
     */
    public final TableField<TGroupPermissionRelaRecord, Integer> GROUP_PERMISSIONS_ID = createField("group_permissions_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "权限id");

    /**
     * The column <code>db_mall.t_group_permission_rela.group_permissions_value</code>. 0:不可用 1:可用
     */
    public final TableField<TGroupPermissionRelaRecord, Integer> GROUP_PERMISSIONS_VALUE = createField("group_permissions_value", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "0:不可用 1:可用");

    /**
     * The column <code>db_mall.t_group_permission_rela.cdate</code>. 创建时间
     */
    public final TableField<TGroupPermissionRelaRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>db_mall.t_group_permission_rela.mdate</code>. 修改时间
     */
    public final TableField<TGroupPermissionRelaRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0000-00-00 00:00:00", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * Create a <code>db_mall.t_group_permission_rela</code> table reference
     */
    public TGroupPermissionRela() {
        this(DSL.name("t_group_permission_rela"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_group_permission_rela</code> table reference
     */
    public TGroupPermissionRela(String alias) {
        this(DSL.name(alias), T_GROUP_PERMISSION_RELA);
    }

    /**
     * Create an aliased <code>db_mall.t_group_permission_rela</code> table reference
     */
    public TGroupPermissionRela(Name alias) {
        this(alias, T_GROUP_PERMISSION_RELA);
    }

    private TGroupPermissionRela(Name alias, Table<TGroupPermissionRelaRecord> aliased) {
        this(alias, aliased, null);
    }

    private TGroupPermissionRela(Name alias, Table<TGroupPermissionRelaRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TGroupPermissionRela(Table<O> child, ForeignKey<O, TGroupPermissionRelaRecord> key) {
        super(child, key, T_GROUP_PERMISSION_RELA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DbMall.DB_MALL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.T_GROUP_PERMISSION_RELA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TGroupPermissionRelaRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_GROUP_PERMISSION_RELA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TGroupPermissionRelaRecord> getPrimaryKey() {
        return Keys.KEY_T_GROUP_PERMISSION_RELA_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TGroupPermissionRelaRecord>> getKeys() {
        return Arrays.<UniqueKey<TGroupPermissionRelaRecord>>asList(Keys.KEY_T_GROUP_PERMISSION_RELA_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupPermissionRela as(String alias) {
        return new TGroupPermissionRela(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupPermissionRela as(Name alias) {
        return new TGroupPermissionRela(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TGroupPermissionRela rename(String name) {
        return new TGroupPermissionRela(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TGroupPermissionRela rename(Name name) {
        return new TGroupPermissionRela(name, null);
    }
}
