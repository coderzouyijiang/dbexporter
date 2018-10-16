/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TOrderBillChangeLog;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TOrderBillChangeLogRecord;

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
public class TOrderBillChangeLogDao extends DAOImpl<TOrderBillChangeLogRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBillChangeLog, Long> {

    /**
     * Create a new TOrderBillChangeLogDao without any configuration
     */
    public TOrderBillChangeLogDao() {
        super(TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBillChangeLog.class);
    }

    /**
     * Create a new TOrderBillChangeLogDao with an attached configuration
     */
    public TOrderBillChangeLogDao(Configuration configuration) {
        super(TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBillChangeLog.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBillChangeLog object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBillChangeLog> fetchById(Long... values) {
        return fetch(TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBillChangeLog fetchOneById(Long value) {
        return fetchOne(TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG.ID, value);
    }

    /**
     * Fetch records that have <code>bill_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBillChangeLog> fetchByBillId(Long... values) {
        return fetch(TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG.BILL_ID, values);
    }

    /**
     * Fetch records that have <code>old_amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBillChangeLog> fetchByOldAmount(BigDecimal... values) {
        return fetch(TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG.OLD_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>new_amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBillChangeLog> fetchByNewAmount(BigDecimal... values) {
        return fetch(TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG.NEW_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>reason IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBillChangeLog> fetchByReason(Byte... values) {
        return fetch(TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG.REASON, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBillChangeLog> fetchByCdate(Timestamp... values) {
        return fetch(TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderBillChangeLog> fetchByMdate(Timestamp... values) {
        return fetch(TOrderBillChangeLog.T_ORDER_BILL_CHANGE_LOG.MDATE, values);
    }
}
