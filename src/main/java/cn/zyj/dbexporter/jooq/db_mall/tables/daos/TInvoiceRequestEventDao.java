/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TInvoiceRequestEvent;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TInvoiceRequestEventRecord;

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
public class TInvoiceRequestEventDao extends DAOImpl<TInvoiceRequestEventRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceRequestEvent, Integer> {

    /**
     * Create a new TInvoiceRequestEventDao without any configuration
     */
    public TInvoiceRequestEventDao() {
        super(TInvoiceRequestEvent.T_INVOICE_REQUEST_EVENT, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceRequestEvent.class);
    }

    /**
     * Create a new TInvoiceRequestEventDao with an attached configuration
     */
    public TInvoiceRequestEventDao(Configuration configuration) {
        super(TInvoiceRequestEvent.T_INVOICE_REQUEST_EVENT, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceRequestEvent.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceRequestEvent object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceRequestEvent> fetchById(Integer... values) {
        return fetch(TInvoiceRequestEvent.T_INVOICE_REQUEST_EVENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceRequestEvent fetchOneById(Integer value) {
        return fetchOne(TInvoiceRequestEvent.T_INVOICE_REQUEST_EVENT.ID, value);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceRequestEvent> fetchByCustomerId(Integer... values) {
        return fetch(TInvoiceRequestEvent.T_INVOICE_REQUEST_EVENT.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceRequestEvent> fetchByAmount(BigDecimal... values) {
        return fetch(TInvoiceRequestEvent.T_INVOICE_REQUEST_EVENT.AMOUNT, values);
    }

    /**
     * Fetch records that have <code>request_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceRequestEvent> fetchByRequestId(Long... values) {
        return fetch(TInvoiceRequestEvent.T_INVOICE_REQUEST_EVENT.REQUEST_ID, values);
    }

    /**
     * Fetch records that have <code>type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceRequestEvent> fetchByTypeId(Byte... values) {
        return fetch(TInvoiceRequestEvent.T_INVOICE_REQUEST_EVENT.TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>sync_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceRequestEvent> fetchBySyncStatus(Byte... values) {
        return fetch(TInvoiceRequestEvent.T_INVOICE_REQUEST_EVENT.SYNC_STATUS, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceRequestEvent> fetchByCdate(Timestamp... values) {
        return fetch(TInvoiceRequestEvent.T_INVOICE_REQUEST_EVENT.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceRequestEvent> fetchByMdate(Timestamp... values) {
        return fetch(TInvoiceRequestEvent.T_INVOICE_REQUEST_EVENT.MDATE, values);
    }
}
