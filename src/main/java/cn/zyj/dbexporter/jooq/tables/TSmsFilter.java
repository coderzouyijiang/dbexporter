/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TSmsFilterRecord;

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
public class TSmsFilter extends TableImpl<TSmsFilterRecord> {

    private static final long serialVersionUID = 2116162719;

    /**
     * The reference instance of <code>db_mall.t_sms_filter</code>
     */
    public static final TSmsFilter T_SMS_FILTER = new TSmsFilter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TSmsFilterRecord> getRecordType() {
        return TSmsFilterRecord.class;
    }

    /**
     * The column <code>db_mall.t_sms_filter.id</code>.
     */
    public final TableField<TSmsFilterRecord, ULong> ID = createField("id", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_sms_filter.phone</code>.
     */
    public final TableField<TSmsFilterRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(11).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_sms_filter.content</code>.
     */
    public final TableField<TSmsFilterRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR(1000).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_sms_filter.type_id</code>.
     */
    public final TableField<TSmsFilterRecord, Byte> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_sms_filter.sys_type</code>.
     */
    public final TableField<TSmsFilterRecord, UByte> SYS_TYPE = createField("sys_type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_sms_filter.biz_type</code>.
     */
    public final TableField<TSmsFilterRecord, UByte> BIZ_TYPE = createField("biz_type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_sms_filter.cdate</code>.
     */
    public final TableField<TSmsFilterRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_sms_filter.reason</code>.
     */
    public final TableField<TSmsFilterRecord, String> REASON = createField("reason", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>db_mall.t_sms_filter</code> table reference
     */
    public TSmsFilter() {
        this(DSL.name("t_sms_filter"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_sms_filter</code> table reference
     */
    public TSmsFilter(String alias) {
        this(DSL.name(alias), T_SMS_FILTER);
    }

    /**
     * Create an aliased <code>db_mall.t_sms_filter</code> table reference
     */
    public TSmsFilter(Name alias) {
        this(alias, T_SMS_FILTER);
    }

    private TSmsFilter(Name alias, Table<TSmsFilterRecord> aliased) {
        this(alias, aliased, null);
    }

    private TSmsFilter(Name alias, Table<TSmsFilterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TSmsFilter(Table<O> child, ForeignKey<O, TSmsFilterRecord> key) {
        super(child, key, T_SMS_FILTER);
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
        return Arrays.<Index>asList(Indexes.T_SMS_FILTER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TSmsFilterRecord, ULong> getIdentity() {
        return Keys.IDENTITY_T_SMS_FILTER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TSmsFilterRecord> getPrimaryKey() {
        return Keys.KEY_T_SMS_FILTER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TSmsFilterRecord>> getKeys() {
        return Arrays.<UniqueKey<TSmsFilterRecord>>asList(Keys.KEY_T_SMS_FILTER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsFilter as(String alias) {
        return new TSmsFilter(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmsFilter as(Name alias) {
        return new TSmsFilter(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TSmsFilter rename(String name) {
        return new TSmsFilter(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TSmsFilter rename(Name name) {
        return new TSmsFilter(name, null);
    }
}
