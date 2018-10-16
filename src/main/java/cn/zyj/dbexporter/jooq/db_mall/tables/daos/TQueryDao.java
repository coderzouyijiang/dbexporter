/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TQuery;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TQueryRecord;

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
public class TQueryDao extends DAOImpl<TQueryRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TQuery, Integer> {

    /**
     * Create a new TQueryDao without any configuration
     */
    public TQueryDao() {
        super(TQuery.T_QUERY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TQuery.class);
    }

    /**
     * Create a new TQueryDao with an attached configuration
     */
    public TQueryDao(Configuration configuration) {
        super(TQuery.T_QUERY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TQuery.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TQuery object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TQuery> fetchById(Integer... values) {
        return fetch(TQuery.T_QUERY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TQuery fetchOneById(Integer value) {
        return fetchOne(TQuery.T_QUERY.ID, value);
    }

    /**
     * Fetch records that have <code>query IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TQuery> fetchByQuery(String... values) {
        return fetch(TQuery.T_QUERY.QUERY, values);
    }

    /**
     * Fetch records that have <code>url IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TQuery> fetchByUrl(String... values) {
        return fetch(TQuery.T_QUERY.URL, values);
    }

    /**
     * Fetch records that have <code>oid IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TQuery> fetchByOid(Integer... values) {
        return fetch(TQuery.T_QUERY.OID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TQuery> fetchByStatus(Byte... values) {
        return fetch(TQuery.T_QUERY.STATUS, values);
    }

    /**
     * Fetch records that have <code>manager_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TQuery> fetchByManagerId(Integer... values) {
        return fetch(TQuery.T_QUERY.MANAGER_ID, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TQuery> fetchByCdate(Timestamp... values) {
        return fetch(TQuery.T_QUERY.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TQuery> fetchByMdate(Timestamp... values) {
        return fetch(TQuery.T_QUERY.MDATE, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TQuery> fetchByType(Integer... values) {
        return fetch(TQuery.T_QUERY.TYPE, values);
    }

    /**
     * Fetch records that have <code>target IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TQuery> fetchByTarget(Integer... values) {
        return fetch(TQuery.T_QUERY.TARGET, values);
    }
}