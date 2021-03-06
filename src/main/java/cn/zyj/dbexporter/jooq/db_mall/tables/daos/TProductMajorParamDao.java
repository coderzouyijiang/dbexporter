/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TProductMajorParam;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TProductMajorParamRecord;

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
public class TProductMajorParamDao extends DAOImpl<TProductMajorParamRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam, Integer> {

    /**
     * Create a new TProductMajorParamDao without any configuration
     */
    public TProductMajorParamDao() {
        super(TProductMajorParam.T_PRODUCT_MAJOR_PARAM, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam.class);
    }

    /**
     * Create a new TProductMajorParamDao with an attached configuration
     */
    public TProductMajorParamDao(Configuration configuration) {
        super(TProductMajorParam.T_PRODUCT_MAJOR_PARAM, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam object) {
        return object.getProductId();
    }

    /**
     * Fetch records that have <code>product_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam> fetchByProductId(Integer... values) {
        return fetch(TProductMajorParam.T_PRODUCT_MAJOR_PARAM.PRODUCT_ID, values);
    }

    /**
     * Fetch a unique record that has <code>product_id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam fetchOneByProductId(Integer value) {
        return fetchOne(TProductMajorParam.T_PRODUCT_MAJOR_PARAM.PRODUCT_ID, value);
    }

    /**
     * Fetch records that have <code>cpu_model IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam> fetchByCpuModel(String... values) {
        return fetch(TProductMajorParam.T_PRODUCT_MAJOR_PARAM.CPU_MODEL, values);
    }

    /**
     * Fetch records that have <code>cpu_model_standard IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam> fetchByCpuModelStandard(String... values) {
        return fetch(TProductMajorParam.T_PRODUCT_MAJOR_PARAM.CPU_MODEL_STANDARD, values);
    }

    /**
     * Fetch records that have <code>screen_size IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam> fetchByScreenSize(String... values) {
        return fetch(TProductMajorParam.T_PRODUCT_MAJOR_PARAM.SCREEN_SIZE, values);
    }

    /**
     * Fetch records that have <code>memory_capacity IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam> fetchByMemoryCapacity(String... values) {
        return fetch(TProductMajorParam.T_PRODUCT_MAJOR_PARAM.MEMORY_CAPACITY, values);
    }

    /**
     * Fetch records that have <code>disk_capacity IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam> fetchByDiskCapacity(String... values) {
        return fetch(TProductMajorParam.T_PRODUCT_MAJOR_PARAM.DISK_CAPACITY, values);
    }

    /**
     * Fetch records that have <code>disk_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam> fetchByDiskType(String... values) {
        return fetch(TProductMajorParam.T_PRODUCT_MAJOR_PARAM.DISK_TYPE, values);
    }

    /**
     * Fetch records that have <code>graphics_card_model IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam> fetchByGraphicsCardModel(String... values) {
        return fetch(TProductMajorParam.T_PRODUCT_MAJOR_PARAM.GRAPHICS_CARD_MODEL, values);
    }

    /**
     * Fetch records that have <code>graphics_card_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam> fetchByGraphicsCardType(String... values) {
        return fetch(TProductMajorParam.T_PRODUCT_MAJOR_PARAM.GRAPHICS_CARD_TYPE, values);
    }

    /**
     * Fetch records that have <code>graphics_card_capacity IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam> fetchByGraphicsCardCapacity(String... values) {
        return fetch(TProductMajorParam.T_PRODUCT_MAJOR_PARAM.GRAPHICS_CARD_CAPACITY, values);
    }

    /**
     * Fetch records that have <code>create_time IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam> fetchByCreateTime(Timestamp... values) {
        return fetch(TProductMajorParam.T_PRODUCT_MAJOR_PARAM.CREATE_TIME, values);
    }

    /**
     * Fetch records that have <code>modify_time IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductMajorParam> fetchByModifyTime(Timestamp... values) {
        return fetch(TProductMajorParam.T_PRODUCT_MAJOR_PARAM.MODIFY_TIME, values);
    }
}
