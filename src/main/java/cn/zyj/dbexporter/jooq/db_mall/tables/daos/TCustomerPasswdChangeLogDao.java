/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCustomerPasswdChangeLog;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCustomerPasswdChangeLogRecord;

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
public class TCustomerPasswdChangeLogDao extends DAOImpl<TCustomerPasswdChangeLogRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerPasswdChangeLog, Integer> {

    /**
     * Create a new TCustomerPasswdChangeLogDao without any configuration
     */
    public TCustomerPasswdChangeLogDao() {
        super(TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerPasswdChangeLog.class);
    }

    /**
     * Create a new TCustomerPasswdChangeLogDao with an attached configuration
     */
    public TCustomerPasswdChangeLogDao(Configuration configuration) {
        super(TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerPasswdChangeLog.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerPasswdChangeLog object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerPasswdChangeLog> fetchById(Integer... values) {
        return fetch(TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerPasswdChangeLog fetchOneById(Integer value) {
        return fetchOne(TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG.ID, value);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerPasswdChangeLog> fetchByCustomerId(Integer... values) {
        return fetch(TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerPasswdChangeLog> fetchByTypeId(Byte... values) {
        return fetch(TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG.TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>ip IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerPasswdChangeLog> fetchByIp(Long... values) {
        return fetch(TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG.IP, values);
    }

    /**
     * Fetch records that have <code>user_agent IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerPasswdChangeLog> fetchByUserAgent(String... values) {
        return fetch(TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG.USER_AGENT, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerPasswdChangeLog> fetchByCdate(Timestamp... values) {
        return fetch(TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TCustomerPasswdChangeLog> fetchByMdate(Timestamp... values) {
        return fetch(TCustomerPasswdChangeLog.T_CUSTOMER_PASSWD_CHANGE_LOG.MDATE, values);
    }
}
