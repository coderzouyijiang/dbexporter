/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TAnnualReview;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TAnnualReviewRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 易点租2017年度数据查询记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAnnualReviewDao extends DAOImpl<TAnnualReviewRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAnnualReview, Integer> {

    /**
     * Create a new TAnnualReviewDao without any configuration
     */
    public TAnnualReviewDao() {
        super(TAnnualReview.T_ANNUAL_REVIEW, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAnnualReview.class);
    }

    /**
     * Create a new TAnnualReviewDao with an attached configuration
     */
    public TAnnualReviewDao(Configuration configuration) {
        super(TAnnualReview.T_ANNUAL_REVIEW, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAnnualReview.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAnnualReview object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAnnualReview> fetchById(Integer... values) {
        return fetch(TAnnualReview.T_ANNUAL_REVIEW.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAnnualReview fetchOneById(Integer value) {
        return fetchOne(TAnnualReview.T_ANNUAL_REVIEW.ID, value);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAnnualReview> fetchByPhone(String... values) {
        return fetch(TAnnualReview.T_ANNUAL_REVIEW.PHONE, values);
    }

    /**
     * Fetch records that have <code>company_name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAnnualReview> fetchByCompanyName(String... values) {
        return fetch(TAnnualReview.T_ANNUAL_REVIEW.COMPANY_NAME, values);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAnnualReview> fetchByCustomerId(Integer... values) {
        return fetch(TAnnualReview.T_ANNUAL_REVIEW.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>ip IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAnnualReview> fetchByIp(String... values) {
        return fetch(TAnnualReview.T_ANNUAL_REVIEW.IP, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAnnualReview> fetchByCdate(Timestamp... values) {
        return fetch(TAnnualReview.T_ANNUAL_REVIEW.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAnnualReview> fetchByMdate(Timestamp... values) {
        return fetch(TAnnualReview.T_ANNUAL_REVIEW.MDATE, values);
    }
}
