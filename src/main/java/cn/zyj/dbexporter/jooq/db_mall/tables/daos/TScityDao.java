/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TScity;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TScityRecord;

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
public class TScityDao extends DAOImpl<TScityRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TScity, Integer> {

    /**
     * Create a new TScityDao without any configuration
     */
    public TScityDao() {
        super(TScity.T_SCITY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TScity.class);
    }

    /**
     * Create a new TScityDao with an attached configuration
     */
    public TScityDao(Configuration configuration) {
        super(TScity.T_SCITY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TScity.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TScity object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TScity> fetchById(Integer... values) {
        return fetch(TScity.T_SCITY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TScity fetchOneById(Integer value) {
        return fetchOne(TScity.T_SCITY.ID, value);
    }

    /**
     * Fetch records that have <code>scity_code IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TScity> fetchByScityCode(String... values) {
        return fetch(TScity.T_SCITY.SCITY_CODE, values);
    }

    /**
     * Fetch records that have <code>pid IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TScity> fetchByPid(Integer... values) {
        return fetch(TScity.T_SCITY.PID, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TScity> fetchByName(String... values) {
        return fetch(TScity.T_SCITY.NAME, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TScity> fetchByCdate(Timestamp... values) {
        return fetch(TScity.T_SCITY.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TScity> fetchByMdate(Timestamp... values) {
        return fetch(TScity.T_SCITY.MDATE, values);
    }
}
