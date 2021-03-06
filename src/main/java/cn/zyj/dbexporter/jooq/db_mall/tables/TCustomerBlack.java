/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCustomerBlackRecord;

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
public class TCustomerBlack extends TableImpl<TCustomerBlackRecord> {

    private static final long serialVersionUID = 1462038972;

    /**
     * The reference instance of <code>db_mall.t_customer_black</code>
     */
    public static final TCustomerBlack T_CUSTOMER_BLACK = new TCustomerBlack();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TCustomerBlackRecord> getRecordType() {
        return TCustomerBlackRecord.class;
    }

    /**
     * The column <code>db_mall.t_customer_black.id</code>.
     */
    public final TableField<TCustomerBlackRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_customer_black.customer_id</code>.
     */
    public final TableField<TCustomerBlackRecord, Long> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_black.type_id</code>.
     */
    public final TableField<TCustomerBlackRecord, Byte> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_black.status</code>.
     */
    public final TableField<TCustomerBlackRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_black.cdate</code>.
     */
    public final TableField<TCustomerBlackRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_customer_black.mdate</code>.
     */
    public final TableField<TCustomerBlackRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_customer_black</code> table reference
     */
    public TCustomerBlack() {
        this(DSL.name("t_customer_black"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_customer_black</code> table reference
     */
    public TCustomerBlack(String alias) {
        this(DSL.name(alias), T_CUSTOMER_BLACK);
    }

    /**
     * Create an aliased <code>db_mall.t_customer_black</code> table reference
     */
    public TCustomerBlack(Name alias) {
        this(alias, T_CUSTOMER_BLACK);
    }

    private TCustomerBlack(Name alias, Table<TCustomerBlackRecord> aliased) {
        this(alias, aliased, null);
    }

    private TCustomerBlack(Name alias, Table<TCustomerBlackRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TCustomerBlack(Table<O> child, ForeignKey<O, TCustomerBlackRecord> key) {
        super(child, key, T_CUSTOMER_BLACK);
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
        return Arrays.<Index>asList(Indexes.T_CUSTOMER_BLACK_PRIMARY, Indexes.T_CUSTOMER_BLACK_UID_STAUS_TYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TCustomerBlackRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_CUSTOMER_BLACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TCustomerBlackRecord> getPrimaryKey() {
        return Keys.KEY_T_CUSTOMER_BLACK_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TCustomerBlackRecord>> getKeys() {
        return Arrays.<UniqueKey<TCustomerBlackRecord>>asList(Keys.KEY_T_CUSTOMER_BLACK_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerBlack as(String alias) {
        return new TCustomerBlack(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerBlack as(Name alias) {
        return new TCustomerBlack(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TCustomerBlack rename(String name) {
        return new TCustomerBlack(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TCustomerBlack rename(Name name) {
        return new TCustomerBlack(name, null);
    }
}
