/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TCustomerProductLimitRecord;

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
public class TCustomerProductLimit extends TableImpl<TCustomerProductLimitRecord> {

    private static final long serialVersionUID = -2088528950;

    /**
     * The reference instance of <code>db_mall.t_customer_product_limit</code>
     */
    public static final TCustomerProductLimit T_CUSTOMER_PRODUCT_LIMIT = new TCustomerProductLimit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TCustomerProductLimitRecord> getRecordType() {
        return TCustomerProductLimitRecord.class;
    }

    /**
     * The column <code>db_mall.t_customer_product_limit.id</code>.
     */
    public final TableField<TCustomerProductLimitRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_customer_product_limit.customer_id</code>.
     */
    public final TableField<TCustomerProductLimitRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_product_limit.product_id</code>.
     */
    public final TableField<TCustomerProductLimitRecord, Integer> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_product_limit.status</code>.
     */
    public final TableField<TCustomerProductLimitRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_customer_product_limit.cdate</code>.
     */
    public final TableField<TCustomerProductLimitRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_product_limit.mdate</code>.
     */
    public final TableField<TCustomerProductLimitRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_customer_product_limit</code> table reference
     */
    public TCustomerProductLimit() {
        this(DSL.name("t_customer_product_limit"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_customer_product_limit</code> table reference
     */
    public TCustomerProductLimit(String alias) {
        this(DSL.name(alias), T_CUSTOMER_PRODUCT_LIMIT);
    }

    /**
     * Create an aliased <code>db_mall.t_customer_product_limit</code> table reference
     */
    public TCustomerProductLimit(Name alias) {
        this(alias, T_CUSTOMER_PRODUCT_LIMIT);
    }

    private TCustomerProductLimit(Name alias, Table<TCustomerProductLimitRecord> aliased) {
        this(alias, aliased, null);
    }

    private TCustomerProductLimit(Name alias, Table<TCustomerProductLimitRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TCustomerProductLimit(Table<O> child, ForeignKey<O, TCustomerProductLimitRecord> key) {
        super(child, key, T_CUSTOMER_PRODUCT_LIMIT);
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
        return Arrays.<Index>asList(Indexes.T_CUSTOMER_PRODUCT_LIMIT_CPS, Indexes.T_CUSTOMER_PRODUCT_LIMIT_PRIMARY, Indexes.T_CUSTOMER_PRODUCT_LIMIT_SS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TCustomerProductLimitRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_CUSTOMER_PRODUCT_LIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TCustomerProductLimitRecord> getPrimaryKey() {
        return Keys.KEY_T_CUSTOMER_PRODUCT_LIMIT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TCustomerProductLimitRecord>> getKeys() {
        return Arrays.<UniqueKey<TCustomerProductLimitRecord>>asList(Keys.KEY_T_CUSTOMER_PRODUCT_LIMIT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerProductLimit as(String alias) {
        return new TCustomerProductLimit(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerProductLimit as(Name alias) {
        return new TCustomerProductLimit(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TCustomerProductLimit rename(String name) {
        return new TCustomerProductLimit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TCustomerProductLimit rename(Name name) {
        return new TCustomerProductLimit(name, null);
    }
}
