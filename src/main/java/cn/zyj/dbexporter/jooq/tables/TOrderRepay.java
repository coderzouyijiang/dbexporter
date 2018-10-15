/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TOrderRepayRecord;

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
public class TOrderRepay extends TableImpl<TOrderRepayRecord> {

    private static final long serialVersionUID = -833241985;

    /**
     * The reference instance of <code>db_mall.t_order_repay</code>
     */
    public static final TOrderRepay T_ORDER_REPAY = new TOrderRepay();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TOrderRepayRecord> getRecordType() {
        return TOrderRepayRecord.class;
    }

    /**
     * The column <code>db_mall.t_order_repay.id</code>.
     */
    public final TableField<TOrderRepayRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_order_repay.customer_id</code>.
     */
    public final TableField<TOrderRepayRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_repay.order_id</code>.
     */
    public final TableField<TOrderRepayRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_repay.main_order_id</code>.
     */
    public final TableField<TOrderRepayRecord, String> MAIN_ORDER_ID = createField("main_order_id", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_repay.payed_amount</code>.
     */
    public final TableField<TOrderRepayRecord, BigDecimal> PAYED_AMOUNT = createField("payed_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_order_repay.payed_deposit</code>.
     */
    public final TableField<TOrderRepayRecord, BigDecimal> PAYED_DEPOSIT = createField("payed_deposit", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_order_repay.need_amount</code>.
     */
    public final TableField<TOrderRepayRecord, BigDecimal> NEED_AMOUNT = createField("need_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_order_repay.sync_status</code>.
     */
    public final TableField<TOrderRepayRecord, Byte> SYNC_STATUS = createField("sync_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_order_repay.cdate</code>.
     */
    public final TableField<TOrderRepayRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_repay.mdate</code>.
     */
    public final TableField<TOrderRepayRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_order_repay</code> table reference
     */
    public TOrderRepay() {
        this(DSL.name("t_order_repay"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_order_repay</code> table reference
     */
    public TOrderRepay(String alias) {
        this(DSL.name(alias), T_ORDER_REPAY);
    }

    /**
     * Create an aliased <code>db_mall.t_order_repay</code> table reference
     */
    public TOrderRepay(Name alias) {
        this(alias, T_ORDER_REPAY);
    }

    private TOrderRepay(Name alias, Table<TOrderRepayRecord> aliased) {
        this(alias, aliased, null);
    }

    private TOrderRepay(Name alias, Table<TOrderRepayRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TOrderRepay(Table<O> child, ForeignKey<O, TOrderRepayRecord> key) {
        super(child, key, T_ORDER_REPAY);
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
        return Arrays.<Index>asList(Indexes.T_ORDER_REPAY_PRIMARY, Indexes.T_ORDER_REPAY_SYNC_STATUS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TOrderRepayRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_ORDER_REPAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TOrderRepayRecord> getPrimaryKey() {
        return Keys.KEY_T_ORDER_REPAY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TOrderRepayRecord>> getKeys() {
        return Arrays.<UniqueKey<TOrderRepayRecord>>asList(Keys.KEY_T_ORDER_REPAY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderRepay as(String alias) {
        return new TOrderRepay(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderRepay as(Name alias) {
        return new TOrderRepay(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderRepay rename(String name) {
        return new TOrderRepay(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderRepay rename(Name name) {
        return new TOrderRepay(name, null);
    }
}
