/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.SmsBlacklist;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.SmsBlacklistRecord;

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
public class SmsBlacklistDao extends DAOImpl<SmsBlacklistRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsBlacklist, Integer> {

    /**
     * Create a new SmsBlacklistDao without any configuration
     */
    public SmsBlacklistDao() {
        super(SmsBlacklist.SMS_BLACKLIST, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsBlacklist.class);
    }

    /**
     * Create a new SmsBlacklistDao with an attached configuration
     */
    public SmsBlacklistDao(Configuration configuration) {
        super(SmsBlacklist.SMS_BLACKLIST, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsBlacklist.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsBlacklist object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsBlacklist> fetchById(Integer... values) {
        return fetch(SmsBlacklist.SMS_BLACKLIST.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsBlacklist fetchOneById(Integer value) {
        return fetchOne(SmsBlacklist.SMS_BLACKLIST.ID, value);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsBlacklist> fetchByPhone(String... values) {
        return fetch(SmsBlacklist.SMS_BLACKLIST.PHONE, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.SmsBlacklist> fetchByStatus(Byte... values) {
        return fetch(SmsBlacklist.SMS_BLACKLIST.STATUS, values);
    }
}
