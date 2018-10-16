/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TSmsTemplateRecord;

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
public class TSmsTemplate extends TableImpl<TSmsTemplateRecord> {

    private static final long serialVersionUID = -247265934;

    /**
     * The reference instance of <code>db_mall.t_sms_template</code>
     */
    public static final TSmsTemplate T_SMS_TEMPLATE = new TSmsTemplate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TSmsTemplateRecord> getRecordType() {
        return TSmsTemplateRecord.class;
    }

    /**
     * The column <code>db_mall.t_sms_template.id</code>.
     */
    public final TableField<TSmsTemplateRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_sms_template.content</code>.
     */
    public final TableField<TSmsTemplateRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>db_mall.t_sms_template.enable</code>.
     */
    public final TableField<TSmsTemplateRecord, Boolean> ENABLE = createField("enable", org.jooq.impl.SQLDataType.BIT.defaultValue(org.jooq.impl.DSL.inline("b'1'", org.jooq.impl.SQLDataType.BIT)), this, "");

    /**
     * Create a <code>db_mall.t_sms_template</code> table reference
     */
    public TSmsTemplate() {
        this(DSL.name("t_sms_template"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_sms_template</code> table reference
     */
    public TSmsTemplate(String alias) {
        this(DSL.name(alias), T_SMS_TEMPLATE);
    }

    /**
     * Create an aliased <code>db_mall.t_sms_template</code> table reference
     */
    public TSmsTemplate(Name alias) {
        this(alias, T_SMS_TEMPLATE);
    }

    private TSmsTemplate(Name alias, Table<TSmsTemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private TSmsTemplate(Name alias, Table<TSmsTemplateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TSmsTemplate(Table<O> child, ForeignKey<O, TSmsTemplateRecord> key) {
        super(child, key, T_SMS_TEMPLATE);
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
        return Arrays.<Index>asList(Indexes.T_SMS_TEMPLATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TSmsTemplateRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_T_SMS_TEMPLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TSmsTemplateRecord> getPrimaryKey() {
        return Keys.KEY_T_SMS_TEMPLATE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TSmsTemplateRecord>> getKeys() {
        return Arrays.<UniqueKey<TSmsTemplateRecord>>asList(Keys.KEY_T_SMS_TEMPLATE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsTemplate as(String alias) {
        return new TSmsTemplate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsTemplate as(Name alias) {
        return new TSmsTemplate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TSmsTemplate rename(String name) {
        return new TSmsTemplate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TSmsTemplate rename(Name name) {
        return new TSmsTemplate(name, null);
    }
}