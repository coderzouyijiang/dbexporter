/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TOrderSearchRecord;

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
public class TOrderSearch extends TableImpl<TOrderSearchRecord> {

    private static final long serialVersionUID = -1174772633;

    /**
     * The reference instance of <code>db_mall.t_order_search</code>
     */
    public static final TOrderSearch T_ORDER_SEARCH = new TOrderSearch();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TOrderSearchRecord> getRecordType() {
        return TOrderSearchRecord.class;
    }

    /**
     * The column <code>db_mall.t_order_search.id</code>.
     */
    public final TableField<TOrderSearchRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_order_search.order_id</code>.
     */
    public final TableField<TOrderSearchRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_order_search</code> table reference
     */
    public TOrderSearch() {
        this(DSL.name("t_order_search"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_order_search</code> table reference
     */
    public TOrderSearch(String alias) {
        this(DSL.name(alias), T_ORDER_SEARCH);
    }

    /**
     * Create an aliased <code>db_mall.t_order_search</code> table reference
     */
    public TOrderSearch(Name alias) {
        this(alias, T_ORDER_SEARCH);
    }

    private TOrderSearch(Name alias, Table<TOrderSearchRecord> aliased) {
        this(alias, aliased, null);
    }

    private TOrderSearch(Name alias, Table<TOrderSearchRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TOrderSearch(Table<O> child, ForeignKey<O, TOrderSearchRecord> key) {
        super(child, key, T_ORDER_SEARCH);
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
        return Arrays.<Index>asList(Indexes.T_ORDER_SEARCH_ORDER_ID, Indexes.T_ORDER_SEARCH_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TOrderSearchRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_ORDER_SEARCH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TOrderSearchRecord> getPrimaryKey() {
        return Keys.KEY_T_ORDER_SEARCH_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TOrderSearchRecord>> getKeys() {
        return Arrays.<UniqueKey<TOrderSearchRecord>>asList(Keys.KEY_T_ORDER_SEARCH_PRIMARY, Keys.KEY_T_ORDER_SEARCH_ORDER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderSearch as(String alias) {
        return new TOrderSearch(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderSearch as(Name alias) {
        return new TOrderSearch(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderSearch rename(String name) {
        return new TOrderSearch(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrderSearch rename(Name name) {
        return new TOrderSearch(name, null);
    }
}
