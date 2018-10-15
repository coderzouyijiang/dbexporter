/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.THomeProductRecord;

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
public class THomeProduct extends TableImpl<THomeProductRecord> {

    private static final long serialVersionUID = 1892887873;

    /**
     * The reference instance of <code>db_mall.t_home_product</code>
     */
    public static final THomeProduct T_HOME_PRODUCT = new THomeProduct();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<THomeProductRecord> getRecordType() {
        return THomeProductRecord.class;
    }

    /**
     * The column <code>db_mall.t_home_product.id</code>.
     */
    public final TableField<THomeProductRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_home_product.type_id</code>. 1:热销机型2：行政办公3：技术开发4：商务便携5：图像处理6：外设配件
     */
    public final TableField<THomeProductRecord, Byte> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "1:热销机型2：行政办公3：技术开发4：商务便携5：图像处理6：外设配件");

    /**
     * The column <code>db_mall.t_home_product.oid</code>.
     */
    public final TableField<THomeProductRecord, Integer> OID = createField("oid", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_home_product.loc_url</code>.
     */
    public final TableField<THomeProductRecord, String> LOC_URL = createField("loc_url", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>db_mall.t_home_product.url</code>.
     */
    public final TableField<THomeProductRecord, String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>db_mall.t_home_product.title</code>.
     */
    public final TableField<THomeProductRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>db_mall.t_home_product.product_id</code>.
     */
    public final TableField<THomeProductRecord, Long> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>db_mall.t_home_product.cdate</code>.
     */
    public final TableField<THomeProductRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_home_product.mdate</code>.
     */
    public final TableField<THomeProductRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_home_product</code> table reference
     */
    public THomeProduct() {
        this(DSL.name("t_home_product"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_home_product</code> table reference
     */
    public THomeProduct(String alias) {
        this(DSL.name(alias), T_HOME_PRODUCT);
    }

    /**
     * Create an aliased <code>db_mall.t_home_product</code> table reference
     */
    public THomeProduct(Name alias) {
        this(alias, T_HOME_PRODUCT);
    }

    private THomeProduct(Name alias, Table<THomeProductRecord> aliased) {
        this(alias, aliased, null);
    }

    private THomeProduct(Name alias, Table<THomeProductRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> THomeProduct(Table<O> child, ForeignKey<O, THomeProductRecord> key) {
        super(child, key, T_HOME_PRODUCT);
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
        return Arrays.<Index>asList(Indexes.T_HOME_PRODUCT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<THomeProductRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_HOME_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<THomeProductRecord> getPrimaryKey() {
        return Keys.KEY_T_HOME_PRODUCT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<THomeProductRecord>> getKeys() {
        return Arrays.<UniqueKey<THomeProductRecord>>asList(Keys.KEY_T_HOME_PRODUCT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public THomeProduct as(String alias) {
        return new THomeProduct(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public THomeProduct as(Name alias) {
        return new THomeProduct(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public THomeProduct rename(String name) {
        return new THomeProduct(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public THomeProduct rename(Name name) {
        return new THomeProduct(name, null);
    }
}
