/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TIndexProduct;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TIndexProductRecord;

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
public class TIndexProductDao extends DAOImpl<TIndexProductRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct, Integer> {

    /**
     * Create a new TIndexProductDao without any configuration
     */
    public TIndexProductDao() {
        super(TIndexProduct.T_INDEX_PRODUCT, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct.class);
    }

    /**
     * Create a new TIndexProductDao with an attached configuration
     */
    public TIndexProductDao(Configuration configuration) {
        super(TIndexProduct.T_INDEX_PRODUCT, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct> fetchById(Integer... values) {
        return fetch(TIndexProduct.T_INDEX_PRODUCT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct fetchOneById(Integer value) {
        return fetchOne(TIndexProduct.T_INDEX_PRODUCT.ID, value);
    }

    /**
     * Fetch records that have <code>type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct> fetchByTypeId(Byte... values) {
        return fetch(TIndexProduct.T_INDEX_PRODUCT.TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>oid IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct> fetchByOid(Integer... values) {
        return fetch(TIndexProduct.T_INDEX_PRODUCT.OID, values);
    }

    /**
     * Fetch records that have <code>loc_url IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct> fetchByLocUrl(String... values) {
        return fetch(TIndexProduct.T_INDEX_PRODUCT.LOC_URL, values);
    }

    /**
     * Fetch records that have <code>url IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct> fetchByUrl(String... values) {
        return fetch(TIndexProduct.T_INDEX_PRODUCT.URL, values);
    }

    /**
     * Fetch records that have <code>pic_length IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct> fetchByPicLength(Integer... values) {
        return fetch(TIndexProduct.T_INDEX_PRODUCT.PIC_LENGTH, values);
    }

    /**
     * Fetch records that have <code>pic_width IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct> fetchByPicWidth(Integer... values) {
        return fetch(TIndexProduct.T_INDEX_PRODUCT.PIC_WIDTH, values);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct> fetchByTitle(String... values) {
        return fetch(TIndexProduct.T_INDEX_PRODUCT.TITLE, values);
    }

    /**
     * Fetch records that have <code>simple_title IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct> fetchBySimpleTitle(String... values) {
        return fetch(TIndexProduct.T_INDEX_PRODUCT.SIMPLE_TITLE, values);
    }

    /**
     * Fetch records that have <code>t_length IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct> fetchByTLength(Integer... values) {
        return fetch(TIndexProduct.T_INDEX_PRODUCT.T_LENGTH, values);
    }

    /**
     * Fetch records that have <code>st_length IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct> fetchByStLength(Integer... values) {
        return fetch(TIndexProduct.T_INDEX_PRODUCT.ST_LENGTH, values);
    }

    /**
     * Fetch records that have <code>product_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct> fetchByProductId(Long... values) {
        return fetch(TIndexProduct.T_INDEX_PRODUCT.PRODUCT_ID, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct> fetchByCdate(Timestamp... values) {
        return fetch(TIndexProduct.T_INDEX_PRODUCT.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexProduct> fetchByMdate(Timestamp... values) {
        return fetch(TIndexProduct.T_INDEX_PRODUCT.MDATE, values);
    }
}