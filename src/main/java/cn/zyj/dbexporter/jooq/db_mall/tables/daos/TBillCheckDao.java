/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TBillCheck;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TBillCheckRecord;

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
public class TBillCheckDao extends DAOImpl<TBillCheckRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheck, Integer> {

    /**
     * Create a new TBillCheckDao without any configuration
     */
    public TBillCheckDao() {
        super(TBillCheck.T_BILL_CHECK, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheck.class);
    }

    /**
     * Create a new TBillCheckDao with an attached configuration
     */
    public TBillCheckDao(Configuration configuration) {
        super(TBillCheck.T_BILL_CHECK, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheck.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheck object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheck> fetchById(Integer... values) {
        return fetch(TBillCheck.T_BILL_CHECK.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheck fetchOneById(Integer value) {
        return fetchOne(TBillCheck.T_BILL_CHECK.ID, value);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheck> fetchByCustomerId(Long... values) {
        return fetch(TBillCheck.T_BILL_CHECK.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheck> fetchByPhone(String... values) {
        return fetch(TBillCheck.T_BILL_CHECK.PHONE, values);
    }

    /**
     * Fetch records that have <code>month IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheck> fetchByMonth(String... values) {
        return fetch(TBillCheck.T_BILL_CHECK.MONTH, values);
    }

    /**
     * Fetch records that have <code>pay_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheck> fetchByPayType(Byte... values) {
        return fetch(TBillCheck.T_BILL_CHECK.PAY_TYPE, values);
    }

    /**
     * Fetch records that have <code>band_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheck> fetchByBandId(Integer... values) {
        return fetch(TBillCheck.T_BILL_CHECK.BAND_ID, values);
    }

    /**
     * Fetch records that have <code>pay_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheck> fetchByPayStatus(Byte... values) {
        return fetch(TBillCheck.T_BILL_CHECK.PAY_STATUS, values);
    }

    /**
     * Fetch records that have <code>is_expire IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheck> fetchByIsExpire(Byte... values) {
        return fetch(TBillCheck.T_BILL_CHECK.IS_EXPIRE, values);
    }

    /**
     * Fetch records that have <code>timestamp IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheck> fetchByTimestamp(Long... values) {
        return fetch(TBillCheck.T_BILL_CHECK.TIMESTAMP, values);
    }

    /**
     * Fetch records that have <code>not_equal IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheck> fetchByNotEqual(Byte... values) {
        return fetch(TBillCheck.T_BILL_CHECK.NOT_EQUAL, values);
    }
}
