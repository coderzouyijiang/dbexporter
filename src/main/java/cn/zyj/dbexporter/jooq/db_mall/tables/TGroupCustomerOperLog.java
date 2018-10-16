/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TGroupCustomerOperLogRecord;

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
public class TGroupCustomerOperLog extends TableImpl<TGroupCustomerOperLogRecord> {

    private static final long serialVersionUID = 1077293306;

    /**
     * The reference instance of <code>db_mall.t_group_customer_oper_log</code>
     */
    public static final TGroupCustomerOperLog T_GROUP_CUSTOMER_OPER_LOG = new TGroupCustomerOperLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TGroupCustomerOperLogRecord> getRecordType() {
        return TGroupCustomerOperLogRecord.class;
    }

    /**
     * The column <code>db_mall.t_group_customer_oper_log.id</code>.
     */
    public final TableField<TGroupCustomerOperLogRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_group_customer_oper_log.customer_id</code>.
     */
    public final TableField<TGroupCustomerOperLogRecord, Long> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_group_customer_oper_log.click_banner</code>.
     */
    public final TableField<TGroupCustomerOperLogRecord, Boolean> CLICK_BANNER = createField("click_banner", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>db_mall.t_group_customer_oper_log.propaganda_time</code>.
     */
    public final TableField<TGroupCustomerOperLogRecord, String> PROPAGANDA_TIME = createField("propaganda_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>db_mall.t_group_customer_oper_log.click_apply</code>.
     */
    public final TableField<TGroupCustomerOperLogRecord, Boolean> CLICK_APPLY = createField("click_apply", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>db_mall.t_group_customer_oper_log.apply_time</code>.
     */
    public final TableField<TGroupCustomerOperLogRecord, String> APPLY_TIME = createField("apply_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>db_mall.t_group_customer_oper_log.apply_success</code>.
     */
    public final TableField<TGroupCustomerOperLogRecord, Boolean> APPLY_SUCCESS = createField("apply_success", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'0'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * The column <code>db_mall.t_group_customer_oper_log.cdate</code>.
     */
    public final TableField<TGroupCustomerOperLogRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_group_customer_oper_log.mdate</code>.
     */
    public final TableField<TGroupCustomerOperLogRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_group_customer_oper_log</code> table reference
     */
    public TGroupCustomerOperLog() {
        this(DSL.name("t_group_customer_oper_log"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_group_customer_oper_log</code> table reference
     */
    public TGroupCustomerOperLog(String alias) {
        this(DSL.name(alias), T_GROUP_CUSTOMER_OPER_LOG);
    }

    /**
     * Create an aliased <code>db_mall.t_group_customer_oper_log</code> table reference
     */
    public TGroupCustomerOperLog(Name alias) {
        this(alias, T_GROUP_CUSTOMER_OPER_LOG);
    }

    private TGroupCustomerOperLog(Name alias, Table<TGroupCustomerOperLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private TGroupCustomerOperLog(Name alias, Table<TGroupCustomerOperLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TGroupCustomerOperLog(Table<O> child, ForeignKey<O, TGroupCustomerOperLogRecord> key) {
        super(child, key, T_GROUP_CUSTOMER_OPER_LOG);
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
        return Arrays.<Index>asList(Indexes.T_GROUP_CUSTOMER_OPER_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TGroupCustomerOperLogRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_GROUP_CUSTOMER_OPER_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TGroupCustomerOperLogRecord> getPrimaryKey() {
        return Keys.KEY_T_GROUP_CUSTOMER_OPER_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TGroupCustomerOperLogRecord>> getKeys() {
        return Arrays.<UniqueKey<TGroupCustomerOperLogRecord>>asList(Keys.KEY_T_GROUP_CUSTOMER_OPER_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupCustomerOperLog as(String alias) {
        return new TGroupCustomerOperLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupCustomerOperLog as(Name alias) {
        return new TGroupCustomerOperLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TGroupCustomerOperLog rename(String name) {
        return new TGroupCustomerOperLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TGroupCustomerOperLog rename(Name name) {
        return new TGroupCustomerOperLog(name, null);
    }
}