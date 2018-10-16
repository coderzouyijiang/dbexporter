/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TScityRecord;

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
public class TScity extends TableImpl<TScityRecord> {

    private static final long serialVersionUID = 1554752829;

    /**
     * The reference instance of <code>db_mall.t_scity</code>
     */
    public static final TScity T_SCITY = new TScity();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TScityRecord> getRecordType() {
        return TScityRecord.class;
    }

    /**
     * The column <code>db_mall.t_scity.id</code>.
     */
    public final TableField<TScityRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_scity.scity_code</code>.
     */
    public final TableField<TScityRecord, String> SCITY_CODE = createField("scity_code", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_scity.pid</code>.
     */
    public final TableField<TScityRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_scity.name</code>.
     */
    public final TableField<TScityRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_scity.cdate</code>.
     */
    public final TableField<TScityRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>db_mall.t_scity.mdate</code>.
     */
    public final TableField<TScityRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>db_mall.t_scity</code> table reference
     */
    public TScity() {
        this(DSL.name("t_scity"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_scity</code> table reference
     */
    public TScity(String alias) {
        this(DSL.name(alias), T_SCITY);
    }

    /**
     * Create an aliased <code>db_mall.t_scity</code> table reference
     */
    public TScity(Name alias) {
        this(alias, T_SCITY);
    }

    private TScity(Name alias, Table<TScityRecord> aliased) {
        this(alias, aliased, null);
    }

    private TScity(Name alias, Table<TScityRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TScity(Table<O> child, ForeignKey<O, TScityRecord> key) {
        super(child, key, T_SCITY);
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
        return Arrays.<Index>asList(Indexes.T_SCITY_PID, Indexes.T_SCITY_PRIMARY, Indexes.T_SCITY_SCITY_CODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TScityRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_SCITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TScityRecord> getPrimaryKey() {
        return Keys.KEY_T_SCITY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TScityRecord>> getKeys() {
        return Arrays.<UniqueKey<TScityRecord>>asList(Keys.KEY_T_SCITY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TScity as(String alias) {
        return new TScity(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TScity as(Name alias) {
        return new TScity(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TScity rename(String name) {
        return new TScity(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TScity rename(Name name) {
        return new TScity(name, null);
    }
}