/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCronLog;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCronLogRecord;

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
public class TCronLogDao extends DAOImpl<TCronLogRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCronLog, Long> {

    /**
     * Create a new TCronLogDao without any configuration
     */
    public TCronLogDao() {
        super(TCronLog.T_CRON_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCronLog.class);
    }

    /**
     * Create a new TCronLogDao with an attached configuration
     */
    public TCronLogDao(Configuration configuration) {
        super(TCronLog.T_CRON_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCronLog.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCronLog object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCronLog> fetchById(Long... values) {
        return fetch(TCronLog.T_CRON_LOG.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCronLog fetchOneById(Long value) {
        return fetchOne(TCronLog.T_CRON_LOG.ID, value);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCronLog> fetchByContent(String... values) {
        return fetch(TCronLog.T_CRON_LOG.CONTENT, values);
    }

    /**
     * Fetch records that have <code>sync_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCronLog> fetchBySyncStatus(Byte... values) {
        return fetch(TCronLog.T_CRON_LOG.SYNC_STATUS, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCronLog> fetchByCdate(Timestamp... values) {
        return fetch(TCronLog.T_CRON_LOG.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCronLog> fetchByMdate(Timestamp... values) {
        return fetch(TCronLog.T_CRON_LOG.MDATE, values);
    }
}
