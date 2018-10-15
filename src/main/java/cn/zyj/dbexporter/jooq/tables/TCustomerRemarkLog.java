/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TCustomerRemarkLogRecord;

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
public class TCustomerRemarkLog extends TableImpl<TCustomerRemarkLogRecord> {

    private static final long serialVersionUID = -1297841167;

    /**
     * The reference instance of <code>db_mall.t_customer_remark_log</code>
     */
    public static final TCustomerRemarkLog T_CUSTOMER_REMARK_LOG = new TCustomerRemarkLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TCustomerRemarkLogRecord> getRecordType() {
        return TCustomerRemarkLogRecord.class;
    }

    /**
     * The column <code>db_mall.t_customer_remark_log.id</code>.
     */
    public final TableField<TCustomerRemarkLogRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_customer_remark_log.customer_id</code>.
     */
    public final TableField<TCustomerRemarkLogRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_remark_log.remark</code>.
     */
    public final TableField<TCustomerRemarkLogRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_remark_log.cdate</code>.
     */
    public final TableField<TCustomerRemarkLogRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_remark_log.mdate</code>.
     */
    public final TableField<TCustomerRemarkLogRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_customer_remark_log</code> table reference
     */
    public TCustomerRemarkLog() {
        this(DSL.name("t_customer_remark_log"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_customer_remark_log</code> table reference
     */
    public TCustomerRemarkLog(String alias) {
        this(DSL.name(alias), T_CUSTOMER_REMARK_LOG);
    }

    /**
     * Create an aliased <code>db_mall.t_customer_remark_log</code> table reference
     */
    public TCustomerRemarkLog(Name alias) {
        this(alias, T_CUSTOMER_REMARK_LOG);
    }

    private TCustomerRemarkLog(Name alias, Table<TCustomerRemarkLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private TCustomerRemarkLog(Name alias, Table<TCustomerRemarkLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TCustomerRemarkLog(Table<O> child, ForeignKey<O, TCustomerRemarkLogRecord> key) {
        super(child, key, T_CUSTOMER_REMARK_LOG);
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
        return Arrays.<Index>asList(Indexes.T_CUSTOMER_REMARK_LOG_CUSTOMER_ID, Indexes.T_CUSTOMER_REMARK_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TCustomerRemarkLogRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_CUSTOMER_REMARK_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TCustomerRemarkLogRecord> getPrimaryKey() {
        return Keys.KEY_T_CUSTOMER_REMARK_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TCustomerRemarkLogRecord>> getKeys() {
        return Arrays.<UniqueKey<TCustomerRemarkLogRecord>>asList(Keys.KEY_T_CUSTOMER_REMARK_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerRemarkLog as(String alias) {
        return new TCustomerRemarkLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerRemarkLog as(Name alias) {
        return new TCustomerRemarkLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TCustomerRemarkLog rename(String name) {
        return new TCustomerRemarkLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TCustomerRemarkLog rename(Name name) {
        return new TCustomerRemarkLog(name, null);
    }
}
