/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCustomerBillRecord;

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
public class TCustomerBill extends TableImpl<TCustomerBillRecord> {

    private static final long serialVersionUID = -680272842;

    /**
     * The reference instance of <code>db_mall.t_customer_bill</code>
     */
    public static final TCustomerBill T_CUSTOMER_BILL = new TCustomerBill();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TCustomerBillRecord> getRecordType() {
        return TCustomerBillRecord.class;
    }

    /**
     * The column <code>db_mall.t_customer_bill.id</code>.
     */
    public final TableField<TCustomerBillRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_customer_bill.bill_code</code>.
     */
    public final TableField<TCustomerBillRecord, String> BILL_CODE = createField("bill_code", org.jooq.impl.SQLDataType.VARCHAR(30), this, "");

    /**
     * The column <code>db_mall.t_customer_bill.customer_id</code>.
     */
    public final TableField<TCustomerBillRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_bill.order_id</code>.
     */
    public final TableField<TCustomerBillRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_bill.amount</code>.
     */
    public final TableField<TCustomerBillRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_customer_bill.available_balance</code>.
     */
    public final TableField<TCustomerBillRecord, BigDecimal> AVAILABLE_BALANCE = createField("available_balance", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_bill.exchange_frozen_balance</code>.
     */
    public final TableField<TCustomerBillRecord, BigDecimal> EXCHANGE_FROZEN_BALANCE = createField("exchange_frozen_balance", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_customer_bill.frozen_balance</code>.
     */
    public final TableField<TCustomerBillRecord, BigDecimal> FROZEN_BALANCE = createField("frozen_balance", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_bill.e_currency_virtual</code>. 虚拟e币金额
     */
    public final TableField<TCustomerBillRecord, BigDecimal> E_CURRENCY_VIRTUAL = createField("e_currency_virtual", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "虚拟e币金额");

    /**
     * The column <code>db_mall.t_customer_bill.available_invoice_balance</code>.
     */
    public final TableField<TCustomerBillRecord, BigDecimal> AVAILABLE_INVOICE_BALANCE = createField("available_invoice_balance", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "");

    /**
     * The column <code>db_mall.t_customer_bill.remark</code>.
     */
    public final TableField<TCustomerBillRecord, String> REMARK = createField("remark", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>db_mall.t_customer_bill.type_id</code>.
     */
    public final TableField<TCustomerBillRecord, Byte> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_customer_bill.account_type</code>.
     */
    public final TableField<TCustomerBillRecord, Byte> ACCOUNT_TYPE = createField("account_type", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>db_mall.t_customer_bill.item_id</code>.
     */
    public final TableField<TCustomerBillRecord, Integer> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_mall.t_customer_bill.source_id</code>.
     */
    public final TableField<TCustomerBillRecord, String> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>db_mall.t_customer_bill.pay_date</code>.
     */
    public final TableField<TCustomerBillRecord, Timestamp> PAY_DATE = createField("pay_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_bill.pay_type</code>.
     */
    public final TableField<TCustomerBillRecord, Byte> PAY_TYPE = createField("pay_type", org.jooq.impl.SQLDataType.TINYINT, this, "");

    /**
     * The column <code>db_mall.t_customer_bill.cdate</code>.
     */
    public final TableField<TCustomerBillRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_bill.mdate</code>.
     */
    public final TableField<TCustomerBillRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_bill.item_desc</code>.
     */
    public final TableField<TCustomerBillRecord, String> ITEM_DESC = createField("item_desc", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * Create a <code>db_mall.t_customer_bill</code> table reference
     */
    public TCustomerBill() {
        this(DSL.name("t_customer_bill"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_customer_bill</code> table reference
     */
    public TCustomerBill(String alias) {
        this(DSL.name(alias), T_CUSTOMER_BILL);
    }

    /**
     * Create an aliased <code>db_mall.t_customer_bill</code> table reference
     */
    public TCustomerBill(Name alias) {
        this(alias, T_CUSTOMER_BILL);
    }

    private TCustomerBill(Name alias, Table<TCustomerBillRecord> aliased) {
        this(alias, aliased, null);
    }

    private TCustomerBill(Name alias, Table<TCustomerBillRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TCustomerBill(Table<O> child, ForeignKey<O, TCustomerBillRecord> key) {
        super(child, key, T_CUSTOMER_BILL);
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
        return Arrays.<Index>asList(Indexes.T_CUSTOMER_BILL_BILL_CODE, Indexes.T_CUSTOMER_BILL_CUSTOMER_ID, Indexes.T_CUSTOMER_BILL_ORDER_ID_INDEX, Indexes.T_CUSTOMER_BILL_PRIMARY, Indexes.T_CUSTOMER_BILL_TS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TCustomerBillRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_CUSTOMER_BILL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TCustomerBillRecord> getPrimaryKey() {
        return Keys.KEY_T_CUSTOMER_BILL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TCustomerBillRecord>> getKeys() {
        return Arrays.<UniqueKey<TCustomerBillRecord>>asList(Keys.KEY_T_CUSTOMER_BILL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerBill as(String alias) {
        return new TCustomerBill(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerBill as(Name alias) {
        return new TCustomerBill(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TCustomerBill rename(String name) {
        return new TCustomerBill(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TCustomerBill rename(Name name) {
        return new TCustomerBill(name, null);
    }
}
