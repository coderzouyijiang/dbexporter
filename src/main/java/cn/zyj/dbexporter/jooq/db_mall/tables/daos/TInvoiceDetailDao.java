/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TInvoiceDetail;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TInvoiceDetailRecord;

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
public class TInvoiceDetailDao extends DAOImpl<TInvoiceDetailRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail, Integer> {

    /**
     * Create a new TInvoiceDetailDao without any configuration
     */
    public TInvoiceDetailDao() {
        super(TInvoiceDetail.T_INVOICE_DETAIL, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail.class);
    }

    /**
     * Create a new TInvoiceDetailDao with an attached configuration
     */
    public TInvoiceDetailDao(Configuration configuration) {
        super(TInvoiceDetail.T_INVOICE_DETAIL, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail> fetchById(Integer... values) {
        return fetch(TInvoiceDetail.T_INVOICE_DETAIL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail fetchOneById(Integer value) {
        return fetchOne(TInvoiceDetail.T_INVOICE_DETAIL.ID, value);
    }

    /**
     * Fetch records that have <code>finance_invoice_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail> fetchByFinanceInvoiceId(Integer... values) {
        return fetch(TInvoiceDetail.T_INVOICE_DETAIL.FINANCE_INVOICE_ID, values);
    }

    /**
     * Fetch records that have <code>request_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail> fetchByRequestId(Integer... values) {
        return fetch(TInvoiceDetail.T_INVOICE_DETAIL.REQUEST_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail> fetchByStatus(Byte... values) {
        return fetch(TInvoiceDetail.T_INVOICE_DETAIL.STATUS, values);
    }

    /**
     * Fetch records that have <code>invoice_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail> fetchByInvoiceType(Byte... values) {
        return fetch(TInvoiceDetail.T_INVOICE_DETAIL.INVOICE_TYPE, values);
    }

    /**
     * Fetch records that have <code>amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail> fetchByAmount(BigDecimal... values) {
        return fetch(TInvoiceDetail.T_INVOICE_DETAIL.AMOUNT, values);
    }

    /**
     * Fetch records that have <code>exe_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail> fetchByExeStatus(Integer... values) {
        return fetch(TInvoiceDetail.T_INVOICE_DETAIL.EXE_STATUS, values);
    }

    /**
     * Fetch records that have <code>invoice_no IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail> fetchByInvoiceNo(String... values) {
        return fetch(TInvoiceDetail.T_INVOICE_DETAIL.INVOICE_NO, values);
    }

    /**
     * Fetch records that have <code>invoice_code IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail> fetchByInvoiceCode(String... values) {
        return fetch(TInvoiceDetail.T_INVOICE_DETAIL.INVOICE_CODE, values);
    }

    /**
     * Fetch records that have <code>invoice_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail> fetchByInvoiceDate(Timestamp... values) {
        return fetch(TInvoiceDetail.T_INVOICE_DETAIL.INVOICE_DATE, values);
    }

    /**
     * Fetch records that have <code>path IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail> fetchByPath(String... values) {
        return fetch(TInvoiceDetail.T_INVOICE_DETAIL.PATH, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail> fetchByCdate(Timestamp... values) {
        return fetch(TInvoiceDetail.T_INVOICE_DETAIL.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TInvoiceDetail> fetchByMdate(Timestamp... values) {
        return fetch(TInvoiceDetail.T_INVOICE_DETAIL.MDATE, values);
    }
}
