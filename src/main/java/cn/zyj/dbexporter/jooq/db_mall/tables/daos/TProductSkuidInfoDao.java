/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TProductSkuidInfo;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TProductSkuidInfoRecord;

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
public class TProductSkuidInfoDao extends DAOImpl<TProductSkuidInfoRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductSkuidInfo, Long> {

    /**
     * Create a new TProductSkuidInfoDao without any configuration
     */
    public TProductSkuidInfoDao() {
        super(TProductSkuidInfo.T_PRODUCT_SKUID_INFO, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductSkuidInfo.class);
    }

    /**
     * Create a new TProductSkuidInfoDao with an attached configuration
     */
    public TProductSkuidInfoDao(Configuration configuration) {
        super(TProductSkuidInfo.T_PRODUCT_SKUID_INFO, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductSkuidInfo.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductSkuidInfo object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductSkuidInfo> fetchById(Long... values) {
        return fetch(TProductSkuidInfo.T_PRODUCT_SKUID_INFO.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductSkuidInfo fetchOneById(Long value) {
        return fetchOne(TProductSkuidInfo.T_PRODUCT_SKUID_INFO.ID, value);
    }

    /**
     * Fetch records that have <code>product_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductSkuidInfo> fetchByProductId(Integer... values) {
        return fetch(TProductSkuidInfo.T_PRODUCT_SKUID_INFO.PRODUCT_ID, values);
    }

    /**
     * Fetch records that have <code>sku_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductSkuidInfo> fetchBySkuId(Integer... values) {
        return fetch(TProductSkuidInfo.T_PRODUCT_SKUID_INFO.SKU_ID, values);
    }

    /**
     * Fetch records that have <code>stock IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductSkuidInfo> fetchByStock(Integer... values) {
        return fetch(TProductSkuidInfo.T_PRODUCT_SKUID_INFO.STOCK, values);
    }

    /**
     * Fetch records that have <code>real_stock IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductSkuidInfo> fetchByRealStock(Integer... values) {
        return fetch(TProductSkuidInfo.T_PRODUCT_SKUID_INFO.REAL_STOCK, values);
    }

    /**
     * Fetch records that have <code>is_presale IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductSkuidInfo> fetchByIsPresale(Byte... values) {
        return fetch(TProductSkuidInfo.T_PRODUCT_SKUID_INFO.IS_PRESALE, values);
    }

    /**
     * Fetch records that have <code>sync_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductSkuidInfo> fetchBySyncStatus(Byte... values) {
        return fetch(TProductSkuidInfo.T_PRODUCT_SKUID_INFO.SYNC_STATUS, values);
    }

    /**
     * Fetch records that have <code>rents IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductSkuidInfo> fetchByRents(String... values) {
        return fetch(TProductSkuidInfo.T_PRODUCT_SKUID_INFO.RENTS, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductSkuidInfo> fetchByCdate(Timestamp... values) {
        return fetch(TProductSkuidInfo.T_PRODUCT_SKUID_INFO.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductSkuidInfo> fetchByMdate(Timestamp... values) {
        return fetch(TProductSkuidInfo.T_PRODUCT_SKUID_INFO.MDATE, values);
    }
}