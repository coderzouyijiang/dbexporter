/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TProductKey;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TProductKeyRecord;

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
public class TProductKeyDao extends DAOImpl<TProductKeyRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey, Integer> {

    /**
     * Create a new TProductKeyDao without any configuration
     */
    public TProductKeyDao() {
        super(TProductKey.T_PRODUCT_KEY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey.class);
    }

    /**
     * Create a new TProductKeyDao with an attached configuration
     */
    public TProductKeyDao(Configuration configuration) {
        super(TProductKey.T_PRODUCT_KEY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey> fetchById(Integer... values) {
        return fetch(TProductKey.T_PRODUCT_KEY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey fetchOneById(Integer value) {
        return fetchOne(TProductKey.T_PRODUCT_KEY.ID, value);
    }

    /**
     * Fetch records that have <code>product_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey> fetchByProductId(Integer... values) {
        return fetch(TProductKey.T_PRODUCT_KEY.PRODUCT_ID, values);
    }

    /**
     * Fetch records that have <code>key_str IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey> fetchByKeyStr(String... values) {
        return fetch(TProductKey.T_PRODUCT_KEY.KEY_STR, values);
    }

    /**
     * Fetch records that have <code>check_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey> fetchByCheckStatus(Byte... values) {
        return fetch(TProductKey.T_PRODUCT_KEY.CHECK_STATUS, values);
    }

    /**
     * Fetch records that have <code>email_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey> fetchByEmailStatus(Byte... values) {
        return fetch(TProductKey.T_PRODUCT_KEY.EMAIL_STATUS, values);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey> fetchByTitle(String... values) {
        return fetch(TProductKey.T_PRODUCT_KEY.TITLE, values);
    }

    /**
     * Fetch records that have <code>deposit IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey> fetchByDeposit(BigDecimal... values) {
        return fetch(TProductKey.T_PRODUCT_KEY.DEPOSIT, values);
    }

    /**
     * Fetch records that have <code>credit_amount IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey> fetchByCreditAmount(BigDecimal... values) {
        return fetch(TProductKey.T_PRODUCT_KEY.CREDIT_AMOUNT, values);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey> fetchByPhone(String... values) {
        return fetch(TProductKey.T_PRODUCT_KEY.PHONE, values);
    }

    /**
     * Fetch records that have <code>stock IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey> fetchByStock(Integer... values) {
        return fetch(TProductKey.T_PRODUCT_KEY.STOCK, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey> fetchByCdate(Timestamp... values) {
        return fetch(TProductKey.T_PRODUCT_KEY.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductKey> fetchByMdate(Timestamp... values) {
        return fetch(TProductKey.T_PRODUCT_KEY.MDATE, values);
    }
}
