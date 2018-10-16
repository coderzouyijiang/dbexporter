/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TBcity;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TBcityRecord;

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
public class TBcityDao extends DAOImpl<TBcityRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBcity, Integer> {

    /**
     * Create a new TBcityDao without any configuration
     */
    public TBcityDao() {
        super(TBcity.T_BCITY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBcity.class);
    }

    /**
     * Create a new TBcityDao with an attached configuration
     */
    public TBcityDao(Configuration configuration) {
        super(TBcity.T_BCITY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBcity.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBcity object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBcity> fetchById(Integer... values) {
        return fetch(TBcity.T_BCITY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBcity fetchOneById(Integer value) {
        return fetchOne(TBcity.T_BCITY.ID, value);
    }

    /**
     * Fetch records that have <code>bcity_code IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBcity> fetchByBcityCode(String... values) {
        return fetch(TBcity.T_BCITY.BCITY_CODE, values);
    }

    /**
     * Fetch records that have <code>pid IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBcity> fetchByPid(Integer... values) {
        return fetch(TBcity.T_BCITY.PID, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBcity> fetchByName(String... values) {
        return fetch(TBcity.T_BCITY.NAME, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBcity> fetchByCdate(Timestamp... values) {
        return fetch(TBcity.T_BCITY.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBcity> fetchByMdate(Timestamp... values) {
        return fetch(TBcity.T_BCITY.MDATE, values);
    }
}
