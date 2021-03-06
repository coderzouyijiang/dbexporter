/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TNewsCategoryRecord;

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
public class TNewsCategory extends TableImpl<TNewsCategoryRecord> {

    private static final long serialVersionUID = -17400278;

    /**
     * The reference instance of <code>db_mall.t_news_category</code>
     */
    public static final TNewsCategory T_NEWS_CATEGORY = new TNewsCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TNewsCategoryRecord> getRecordType() {
        return TNewsCategoryRecord.class;
    }

    /**
     * The column <code>db_mall.t_news_category.id</code>.
     */
    public final TableField<TNewsCategoryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_news_category.name</code>.
     */
    public final TableField<TNewsCategoryRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_news_category.oid</code>.
     */
    public final TableField<TNewsCategoryRecord, Byte> OID = createField("oid", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_news_category.status</code>.
     */
    public final TableField<TNewsCategoryRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_news_category.type_id</code>.
     */
    public final TableField<TNewsCategoryRecord, Byte> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_news_category.cdate</code>.
     */
    public final TableField<TNewsCategoryRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_news_category.mdate</code>.
     */
    public final TableField<TNewsCategoryRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_news_category</code> table reference
     */
    public TNewsCategory() {
        this(DSL.name("t_news_category"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_news_category</code> table reference
     */
    public TNewsCategory(String alias) {
        this(DSL.name(alias), T_NEWS_CATEGORY);
    }

    /**
     * Create an aliased <code>db_mall.t_news_category</code> table reference
     */
    public TNewsCategory(Name alias) {
        this(alias, T_NEWS_CATEGORY);
    }

    private TNewsCategory(Name alias, Table<TNewsCategoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private TNewsCategory(Name alias, Table<TNewsCategoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TNewsCategory(Table<O> child, ForeignKey<O, TNewsCategoryRecord> key) {
        super(child, key, T_NEWS_CATEGORY);
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
        return Arrays.<Index>asList(Indexes.T_NEWS_CATEGORY_PRIMARY, Indexes.T_NEWS_CATEGORY_TYPEID_STATUS_OID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TNewsCategoryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_NEWS_CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TNewsCategoryRecord> getPrimaryKey() {
        return Keys.KEY_T_NEWS_CATEGORY_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TNewsCategoryRecord>> getKeys() {
        return Arrays.<UniqueKey<TNewsCategoryRecord>>asList(Keys.KEY_T_NEWS_CATEGORY_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNewsCategory as(String alias) {
        return new TNewsCategory(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNewsCategory as(Name alias) {
        return new TNewsCategory(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TNewsCategory rename(String name) {
        return new TNewsCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TNewsCategory rename(Name name) {
        return new TNewsCategory(name, null);
    }
}
