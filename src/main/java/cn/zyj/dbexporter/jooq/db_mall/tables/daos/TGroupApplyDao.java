/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TGroupApply;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TGroupApplyRecord;

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
public class TGroupApplyDao extends DAOImpl<TGroupApplyRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupApply, Long> {

    /**
     * Create a new TGroupApplyDao without any configuration
     */
    public TGroupApplyDao() {
        super(TGroupApply.T_GROUP_APPLY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupApply.class);
    }

    /**
     * Create a new TGroupApplyDao with an attached configuration
     */
    public TGroupApplyDao(Configuration configuration) {
        super(TGroupApply.T_GROUP_APPLY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupApply.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupApply object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupApply> fetchById(Long... values) {
        return fetch(TGroupApply.T_GROUP_APPLY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupApply fetchOneById(Long value) {
        return fetchOne(TGroupApply.T_GROUP_APPLY.ID, value);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupApply> fetchByCustomerId(Long... values) {
        return fetch(TGroupApply.T_GROUP_APPLY.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupApply> fetchByStatus(Byte... values) {
        return fetch(TGroupApply.T_GROUP_APPLY.STATUS, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupApply> fetchByCdate(Timestamp... values) {
        return fetch(TGroupApply.T_GROUP_APPLY.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TGroupApply> fetchByMdate(Timestamp... values) {
        return fetch(TGroupApply.T_GROUP_APPLY.MDATE, values);
    }
}
