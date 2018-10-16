/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TSmsFilter;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TSmsFilterRecord;

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
public class TSmsFilterDao extends DAOImpl<TSmsFilterRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsFilter, Long> {

    /**
     * Create a new TSmsFilterDao without any configuration
     */
    public TSmsFilterDao() {
        super(TSmsFilter.T_SMS_FILTER, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsFilter.class);
    }

    /**
     * Create a new TSmsFilterDao with an attached configuration
     */
    public TSmsFilterDao(Configuration configuration) {
        super(TSmsFilter.T_SMS_FILTER, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsFilter.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsFilter object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsFilter> fetchById(Long... values) {
        return fetch(TSmsFilter.T_SMS_FILTER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsFilter fetchOneById(Long value) {
        return fetchOne(TSmsFilter.T_SMS_FILTER.ID, value);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsFilter> fetchByPhone(String... values) {
        return fetch(TSmsFilter.T_SMS_FILTER.PHONE, values);
    }

    /**
     * Fetch records that have <code>content IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsFilter> fetchByContent(String... values) {
        return fetch(TSmsFilter.T_SMS_FILTER.CONTENT, values);
    }

    /**
     * Fetch records that have <code>type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsFilter> fetchByTypeId(Byte... values) {
        return fetch(TSmsFilter.T_SMS_FILTER.TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>sys_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsFilter> fetchBySysType(Byte... values) {
        return fetch(TSmsFilter.T_SMS_FILTER.SYS_TYPE, values);
    }

    /**
     * Fetch records that have <code>biz_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsFilter> fetchByBizType(Byte... values) {
        return fetch(TSmsFilter.T_SMS_FILTER.BIZ_TYPE, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsFilter> fetchByCdate(Timestamp... values) {
        return fetch(TSmsFilter.T_SMS_FILTER.CDATE, values);
    }

    /**
     * Fetch records that have <code>reason IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TSmsFilter> fetchByReason(String... values) {
        return fetch(TSmsFilter.T_SMS_FILTER.REASON, values);
    }
}