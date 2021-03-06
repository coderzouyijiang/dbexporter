/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TOrderRentTypeChangeLog;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TOrderRentTypeChangeLogRecord;

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
public class TOrderRentTypeChangeLogDao extends DAOImpl<TOrderRentTypeChangeLogRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRentTypeChangeLog, Integer> {

    /**
     * Create a new TOrderRentTypeChangeLogDao without any configuration
     */
    public TOrderRentTypeChangeLogDao() {
        super(TOrderRentTypeChangeLog.T_ORDER_RENT_TYPE_CHANGE_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRentTypeChangeLog.class);
    }

    /**
     * Create a new TOrderRentTypeChangeLogDao with an attached configuration
     */
    public TOrderRentTypeChangeLogDao(Configuration configuration) {
        super(TOrderRentTypeChangeLog.T_ORDER_RENT_TYPE_CHANGE_LOG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRentTypeChangeLog.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRentTypeChangeLog object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRentTypeChangeLog> fetchById(Integer... values) {
        return fetch(TOrderRentTypeChangeLog.T_ORDER_RENT_TYPE_CHANGE_LOG.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRentTypeChangeLog fetchOneById(Integer value) {
        return fetchOne(TOrderRentTypeChangeLog.T_ORDER_RENT_TYPE_CHANGE_LOG.ID, value);
    }

    /**
     * Fetch records that have <code>now_balance_num IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRentTypeChangeLog> fetchByNowBalanceNum(Integer... values) {
        return fetch(TOrderRentTypeChangeLog.T_ORDER_RENT_TYPE_CHANGE_LOG.NOW_BALANCE_NUM, values);
    }

    /**
     * Fetch records that have <code>rent_type_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRentTypeChangeLog> fetchByRentTypeId(Integer... values) {
        return fetch(TOrderRentTypeChangeLog.T_ORDER_RENT_TYPE_CHANGE_LOG.RENT_TYPE_ID, values);
    }

    /**
     * Fetch records that have <code>order_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRentTypeChangeLog> fetchByOrderId(String... values) {
        return fetch(TOrderRentTypeChangeLog.T_ORDER_RENT_TYPE_CHANGE_LOG.ORDER_ID, values);
    }

    /**
     * Fetch records that have <code>order_item_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRentTypeChangeLog> fetchByOrderItemId(Integer... values) {
        return fetch(TOrderRentTypeChangeLog.T_ORDER_RENT_TYPE_CHANGE_LOG.ORDER_ITEM_ID, values);
    }

    /**
     * Fetch records that have <code>item_detail_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRentTypeChangeLog> fetchByItemDetailId(Integer... values) {
        return fetch(TOrderRentTypeChangeLog.T_ORDER_RENT_TYPE_CHANGE_LOG.ITEM_DETAIL_ID, values);
    }

    /**
     * Fetch records that have <code>old_rent_money IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRentTypeChangeLog> fetchByOldRentMoney(Long... values) {
        return fetch(TOrderRentTypeChangeLog.T_ORDER_RENT_TYPE_CHANGE_LOG.OLD_RENT_MONEY, values);
    }

    /**
     * Fetch records that have <code>new_rent_money IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRentTypeChangeLog> fetchByNewRentMoney(Long... values) {
        return fetch(TOrderRentTypeChangeLog.T_ORDER_RENT_TYPE_CHANGE_LOG.NEW_RENT_MONEY, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TOrderRentTypeChangeLog> fetchByCdate(Timestamp... values) {
        return fetch(TOrderRentTypeChangeLog.T_ORDER_RENT_TYPE_CHANGE_LOG.CDATE, values);
    }
}
