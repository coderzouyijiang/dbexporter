/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TOrderBalanceRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class TOrderBalance extends TableImpl<TOrderBalanceRecord> {

    private static final long serialVersionUID = -1029655502;

    /**
     * The reference instance of <code>db_mall.t_order_balance</code>
     */
    public static final TOrderBalance T_ORDER_BALANCE = new TOrderBalance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TOrderBalanceRecord> getRecordType() {
        return TOrderBalanceRecord.class;
    }

    /**
     * The column <code>db_mall.t_order_balance.order_id</code>.
     */
    public final TableField<TOrderBalanceRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_balance.pay_status</code>.
     */
    public final TableField<TOrderBalanceRecord, Byte> PAY_STATUS = createField("pay_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_order_balance.deposit</code>.
     */
    public final TableField<TOrderBalanceRecord, BigDecimal> DEPOSIT = createField("deposit", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_order_balance.credit_deposit</code>.
     */
    public final TableField<TOrderBalanceRecord, BigDecimal> CREDIT_DEPOSIT = createField("credit_deposit", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_order_balance.pay_deposit</code>.
     */
    public final TableField<TOrderBalanceRecord, BigDecimal> PAY_DEPOSIT = createField("pay_deposit", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_order_balance.deposit_type</code>.
     */
    public final TableField<TOrderBalanceRecord, Byte> DEPOSIT_TYPE = createField("deposit_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_order_balance.coupon_id</code>.
     */
    public final TableField<TOrderBalanceRecord, Integer> COUPON_ID = createField("coupon_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_order_balance.coupon_amount</code>.
     */
    public final TableField<TOrderBalanceRecord, BigDecimal> COUPON_AMOUNT = createField("coupon_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_order_balance.insurance_amount</code>.
     */
    public final TableField<TOrderBalanceRecord, BigDecimal> INSURANCE_AMOUNT = createField("insurance_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_order_balance.added_service_amount</code>. 增值服务总金额
     */
    public final TableField<TOrderBalanceRecord, BigDecimal> ADDED_SERVICE_AMOUNT = createField("added_service_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "增值服务总金额");

    /**
     * The column <code>db_mall.t_order_balance.payed_amount</code>.
     */
    public final TableField<TOrderBalanceRecord, BigDecimal> PAYED_AMOUNT = createField("payed_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_order_balance.e_currency_virtual</code>.
     */
    public final TableField<TOrderBalanceRecord, BigDecimal> E_CURRENCY_VIRTUAL = createField("e_currency_virtual", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_order_balance.sale_amount</code>.
     */
    public final TableField<TOrderBalanceRecord, BigDecimal> SALE_AMOUNT = createField("sale_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_order_balance.rent</code>.
     */
    public final TableField<TOrderBalanceRecord, BigDecimal> RENT = createField("rent", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_order_balance.need_amount</code>.
     */
    public final TableField<TOrderBalanceRecord, BigDecimal> NEED_AMOUNT = createField("need_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_order_balance.use_coupon_date</code>.
     */
    public final TableField<TOrderBalanceRecord, Timestamp> USE_COUPON_DATE = createField("use_coupon_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>db_mall.t_order_balance.cdate</code>.
     */
    public final TableField<TOrderBalanceRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_balance.mdate</code>.
     */
    public final TableField<TOrderBalanceRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_order_balance</code> table reference
     */
    public TOrderBalance() {
        this(DSL.name("t_order_balance"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_order_balance</code> table reference
     */
    public TOrderBalance(String alias) {
        this(DSL.name(alias), T_ORDER_BALANCE);
    }

    /**
     * Create an aliased <code>db_mall.t_order_balance</code> table reference
     */
    public TOrderBalance(Name alias) {
        this(alias, T_ORDER_BALANCE);
    }

    private TOrderBalance(Name alias, Table<TOrderBalanceRecord> aliased) {
        this(alias, aliased, null);
    }

    private TOrderBalance(Name alias, Table<TOrderBalanceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TOrderBalance(Table<O> child, ForeignKey<O, TOrderBalanceRecord> key) {
        super(child, key, T_ORDER_BALANCE);
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
        return Arrays.<Index>asList(Indexes.T_ORDER_BALANCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TOrderBalanceRecord> getPrimaryKey() {
        return Keys.KEY_T_ORDER_BALANCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TOrderBalanceRecord>> getKeys() {
        return Arrays.<UniqueKey<TOrderBalanceRecord>>asList(Keys.KEY_T_ORDER_BALANCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderBalance as(String alias) {
        return new TOrderBalance(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderBalance as(Name alias) {
        return new TOrderBalance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderBalance rename(String name) {
        return new TOrderBalance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderBalance rename(Name name) {
        return new TOrderBalance(name, null);
    }
}