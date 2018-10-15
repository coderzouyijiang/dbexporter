/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TOrderCountRecord;

import java.sql.Date;
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
public class TOrderCount extends TableImpl<TOrderCountRecord> {

    private static final long serialVersionUID = 1544632568;

    /**
     * The reference instance of <code>db_mall.t_order_count</code>
     */
    public static final TOrderCount T_ORDER_COUNT = new TOrderCount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TOrderCountRecord> getRecordType() {
        return TOrderCountRecord.class;
    }

    /**
     * The column <code>db_mall.t_order_count.id</code>.
     */
    public final TableField<TOrderCountRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_order_count.customer_id</code>.
     */
    public final TableField<TOrderCountRecord, Long> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_count.count_date</code>.
     */
    public final TableField<TOrderCountRecord, Date> COUNT_DATE = createField("count_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>db_mall.t_order_count.count</code>.
     */
    public final TableField<TOrderCountRecord, Integer> COUNT = createField("count", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_mall.t_order_count.cdate</code>.
     */
    public final TableField<TOrderCountRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_count.mdate</code>.
     */
    public final TableField<TOrderCountRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_order_count</code> table reference
     */
    public TOrderCount() {
        this(DSL.name("t_order_count"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_order_count</code> table reference
     */
    public TOrderCount(String alias) {
        this(DSL.name(alias), T_ORDER_COUNT);
    }

    /**
     * Create an aliased <code>db_mall.t_order_count</code> table reference
     */
    public TOrderCount(Name alias) {
        this(alias, T_ORDER_COUNT);
    }

    private TOrderCount(Name alias, Table<TOrderCountRecord> aliased) {
        this(alias, aliased, null);
    }

    private TOrderCount(Name alias, Table<TOrderCountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TOrderCount(Table<O> child, ForeignKey<O, TOrderCountRecord> key) {
        super(child, key, T_ORDER_COUNT);
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
        return Arrays.<Index>asList(Indexes.T_ORDER_COUNT_CUSTOMERID, Indexes.T_ORDER_COUNT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TOrderCountRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_ORDER_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TOrderCountRecord> getPrimaryKey() {
        return Keys.KEY_T_ORDER_COUNT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TOrderCountRecord>> getKeys() {
        return Arrays.<UniqueKey<TOrderCountRecord>>asList(Keys.KEY_T_ORDER_COUNT_PRIMARY, Keys.KEY_T_ORDER_COUNT_CUSTOMERID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderCount as(String alias) {
        return new TOrderCount(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderCount as(Name alias) {
        return new TOrderCount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderCount rename(String name) {
        return new TOrderCount(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderCount rename(Name name) {
        return new TOrderCount(name, null);
    }
}
