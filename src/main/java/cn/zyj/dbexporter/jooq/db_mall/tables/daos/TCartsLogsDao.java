/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCartsLogs;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCartsLogsRecord;

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
public class TCartsLogsDao extends DAOImpl<TCartsLogsRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs, Long> {

    /**
     * Create a new TCartsLogsDao without any configuration
     */
    public TCartsLogsDao() {
        super(TCartsLogs.T_CARTS_LOGS, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs.class);
    }

    /**
     * Create a new TCartsLogsDao with an attached configuration
     */
    public TCartsLogsDao(Configuration configuration) {
        super(TCartsLogs.T_CARTS_LOGS, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchById(Long... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs fetchOneById(Long value) {
        return fetchOne(TCartsLogs.T_CARTS_LOGS.ID, value);
    }

    /**
     * Fetch records that have <code>product_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByProductId(Integer... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.PRODUCT_ID, values);
    }

    /**
     * Fetch records that have <code>num IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByNum(Integer... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.NUM, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByStatus(Byte... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.STATUS, values);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByCustomerId(Integer... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>rent_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByRentType(Integer... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.RENT_TYPE, values);
    }

    /**
     * Fetch records that have <code>start_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByStartDate(Integer... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.START_DATE, values);
    }

    /**
     * Fetch records that have <code>month IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByMonth(Integer... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.MONTH, values);
    }

    /**
     * Fetch records that have <code>is_sale IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByIsSale(Byte... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.IS_SALE, values);
    }

    /**
     * Fetch records that have <code>insurance_type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByInsuranceTypeId(Byte... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.INSURANCE_TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>ip IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByIp(Long... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.IP, values);
    }

    /**
     * Fetch records that have <code>user_agent IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByUserAgent(String... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.USER_AGENT, values);
    }

    /**
     * Fetch records that have <code>source IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchBySource(Byte... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.SOURCE, values);
    }

    /**
     * Fetch records that have <code>is_checked IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByIsChecked(Byte... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.IS_CHECKED, values);
    }

    /**
     * Fetch records that have <code>service_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByServiceId(Integer... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.SERVICE_ID, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByCdate(Timestamp... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByMdate(Timestamp... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.MDATE, values);
    }

    /**
     * Fetch records that have <code>rent_type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCartsLogs> fetchByRentTypeId(Integer... values) {
        return fetch(TCartsLogs.T_CARTS_LOGS.RENT_TYPE_ID, values);
    }
}
