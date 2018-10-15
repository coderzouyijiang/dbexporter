/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.tables.records.TBillCrmRecord;

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
public class TBillCrm extends TableImpl<TBillCrmRecord> {

    private static final long serialVersionUID = 2101458190;

    /**
     * The reference instance of <code>db_mall.t_bill_crm</code>
     */
    public static final TBillCrm T_BILL_CRM = new TBillCrm();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TBillCrmRecord> getRecordType() {
        return TBillCrmRecord.class;
    }

    /**
     * The column <code>db_mall.t_bill_crm.ecm_id</code>.
     */
    public final TableField<TBillCrmRecord, Long> ECM_ID = createField("ecm_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>db_mall.t_bill_crm.first_time</code>.
     */
    public final TableField<TBillCrmRecord, String> FIRST_TIME = createField("first_time", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>db_mall.t_bill_crm</code> table reference
     */
    public TBillCrm() {
        this(DSL.name("t_bill_crm"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_bill_crm</code> table reference
     */
    public TBillCrm(String alias) {
        this(DSL.name(alias), T_BILL_CRM);
    }

    /**
     * Create an aliased <code>db_mall.t_bill_crm</code> table reference
     */
    public TBillCrm(Name alias) {
        this(alias, T_BILL_CRM);
    }

    private TBillCrm(Name alias, Table<TBillCrmRecord> aliased) {
        this(alias, aliased, null);
    }

    private TBillCrm(Name alias, Table<TBillCrmRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TBillCrm(Table<O> child, ForeignKey<O, TBillCrmRecord> key) {
        super(child, key, T_BILL_CRM);
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
    public TBillCrm as(String alias) {
        return new TBillCrm(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBillCrm as(Name alias) {
        return new TBillCrm(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TBillCrm rename(String name) {
        return new TBillCrm(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TBillCrm rename(Name name) {
        return new TBillCrm(name, null);
    }
}
