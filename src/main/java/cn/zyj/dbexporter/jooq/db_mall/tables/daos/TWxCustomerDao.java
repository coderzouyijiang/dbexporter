/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TWxCustomer;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TWxCustomerRecord;

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
public class TWxCustomerDao extends DAOImpl<TWxCustomerRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TWxCustomer, Integer> {

    /**
     * Create a new TWxCustomerDao without any configuration
     */
    public TWxCustomerDao() {
        super(TWxCustomer.T_WX_CUSTOMER, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TWxCustomer.class);
    }

    /**
     * Create a new TWxCustomerDao with an attached configuration
     */
    public TWxCustomerDao(Configuration configuration) {
        super(TWxCustomer.T_WX_CUSTOMER, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TWxCustomer.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TWxCustomer object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TWxCustomer> fetchById(Integer... values) {
        return fetch(TWxCustomer.T_WX_CUSTOMER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TWxCustomer fetchOneById(Integer value) {
        return fetchOne(TWxCustomer.T_WX_CUSTOMER.ID, value);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TWxCustomer> fetchByCustomerId(Integer... values) {
        return fetch(TWxCustomer.T_WX_CUSTOMER.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>open_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TWxCustomer> fetchByOpenId(String... values) {
        return fetch(TWxCustomer.T_WX_CUSTOMER.OPEN_ID, values);
    }

    /**
     * Fetch records that have <code>logo IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TWxCustomer> fetchByLogo(String... values) {
        return fetch(TWxCustomer.T_WX_CUSTOMER.LOGO, values);
    }

    /**
     * Fetch records that have <code>nickname IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TWxCustomer> fetchByNickname(String... values) {
        return fetch(TWxCustomer.T_WX_CUSTOMER.NICKNAME, values);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TWxCustomer> fetchByAddress(String... values) {
        return fetch(TWxCustomer.T_WX_CUSTOMER.ADDRESS, values);
    }

    /**
     * Fetch records that have <code>is_focus IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TWxCustomer> fetchByIsFocus(Byte... values) {
        return fetch(TWxCustomer.T_WX_CUSTOMER.IS_FOCUS, values);
    }

    /**
     * Fetch records that have <code>sex IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TWxCustomer> fetchBySex(Byte... values) {
        return fetch(TWxCustomer.T_WX_CUSTOMER.SEX, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TWxCustomer> fetchByCdate(Timestamp... values) {
        return fetch(TWxCustomer.T_WX_CUSTOMER.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TWxCustomer> fetchByMdate(Timestamp... values) {
        return fetch(TWxCustomer.T_WX_CUSTOMER.MDATE, values);
    }
}
