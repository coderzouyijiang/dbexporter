/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TOrderPayableBillRecord;

import java.math.BigDecimal;
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
import org.jooq.types.UByte;
import org.jooq.types.ULong;


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
public class TOrderPayableBill extends TableImpl<TOrderPayableBillRecord> {

    private static final long serialVersionUID = -2036450528;

    /**
     * The reference instance of <code>db_mall.t_order_payable_bill</code>
     */
    public static final TOrderPayableBill T_ORDER_PAYABLE_BILL = new TOrderPayableBill();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TOrderPayableBillRecord> getRecordType() {
        return TOrderPayableBillRecord.class;
    }

    /**
     * The column <code>db_mall.t_order_payable_bill.id</code>.
     */
    public final TableField<TOrderPayableBillRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_order_payable_bill.order_id</code>.
     */
    public final TableField<TOrderPayableBillRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_payable_bill.sn</code>.
     */
    public final TableField<TOrderPayableBillRecord, String> SN = createField("sn", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_order_payable_bill.type</code>. 0 租金 1调整租金
     */
    public final TableField<TOrderPayableBillRecord, UByte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINTUNSIGNED)), this, "0 租金 1调整租金");

    /**
     * The column <code>db_mall.t_order_payable_bill.month</code>.
     */
    public final TableField<TOrderPayableBillRecord, Integer> MONTH = createField("month", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_mall.t_order_payable_bill.money</code>.
     */
    public final TableField<TOrderPayableBillRecord, BigDecimal> MONEY = createField("money", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "");

    /**
     * Create a <code>db_mall.t_order_payable_bill</code> table reference
     */
    public TOrderPayableBill() {
        this(DSL.name("t_order_payable_bill"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_order_payable_bill</code> table reference
     */
    public TOrderPayableBill(String alias) {
        this(DSL.name(alias), T_ORDER_PAYABLE_BILL);
    }

    /**
     * Create an aliased <code>db_mall.t_order_payable_bill</code> table reference
     */
    public TOrderPayableBill(Name alias) {
        this(alias, T_ORDER_PAYABLE_BILL);
    }

    private TOrderPayableBill(Name alias, Table<TOrderPayableBillRecord> aliased) {
        this(alias, aliased, null);
    }

    private TOrderPayableBill(Name alias, Table<TOrderPayableBillRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TOrderPayableBill(Table<O> child, ForeignKey<O, TOrderPayableBillRecord> key) {
        super(child, key, T_ORDER_PAYABLE_BILL);
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
        return Arrays.<Index>asList(Indexes.T_ORDER_PAYABLE_BILL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TOrderPayableBillRecord, ULong> getIdentity() {
        return Keys.IDENTITY_T_ORDER_PAYABLE_BILL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TOrderPayableBillRecord> getPrimaryKey() {
        return Keys.KEY_T_ORDER_PAYABLE_BILL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TOrderPayableBillRecord>> getKeys() {
        return Arrays.<UniqueKey<TOrderPayableBillRecord>>asList(Keys.KEY_T_ORDER_PAYABLE_BILL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderPayableBill as(String alias) {
        return new TOrderPayableBill(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderPayableBill as(Name alias) {
        return new TOrderPayableBill(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderPayableBill rename(String name) {
        return new TOrderPayableBill(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderPayableBill rename(Name name) {
        return new TOrderPayableBill(name, null);
    }
}