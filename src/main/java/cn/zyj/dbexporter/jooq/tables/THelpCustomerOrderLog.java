/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.THelpCustomerOrderLogRecord;

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
 * 代客下单日志记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class THelpCustomerOrderLog extends TableImpl<THelpCustomerOrderLogRecord> {

    private static final long serialVersionUID = 94778689;

    /**
     * The reference instance of <code>db_mall.t_help_customer_order_log</code>
     */
    public static final THelpCustomerOrderLog T_HELP_CUSTOMER_ORDER_LOG = new THelpCustomerOrderLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<THelpCustomerOrderLogRecord> getRecordType() {
        return THelpCustomerOrderLogRecord.class;
    }

    /**
     * The column <code>db_mall.t_help_customer_order_log.id</code>. 主键id
     */
    public final TableField<THelpCustomerOrderLogRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "主键id");

    /**
     * The column <code>db_mall.t_help_customer_order_log.manager_id</code>. 操作人id
     */
    public final TableField<THelpCustomerOrderLogRecord, Integer> MANAGER_ID = createField("manager_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "操作人id");

    /**
     * The column <code>db_mall.t_help_customer_order_log.customer_id</code>. 客户id
     */
    public final TableField<THelpCustomerOrderLogRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "客户id");

    /**
     * The column <code>db_mall.t_help_customer_order_log.order_num</code>. 下单数
     */
    public final TableField<THelpCustomerOrderLogRecord, Integer> ORDER_NUM = createField("order_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "下单数");

    /**
     * The column <code>db_mall.t_help_customer_order_log.create_time</code>. 创建时间
     */
    public final TableField<THelpCustomerOrderLogRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>db_mall.t_help_customer_order_log.update_time</code>. 修改时间
     */
    public final TableField<THelpCustomerOrderLogRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * Create a <code>db_mall.t_help_customer_order_log</code> table reference
     */
    public THelpCustomerOrderLog() {
        this(DSL.name("t_help_customer_order_log"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_help_customer_order_log</code> table reference
     */
    public THelpCustomerOrderLog(String alias) {
        this(DSL.name(alias), T_HELP_CUSTOMER_ORDER_LOG);
    }

    /**
     * Create an aliased <code>db_mall.t_help_customer_order_log</code> table reference
     */
    public THelpCustomerOrderLog(Name alias) {
        this(alias, T_HELP_CUSTOMER_ORDER_LOG);
    }

    private THelpCustomerOrderLog(Name alias, Table<THelpCustomerOrderLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private THelpCustomerOrderLog(Name alias, Table<THelpCustomerOrderLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("代客下单日志记录"));
    }

    public <O extends Record> THelpCustomerOrderLog(Table<O> child, ForeignKey<O, THelpCustomerOrderLogRecord> key) {
        super(child, key, T_HELP_CUSTOMER_ORDER_LOG);
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
        return Arrays.<Index>asList(Indexes.T_HELP_CUSTOMER_ORDER_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<THelpCustomerOrderLogRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_HELP_CUSTOMER_ORDER_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<THelpCustomerOrderLogRecord> getPrimaryKey() {
        return Keys.KEY_T_HELP_CUSTOMER_ORDER_LOG_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<THelpCustomerOrderLogRecord>> getKeys() {
        return Arrays.<UniqueKey<THelpCustomerOrderLogRecord>>asList(Keys.KEY_T_HELP_CUSTOMER_ORDER_LOG_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public THelpCustomerOrderLog as(String alias) {
        return new THelpCustomerOrderLog(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public THelpCustomerOrderLog as(Name alias) {
        return new THelpCustomerOrderLog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public THelpCustomerOrderLog rename(String name) {
        return new THelpCustomerOrderLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public THelpCustomerOrderLog rename(Name name) {
        return new THelpCustomerOrderLog(name, null);
    }
}
