/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TSmsTemplateBakRecord;

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
import org.jooq.types.UInteger;


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
public class TSmsTemplateBak extends TableImpl<TSmsTemplateBakRecord> {

    private static final long serialVersionUID = -700119482;

    /**
     * The reference instance of <code>db_mall.t_sms_template_bak</code>
     */
    public static final TSmsTemplateBak T_SMS_TEMPLATE_BAK = new TSmsTemplateBak();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TSmsTemplateBakRecord> getRecordType() {
        return TSmsTemplateBakRecord.class;
    }

    /**
     * The column <code>db_mall.t_sms_template_bak.id</code>.
     */
    public final TableField<TSmsTemplateBakRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_sms_template_bak.content</code>.
     */
    public final TableField<TSmsTemplateBakRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>db_mall.t_sms_template_bak.enable</code>.
     */
    public final TableField<TSmsTemplateBakRecord, Boolean> ENABLE = createField("enable", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'1'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * Create a <code>db_mall.t_sms_template_bak</code> table reference
     */
    public TSmsTemplateBak() {
        this(DSL.name("t_sms_template_bak"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_sms_template_bak</code> table reference
     */
    public TSmsTemplateBak(String alias) {
        this(DSL.name(alias), T_SMS_TEMPLATE_BAK);
    }

    /**
     * Create an aliased <code>db_mall.t_sms_template_bak</code> table reference
     */
    public TSmsTemplateBak(Name alias) {
        this(alias, T_SMS_TEMPLATE_BAK);
    }

    private TSmsTemplateBak(Name alias, Table<TSmsTemplateBakRecord> aliased) {
        this(alias, aliased, null);
    }

    private TSmsTemplateBak(Name alias, Table<TSmsTemplateBakRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TSmsTemplateBak(Table<O> child, ForeignKey<O, TSmsTemplateBakRecord> key) {
        super(child, key, T_SMS_TEMPLATE_BAK);
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
        return Arrays.<Index>asList(Indexes.T_SMS_TEMPLATE_BAK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TSmsTemplateBakRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_T_SMS_TEMPLATE_BAK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TSmsTemplateBakRecord> getPrimaryKey() {
        return Keys.KEY_T_SMS_TEMPLATE_BAK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TSmsTemplateBakRecord>> getKeys() {
        return Arrays.<UniqueKey<TSmsTemplateBakRecord>>asList(Keys.KEY_T_SMS_TEMPLATE_BAK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsTemplateBak as(String alias) {
        return new TSmsTemplateBak(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsTemplateBak as(Name alias) {
        return new TSmsTemplateBak(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TSmsTemplateBak rename(String name) {
        return new TSmsTemplateBak(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TSmsTemplateBak rename(Name name) {
        return new TSmsTemplateBak(name, null);
    }
}
