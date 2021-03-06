/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.SmsWhitelist;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.SmsWhitelistRecord;

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
public class SmsWhitelistDao extends DAOImpl<SmsWhitelistRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsWhitelist, Integer> {

    /**
     * Create a new SmsWhitelistDao without any configuration
     */
    public SmsWhitelistDao() {
        super(SmsWhitelist.SMS_WHITELIST, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsWhitelist.class);
    }

    /**
     * Create a new SmsWhitelistDao with an attached configuration
     */
    public SmsWhitelistDao(Configuration configuration) {
        super(SmsWhitelist.SMS_WHITELIST, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsWhitelist.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsWhitelist object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsWhitelist> fetchById(Integer... values) {
        return fetch(SmsWhitelist.SMS_WHITELIST.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsWhitelist fetchOneById(Integer value) {
        return fetchOne(SmsWhitelist.SMS_WHITELIST.ID, value);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsWhitelist> fetchByPhone(String... values) {
        return fetch(SmsWhitelist.SMS_WHITELIST.PHONE, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsWhitelist> fetchByStatus(Byte... values) {
        return fetch(SmsWhitelist.SMS_WHITELIST.STATUS, values);
    }
}
