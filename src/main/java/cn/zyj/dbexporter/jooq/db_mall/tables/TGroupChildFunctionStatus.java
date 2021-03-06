/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TGroupChildFunctionStatusRecord;

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
public class TGroupChildFunctionStatus extends TableImpl<TGroupChildFunctionStatusRecord> {

    private static final long serialVersionUID = 1566344553;

    /**
     * The reference instance of <code>db_mall.t_group_child_function_status</code>
     */
    public static final TGroupChildFunctionStatus T_GROUP_CHILD_FUNCTION_STATUS = new TGroupChildFunctionStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TGroupChildFunctionStatusRecord> getRecordType() {
        return TGroupChildFunctionStatusRecord.class;
    }

    /**
     * The column <code>db_mall.t_group_child_function_status.id</code>. 主键id
     */
    public final TableField<TGroupChildFunctionStatusRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "主键id");

    /**
     * The column <code>db_mall.t_group_child_function_status.customer_id</code>. 客户id
     */
    public final TableField<TGroupChildFunctionStatusRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "客户id");

    /**
     * The column <code>db_mall.t_group_child_function_status.invoice_status</code>. 统一开票状态  0否  1是
     */
    public final TableField<TGroupChildFunctionStatusRecord, Byte> INVOICE_STATUS = createField("invoice_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "统一开票状态  0否  1是");

    /**
     * The column <code>db_mall.t_group_child_function_status.order_status</code>. 下单审核状态  0否  1是
     */
    public final TableField<TGroupChildFunctionStatusRecord, Byte> ORDER_STATUS = createField("order_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "下单审核状态  0否  1是");

    /**
     * The column <code>db_mall.t_group_child_function_status.group_id</code>. 集团group
     */
    public final TableField<TGroupChildFunctionStatusRecord, Integer> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "集团group");

    /**
     * The column <code>db_mall.t_group_child_function_status.balance_date</code>. 账单日
     */
    public final TableField<TGroupChildFunctionStatusRecord, Integer> BALANCE_DATE = createField("balance_date", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "账单日");

    /**
     * The column <code>db_mall.t_group_child_function_status.cdate</code>.
     */
    public final TableField<TGroupChildFunctionStatusRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_group_child_function_status.mdate</code>.
     */
    public final TableField<TGroupChildFunctionStatusRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_group_child_function_status</code> table reference
     */
    public TGroupChildFunctionStatus() {
        this(DSL.name("t_group_child_function_status"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_group_child_function_status</code> table reference
     */
    public TGroupChildFunctionStatus(String alias) {
        this(DSL.name(alias), T_GROUP_CHILD_FUNCTION_STATUS);
    }

    /**
     * Create an aliased <code>db_mall.t_group_child_function_status</code> table reference
     */
    public TGroupChildFunctionStatus(Name alias) {
        this(alias, T_GROUP_CHILD_FUNCTION_STATUS);
    }

    private TGroupChildFunctionStatus(Name alias, Table<TGroupChildFunctionStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private TGroupChildFunctionStatus(Name alias, Table<TGroupChildFunctionStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TGroupChildFunctionStatus(Table<O> child, ForeignKey<O, TGroupChildFunctionStatusRecord> key) {
        super(child, key, T_GROUP_CHILD_FUNCTION_STATUS);
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
        return Arrays.<Index>asList(Indexes.T_GROUP_CHILD_FUNCTION_STATUS_IDX_CG, Indexes.T_GROUP_CHILD_FUNCTION_STATUS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TGroupChildFunctionStatusRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_GROUP_CHILD_FUNCTION_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TGroupChildFunctionStatusRecord> getPrimaryKey() {
        return Keys.KEY_T_GROUP_CHILD_FUNCTION_STATUS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TGroupChildFunctionStatusRecord>> getKeys() {
        return Arrays.<UniqueKey<TGroupChildFunctionStatusRecord>>asList(Keys.KEY_T_GROUP_CHILD_FUNCTION_STATUS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupChildFunctionStatus as(String alias) {
        return new TGroupChildFunctionStatus(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupChildFunctionStatus as(Name alias) {
        return new TGroupChildFunctionStatus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TGroupChildFunctionStatus rename(String name) {
        return new TGroupChildFunctionStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TGroupChildFunctionStatus rename(Name name) {
        return new TGroupChildFunctionStatus(name, null);
    }
}
