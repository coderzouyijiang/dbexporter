/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TIndexFloor;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TIndexFloorRecord;

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
public class TIndexFloorDao extends DAOImpl<TIndexFloorRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexFloor, Integer> {

    /**
     * Create a new TIndexFloorDao without any configuration
     */
    public TIndexFloorDao() {
        super(TIndexFloor.T_INDEX_FLOOR, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexFloor.class);
    }

    /**
     * Create a new TIndexFloorDao with an attached configuration
     */
    public TIndexFloorDao(Configuration configuration) {
        super(TIndexFloor.T_INDEX_FLOOR, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexFloor.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexFloor object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexFloor> fetchById(Integer... values) {
        return fetch(TIndexFloor.T_INDEX_FLOOR.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexFloor fetchOneById(Integer value) {
        return fetchOne(TIndexFloor.T_INDEX_FLOOR.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexFloor> fetchByName(String... values) {
        return fetch(TIndexFloor.T_INDEX_FLOOR.NAME, values);
    }

    /**
     * Fetch records that have <code>oid IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexFloor> fetchByOid(Integer... values) {
        return fetch(TIndexFloor.T_INDEX_FLOOR.OID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexFloor> fetchByStatus(Byte... values) {
        return fetch(TIndexFloor.T_INDEX_FLOOR.STATUS, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexFloor> fetchByCdate(Timestamp... values) {
        return fetch(TIndexFloor.T_INDEX_FLOOR.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TIndexFloor> fetchByMdate(Timestamp... values) {
        return fetch(TIndexFloor.T_INDEX_FLOOR.MDATE, values);
    }
}
