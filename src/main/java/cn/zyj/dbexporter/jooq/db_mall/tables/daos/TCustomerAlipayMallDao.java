/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCustomerAlipayMall;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCustomerAlipayMallRecord;

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
public class TCustomerAlipayMallDao extends DAOImpl<TCustomerAlipayMallRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerAlipayMall, Integer> {

    /**
     * Create a new TCustomerAlipayMallDao without any configuration
     */
    public TCustomerAlipayMallDao() {
        super(TCustomerAlipayMall.T_CUSTOMER_ALIPAY_MALL, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerAlipayMall.class);
    }

    /**
     * Create a new TCustomerAlipayMallDao with an attached configuration
     */
    public TCustomerAlipayMallDao(Configuration configuration) {
        super(TCustomerAlipayMall.T_CUSTOMER_ALIPAY_MALL, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerAlipayMall.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerAlipayMall object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerAlipayMall> fetchById(Integer... values) {
        return fetch(TCustomerAlipayMall.T_CUSTOMER_ALIPAY_MALL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerAlipayMall fetchOneById(Integer value) {
        return fetchOne(TCustomerAlipayMall.T_CUSTOMER_ALIPAY_MALL.ID, value);
    }

    /**
     * Fetch records that have <code>user_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerAlipayMall> fetchByUserId(Long... values) {
        return fetch(TCustomerAlipayMall.T_CUSTOMER_ALIPAY_MALL.USER_ID, values);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerAlipayMall> fetchByCustomerId(Integer... values) {
        return fetch(TCustomerAlipayMall.T_CUSTOMER_ALIPAY_MALL.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerAlipayMall> fetchByStatus(String... values) {
        return fetch(TCustomerAlipayMall.T_CUSTOMER_ALIPAY_MALL.STATUS, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerAlipayMall> fetchByCdate(Timestamp... values) {
        return fetch(TCustomerAlipayMall.T_CUSTOMER_ALIPAY_MALL.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerAlipayMall> fetchByMdate(Timestamp... values) {
        return fetch(TCustomerAlipayMall.T_CUSTOMER_ALIPAY_MALL.MDATE, values);
    }
}
