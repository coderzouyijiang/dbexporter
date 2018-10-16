/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TShortcutMenuRecord;

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
 * 快捷菜单表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TShortcutMenu extends TableImpl<TShortcutMenuRecord> {

    private static final long serialVersionUID = 373449100;

    /**
     * The reference instance of <code>db_mall.t_shortcut_menu</code>
     */
    public static final TShortcutMenu T_SHORTCUT_MENU = new TShortcutMenu();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TShortcutMenuRecord> getRecordType() {
        return TShortcutMenuRecord.class;
    }

    /**
     * The column <code>db_mall.t_shortcut_menu.manager_id</code>. 管理员标识
     */
    public final TableField<TShortcutMenuRecord, Long> MANAGER_ID = createField("manager_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "管理员标识");

    /**
     * The column <code>db_mall.t_shortcut_menu.menu_id</code>. 菜单标识
     */
    public final TableField<TShortcutMenuRecord, Long> MENU_ID = createField("menu_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "菜单标识");

    /**
     * The column <code>db_mall.t_shortcut_menu.menu_no</code>. 菜单序号
     */
    public final TableField<TShortcutMenuRecord, Long> MENU_NO = createField("menu_no", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "菜单序号");

    /**
     * The column <code>db_mall.t_shortcut_menu.created_time</code>. 创建时间
     */
    public final TableField<TShortcutMenuRecord, Timestamp> CREATED_TIME = createField("created_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>db_mall.t_shortcut_menu.modified_time</code>. 修改时间
     */
    public final TableField<TShortcutMenuRecord, Timestamp> MODIFIED_TIME = createField("modified_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "修改时间");

    /**
     * Create a <code>db_mall.t_shortcut_menu</code> table reference
     */
    public TShortcutMenu() {
        this(DSL.name("t_shortcut_menu"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_shortcut_menu</code> table reference
     */
    public TShortcutMenu(String alias) {
        this(DSL.name(alias), T_SHORTCUT_MENU);
    }

    /**
     * Create an aliased <code>db_mall.t_shortcut_menu</code> table reference
     */
    public TShortcutMenu(Name alias) {
        this(alias, T_SHORTCUT_MENU);
    }

    private TShortcutMenu(Name alias, Table<TShortcutMenuRecord> aliased) {
        this(alias, aliased, null);
    }

    private TShortcutMenu(Name alias, Table<TShortcutMenuRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("快捷菜单表"));
    }

    public <O extends Record> TShortcutMenu(Table<O> child, ForeignKey<O, TShortcutMenuRecord> key) {
        super(child, key, T_SHORTCUT_MENU);
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
        return Arrays.<Index>asList(Indexes.T_SHORTCUT_MENU_FK_SMENU_MENU_ID, Indexes.T_SHORTCUT_MENU_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TShortcutMenuRecord> getPrimaryKey() {
        return Keys.KEY_T_SHORTCUT_MENU_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TShortcutMenuRecord>> getKeys() {
        return Arrays.<UniqueKey<TShortcutMenuRecord>>asList(Keys.KEY_T_SHORTCUT_MENU_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TShortcutMenuRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TShortcutMenuRecord, ?>>asList(Keys.FK_SMENU_MANAGER_ID, Keys.FK_SMENU_MENU_ID);
    }

    public TManager tManager() {
        return new TManager(this, Keys.FK_SMENU_MANAGER_ID);
    }

    public TMenu tMenu() {
        return new TMenu(this, Keys.FK_SMENU_MENU_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TShortcutMenu as(String alias) {
        return new TShortcutMenu(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TShortcutMenu as(Name alias) {
        return new TShortcutMenu(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TShortcutMenu rename(String name) {
        return new TShortcutMenu(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TShortcutMenu rename(Name name) {
        return new TShortcutMenu(name, null);
    }
}