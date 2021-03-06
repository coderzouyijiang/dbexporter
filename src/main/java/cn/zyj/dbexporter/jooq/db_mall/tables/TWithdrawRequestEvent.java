/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TWithdrawRequestEventRecord;

import java.math.BigDecimal;
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
public class TWithdrawRequestEvent extends TableImpl<TWithdrawRequestEventRecord> {

    private static final long serialVersionUID = -1735255908;

    /**
     * The reference instance of <code>db_mall.t_withdraw_request_event</code>
     */
    public static final TWithdrawRequestEvent T_WITHDRAW_REQUEST_EVENT = new TWithdrawRequestEvent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TWithdrawRequestEventRecord> getRecordType() {
        return TWithdrawRequestEventRecord.class;
    }

    /**
     * The column <code>db_mall.t_withdraw_request_event.id</code>.
     */
    public final TableField<TWithdrawRequestEventRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_withdraw_request_event.request_id</code>.
     */
    public final TableField<TWithdrawRequestEventRecord, Long> REQUEST_ID = createField("request_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_withdraw_request_event.type_id</code>.
     */
    public final TableField<TWithdrawRequestEventRecord, Byte> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_withdraw_request_event.sync_status</code>.
     */
    public final TableField<TWithdrawRequestEventRecord, Byte> SYNC_STATUS = createField("sync_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_withdraw_request_event.cdate</code>.
     */
    public final TableField<TWithdrawRequestEventRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_withdraw_request_event.mdate</code>.
     */
    public final TableField<TWithdrawRequestEventRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_withdraw_request_event.amount</code>.
     */
    public final TableField<TWithdrawRequestEventRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2), this, "");

    /**
     * The column <code>db_mall.t_withdraw_request_event.customer_id</code>.
     */
    public final TableField<TWithdrawRequestEventRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>db_mall.t_withdraw_request_event</code> table reference
     */
    public TWithdrawRequestEvent() {
        this(DSL.name("t_withdraw_request_event"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_withdraw_request_event</code> table reference
     */
    public TWithdrawRequestEvent(String alias) {
        this(DSL.name(alias), T_WITHDRAW_REQUEST_EVENT);
    }

    /**
     * Create an aliased <code>db_mall.t_withdraw_request_event</code> table reference
     */
    public TWithdrawRequestEvent(Name alias) {
        this(alias, T_WITHDRAW_REQUEST_EVENT);
    }

    private TWithdrawRequestEvent(Name alias, Table<TWithdrawRequestEventRecord> aliased) {
        this(alias, aliased, null);
    }

    private TWithdrawRequestEvent(Name alias, Table<TWithdrawRequestEventRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TWithdrawRequestEvent(Table<O> child, ForeignKey<O, TWithdrawRequestEventRecord> key) {
        super(child, key, T_WITHDRAW_REQUEST_EVENT);
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
        return Arrays.<Index>asList(Indexes.T_WITHDRAW_REQUEST_EVENT_PRIMARY, Indexes.T_WITHDRAW_REQUEST_EVENT_SYNC_STATUS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TWithdrawRequestEventRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_WITHDRAW_REQUEST_EVENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TWithdrawRequestEventRecord> getPrimaryKey() {
        return Keys.KEY_T_WITHDRAW_REQUEST_EVENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TWithdrawRequestEventRecord>> getKeys() {
        return Arrays.<UniqueKey<TWithdrawRequestEventRecord>>asList(Keys.KEY_T_WITHDRAW_REQUEST_EVENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TWithdrawRequestEvent as(String alias) {
        return new TWithdrawRequestEvent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TWithdrawRequestEvent as(Name alias) {
        return new TWithdrawRequestEvent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TWithdrawRequestEvent rename(String name) {
        return new TWithdrawRequestEvent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TWithdrawRequestEvent rename(Name name) {
        return new TWithdrawRequestEvent(name, null);
    }
}
