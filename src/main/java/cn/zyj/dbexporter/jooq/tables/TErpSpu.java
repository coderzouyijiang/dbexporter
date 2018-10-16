/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TErpSpuRecord;

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
public class TErpSpu extends TableImpl<TErpSpuRecord> {

    private static final long serialVersionUID = 1277456517;

    /**
     * The reference instance of <code>db_mall.t_erp_spu</code>
     */
    public static final TErpSpu T_ERP_SPU = new TErpSpu();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TErpSpuRecord> getRecordType() {
        return TErpSpuRecord.class;
    }

    /**
     * The column <code>db_mall.t_erp_spu.id</code>.
     */
    public final TableField<TErpSpuRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_erp_spu.brand_id</code>.  和erp一致（展示取商城的） 
     */
    public final TableField<TErpSpuRecord, Integer> BRAND_ID = createField("brand_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, " 和erp一致（展示取商城的） ");

    /**
     * The column <code>db_mall.t_erp_spu.category_id</code>.  和erp一致（展示取商城的） 
     */
    public final TableField<TErpSpuRecord, Integer> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, " 和erp一致（展示取商城的） ");

    /**
     * The column <code>db_mall.t_erp_spu.name</code>.  和erp一致 
     */
    public final TableField<TErpSpuRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, " 和erp一致 ");

    /**
     * The column <code>db_mall.t_erp_spu.is_delete</code>. 分类状态(0:正常 1：删除) 商城个性化
     */
    public final TableField<TErpSpuRecord, Byte> IS_DELETE = createField("is_delete", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "分类状态(0:正常 1：删除) 商城个性化");

    /**
     * The column <code>db_mall.t_erp_spu.status</code>.  0:正常;1:停用 
     */
    public final TableField<TErpSpuRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, " 0:正常;1:停用 ");

    /**
     * The column <code>db_mall.t_erp_spu.condition</code>. 1：全新 2：非全新 3:翻新 
     */
    public final TableField<TErpSpuRecord, Byte> CONDITION = createField("condition", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "1：全新 2：非全新 3:翻新 ");

    /**
     * The column <code>db_mall.t_erp_spu.sync_status</code>. 0:未处理 1：已处理
     */
    public final TableField<TErpSpuRecord, Byte> SYNC_STATUS = createField("sync_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:未处理 1：已处理");

    /**
     * The column <code>db_mall.t_erp_spu.cdate</code>.
     */
    public final TableField<TErpSpuRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_erp_spu.mdate</code>.
     */
    public final TableField<TErpSpuRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_erp_spu</code> table reference
     */
    public TErpSpu() {
        this(DSL.name("t_erp_spu"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_erp_spu</code> table reference
     */
    public TErpSpu(String alias) {
        this(DSL.name(alias), T_ERP_SPU);
    }

    /**
     * Create an aliased <code>db_mall.t_erp_spu</code> table reference
     */
    public TErpSpu(Name alias) {
        this(alias, T_ERP_SPU);
    }

    private TErpSpu(Name alias, Table<TErpSpuRecord> aliased) {
        this(alias, aliased, null);
    }

    private TErpSpu(Name alias, Table<TErpSpuRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TErpSpu(Table<O> child, ForeignKey<O, TErpSpuRecord> key) {
        super(child, key, T_ERP_SPU);
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
        return Arrays.<Index>asList(Indexes.T_ERP_SPU_PRIMARY, Indexes.T_ERP_SPU_SYNC_STATUS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TErpSpuRecord> getPrimaryKey() {
        return Keys.KEY_T_ERP_SPU_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TErpSpuRecord>> getKeys() {
        return Arrays.<UniqueKey<TErpSpuRecord>>asList(Keys.KEY_T_ERP_SPU_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TErpSpu as(String alias) {
        return new TErpSpu(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TErpSpu as(Name alias) {
        return new TErpSpu(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TErpSpu rename(String name) {
        return new TErpSpu(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TErpSpu rename(Name name) {
        return new TErpSpu(name, null);
    }
}