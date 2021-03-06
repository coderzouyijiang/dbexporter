/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCrmOrderErrorLog;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCrmOrderErrorLogRecord;

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
public class TCrmOrderErrorLogDao extends DAOImpl<TCrmOrderErrorLogRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCrmOrderErrorLog, Integer> {

    /**
     * Create a new TCrmOrderErrorLogDao without any configuration
     */
    public TCrmOrderErrorLogDao() {
        super(TCrmOrderErrorLog.T_CRM_ORDER_ERROR_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCrmOrderErrorLog.class);
    }

    /**
     * Create a new TCrmOrderErrorLogDao with an attached configuration
     */
    public TCrmOrderErrorLogDao(Configuration configuration) {
        super(TCrmOrderErrorLog.T_CRM_ORDER_ERROR_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCrmOrderErrorLog.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCrmOrderErrorLog object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCrmOrderErrorLog> fetchById(Integer... values) {
        return fetch(TCrmOrderErrorLog.T_CRM_ORDER_ERROR_LOG.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCrmOrderErrorLog fetchOneById(Integer value) {
        return fetchOne(TCrmOrderErrorLog.T_CRM_ORDER_ERROR_LOG.ID, value);
    }

    /**
     * Fetch records that have <code>parameter IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCrmOrderErrorLog> fetchByParameter(String... values) {
        return fetch(TCrmOrderErrorLog.T_CRM_ORDER_ERROR_LOG.PARAMETER, values);
    }

    /**
     * Fetch records that have <code>result IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCrmOrderErrorLog> fetchByResult(String... values) {
        return fetch(TCrmOrderErrorLog.T_CRM_ORDER_ERROR_LOG.RESULT, values);
    }

    /**
     * Fetch records that have <code>node_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCrmOrderErrorLog> fetchByNodeId(Integer... values) {
        return fetch(TCrmOrderErrorLog.T_CRM_ORDER_ERROR_LOG.NODE_ID, values);
    }
}
