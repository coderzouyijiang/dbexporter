/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCarts;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCartsRecord;

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
public class TCartsDao extends DAOImpl<TCartsRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts, Long> {

    /**
     * Create a new TCartsDao without any configuration
     */
    public TCartsDao() {
        super(TCarts.T_CARTS, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts.class);
    }

    /**
     * Create a new TCartsDao with an attached configuration
     */
    public TCartsDao(Configuration configuration) {
        super(TCarts.T_CARTS, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchById(Long... values) {
        return fetch(TCarts.T_CARTS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts fetchOneById(Long value) {
        return fetchOne(TCarts.T_CARTS.ID, value);
    }

    /**
     * Fetch records that have <code>product_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByProductId(Integer... values) {
        return fetch(TCarts.T_CARTS.PRODUCT_ID, values);
    }

    /**
     * Fetch records that have <code>num IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByNum(Integer... values) {
        return fetch(TCarts.T_CARTS.NUM, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByStatus(Byte... values) {
        return fetch(TCarts.T_CARTS.STATUS, values);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByCustomerId(Integer... values) {
        return fetch(TCarts.T_CARTS.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>rent_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByRentType(Integer... values) {
        return fetch(TCarts.T_CARTS.RENT_TYPE, values);
    }

    /**
     * Fetch records that have <code>start_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByStartDate(Integer... values) {
        return fetch(TCarts.T_CARTS.START_DATE, values);
    }

    /**
     * Fetch records that have <code>month IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByMonth(Integer... values) {
        return fetch(TCarts.T_CARTS.MONTH, values);
    }

    /**
     * Fetch records that have <code>is_sale IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByIsSale(Byte... values) {
        return fetch(TCarts.T_CARTS.IS_SALE, values);
    }

    /**
     * Fetch records that have <code>insurance_type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByInsuranceTypeId(Byte... values) {
        return fetch(TCarts.T_CARTS.INSURANCE_TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>added_service_type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByAddedServiceTypeId(Byte... values) {
        return fetch(TCarts.T_CARTS.ADDED_SERVICE_TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>soft_service_type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchBySoftServiceTypeId(Byte... values) {
        return fetch(TCarts.T_CARTS.SOFT_SERVICE_TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>onsite_service_type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByOnsiteServiceTypeId(Byte... values) {
        return fetch(TCarts.T_CARTS.ONSITE_SERVICE_TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>suits_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchBySuitsType(Integer... values) {
        return fetch(TCarts.T_CARTS.SUITS_TYPE, values);
    }

    /**
     * Fetch records that have <code>is_checked IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByIsChecked(Byte... values) {
        return fetch(TCarts.T_CARTS.IS_CHECKED, values);
    }

    /**
     * Fetch records that have <code>service_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByServiceId(Byte... values) {
        return fetch(TCarts.T_CARTS.SERVICE_ID, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByCdate(Timestamp... values) {
        return fetch(TCarts.T_CARTS.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByMdate(Timestamp... values) {
        return fetch(TCarts.T_CARTS.MDATE, values);
    }

    /**
     * Fetch records that have <code>rent_type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByRentTypeId(Integer... values) {
        return fetch(TCarts.T_CARTS.RENT_TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>pay_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCarts> fetchByPayType(Byte... values) {
        return fetch(TCarts.T_CARTS.PAY_TYPE, values);
    }
}
