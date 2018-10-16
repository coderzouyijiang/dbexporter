/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TShortcutMenu;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TShortcutMenuRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;


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
public class TShortcutMenuDao extends DAOImpl<TShortcutMenuRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TShortcutMenu, Record2<Long, Long>> {

    /**
     * Create a new TShortcutMenuDao without any configuration
     */
    public TShortcutMenuDao() {
        super(TShortcutMenu.T_SHORTCUT_MENU, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TShortcutMenu.class);
    }

    /**
     * Create a new TShortcutMenuDao with an attached configuration
     */
    public TShortcutMenuDao(Configuration configuration) {
        super(TShortcutMenu.T_SHORTCUT_MENU, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TShortcutMenu.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Long, Long> getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TShortcutMenu object) {
        return compositeKeyRecord(object.getManagerId(), object.getMenuId());
    }

    /**
     * Fetch records that have <code>manager_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TShortcutMenu> fetchByManagerId(Long... values) {
        return fetch(TShortcutMenu.T_SHORTCUT_MENU.MANAGER_ID, values);
    }

    /**
     * Fetch records that have <code>menu_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TShortcutMenu> fetchByMenuId(Long... values) {
        return fetch(TShortcutMenu.T_SHORTCUT_MENU.MENU_ID, values);
    }

    /**
     * Fetch records that have <code>menu_no IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TShortcutMenu> fetchByMenuNo(Long... values) {
        return fetch(TShortcutMenu.T_SHORTCUT_MENU.MENU_NO, values);
    }

    /**
     * Fetch records that have <code>created_time IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TShortcutMenu> fetchByCreatedTime(Timestamp... values) {
        return fetch(TShortcutMenu.T_SHORTCUT_MENU.CREATED_TIME, values);
    }

    /**
     * Fetch records that have <code>modified_time IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TShortcutMenu> fetchByModifiedTime(Timestamp... values) {
        return fetch(TShortcutMenu.T_SHORTCUT_MENU.MODIFIED_TIME, values);
    }
}
