/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCustomerBalanceDateLog;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCustomerBalanceDateLogRecord;

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
public class TCustomerBalanceDateLogDao extends DAOImpl<TCustomerBalanceDateLogRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerBalanceDateLog, Long> {

    /**
     * Create a new TCustomerBalanceDateLogDao without any configuration
     */
    public TCustomerBalanceDateLogDao() {
        super(TCustomerBalanceDateLog.T_CUSTOMER_BALANCE_DATE_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerBalanceDateLog.class);
    }

    /**
     * Create a new TCustomerBalanceDateLogDao with an attached configuration
     */
    public TCustomerBalanceDateLogDao(Configuration configuration) {
        super(TCustomerBalanceDateLog.T_CUSTOMER_BALANCE_DATE_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerBalanceDateLog.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerBalanceDateLog object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerBalanceDateLog> fetchById(Long... values) {
        return fetch(TCustomerBalanceDateLog.T_CUSTOMER_BALANCE_DATE_LOG.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerBalanceDateLog fetchOneById(Long value) {
        return fetchOne(TCustomerBalanceDateLog.T_CUSTOMER_BALANCE_DATE_LOG.ID, value);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerBalanceDateLog> fetchByCustomerId(Long... values) {
        return fetch(TCustomerBalanceDateLog.T_CUSTOMER_BALANCE_DATE_LOG.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>now_balance_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerBalanceDateLog> fetchByNowBalanceDate(Integer... values) {
        return fetch(TCustomerBalanceDateLog.T_CUSTOMER_BALANCE_DATE_LOG.NOW_BALANCE_DATE, values);
    }

    /**
     * Fetch records that have <code>expect_balance_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerBalanceDateLog> fetchByExpectBalanceDate(Integer... values) {
        return fetch(TCustomerBalanceDateLog.T_CUSTOMER_BALANCE_DATE_LOG.EXPECT_BALANCE_DATE, values);
    }

    /**
     * Fetch records that have <code>effect_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerBalanceDateLog> fetchByEffectDate(Integer... values) {
        return fetch(TCustomerBalanceDateLog.T_CUSTOMER_BALANCE_DATE_LOG.EFFECT_DATE, values);
    }

    /**
     * Fetch records that have <code>is_effect IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerBalanceDateLog> fetchByIsEffect(Integer... values) {
        return fetch(TCustomerBalanceDateLog.T_CUSTOMER_BALANCE_DATE_LOG.IS_EFFECT, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerBalanceDateLog> fetchByMdate(Timestamp... values) {
        return fetch(TCustomerBalanceDateLog.T_CUSTOMER_BALANCE_DATE_LOG.MDATE, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerBalanceDateLog> fetchByCdate(Timestamp... values) {
        return fetch(TCustomerBalanceDateLog.T_CUSTOMER_BALANCE_DATE_LOG.CDATE, values);
    }
}
