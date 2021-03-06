/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCustomerToSaasLog;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCustomerToSaasLogRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 客户跳转至saas日志记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCustomerToSaasLogDao extends DAOImpl<TCustomerToSaasLogRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerToSaasLog, Integer> {

    /**
     * Create a new TCustomerToSaasLogDao without any configuration
     */
    public TCustomerToSaasLogDao() {
        super(TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerToSaasLog.class);
    }

    /**
     * Create a new TCustomerToSaasLogDao with an attached configuration
     */
    public TCustomerToSaasLogDao(Configuration configuration) {
        super(TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerToSaasLog.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerToSaasLog object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerToSaasLog> fetchById(Integer... values) {
        return fetch(TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerToSaasLog fetchOneById(Integer value) {
        return fetchOne(TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG.ID, value);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerToSaasLog> fetchByCustomerId(Integer... values) {
        return fetch(TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>company_name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerToSaasLog> fetchByCompanyName(String... values) {
        return fetch(TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG.COMPANY_NAME, values);
    }

    /**
     * Fetch records that have <code>day_time IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerToSaasLog> fetchByDayTime(Integer... values) {
        return fetch(TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG.DAY_TIME, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerToSaasLog> fetchByCdate(Timestamp... values) {
        return fetch(TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerToSaasLog> fetchByMdate(Timestamp... values) {
        return fetch(TCustomerToSaasLog.T_CUSTOMER_TO_SAAS_LOG.MDATE, values);
    }
}
