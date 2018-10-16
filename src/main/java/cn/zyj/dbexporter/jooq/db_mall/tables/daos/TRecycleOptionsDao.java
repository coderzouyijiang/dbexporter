/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TRecycleOptions;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TRecycleOptionsRecord;

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
public class TRecycleOptionsDao extends DAOImpl<TRecycleOptionsRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleOptions, Integer> {

    /**
     * Create a new TRecycleOptionsDao without any configuration
     */
    public TRecycleOptionsDao() {
        super(TRecycleOptions.T_RECYCLE_OPTIONS, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleOptions.class);
    }

    /**
     * Create a new TRecycleOptionsDao with an attached configuration
     */
    public TRecycleOptionsDao(Configuration configuration) {
        super(TRecycleOptions.T_RECYCLE_OPTIONS, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleOptions.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleOptions object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleOptions> fetchById(Integer... values) {
        return fetch(TRecycleOptions.T_RECYCLE_OPTIONS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleOptions fetchOneById(Integer value) {
        return fetchOne(TRecycleOptions.T_RECYCLE_OPTIONS.ID, value);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleOptions> fetchByType(Byte... values) {
        return fetch(TRecycleOptions.T_RECYCLE_OPTIONS.TYPE, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleOptions> fetchByName(String... values) {
        return fetch(TRecycleOptions.T_RECYCLE_OPTIONS.NAME, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleOptions> fetchByCdate(Timestamp... values) {
        return fetch(TRecycleOptions.T_RECYCLE_OPTIONS.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TRecycleOptions> fetchByMdate(Timestamp... values) {
        return fetch(TRecycleOptions.T_RECYCLE_OPTIONS.MDATE, values);
    }
}
