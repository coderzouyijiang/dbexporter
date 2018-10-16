/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TAutoCutMoneyQueue;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TAutoCutMoneyQueueRecord;

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
public class TAutoCutMoneyQueueDao extends DAOImpl<TAutoCutMoneyQueueRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAutoCutMoneyQueue, Long> {

    /**
     * Create a new TAutoCutMoneyQueueDao without any configuration
     */
    public TAutoCutMoneyQueueDao() {
        super(TAutoCutMoneyQueue.T_AUTO_CUT_MONEY_QUEUE, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAutoCutMoneyQueue.class);
    }

    /**
     * Create a new TAutoCutMoneyQueueDao with an attached configuration
     */
    public TAutoCutMoneyQueueDao(Configuration configuration) {
        super(TAutoCutMoneyQueue.T_AUTO_CUT_MONEY_QUEUE, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAutoCutMoneyQueue.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAutoCutMoneyQueue object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAutoCutMoneyQueue> fetchById(Long... values) {
        return fetch(TAutoCutMoneyQueue.T_AUTO_CUT_MONEY_QUEUE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAutoCutMoneyQueue fetchOneById(Long value) {
        return fetchOne(TAutoCutMoneyQueue.T_AUTO_CUT_MONEY_QUEUE.ID, value);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAutoCutMoneyQueue> fetchByCustomerId(Integer... values) {
        return fetch(TAutoCutMoneyQueue.T_AUTO_CUT_MONEY_QUEUE.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAutoCutMoneyQueue> fetchByTypeId(Integer... values) {
        return fetch(TAutoCutMoneyQueue.T_AUTO_CUT_MONEY_QUEUE.TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>sync_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAutoCutMoneyQueue> fetchBySyncStatus(Byte... values) {
        return fetch(TAutoCutMoneyQueue.T_AUTO_CUT_MONEY_QUEUE.SYNC_STATUS, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAutoCutMoneyQueue> fetchByCdate(Timestamp... values) {
        return fetch(TAutoCutMoneyQueue.T_AUTO_CUT_MONEY_QUEUE.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAutoCutMoneyQueue> fetchByMdate(Timestamp... values) {
        return fetch(TAutoCutMoneyQueue.T_AUTO_CUT_MONEY_QUEUE.MDATE, values);
    }
}
