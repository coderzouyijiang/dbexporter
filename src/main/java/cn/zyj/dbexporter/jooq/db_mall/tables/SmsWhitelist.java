/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.SmsWhitelistRecord;

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
public class SmsWhitelist extends TableImpl<SmsWhitelistRecord> {

    private static final long serialVersionUID = -1896473941;

    /**
     * The reference instance of <code>db_mall.sms_whitelist</code>
     */
    public static final SmsWhitelist SMS_WHITELIST = new SmsWhitelist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SmsWhitelistRecord> getRecordType() {
        return SmsWhitelistRecord.class;
    }

    /**
     * The column <code>db_mall.sms_whitelist.id</code>.
     */
    public final TableField<SmsWhitelistRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.sms_whitelist.phone</code>.
     */
    public final TableField<SmsWhitelistRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.CHAR(11).nullable(false), this, "");

    /**
     * The column <code>db_mall.sms_whitelist.status</code>. 0：启用 1：禁用
     */
    public final TableField<SmsWhitelistRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0：启用 1：禁用");

    /**
     * Create a <code>db_mall.sms_whitelist</code> table reference
     */
    public SmsWhitelist() {
        this(DSL.name("sms_whitelist"), null);
    }

    /**
     * Create an aliased <code>db_mall.sms_whitelist</code> table reference
     */
    public SmsWhitelist(String alias) {
        this(DSL.name(alias), SMS_WHITELIST);
    }

    /**
     * Create an aliased <code>db_mall.sms_whitelist</code> table reference
     */
    public SmsWhitelist(Name alias) {
        this(alias, SMS_WHITELIST);
    }

    private SmsWhitelist(Name alias, Table<SmsWhitelistRecord> aliased) {
        this(alias, aliased, null);
    }

    private SmsWhitelist(Name alias, Table<SmsWhitelistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SmsWhitelist(Table<O> child, ForeignKey<O, SmsWhitelistRecord> key) {
        super(child, key, SMS_WHITELIST);
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
        return Arrays.<Index>asList(Indexes.SMS_WHITELIST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<SmsWhitelistRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SMS_WHITELIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SmsWhitelistRecord> getPrimaryKey() {
        return Keys.KEY_SMS_WHITELIST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SmsWhitelistRecord>> getKeys() {
        return Arrays.<UniqueKey<SmsWhitelistRecord>>asList(Keys.KEY_SMS_WHITELIST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsWhitelist as(String alias) {
        return new SmsWhitelist(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SmsWhitelist as(Name alias) {
        return new SmsWhitelist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SmsWhitelist rename(String name) {
        return new SmsWhitelist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SmsWhitelist rename(Name name) {
        return new SmsWhitelist(name, null);
    }
}
