/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TAssetsPackagesRecord;

import java.math.BigDecimal;
import java.sql.Date;
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
public class TAssetsPackages extends TableImpl<TAssetsPackagesRecord> {

    private static final long serialVersionUID = 1066847045;

    /**
     * The reference instance of <code>db_mall.t_assets_packages</code>
     */
    public static final TAssetsPackages T_ASSETS_PACKAGES = new TAssetsPackages();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TAssetsPackagesRecord> getRecordType() {
        return TAssetsPackagesRecord.class;
    }

    /**
     * The column <code>db_mall.t_assets_packages.id</code>.
     */
    public final TableField<TAssetsPackagesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.name</code>.
     */
    public final TableField<TAssetsPackagesRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.platform_id</code>.
     */
    public final TableField<TAssetsPackagesRecord, Integer> PLATFORM_ID = createField("platform_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.type_id</code>.
     */
    public final TableField<TAssetsPackagesRecord, Integer> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.sell_money</code>.
     */
    public final TableField<TAssetsPackagesRecord, String> SELL_MONEY = createField("sell_money", org.jooq.impl.SQLDataType.VARCHAR(500).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.fee</code>.
     */
    public final TableField<TAssetsPackagesRecord, BigDecimal> FEE = createField("fee", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.interest</code>.
     */
    public final TableField<TAssetsPackagesRecord, BigDecimal> INTEREST = createField("interest", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.repayment_date</code>.
     */
    public final TableField<TAssetsPackagesRecord, Integer> REPAYMENT_DATE = createField("repayment_date", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_mall.t_assets_packages.self_repayment_date</code>.
     */
    public final TableField<TAssetsPackagesRecord, Date> SELF_REPAYMENT_DATE = createField("self_repayment_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>db_mall.t_assets_packages.repayment_amount</code>.
     */
    public final TableField<TAssetsPackagesRecord, BigDecimal> REPAYMENT_AMOUNT = createField("repayment_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.month</code>.
     */
    public final TableField<TAssetsPackagesRecord, Integer> MONTH = createField("month", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.give_money_date</code>.
     */
    public final TableField<TAssetsPackagesRecord, Date> GIVE_MONEY_DATE = createField("give_money_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>db_mall.t_assets_packages.hand_money</code>.
     */
    public final TableField<TAssetsPackagesRecord, BigDecimal> HAND_MONEY = createField("hand_money", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.company_num</code>.
     */
    public final TableField<TAssetsPackagesRecord, Integer> COMPANY_NUM = createField("company_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.device_num</code>.
     */
    public final TableField<TAssetsPackagesRecord, Integer> DEVICE_NUM = createField("device_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.deposit</code>.
     */
    public final TableField<TAssetsPackagesRecord, BigDecimal> DEPOSIT = createField("deposit", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.manager_id</code>.
     */
    public final TableField<TAssetsPackagesRecord, Integer> MANAGER_ID = createField("manager_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.status</code>.
     */
    public final TableField<TAssetsPackagesRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.buy_num</code>.
     */
    public final TableField<TAssetsPackagesRecord, String> BUY_NUM = createField("buy_num", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.cdate</code>.
     */
    public final TableField<TAssetsPackagesRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_assets_packages.mdate</code>.
     */
    public final TableField<TAssetsPackagesRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.t_assets_packages</code> table reference
     */
    public TAssetsPackages() {
        this(DSL.name("t_assets_packages"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_assets_packages</code> table reference
     */
    public TAssetsPackages(String alias) {
        this(DSL.name(alias), T_ASSETS_PACKAGES);
    }

    /**
     * Create an aliased <code>db_mall.t_assets_packages</code> table reference
     */
    public TAssetsPackages(Name alias) {
        this(alias, T_ASSETS_PACKAGES);
    }

    private TAssetsPackages(Name alias, Table<TAssetsPackagesRecord> aliased) {
        this(alias, aliased, null);
    }

    private TAssetsPackages(Name alias, Table<TAssetsPackagesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TAssetsPackages(Table<O> child, ForeignKey<O, TAssetsPackagesRecord> key) {
        super(child, key, T_ASSETS_PACKAGES);
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
        return Arrays.<Index>asList(Indexes.T_ASSETS_PACKAGES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TAssetsPackagesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_ASSETS_PACKAGES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TAssetsPackagesRecord> getPrimaryKey() {
        return Keys.KEY_T_ASSETS_PACKAGES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TAssetsPackagesRecord>> getKeys() {
        return Arrays.<UniqueKey<TAssetsPackagesRecord>>asList(Keys.KEY_T_ASSETS_PACKAGES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackages as(String alias) {
        return new TAssetsPackages(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackages as(Name alias) {
        return new TAssetsPackages(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TAssetsPackages rename(String name) {
        return new TAssetsPackages(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TAssetsPackages rename(Name name) {
        return new TAssetsPackages(name, null);
    }
}
