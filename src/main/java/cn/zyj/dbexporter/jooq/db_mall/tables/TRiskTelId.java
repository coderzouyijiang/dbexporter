/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TRiskTelIdRecord;

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
public class TRiskTelId extends TableImpl<TRiskTelIdRecord> {

    private static final long serialVersionUID = -1603518494;

    /**
     * The reference instance of <code>db_mall.t_risk_tel_id</code>
     */
    public static final TRiskTelId T_RISK_TEL_ID = new TRiskTelId();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TRiskTelIdRecord> getRecordType() {
        return TRiskTelIdRecord.class;
    }

    /**
     * The column <code>db_mall.t_risk_tel_id.num</code>. 当前同步到的id
     */
    public final TableField<TRiskTelIdRecord, Integer> NUM = createField("num", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "当前同步到的id");

    /**
     * The column <code>db_mall.t_risk_tel_id.cdate</code>.
     */
    public final TableField<TRiskTelIdRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>db_mall.t_risk_tel_id.mdate</code>.
     */
    public final TableField<TRiskTelIdRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>db_mall.t_risk_tel_id</code> table reference
     */
    public TRiskTelId() {
        this(DSL.name("t_risk_tel_id"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_risk_tel_id</code> table reference
     */
    public TRiskTelId(String alias) {
        this(DSL.name(alias), T_RISK_TEL_ID);
    }

    /**
     * Create an aliased <code>db_mall.t_risk_tel_id</code> table reference
     */
    public TRiskTelId(Name alias) {
        this(alias, T_RISK_TEL_ID);
    }

    private TRiskTelId(Name alias, Table<TRiskTelIdRecord> aliased) {
        this(alias, aliased, null);
    }

    private TRiskTelId(Name alias, Table<TRiskTelIdRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TRiskTelId(Table<O> child, ForeignKey<O, TRiskTelIdRecord> key) {
        super(child, key, T_RISK_TEL_ID);
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
        return Arrays.<Index>asList(Indexes.T_RISK_TEL_ID_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TRiskTelIdRecord> getPrimaryKey() {
        return Keys.KEY_T_RISK_TEL_ID_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TRiskTelIdRecord>> getKeys() {
        return Arrays.<UniqueKey<TRiskTelIdRecord>>asList(Keys.KEY_T_RISK_TEL_ID_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskTelId as(String alias) {
        return new TRiskTelId(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskTelId as(Name alias) {
        return new TRiskTelId(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TRiskTelId rename(String name) {
        return new TRiskTelId(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TRiskTelId rename(Name name) {
        return new TRiskTelId(name, null);
    }
}
