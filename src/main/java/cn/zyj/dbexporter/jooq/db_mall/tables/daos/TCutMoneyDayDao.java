/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCutMoneyDay;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCutMoneyDayRecord;

import java.sql.Date;
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
public class TCutMoneyDayDao extends DAOImpl<TCutMoneyDayRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCutMoneyDay, Integer> {

    /**
     * Create a new TCutMoneyDayDao without any configuration
     */
    public TCutMoneyDayDao() {
        super(TCutMoneyDay.T_CUT_MONEY_DAY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCutMoneyDay.class);
    }

    /**
     * Create a new TCutMoneyDayDao with an attached configuration
     */
    public TCutMoneyDayDao(Configuration configuration) {
        super(TCutMoneyDay.T_CUT_MONEY_DAY, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCutMoneyDay.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCutMoneyDay object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCutMoneyDay> fetchById(Integer... values) {
        return fetch(TCutMoneyDay.T_CUT_MONEY_DAY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCutMoneyDay fetchOneById(Integer value) {
        return fetchOne(TCutMoneyDay.T_CUT_MONEY_DAY.ID, value);
    }

    /**
     * Fetch records that have <code>date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCutMoneyDay> fetchByDate(Date... values) {
        return fetch(TCutMoneyDay.T_CUT_MONEY_DAY.DATE, values);
    }
}
