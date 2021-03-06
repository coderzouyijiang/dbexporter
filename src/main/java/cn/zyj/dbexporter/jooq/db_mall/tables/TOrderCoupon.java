/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TOrderCouponRecord;

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
public class TOrderCoupon extends TableImpl<TOrderCouponRecord> {

    private static final long serialVersionUID = -1860797855;

    /**
     * The reference instance of <code>db_mall.t_order_coupon</code>
     */
    public static final TOrderCoupon T_ORDER_COUPON = new TOrderCoupon();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TOrderCouponRecord> getRecordType() {
        return TOrderCouponRecord.class;
    }

    /**
     * The column <code>db_mall.t_order_coupon.id</code>.
     */
    public final TableField<TOrderCouponRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_order_coupon.customer_id</code>.
     */
    public final TableField<TOrderCouponRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_order_coupon.order_id</code>.
     */
    public final TableField<TOrderCouponRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_coupon.main_order_id</code>.
     */
    public final TableField<TOrderCouponRecord, String> MAIN_ORDER_ID = createField("main_order_id", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>db_mall.t_order_coupon.coupon_id</code>.
     */
    public final TableField<TOrderCouponRecord, Integer> COUPON_ID = createField("coupon_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_coupon.amount</code>.
     */
    public final TableField<TOrderCouponRecord, Long> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_coupon.month</code>.
     */
    public final TableField<TOrderCouponRecord, Integer> MONTH = createField("month", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_coupon.discount_value</code>.
     */
    public final TableField<TOrderCouponRecord, String> DISCOUNT_VALUE = createField("discount_value", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_coupon.months</code>.
     */
    public final TableField<TOrderCouponRecord, String> MONTHS = createField("months", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_coupon.cdate</code>.
     */
    public final TableField<TOrderCouponRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_coupon.mdate</code>.
     */
    public final TableField<TOrderCouponRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_order_coupon</code> table reference
     */
    public TOrderCoupon() {
        this(DSL.name("t_order_coupon"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_order_coupon</code> table reference
     */
    public TOrderCoupon(String alias) {
        this(DSL.name(alias), T_ORDER_COUPON);
    }

    /**
     * Create an aliased <code>db_mall.t_order_coupon</code> table reference
     */
    public TOrderCoupon(Name alias) {
        this(alias, T_ORDER_COUPON);
    }

    private TOrderCoupon(Name alias, Table<TOrderCouponRecord> aliased) {
        this(alias, aliased, null);
    }

    private TOrderCoupon(Name alias, Table<TOrderCouponRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TOrderCoupon(Table<O> child, ForeignKey<O, TOrderCouponRecord> key) {
        super(child, key, T_ORDER_COUPON);
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
        return Arrays.<Index>asList(Indexes.T_ORDER_COUPON_C_O, Indexes.T_ORDER_COUPON_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TOrderCouponRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_ORDER_COUPON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TOrderCouponRecord> getPrimaryKey() {
        return Keys.KEY_T_ORDER_COUPON_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TOrderCouponRecord>> getKeys() {
        return Arrays.<UniqueKey<TOrderCouponRecord>>asList(Keys.KEY_T_ORDER_COUPON_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderCoupon as(String alias) {
        return new TOrderCoupon(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderCoupon as(Name alias) {
        return new TOrderCoupon(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderCoupon rename(String name) {
        return new TOrderCoupon(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderCoupon rename(Name name) {
        return new TOrderCoupon(name, null);
    }
}
