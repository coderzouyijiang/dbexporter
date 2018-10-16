/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TProductRentTypeDetail;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TProductRentTypeDetailRecord;

import java.math.BigDecimal;
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
public class TProductRentTypeDetailDao extends DAOImpl<TProductRentTypeDetailRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail, Integer> {

    /**
     * Create a new TProductRentTypeDetailDao without any configuration
     */
    public TProductRentTypeDetailDao() {
        super(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail.class);
    }

    /**
     * Create a new TProductRentTypeDetailDao with an attached configuration
     */
    public TProductRentTypeDetailDao(Configuration configuration) {
        super(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail> fetchById(Integer... values) {
        return fetch(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail fetchOneById(Integer value) {
        return fetchOne(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.ID, value);
    }

    /**
     * Fetch records that have <code>rent_type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail> fetchByRentTypeId(Integer... values) {
        return fetch(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.RENT_TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>start_month IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail> fetchByStartMonth(Short... values) {
        return fetch(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.START_MONTH, values);
    }

    /**
     * Fetch records that have <code>end_month IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail> fetchByEndMonth(Short... values) {
        return fetch(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.END_MONTH, values);
    }

    /**
     * Fetch records that have <code>rent_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail> fetchByRentType(Byte... values) {
        return fetch(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.RENT_TYPE, values);
    }

    /**
     * Fetch records that have <code>rent IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail> fetchByRent(BigDecimal... values) {
        return fetch(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.RENT, values);
    }

    /**
     * Fetch records that have <code>pay_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail> fetchByPayType(Byte... values) {
        return fetch(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.PAY_TYPE, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail> fetchByStatus(Byte... values) {
        return fetch(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.STATUS, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail> fetchByCdate(Timestamp... values) {
        return fetch(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail> fetchByMdate(Timestamp... values) {
        return fetch(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.MDATE, values);
    }

    /**
     * Fetch records that have <code>condition IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail> fetchByCondition(Byte... values) {
        return fetch(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.CONDITION, values);
    }

    /**
     * Fetch records that have <code>service_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail> fetchByServiceId(String... values) {
        return fetch(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.SERVICE_ID, values);
    }

    /**
     * Fetch records that have <code>sku_info IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductRentTypeDetail> fetchBySkuInfo(String... values) {
        return fetch(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.SKU_INFO, values);
    }
}
