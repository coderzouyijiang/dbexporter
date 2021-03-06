/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TOrderItemsDetailLogRecord;

import java.math.BigDecimal;
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
public class TOrderItemsDetailLog extends TableImpl<TOrderItemsDetailLogRecord> {

    private static final long serialVersionUID = 144045808;

    /**
     * The reference instance of <code>db_mall.t_order_items_detail_log</code>
     */
    public static final TOrderItemsDetailLog T_ORDER_ITEMS_DETAIL_LOG = new TOrderItemsDetailLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TOrderItemsDetailLogRecord> getRecordType() {
        return TOrderItemsDetailLogRecord.class;
    }

    /**
     * The column <code>db_mall.t_order_items_detail_log.id</code>.
     */
    public final TableField<TOrderItemsDetailLogRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_order_items_detail_log.snapshot</code>.
     */
    public final TableField<TOrderItemsDetailLogRecord, String> SNAPSHOT = createField("snapshot", org.jooq.impl.SQLDataType.VARCHAR(5000).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_items_detail_log.displace_amount</code>.
     */
    public final TableField<TOrderItemsDetailLogRecord, BigDecimal> DISPLACE_AMOUNT = createField("displace_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_items_detail_log.request_id</code>.
     */
    public final TableField<TOrderItemsDetailLogRecord, Integer> REQUEST_ID = createField("request_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_items_detail_log.cdate</code>.
     */
    public final TableField<TOrderItemsDetailLogRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_items_detail_log.mdate</code>.
     */
    public final TableField<TOrderItemsDetailLogRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_order_items_detail_log</code> table reference
     */
    public TOrderItemsDetailLog() {
        this(DSL.name("t_order_items_detail_log"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_order_items_detail_log</code> table reference
     */
    public TOrderItemsDetailLog(String alias) {
        this(DSL.name(alias), T_ORDER_ITEMS_DETAIL_LOG);
    }

    /**
     * Create an aliased <code>db_mall.t_order_items_detail_log</code> table reference
     */
    public TOrderItemsDetailLog(Name alias) {
        this(alias, T_ORDER_ITEMS_DETAIL_LOG);
    }

    private TOrderItemsDetailLog(Name alias, Table<TOrderItemsDetailLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private TOrderItemsDetailLog(Name alias, Table<TOrderItemsDetailLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TOrderItemsDetailLog(Table<O> child, ForeignKey<O, TOrderItemsDetailLogRecord> key) {
        super(child, key, T_ORDER_ITEMS_DETAIL_LOG);
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
        return Arrays.<Index>asList(Indexes.T_ORDER_ITEMS_DETAIL_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TOrderItemsDetailLogRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_ORDER_ITEMS_DETAIL_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TOrderItemsDetailLogRecord> getPrimaryKey() {
        return Keys.KEY_T_ORDER_ITEMS_DETAIL_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TOrderItemsDetailLogRecord>> getKeys() {
        return Arrays.<UniqueKey<TOrderItemsDetailLogRecord>>asList(Keys.KEY_T_ORDER_ITEMS_DETAIL_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderItemsDetailLog as(String alias) {
        return new TOrderItemsDetailLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderItemsDetailLog as(Name alias) {
        return new TOrderItemsDetailLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderItemsDetailLog rename(String name) {
        return new TOrderItemsDetailLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderItemsDetailLog rename(Name name) {
        return new TOrderItemsDetailLog(name, null);
    }
}
