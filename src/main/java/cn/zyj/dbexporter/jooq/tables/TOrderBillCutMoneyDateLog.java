/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TOrderBillCutMoneyDateLogRecord;

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
public class TOrderBillCutMoneyDateLog extends TableImpl<TOrderBillCutMoneyDateLogRecord> {

    private static final long serialVersionUID = -1423409175;

    /**
     * The reference instance of <code>db_mall.t_order_bill_cut_money_date_log</code>
     */
    public static final TOrderBillCutMoneyDateLog T_ORDER_BILL_CUT_MONEY_DATE_LOG = new TOrderBillCutMoneyDateLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TOrderBillCutMoneyDateLogRecord> getRecordType() {
        return TOrderBillCutMoneyDateLogRecord.class;
    }

    /**
     * The column <code>db_mall.t_order_bill_cut_money_date_log.id</code>.
     */
    public final TableField<TOrderBillCutMoneyDateLogRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_order_bill_cut_money_date_log.customer_id</code>.
     */
    public final TableField<TOrderBillCutMoneyDateLogRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_mall.t_order_bill_cut_money_date_log.bill_month</code>.
     */
    public final TableField<TOrderBillCutMoneyDateLogRecord, Integer> BILL_MONTH = createField("bill_month", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_mall.t_order_bill_cut_money_date_log.cut_money_date</code>.
     */
    public final TableField<TOrderBillCutMoneyDateLogRecord, Integer> CUT_MONEY_DATE = createField("cut_money_date", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_mall.t_order_bill_cut_money_date_log.cdate</code>.
     */
    public final TableField<TOrderBillCutMoneyDateLogRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>db_mall.t_order_bill_cut_money_date_log.mdate</code>.
     */
    public final TableField<TOrderBillCutMoneyDateLogRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>db_mall.t_order_bill_cut_money_date_log</code> table reference
     */
    public TOrderBillCutMoneyDateLog() {
        this(DSL.name("t_order_bill_cut_money_date_log"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_order_bill_cut_money_date_log</code> table reference
     */
    public TOrderBillCutMoneyDateLog(String alias) {
        this(DSL.name(alias), T_ORDER_BILL_CUT_MONEY_DATE_LOG);
    }

    /**
     * Create an aliased <code>db_mall.t_order_bill_cut_money_date_log</code> table reference
     */
    public TOrderBillCutMoneyDateLog(Name alias) {
        this(alias, T_ORDER_BILL_CUT_MONEY_DATE_LOG);
    }

    private TOrderBillCutMoneyDateLog(Name alias, Table<TOrderBillCutMoneyDateLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private TOrderBillCutMoneyDateLog(Name alias, Table<TOrderBillCutMoneyDateLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TOrderBillCutMoneyDateLog(Table<O> child, ForeignKey<O, TOrderBillCutMoneyDateLogRecord> key) {
        super(child, key, T_ORDER_BILL_CUT_MONEY_DATE_LOG);
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
        return Arrays.<Index>asList(Indexes.T_ORDER_BILL_CUT_MONEY_DATE_LOG_CABM, Indexes.T_ORDER_BILL_CUT_MONEY_DATE_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TOrderBillCutMoneyDateLogRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_ORDER_BILL_CUT_MONEY_DATE_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TOrderBillCutMoneyDateLogRecord> getPrimaryKey() {
        return Keys.KEY_T_ORDER_BILL_CUT_MONEY_DATE_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TOrderBillCutMoneyDateLogRecord>> getKeys() {
        return Arrays.<UniqueKey<TOrderBillCutMoneyDateLogRecord>>asList(Keys.KEY_T_ORDER_BILL_CUT_MONEY_DATE_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderBillCutMoneyDateLog as(String alias) {
        return new TOrderBillCutMoneyDateLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderBillCutMoneyDateLog as(Name alias) {
        return new TOrderBillCutMoneyDateLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderBillCutMoneyDateLog rename(String name) {
        return new TOrderBillCutMoneyDateLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderBillCutMoneyDateLog rename(Name name) {
        return new TOrderBillCutMoneyDateLog(name, null);
    }
}