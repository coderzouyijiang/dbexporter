/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TRecycleApply;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TRecycleApplyRecord;

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
public class TRecycleApplyDao extends DAOImpl<TRecycleApplyRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply, Integer> {

    /**
     * Create a new TRecycleApplyDao without any configuration
     */
    public TRecycleApplyDao() {
        super(TRecycleApply.T_RECYCLE_APPLY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply.class);
    }

    /**
     * Create a new TRecycleApplyDao with an attached configuration
     */
    public TRecycleApplyDao(Configuration configuration) {
        super(TRecycleApply.T_RECYCLE_APPLY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchById(Integer... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply fetchOneById(Integer value) {
        return fetchOne(TRecycleApply.T_RECYCLE_APPLY.ID, value);
    }

    /**
     * Fetch records that have <code>company_name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchByCompanyName(String... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.COMPANY_NAME, values);
    }

    /**
     * Fetch records that have <code>contact IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchByContact(String... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.CONTACT, values);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchByPhone(String... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.PHONE, values);
    }

    /**
     * Fetch records that have <code>num IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchByNum(Integer... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.NUM, values);
    }

    /**
     * Fetch records that have <code>year IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchByYear(String... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.YEAR, values);
    }

    /**
     * Fetch records that have <code>category IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchByCategory(String... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.CATEGORY, values);
    }

    /**
     * Fetch records that have <code>brand IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchByBrand(String... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.BRAND, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchByStatus(Byte... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.STATUS, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchByCdate(Timestamp... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchByMdate(Timestamp... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.MDATE, values);
    }

    /**
     * Fetch records that have <code>remark IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchByRemark(String... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.REMARK, values);
    }

    /**
     * Fetch records that have <code>communicate_result IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchByCommunicateResult(String... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.COMMUNICATE_RESULT, values);
    }

    /**
     * Fetch records that have <code>customer_manager IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchByCustomerManager(String... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.CUSTOMER_MANAGER, values);
    }

    /**
     * Fetch records that have <code>operator IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchByOperator(String... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.OPERATOR, values);
    }

    /**
     * Fetch records that have <code>secCustomerManager IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleApply> fetchBySeccustomermanager(String... values) {
        return fetch(TRecycleApply.T_RECYCLE_APPLY.SECCUSTOMERMANAGER, values);
    }
}
