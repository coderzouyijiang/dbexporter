/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TProductCheck;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TProductCheckRecord;

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
public class TProductCheckDao extends DAOImpl<TProductCheckRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCheck, Integer> {

    /**
     * Create a new TProductCheckDao without any configuration
     */
    public TProductCheckDao() {
        super(TProductCheck.T_PRODUCT_CHECK, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCheck.class);
    }

    /**
     * Create a new TProductCheckDao with an attached configuration
     */
    public TProductCheckDao(Configuration configuration) {
        super(TProductCheck.T_PRODUCT_CHECK, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCheck.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCheck object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCheck> fetchById(Integer... values) {
        return fetch(TProductCheck.T_PRODUCT_CHECK.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCheck fetchOneById(Integer value) {
        return fetchOne(TProductCheck.T_PRODUCT_CHECK.ID, value);
    }

    /**
     * Fetch records that have <code>product_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCheck> fetchByProductId(Integer... values) {
        return fetch(TProductCheck.T_PRODUCT_CHECK.PRODUCT_ID, values);
    }

    /**
     * Fetch records that have <code>manager_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCheck> fetchByManagerId(Integer... values) {
        return fetch(TProductCheck.T_PRODUCT_CHECK.MANAGER_ID, values);
    }

    /**
     * Fetch records that have <code>check_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCheck> fetchByCheckStatus(Byte... values) {
        return fetch(TProductCheck.T_PRODUCT_CHECK.CHECK_STATUS, values);
    }

    /**
     * Fetch records that have <code>check_remark IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCheck> fetchByCheckRemark(String... values) {
        return fetch(TProductCheck.T_PRODUCT_CHECK.CHECK_REMARK, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCheck> fetchByCdate(Timestamp... values) {
        return fetch(TProductCheck.T_PRODUCT_CHECK.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TProductCheck> fetchByMdate(Timestamp... values) {
        return fetch(TProductCheck.T_PRODUCT_CHECK.MDATE, values);
    }
}
