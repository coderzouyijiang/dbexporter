/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TStatDailyOrdersRecord;

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
public class TStatDailyOrders extends TableImpl<TStatDailyOrdersRecord> {

    private static final long serialVersionUID = -1261577211;

    /**
     * The reference instance of <code>db_mall.t_stat_daily_orders</code>
     */
    public static final TStatDailyOrders T_STAT_DAILY_ORDERS = new TStatDailyOrders();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TStatDailyOrdersRecord> getRecordType() {
        return TStatDailyOrdersRecord.class;
    }

    /**
     * The column <code>db_mall.t_stat_daily_orders.id</code>.
     */
    public final TableField<TStatDailyOrdersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_stat_daily_orders.stat_date</code>.
     */
    public final TableField<TStatDailyOrdersRecord, Integer> STAT_DATE = createField("stat_date", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_stat_daily_orders.total_num</code>.
     */
    public final TableField<TStatDailyOrdersRecord, Integer> TOTAL_NUM = createField("total_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_stat_daily_orders.diff_num</code>.
     */
    public final TableField<TStatDailyOrdersRecord, Integer> DIFF_NUM = createField("diff_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_stat_daily_orders.ok_num</code>.
     */
    public final TableField<TStatDailyOrdersRecord, Integer> OK_NUM = createField("ok_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_stat_daily_orders.diff_ok_num</code>.
     */
    public final TableField<TStatDailyOrdersRecord, Integer> DIFF_OK_NUM = createField("diff_ok_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_stat_daily_orders.cdate</code>.
     */
    public final TableField<TStatDailyOrdersRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_stat_daily_orders.mdate</code>.
     */
    public final TableField<TStatDailyOrdersRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_stat_daily_orders</code> table reference
     */
    public TStatDailyOrders() {
        this(DSL.name("t_stat_daily_orders"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_stat_daily_orders</code> table reference
     */
    public TStatDailyOrders(String alias) {
        this(DSL.name(alias), T_STAT_DAILY_ORDERS);
    }

    /**
     * Create an aliased <code>db_mall.t_stat_daily_orders</code> table reference
     */
    public TStatDailyOrders(Name alias) {
        this(alias, T_STAT_DAILY_ORDERS);
    }

    private TStatDailyOrders(Name alias, Table<TStatDailyOrdersRecord> aliased) {
        this(alias, aliased, null);
    }

    private TStatDailyOrders(Name alias, Table<TStatDailyOrdersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TStatDailyOrders(Table<O> child, ForeignKey<O, TStatDailyOrdersRecord> key) {
        super(child, key, T_STAT_DAILY_ORDERS);
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
        return Arrays.<Index>asList(Indexes.T_STAT_DAILY_ORDERS_PRIMARY, Indexes.T_STAT_DAILY_ORDERS_STAT_DATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TStatDailyOrdersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_STAT_DAILY_ORDERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TStatDailyOrdersRecord> getPrimaryKey() {
        return Keys.KEY_T_STAT_DAILY_ORDERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TStatDailyOrdersRecord>> getKeys() {
        return Arrays.<UniqueKey<TStatDailyOrdersRecord>>asList(Keys.KEY_T_STAT_DAILY_ORDERS_PRIMARY, Keys.KEY_T_STAT_DAILY_ORDERS_STAT_DATE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStatDailyOrders as(String alias) {
        return new TStatDailyOrders(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStatDailyOrders as(Name alias) {
        return new TStatDailyOrders(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TStatDailyOrders rename(String name) {
        return new TStatDailyOrders(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TStatDailyOrders rename(Name name) {
        return new TStatDailyOrders(name, null);
    }
}