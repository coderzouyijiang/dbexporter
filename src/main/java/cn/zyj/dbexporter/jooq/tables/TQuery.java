/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TQueryRecord;

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
public class TQuery extends TableImpl<TQueryRecord> {

    private static final long serialVersionUID = -366138283;

    /**
     * The reference instance of <code>db_mall.t_query</code>
     */
    public static final TQuery T_QUERY = new TQuery();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TQueryRecord> getRecordType() {
        return TQueryRecord.class;
    }

    /**
     * The column <code>db_mall.t_query.id</code>.
     */
    public final TableField<TQueryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_query.query</code>.
     */
    public final TableField<TQueryRecord, String> QUERY = createField("query", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_query.url</code>.
     */
    public final TableField<TQueryRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(300).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_query.oid</code>.
     */
    public final TableField<TQueryRecord, Integer> OID = createField("oid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_query.status</code>.
     */
    public final TableField<TQueryRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_query.manager_id</code>.
     */
    public final TableField<TQueryRecord, Integer> MANAGER_ID = createField("manager_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_query.cdate</code>.
     */
    public final TableField<TQueryRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_query.mdate</code>.
     */
    public final TableField<TQueryRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_query.type</code>. 1:搜索热词 2：导航词
     */
    public final TableField<TQueryRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "1:搜索热词 2：导航词");

    /**
     * The column <code>db_mall.t_query.target</code>. 1:新窗口打开 0：本页打开
     */
    public final TableField<TQueryRecord, Integer> TARGET = createField("target", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "1:新窗口打开 0：本页打开");

    /**
     * Create a <code>db_mall.t_query</code> table reference
     */
    public TQuery() {
        this(DSL.name("t_query"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_query</code> table reference
     */
    public TQuery(String alias) {
        this(DSL.name(alias), T_QUERY);
    }

    /**
     * Create an aliased <code>db_mall.t_query</code> table reference
     */
    public TQuery(Name alias) {
        this(alias, T_QUERY);
    }

    private TQuery(Name alias, Table<TQueryRecord> aliased) {
        this(alias, aliased, null);
    }

    private TQuery(Name alias, Table<TQueryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TQuery(Table<O> child, ForeignKey<O, TQueryRecord> key) {
        super(child, key, T_QUERY);
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
        return Arrays.<Index>asList(Indexes.T_QUERY_PRIMARY, Indexes.T_QUERY_S_O);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TQueryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_QUERY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TQueryRecord> getPrimaryKey() {
        return Keys.KEY_T_QUERY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TQueryRecord>> getKeys() {
        return Arrays.<UniqueKey<TQueryRecord>>asList(Keys.KEY_T_QUERY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQuery as(String alias) {
        return new TQuery(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQuery as(Name alias) {
        return new TQuery(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TQuery rename(String name) {
        return new TQuery(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TQuery rename(Name name) {
        return new TQuery(name, null);
    }
}
