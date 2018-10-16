/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TProductCategory;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TProductCategoryRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 商品分类表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TProductCategoryDao extends DAOImpl<TProductCategoryRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCategory, Long> {

    /**
     * Create a new TProductCategoryDao without any configuration
     */
    public TProductCategoryDao() {
        super(TProductCategory.T_PRODUCT_CATEGORY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCategory.class);
    }

    /**
     * Create a new TProductCategoryDao with an attached configuration
     */
    public TProductCategoryDao(Configuration configuration) {
        super(TProductCategory.T_PRODUCT_CATEGORY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCategory.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCategory object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCategory> fetchById(Long... values) {
        return fetch(TProductCategory.T_PRODUCT_CATEGORY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCategory fetchOneById(Long value) {
        return fetchOne(TProductCategory.T_PRODUCT_CATEGORY.ID, value);
    }

    /**
     * Fetch records that have <code>parent_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCategory> fetchByParentId(Integer... values) {
        return fetch(TProductCategory.T_PRODUCT_CATEGORY.PARENT_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCategory> fetchByStatus(Byte... values) {
        return fetch(TProductCategory.T_PRODUCT_CATEGORY.STATUS, values);
    }

    /**
     * Fetch records that have <code>is_delete IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCategory> fetchByIsDelete(Byte... values) {
        return fetch(TProductCategory.T_PRODUCT_CATEGORY.IS_DELETE, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCategory> fetchByName(String... values) {
        return fetch(TProductCategory.T_PRODUCT_CATEGORY.NAME, values);
    }

    /**
     * Fetch records that have <code>show_name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCategory> fetchByShowName(String... values) {
        return fetch(TProductCategory.T_PRODUCT_CATEGORY.SHOW_NAME, values);
    }

    /**
     * Fetch records that have <code>oid IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCategory> fetchByOid(Integer... values) {
        return fetch(TProductCategory.T_PRODUCT_CATEGORY.OID, values);
    }

    /**
     * Fetch records that have <code>sync_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCategory> fetchBySyncStatus(Byte... values) {
        return fetch(TProductCategory.T_PRODUCT_CATEGORY.SYNC_STATUS, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCategory> fetchByCdate(Timestamp... values) {
        return fetch(TProductCategory.T_PRODUCT_CATEGORY.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCategory> fetchByMdate(Timestamp... values) {
        return fetch(TProductCategory.T_PRODUCT_CATEGORY.MDATE, values);
    }
}
