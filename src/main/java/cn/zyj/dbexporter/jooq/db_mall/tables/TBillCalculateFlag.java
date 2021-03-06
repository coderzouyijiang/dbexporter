/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TBillCalculateFlagRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class TBillCalculateFlag extends TableImpl<TBillCalculateFlagRecord> {

    private static final long serialVersionUID = 1092449648;

    /**
     * The reference instance of <code>db_mall.t_bill_calculate_flag</code>
     */
    public static final TBillCalculateFlag T_BILL_CALCULATE_FLAG = new TBillCalculateFlag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TBillCalculateFlagRecord> getRecordType() {
        return TBillCalculateFlagRecord.class;
    }

    /**
     * The column <code>db_mall.t_bill_calculate_flag.type</code>.
     */
    public final TableField<TBillCalculateFlagRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_bill_calculate_flag.num</code>.
     */
    public final TableField<TBillCalculateFlagRecord, Long> NUM = createField("num", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_bill_calculate_flag</code> table reference
     */
    public TBillCalculateFlag() {
        this(DSL.name("t_bill_calculate_flag"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_bill_calculate_flag</code> table reference
     */
    public TBillCalculateFlag(String alias) {
        this(DSL.name(alias), T_BILL_CALCULATE_FLAG);
    }

    /**
     * Create an aliased <code>db_mall.t_bill_calculate_flag</code> table reference
     */
    public TBillCalculateFlag(Name alias) {
        this(alias, T_BILL_CALCULATE_FLAG);
    }

    private TBillCalculateFlag(Name alias, Table<TBillCalculateFlagRecord> aliased) {
        this(alias, aliased, null);
    }

    private TBillCalculateFlag(Name alias, Table<TBillCalculateFlagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TBillCalculateFlag(Table<O> child, ForeignKey<O, TBillCalculateFlagRecord> key) {
        super(child, key, T_BILL_CALCULATE_FLAG);
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
    public TBillCalculateFlag as(String alias) {
        return new TBillCalculateFlag(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBillCalculateFlag as(Name alias) {
        return new TBillCalculateFlag(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TBillCalculateFlag rename(String name) {
        return new TBillCalculateFlag(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TBillCalculateFlag rename(Name name) {
        return new TBillCalculateFlag(name, null);
    }
}
