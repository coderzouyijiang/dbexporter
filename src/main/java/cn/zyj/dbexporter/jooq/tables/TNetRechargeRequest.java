/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TNetRechargeRequestRecord;

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
public class TNetRechargeRequest extends TableImpl<TNetRechargeRequestRecord> {

    private static final long serialVersionUID = 1953839685;

    /**
     * The reference instance of <code>db_mall.t_net_recharge_request</code>
     */
    public static final TNetRechargeRequest T_NET_RECHARGE_REQUEST = new TNetRechargeRequest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TNetRechargeRequestRecord> getRecordType() {
        return TNetRechargeRequestRecord.class;
    }

    /**
     * The column <code>db_mall.t_net_recharge_request.id</code>.
     */
    public final TableField<TNetRechargeRequestRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_net_recharge_request.customer_id</code>.
     */
    public final TableField<TNetRechargeRequestRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_net_recharge_request.status</code>.
     */
    public final TableField<TNetRechargeRequestRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_net_recharge_request.pay_type</code>.
     */
    public final TableField<TNetRechargeRequestRecord, Byte> PAY_TYPE = createField("pay_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_net_recharge_request.type_id</code>.
     */
    public final TableField<TNetRechargeRequestRecord, Byte> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_net_recharge_request.amount</code>.
     */
    public final TableField<TNetRechargeRequestRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_net_recharge_request.order_id</code>.
     */
    public final TableField<TNetRechargeRequestRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>db_mall.t_net_recharge_request.response</code>.
     */
    public final TableField<TNetRechargeRequestRecord, String> RESPONSE = createField("response", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>db_mall.t_net_recharge_request.source</code>.
     */
    public final TableField<TNetRechargeRequestRecord, Byte> SOURCE = createField("source", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_net_recharge_request.ip</code>.
     */
    public final TableField<TNetRechargeRequestRecord, Long> IP = createField("ip", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>db_mall.t_net_recharge_request.user_agent</code>.
     */
    public final TableField<TNetRechargeRequestRecord, String> USER_AGENT = createField("user_agent", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>db_mall.t_net_recharge_request.sync_status</code>.
     */
    public final TableField<TNetRechargeRequestRecord, Byte> SYNC_STATUS = createField("sync_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_net_recharge_request.cdate</code>.
     */
    public final TableField<TNetRechargeRequestRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_net_recharge_request.mdate</code>.
     */
    public final TableField<TNetRechargeRequestRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_net_recharge_request.notify_status</code>. 回调状态,0：未回调 1：回调结果成功 2:回调结果失败
     */
    public final TableField<TNetRechargeRequestRecord, Byte> NOTIFY_STATUS = createField("notify_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "回调状态,0：未回调 1：回调结果成功 2:回调结果失败");

    /**
     * Create a <code>db_mall.t_net_recharge_request</code> table reference
     */
    public TNetRechargeRequest() {
        this(DSL.name("t_net_recharge_request"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_net_recharge_request</code> table reference
     */
    public TNetRechargeRequest(String alias) {
        this(DSL.name(alias), T_NET_RECHARGE_REQUEST);
    }

    /**
     * Create an aliased <code>db_mall.t_net_recharge_request</code> table reference
     */
    public TNetRechargeRequest(Name alias) {
        this(alias, T_NET_RECHARGE_REQUEST);
    }

    private TNetRechargeRequest(Name alias, Table<TNetRechargeRequestRecord> aliased) {
        this(alias, aliased, null);
    }

    private TNetRechargeRequest(Name alias, Table<TNetRechargeRequestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TNetRechargeRequest(Table<O> child, ForeignKey<O, TNetRechargeRequestRecord> key) {
        super(child, key, T_NET_RECHARGE_REQUEST);
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
        return Arrays.<Index>asList(Indexes.T_NET_RECHARGE_REQUEST_CUSTOMER_ID, Indexes.T_NET_RECHARGE_REQUEST_ORDER_ID, Indexes.T_NET_RECHARGE_REQUEST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TNetRechargeRequestRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_NET_RECHARGE_REQUEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TNetRechargeRequestRecord> getPrimaryKey() {
        return Keys.KEY_T_NET_RECHARGE_REQUEST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TNetRechargeRequestRecord>> getKeys() {
        return Arrays.<UniqueKey<TNetRechargeRequestRecord>>asList(Keys.KEY_T_NET_RECHARGE_REQUEST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNetRechargeRequest as(String alias) {
        return new TNetRechargeRequest(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNetRechargeRequest as(Name alias) {
        return new TNetRechargeRequest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TNetRechargeRequest rename(String name) {
        return new TNetRechargeRequest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TNetRechargeRequest rename(Name name) {
        return new TNetRechargeRequest(name, null);
    }
}