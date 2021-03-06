/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TOrderPayEventRecord;

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
public class TOrderPayEvent extends TableImpl<TOrderPayEventRecord> {

    private static final long serialVersionUID = 228562592;

    /**
     * The reference instance of <code>db_mall.t_order_pay_event</code>
     */
    public static final TOrderPayEvent T_ORDER_PAY_EVENT = new TOrderPayEvent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TOrderPayEventRecord> getRecordType() {
        return TOrderPayEventRecord.class;
    }

    /**
     * The column <code>db_mall.t_order_pay_event.id</code>.
     */
    public final TableField<TOrderPayEventRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_order_pay_event.customer_id</code>.
     */
    public final TableField<TOrderPayEventRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_order_pay_event.order_id</code>.
     */
    public final TableField<TOrderPayEventRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_pay_event.balance_date</code>.
     */
    public final TableField<TOrderPayEventRecord, Integer> BALANCE_DATE = createField("balance_date", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_pay_event.status</code>.
     */
    public final TableField<TOrderPayEventRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_order_pay_event.type_id</code>.
     */
    public final TableField<TOrderPayEventRecord, Byte> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_order_pay_event.sync_status</code>.
     */
    public final TableField<TOrderPayEventRecord, Byte> SYNC_STATUS = createField("sync_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_order_pay_event.cdate</code>.
     */
    public final TableField<TOrderPayEventRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_pay_event.mdate</code>.
     */
    public final TableField<TOrderPayEventRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_order_pay_event</code> table reference
     */
    public TOrderPayEvent() {
        this(DSL.name("t_order_pay_event"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_order_pay_event</code> table reference
     */
    public TOrderPayEvent(String alias) {
        this(DSL.name(alias), T_ORDER_PAY_EVENT);
    }

    /**
     * Create an aliased <code>db_mall.t_order_pay_event</code> table reference
     */
    public TOrderPayEvent(Name alias) {
        this(alias, T_ORDER_PAY_EVENT);
    }

    private TOrderPayEvent(Name alias, Table<TOrderPayEventRecord> aliased) {
        this(alias, aliased, null);
    }

    private TOrderPayEvent(Name alias, Table<TOrderPayEventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TOrderPayEvent(Table<O> child, ForeignKey<O, TOrderPayEventRecord> key) {
        super(child, key, T_ORDER_PAY_EVENT);
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
        return Arrays.<Index>asList(Indexes.T_ORDER_PAY_EVENT_CUSTOMER_ID, Indexes.T_ORDER_PAY_EVENT_INDEX_CDATE, Indexes.T_ORDER_PAY_EVENT_PRIMARY, Indexes.T_ORDER_PAY_EVENT_SYNC_STATUS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TOrderPayEventRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_ORDER_PAY_EVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TOrderPayEventRecord> getPrimaryKey() {
        return Keys.KEY_T_ORDER_PAY_EVENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TOrderPayEventRecord>> getKeys() {
        return Arrays.<UniqueKey<TOrderPayEventRecord>>asList(Keys.KEY_T_ORDER_PAY_EVENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderPayEvent as(String alias) {
        return new TOrderPayEvent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderPayEvent as(Name alias) {
        return new TOrderPayEvent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderPayEvent rename(String name) {
        return new TOrderPayEvent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderPayEvent rename(Name name) {
        return new TOrderPayEvent(name, null);
    }
}
