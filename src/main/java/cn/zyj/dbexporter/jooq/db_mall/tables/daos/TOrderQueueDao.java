/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TOrderQueue;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TOrderQueueRecord;

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
public class TOrderQueueDao extends DAOImpl<TOrderQueueRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue, Long> {

    /**
     * Create a new TOrderQueueDao without any configuration
     */
    public TOrderQueueDao() {
        super(TOrderQueue.T_ORDER_QUEUE, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue.class);
    }

    /**
     * Create a new TOrderQueueDao with an attached configuration
     */
    public TOrderQueueDao(Configuration configuration) {
        super(TOrderQueue.T_ORDER_QUEUE, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue> fetchById(Long... values) {
        return fetch(TOrderQueue.T_ORDER_QUEUE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue fetchOneById(Long value) {
        return fetchOne(TOrderQueue.T_ORDER_QUEUE.ID, value);
    }

    /**
     * Fetch records that have <code>erp_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue> fetchByErpId(Long... values) {
        return fetch(TOrderQueue.T_ORDER_QUEUE.ERP_ID, values);
    }

    /**
     * Fetch records that have <code>order_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue> fetchByOrderId(String... values) {
        return fetch(TOrderQueue.T_ORDER_QUEUE.ORDER_ID, values);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue> fetchByCustomerId(Integer... values) {
        return fetch(TOrderQueue.T_ORDER_QUEUE.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue> fetchByTypeId(Integer... values) {
        return fetch(TOrderQueue.T_ORDER_QUEUE.TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>oper IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue> fetchByOper(String... values) {
        return fetch(TOrderQueue.T_ORDER_QUEUE.OPER, values);
    }

    /**
     * Fetch records that have <code>op_time IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue> fetchByOpTime(Timestamp... values) {
        return fetch(TOrderQueue.T_ORDER_QUEUE.OP_TIME, values);
    }

    /**
     * Fetch records that have <code>message IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue> fetchByMessage(String... values) {
        return fetch(TOrderQueue.T_ORDER_QUEUE.MESSAGE, values);
    }

    /**
     * Fetch records that have <code>values IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue> fetchByValues(String... values) {
        return fetch(TOrderQueue.T_ORDER_QUEUE.VALUES, values);
    }

    /**
     * Fetch records that have <code>sync_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue> fetchBySyncStatus(Byte... values) {
        return fetch(TOrderQueue.T_ORDER_QUEUE.SYNC_STATUS, values);
    }

    /**
     * Fetch records that have <code>sync_crm_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue> fetchBySyncCrmStatus(Byte... values) {
        return fetch(TOrderQueue.T_ORDER_QUEUE.SYNC_CRM_STATUS, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue> fetchByCdate(Timestamp... values) {
        return fetch(TOrderQueue.T_ORDER_QUEUE.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderQueue> fetchByMdate(Timestamp... values) {
        return fetch(TOrderQueue.T_ORDER_QUEUE.MDATE, values);
    }
}
