/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TGroupPermissionRela;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TGroupPermissionRelaRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class TGroupPermissionRelaDao extends DAOImpl<TGroupPermissionRelaRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupPermissionRela, Integer> {

    /**
     * Create a new TGroupPermissionRelaDao without any configuration
     */
    public TGroupPermissionRelaDao() {
        super(TGroupPermissionRela.T_GROUP_PERMISSION_RELA, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupPermissionRela.class);
    }

    /**
     * Create a new TGroupPermissionRelaDao with an attached configuration
     */
    public TGroupPermissionRelaDao(Configuration configuration) {
        super(TGroupPermissionRela.T_GROUP_PERMISSION_RELA, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupPermissionRela.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupPermissionRela object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupPermissionRela> fetchById(Integer... values) {
        return fetch(TGroupPermissionRela.T_GROUP_PERMISSION_RELA.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupPermissionRela fetchOneById(Integer value) {
        return fetchOne(TGroupPermissionRela.T_GROUP_PERMISSION_RELA.ID, value);
    }

    /**
     * Fetch records that have <code>group_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupPermissionRela> fetchByGroupId(Integer... values) {
        return fetch(TGroupPermissionRela.T_GROUP_PERMISSION_RELA.GROUP_ID, values);
    }

    /**
     * Fetch records that have <code>group_permissions_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupPermissionRela> fetchByGroupPermissionsId(Integer... values) {
        return fetch(TGroupPermissionRela.T_GROUP_PERMISSION_RELA.GROUP_PERMISSIONS_ID, values);
    }

    /**
     * Fetch records that have <code>group_permissions_value IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupPermissionRela> fetchByGroupPermissionsValue(Integer... values) {
        return fetch(TGroupPermissionRela.T_GROUP_PERMISSION_RELA.GROUP_PERMISSIONS_VALUE, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupPermissionRela> fetchByCdate(Timestamp... values) {
        return fetch(TGroupPermissionRela.T_GROUP_PERMISSION_RELA.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupPermissionRela> fetchByMdate(Timestamp... values) {
        return fetch(TGroupPermissionRela.T_GROUP_PERMISSION_RELA.MDATE, values);
    }
}
