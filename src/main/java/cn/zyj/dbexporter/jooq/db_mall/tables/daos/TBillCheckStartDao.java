/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TBillCheckStart;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TBillCheckStartRecord;

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
public class TBillCheckStartDao extends DAOImpl<TBillCheckStartRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheckStart, Integer> {

    /**
     * Create a new TBillCheckStartDao without any configuration
     */
    public TBillCheckStartDao() {
        super(TBillCheckStart.T_BILL_CHECK_START, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheckStart.class);
    }

    /**
     * Create a new TBillCheckStartDao with an attached configuration
     */
    public TBillCheckStartDao(Configuration configuration) {
        super(TBillCheckStart.T_BILL_CHECK_START, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheckStart.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheckStart object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheckStart> fetchById(Integer... values) {
        return fetch(TBillCheckStart.T_BILL_CHECK_START.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheckStart fetchOneById(Integer value) {
        return fetchOne(TBillCheckStart.T_BILL_CHECK_START.ID, value);
    }

    /**
     * Fetch records that have <code>timestamp IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheckStart> fetchByTimestamp(Long... values) {
        return fetch(TBillCheckStart.T_BILL_CHECK_START.TIMESTAMP, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TBillCheckStart> fetchByStatus(Byte... values) {
        return fetch(TBillCheckStart.T_BILL_CHECK_START.STATUS, values);
    }
}
