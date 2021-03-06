/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TWxCustomerRecord;

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
public class TWxCustomer extends TableImpl<TWxCustomerRecord> {

    private static final long serialVersionUID = -267879410;

    /**
     * The reference instance of <code>db_mall.t_wx_customer</code>
     */
    public static final TWxCustomer T_WX_CUSTOMER = new TWxCustomer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TWxCustomerRecord> getRecordType() {
        return TWxCustomerRecord.class;
    }

    /**
     * The column <code>db_mall.t_wx_customer.id</code>.
     */
    public final TableField<TWxCustomerRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_wx_customer.customer_id</code>.
     */
    public final TableField<TWxCustomerRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_wx_customer.open_id</code>.
     */
    public final TableField<TWxCustomerRecord, String> OPEN_ID = createField("open_id", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_wx_customer.logo</code>.
     */
    public final TableField<TWxCustomerRecord, String> LOGO = createField("logo", org.jooq.impl.SQLDataType.VARCHAR(300).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_wx_customer.nickname</code>.
     */
    public final TableField<TWxCustomerRecord, String> NICKNAME = createField("nickname", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_wx_customer.address</code>.
     */
    public final TableField<TWxCustomerRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(300).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_wx_customer.is_focus</code>.
     */
    public final TableField<TWxCustomerRecord, Byte> IS_FOCUS = createField("is_focus", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_wx_customer.sex</code>.
     */
    public final TableField<TWxCustomerRecord, Byte> SEX = createField("sex", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_wx_customer.cdate</code>.
     */
    public final TableField<TWxCustomerRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_wx_customer.mdate</code>.
     */
    public final TableField<TWxCustomerRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_wx_customer</code> table reference
     */
    public TWxCustomer() {
        this(DSL.name("t_wx_customer"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_wx_customer</code> table reference
     */
    public TWxCustomer(String alias) {
        this(DSL.name(alias), T_WX_CUSTOMER);
    }

    /**
     * Create an aliased <code>db_mall.t_wx_customer</code> table reference
     */
    public TWxCustomer(Name alias) {
        this(alias, T_WX_CUSTOMER);
    }

    private TWxCustomer(Name alias, Table<TWxCustomerRecord> aliased) {
        this(alias, aliased, null);
    }

    private TWxCustomer(Name alias, Table<TWxCustomerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TWxCustomer(Table<O> child, ForeignKey<O, TWxCustomerRecord> key) {
        super(child, key, T_WX_CUSTOMER);
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
        return Arrays.<Index>asList(Indexes.T_WX_CUSTOMER_CUSTOMER_ID, Indexes.T_WX_CUSTOMER_OPEN_ID, Indexes.T_WX_CUSTOMER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TWxCustomerRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_WX_CUSTOMER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TWxCustomerRecord> getPrimaryKey() {
        return Keys.KEY_T_WX_CUSTOMER_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TWxCustomerRecord>> getKeys() {
        return Arrays.<UniqueKey<TWxCustomerRecord>>asList(Keys.KEY_T_WX_CUSTOMER_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TWxCustomer as(String alias) {
        return new TWxCustomer(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TWxCustomer as(Name alias) {
        return new TWxCustomer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TWxCustomer rename(String name) {
        return new TWxCustomer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TWxCustomer rename(Name name) {
        return new TWxCustomer(name, null);
    }
}
