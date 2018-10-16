/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TProductMajorParamRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class TProductMajorParam extends TableImpl<TProductMajorParamRecord> {

    private static final long serialVersionUID = -903443872;

    /**
     * The reference instance of <code>db_mall.t_product_major_param</code>
     */
    public static final TProductMajorParam T_PRODUCT_MAJOR_PARAM = new TProductMajorParam();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TProductMajorParamRecord> getRecordType() {
        return TProductMajorParamRecord.class;
    }

    /**
     * The column <code>db_mall.t_product_major_param.product_id</code>. 商品ID
     */
    public final TableField<TProductMajorParamRecord, Integer> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "商品ID");

    /**
     * The column <code>db_mall.t_product_major_param.cpu_model</code>. CPU型号
     */
    public final TableField<TProductMajorParamRecord, String> CPU_MODEL = createField("cpu_model", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "CPU型号");

    /**
     * The column <code>db_mall.t_product_major_param.cpu_model_standard</code>. CPU筛选值
     */
    public final TableField<TProductMajorParamRecord, String> CPU_MODEL_STANDARD = createField("cpu_model_standard", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "CPU筛选值");

    /**
     * The column <code>db_mall.t_product_major_param.screen_size</code>. 屏幕尺寸
     */
    public final TableField<TProductMajorParamRecord, String> SCREEN_SIZE = createField("screen_size", org.jooq.impl.SQLDataType.VARCHAR(100).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "屏幕尺寸");

    /**
     * The column <code>db_mall.t_product_major_param.memory_capacity</code>. 内存容量
     */
    public final TableField<TProductMajorParamRecord, String> MEMORY_CAPACITY = createField("memory_capacity", org.jooq.impl.SQLDataType.VARCHAR(100).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "内存容量");

    /**
     * The column <code>db_mall.t_product_major_param.disk_capacity</code>. 硬盘容量
     */
    public final TableField<TProductMajorParamRecord, String> DISK_CAPACITY = createField("disk_capacity", org.jooq.impl.SQLDataType.VARCHAR(100).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "硬盘容量");

    /**
     * The column <code>db_mall.t_product_major_param.disk_type</code>. 硬盘类型
     */
    public final TableField<TProductMajorParamRecord, String> DISK_TYPE = createField("disk_type", org.jooq.impl.SQLDataType.VARCHAR(100).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "硬盘类型");

    /**
     * The column <code>db_mall.t_product_major_param.graphics_card_model</code>. 显卡型号
     */
    public final TableField<TProductMajorParamRecord, String> GRAPHICS_CARD_MODEL = createField("graphics_card_model", org.jooq.impl.SQLDataType.VARCHAR(100).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "显卡型号");

    /**
     * The column <code>db_mall.t_product_major_param.graphics_card_type</code>. 显卡类型
     */
    public final TableField<TProductMajorParamRecord, String> GRAPHICS_CARD_TYPE = createField("graphics_card_type", org.jooq.impl.SQLDataType.VARCHAR(100).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "显卡类型");

    /**
     * The column <code>db_mall.t_product_major_param.graphics_card_capacity</code>. 显存容量
     */
    public final TableField<TProductMajorParamRecord, String> GRAPHICS_CARD_CAPACITY = createField("graphics_card_capacity", org.jooq.impl.SQLDataType.VARCHAR(100).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "显存容量");

    /**
     * The column <code>db_mall.t_product_major_param.create_time</code>. 创建时间
     */
    public final TableField<TProductMajorParamRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>db_mall.t_product_major_param.modify_time</code>. 修改时间
     */
    public final TableField<TProductMajorParamRecord, Timestamp> MODIFY_TIME = createField("modify_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * Create a <code>db_mall.t_product_major_param</code> table reference
     */
    public TProductMajorParam() {
        this(DSL.name("t_product_major_param"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_product_major_param</code> table reference
     */
    public TProductMajorParam(String alias) {
        this(DSL.name(alias), T_PRODUCT_MAJOR_PARAM);
    }

    /**
     * Create an aliased <code>db_mall.t_product_major_param</code> table reference
     */
    public TProductMajorParam(Name alias) {
        this(alias, T_PRODUCT_MAJOR_PARAM);
    }

    private TProductMajorParam(Name alias, Table<TProductMajorParamRecord> aliased) {
        this(alias, aliased, null);
    }

    private TProductMajorParam(Name alias, Table<TProductMajorParamRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TProductMajorParam(Table<O> child, ForeignKey<O, TProductMajorParamRecord> key) {
        super(child, key, T_PRODUCT_MAJOR_PARAM);
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
        return Arrays.<Index>asList(Indexes.T_PRODUCT_MAJOR_PARAM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TProductMajorParamRecord> getPrimaryKey() {
        return Keys.KEY_T_PRODUCT_MAJOR_PARAM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TProductMajorParamRecord>> getKeys() {
        return Arrays.<UniqueKey<TProductMajorParamRecord>>asList(Keys.KEY_T_PRODUCT_MAJOR_PARAM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorParam as(String alias) {
        return new TProductMajorParam(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorParam as(Name alias) {
        return new TProductMajorParam(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TProductMajorParam rename(String name) {
        return new TProductMajorParam(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TProductMajorParam rename(Name name) {
        return new TProductMajorParam(name, null);
    }
}