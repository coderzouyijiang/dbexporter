/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TMacBindLogRecord;

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
public class TMacBindLog extends TableImpl<TMacBindLogRecord> {

    private static final long serialVersionUID = -1240093719;

    /**
     * The reference instance of <code>db_mall.t_mac_bind_log</code>
     */
    public static final TMacBindLog T_MAC_BIND_LOG = new TMacBindLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TMacBindLogRecord> getRecordType() {
        return TMacBindLogRecord.class;
    }

    /**
     * The column <code>db_mall.t_mac_bind_log.id</code>.
     */
    public final TableField<TMacBindLogRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_mac_bind_log.device_id</code>.
     */
    public final TableField<TMacBindLogRecord, String> DEVICE_ID = createField("device_id", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_mac_bind_log.phone</code>.
     */
    public final TableField<TMacBindLogRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>db_mall.t_mac_bind_log.secret_key</code>.
     */
    public final TableField<TMacBindLogRecord, String> SECRET_KEY = createField("secret_key", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>db_mall.t_mac_bind_log.rate</code>.
     */
    public final TableField<TMacBindLogRecord, String> RATE = createField("rate", org.jooq.impl.SQLDataType.VARCHAR(100).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>db_mall.t_mac_bind_log.cdate</code>.
     */
    public final TableField<TMacBindLogRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>db_mall.t_mac_bind_log.mdate</code>.
     */
    public final TableField<TMacBindLogRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>db_mall.t_mac_bind_log</code> table reference
     */
    public TMacBindLog() {
        this(DSL.name("t_mac_bind_log"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_mac_bind_log</code> table reference
     */
    public TMacBindLog(String alias) {
        this(DSL.name(alias), T_MAC_BIND_LOG);
    }

    /**
     * Create an aliased <code>db_mall.t_mac_bind_log</code> table reference
     */
    public TMacBindLog(Name alias) {
        this(alias, T_MAC_BIND_LOG);
    }

    private TMacBindLog(Name alias, Table<TMacBindLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private TMacBindLog(Name alias, Table<TMacBindLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TMacBindLog(Table<O> child, ForeignKey<O, TMacBindLogRecord> key) {
        super(child, key, T_MAC_BIND_LOG);
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
        return Arrays.<Index>asList(Indexes.T_MAC_BIND_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TMacBindLogRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_MAC_BIND_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TMacBindLogRecord> getPrimaryKey() {
        return Keys.KEY_T_MAC_BIND_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TMacBindLogRecord>> getKeys() {
        return Arrays.<UniqueKey<TMacBindLogRecord>>asList(Keys.KEY_T_MAC_BIND_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMacBindLog as(String alias) {
        return new TMacBindLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMacBindLog as(Name alias) {
        return new TMacBindLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TMacBindLog rename(String name) {
        return new TMacBindLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TMacBindLog rename(Name name) {
        return new TMacBindLog(name, null);
    }
}