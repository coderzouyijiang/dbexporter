/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TMacBindLog;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TMacBindLogRecord;

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
public class TMacBindLogDao extends DAOImpl<TMacBindLogRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TMacBindLog, Integer> {

    /**
     * Create a new TMacBindLogDao without any configuration
     */
    public TMacBindLogDao() {
        super(TMacBindLog.T_MAC_BIND_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TMacBindLog.class);
    }

    /**
     * Create a new TMacBindLogDao with an attached configuration
     */
    public TMacBindLogDao(Configuration configuration) {
        super(TMacBindLog.T_MAC_BIND_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TMacBindLog.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TMacBindLog object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TMacBindLog> fetchById(Integer... values) {
        return fetch(TMacBindLog.T_MAC_BIND_LOG.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TMacBindLog fetchOneById(Integer value) {
        return fetchOne(TMacBindLog.T_MAC_BIND_LOG.ID, value);
    }

    /**
     * Fetch records that have <code>device_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TMacBindLog> fetchByDeviceId(String... values) {
        return fetch(TMacBindLog.T_MAC_BIND_LOG.DEVICE_ID, values);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TMacBindLog> fetchByPhone(String... values) {
        return fetch(TMacBindLog.T_MAC_BIND_LOG.PHONE, values);
    }

    /**
     * Fetch records that have <code>secret_key IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TMacBindLog> fetchBySecretKey(String... values) {
        return fetch(TMacBindLog.T_MAC_BIND_LOG.SECRET_KEY, values);
    }

    /**
     * Fetch records that have <code>rate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TMacBindLog> fetchByRate(String... values) {
        return fetch(TMacBindLog.T_MAC_BIND_LOG.RATE, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TMacBindLog> fetchByCdate(Timestamp... values) {
        return fetch(TMacBindLog.T_MAC_BIND_LOG.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TMacBindLog> fetchByMdate(Timestamp... values) {
        return fetch(TMacBindLog.T_MAC_BIND_LOG.MDATE, values);
    }
}
