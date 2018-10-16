/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_calculator.tables;


import cn.zyj.dbexporter.jooq.db_calculator.DbCalculator;
import cn.zyj.dbexporter.jooq.db_calculator.Indexes;
import cn.zyj.dbexporter.jooq.db_calculator.Keys;
import cn.zyj.dbexporter.jooq.db_calculator.tables.records.TDepreciationRecord;

import java.math.BigDecimal;
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
 * 残值
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDepreciation extends TableImpl<TDepreciationRecord> {

    private static final long serialVersionUID = 1415090024;

    /**
     * The reference instance of <code>db_calculator.t_depreciation</code>
     */
    public static final TDepreciation T_DEPRECIATION = new TDepreciation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TDepreciationRecord> getRecordType() {
        return TDepreciationRecord.class;
    }

    /**
     * The column <code>db_calculator.t_depreciation.id</code>.
     */
    public final TableField<TDepreciationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_calculator.t_depreciation.spu</code>. spu
     */
    public final TableField<TDepreciationRecord, String> SPU = createField("spu", org.jooq.impl.SQLDataType.VARCHAR(300), this, "spu");

    /**
     * The column <code>db_calculator.t_depreciation.spu_type</code>. spu类型 1:主机2笔记本3显示器4工作站5服务器
     */
    public final TableField<TDepreciationRecord, Integer> SPU_TYPE = createField("spu_type", org.jooq.impl.SQLDataType.INTEGER, this, "spu类型 1:主机2笔记本3显示器4工作站5服务器");

    /**
     * The column <code>db_calculator.t_depreciation.cpu_model</code>. cpu型号
     */
    public final TableField<TDepreciationRecord, Integer> CPU_MODEL = createField("cpu_model", org.jooq.impl.SQLDataType.INTEGER, this, "cpu型号");

    /**
     * The column <code>db_calculator.t_depreciation.ram</code>. ram
     */
    public final TableField<TDepreciationRecord, Integer> RAM = createField("ram", org.jooq.impl.SQLDataType.INTEGER, this, "ram");

    /**
     * The column <code>db_calculator.t_depreciation.hd1</code>. hd1
     */
    public final TableField<TDepreciationRecord, Integer> HD1 = createField("hd1", org.jooq.impl.SQLDataType.INTEGER, this, "hd1");

    /**
     * The column <code>db_calculator.t_depreciation.hd2</code>. hd2
     */
    public final TableField<TDepreciationRecord, Integer> HD2 = createField("hd2", org.jooq.impl.SQLDataType.INTEGER, this, "hd2");

    /**
     * The column <code>db_calculator.t_depreciation.gpu</code>. gpu
     */
    public final TableField<TDepreciationRecord, Integer> GPU = createField("gpu", org.jooq.impl.SQLDataType.INTEGER, this, "gpu");

    /**
     * The column <code>db_calculator.t_depreciation.screen_size</code>. 屏幕尺寸
     */
    public final TableField<TDepreciationRecord, Integer> SCREEN_SIZE = createField("screen_size", org.jooq.impl.SQLDataType.INTEGER, this, "屏幕尺寸");

    /**
     * The column <code>db_calculator.t_depreciation.resolution</code>. 分辨率
     */
    public final TableField<TDepreciationRecord, Integer> RESOLUTION = createField("resolution", org.jooq.impl.SQLDataType.INTEGER, this, "分辨率");

    /**
     * The column <code>db_calculator.t_depreciation.residual_after_year1</code>. 1年后处置价
     */
    public final TableField<TDepreciationRecord, BigDecimal> RESIDUAL_AFTER_YEAR1 = createField("residual_after_year1", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("-1.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "1年后处置价");

    /**
     * The column <code>db_calculator.t_depreciation.residual_after_year2</code>. 2年后处置价
     */
    public final TableField<TDepreciationRecord, BigDecimal> RESIDUAL_AFTER_YEAR2 = createField("residual_after_year2", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("-1.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "2年后处置价");

    /**
     * The column <code>db_calculator.t_depreciation.residual_after_year3</code>. 3年后处置价
     */
    public final TableField<TDepreciationRecord, BigDecimal> RESIDUAL_AFTER_YEAR3 = createField("residual_after_year3", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("-1.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "3年后处置价");

    /**
     * The column <code>db_calculator.t_depreciation.residual_after_year4</code>. 4年后处置价
     */
    public final TableField<TDepreciationRecord, BigDecimal> RESIDUAL_AFTER_YEAR4 = createField("residual_after_year4", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("-1.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "4年后处置价");

    /**
     * The column <code>db_calculator.t_depreciation.residual_after_year5</code>. 5年后处置价
     */
    public final TableField<TDepreciationRecord, BigDecimal> RESIDUAL_AFTER_YEAR5 = createField("residual_after_year5", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("-1.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "5年后处置价");

    /**
     * The column <code>db_calculator.t_depreciation.status</code>. 状态 0:正常 1:禁用
     */
    public final TableField<TDepreciationRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "状态 0:正常 1:禁用");

    /**
     * The column <code>db_calculator.t_depreciation.cdate</code>.
     */
    public final TableField<TDepreciationRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>db_calculator.t_depreciation.mdate</code>.
     */
    public final TableField<TDepreciationRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>db_calculator.t_depreciation.creater_id</code>. 创建人ID
     */
    public final TableField<TDepreciationRecord, Integer> CREATER_ID = createField("creater_id", org.jooq.impl.SQLDataType.INTEGER, this, "创建人ID");

    /**
     * The column <code>db_calculator.t_depreciation.creater_name</code>. 创建人姓名
     */
    public final TableField<TDepreciationRecord, String> CREATER_NAME = createField("creater_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "创建人姓名");

    /**
     * The column <code>db_calculator.t_depreciation.data_status</code>. 状态 0:正常 -1:删除
     */
    public final TableField<TDepreciationRecord, Integer> DATA_STATUS = createField("data_status", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "状态 0:正常 -1:删除");

    /**
     * Create a <code>db_calculator.t_depreciation</code> table reference
     */
    public TDepreciation() {
        this(DSL.name("t_depreciation"), null);
    }

    /**
     * Create an aliased <code>db_calculator.t_depreciation</code> table reference
     */
    public TDepreciation(String alias) {
        this(DSL.name(alias), T_DEPRECIATION);
    }

    /**
     * Create an aliased <code>db_calculator.t_depreciation</code> table reference
     */
    public TDepreciation(Name alias) {
        this(alias, T_DEPRECIATION);
    }

    private TDepreciation(Name alias, Table<TDepreciationRecord> aliased) {
        this(alias, aliased, null);
    }

    private TDepreciation(Name alias, Table<TDepreciationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("残值"));
    }

    public <O extends Record> TDepreciation(Table<O> child, ForeignKey<O, TDepreciationRecord> key) {
        super(child, key, T_DEPRECIATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DbCalculator.DB_CALCULATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.T_DEPRECIATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TDepreciationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_DEPRECIATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TDepreciationRecord> getPrimaryKey() {
        return Keys.KEY_T_DEPRECIATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TDepreciationRecord>> getKeys() {
        return Arrays.<UniqueKey<TDepreciationRecord>>asList(Keys.KEY_T_DEPRECIATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDepreciation as(String alias) {
        return new TDepreciation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TDepreciation as(Name alias) {
        return new TDepreciation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TDepreciation rename(String name) {
        return new TDepreciation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TDepreciation rename(Name name) {
        return new TDepreciation(name, null);
    }
}