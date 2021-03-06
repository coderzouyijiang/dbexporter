/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TReleaseFrozenBalanceRecord;

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
public class TReleaseFrozenBalance extends TableImpl<TReleaseFrozenBalanceRecord> {

    private static final long serialVersionUID = -1040004793;

    /**
     * The reference instance of <code>db_mall.t_release_frozen_balance</code>
     */
    public static final TReleaseFrozenBalance T_RELEASE_FROZEN_BALANCE = new TReleaseFrozenBalance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TReleaseFrozenBalanceRecord> getRecordType() {
        return TReleaseFrozenBalanceRecord.class;
    }

    /**
     * The column <code>db_mall.t_release_frozen_balance.id</code>.
     */
    public final TableField<TReleaseFrozenBalanceRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_release_frozen_balance.customer_id</code>. 客户id
     */
    public final TableField<TReleaseFrozenBalanceRecord, Long> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "客户id");

    /**
     * The column <code>db_mall.t_release_frozen_balance.amount</code>. 返还的现金押金
     */
    public final TableField<TReleaseFrozenBalanceRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2).nullable(false), this, "返还的现金押金");

    /**
     * The column <code>db_mall.t_release_frozen_balance.type</code>. 1:押金解冻 恢复余额
     */
    public final TableField<TReleaseFrozenBalanceRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT, this, "1:押金解冻 恢复余额");

    /**
     * The column <code>db_mall.t_release_frozen_balance.item_detail_id</code>. t_order_items_detail.id
     */
    public final TableField<TReleaseFrozenBalanceRecord, Long> ITEM_DETAIL_ID = createField("item_detail_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "t_order_items_detail.id");

    /**
     * The column <code>db_mall.t_release_frozen_balance.process_status</code>. 0:未处理 1已处理2处理成功
     */
    public final TableField<TReleaseFrozenBalanceRecord, Byte> PROCESS_STATUS = createField("process_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "0:未处理 1已处理2处理成功");

    /**
     * The column <code>db_mall.t_release_frozen_balance.source_id</code>. t_frozenmoney2deposit.id
     */
    public final TableField<TReleaseFrozenBalanceRecord, Long> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "t_frozenmoney2deposit.id");

    /**
     * The column <code>db_mall.t_release_frozen_balance.cdate</code>. 创建时间
     */
    public final TableField<TReleaseFrozenBalanceRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * The column <code>db_mall.t_release_frozen_balance.mdate</code>. 最后修改时间
     */
    public final TableField<TReleaseFrozenBalanceRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "最后修改时间");

    /**
     * The column <code>db_mall.t_release_frozen_balance.timestamp</code>. 时间戳 用于标识同一次解冻的操作
     */
    public final TableField<TReleaseFrozenBalanceRecord, Long> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "时间戳 用于标识同一次解冻的操作");

    /**
     * The column <code>db_mall.t_release_frozen_balance.total_amount</code>.
     */
    public final TableField<TReleaseFrozenBalanceRecord, BigDecimal> TOTAL_AMOUNT = createField("total_amount", org.jooq.impl.SQLDataType.DECIMAL(20, 2), this, "");

    /**
     * Create a <code>db_mall.t_release_frozen_balance</code> table reference
     */
    public TReleaseFrozenBalance() {
        this(DSL.name("t_release_frozen_balance"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_release_frozen_balance</code> table reference
     */
    public TReleaseFrozenBalance(String alias) {
        this(DSL.name(alias), T_RELEASE_FROZEN_BALANCE);
    }

    /**
     * Create an aliased <code>db_mall.t_release_frozen_balance</code> table reference
     */
    public TReleaseFrozenBalance(Name alias) {
        this(alias, T_RELEASE_FROZEN_BALANCE);
    }

    private TReleaseFrozenBalance(Name alias, Table<TReleaseFrozenBalanceRecord> aliased) {
        this(alias, aliased, null);
    }

    private TReleaseFrozenBalance(Name alias, Table<TReleaseFrozenBalanceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TReleaseFrozenBalance(Table<O> child, ForeignKey<O, TReleaseFrozenBalanceRecord> key) {
        super(child, key, T_RELEASE_FROZEN_BALANCE);
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
        return Arrays.<Index>asList(Indexes.T_RELEASE_FROZEN_BALANCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TReleaseFrozenBalanceRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_RELEASE_FROZEN_BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TReleaseFrozenBalanceRecord> getPrimaryKey() {
        return Keys.KEY_T_RELEASE_FROZEN_BALANCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TReleaseFrozenBalanceRecord>> getKeys() {
        return Arrays.<UniqueKey<TReleaseFrozenBalanceRecord>>asList(Keys.KEY_T_RELEASE_FROZEN_BALANCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TReleaseFrozenBalance as(String alias) {
        return new TReleaseFrozenBalance(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TReleaseFrozenBalance as(Name alias) {
        return new TReleaseFrozenBalance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TReleaseFrozenBalance rename(String name) {
        return new TReleaseFrozenBalance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TReleaseFrozenBalance rename(Name name) {
        return new TReleaseFrozenBalance(name, null);
    }
}
