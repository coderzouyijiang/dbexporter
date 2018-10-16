/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TPhoneTemp;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TPhoneTempRecord;

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
public class TPhoneTempDao extends DAOImpl<TPhoneTempRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TPhoneTemp, Long> {

    /**
     * Create a new TPhoneTempDao without any configuration
     */
    public TPhoneTempDao() {
        super(TPhoneTemp.T_PHONE_TEMP, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TPhoneTemp.class);
    }

    /**
     * Create a new TPhoneTempDao with an attached configuration
     */
    public TPhoneTempDao(Configuration configuration) {
        super(TPhoneTemp.T_PHONE_TEMP, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TPhoneTemp.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TPhoneTemp object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TPhoneTemp> fetchById(Long... values) {
        return fetch(TPhoneTemp.T_PHONE_TEMP.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TPhoneTemp fetchOneById(Long value) {
        return fetchOne(TPhoneTemp.T_PHONE_TEMP.ID, value);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TPhoneTemp> fetchByPhone(String... values) {
        return fetch(TPhoneTemp.T_PHONE_TEMP.PHONE, values);
    }
}