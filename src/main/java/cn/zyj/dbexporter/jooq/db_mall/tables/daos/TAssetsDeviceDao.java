/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TAssetsDevice;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TAssetsDeviceRecord;

import java.math.BigDecimal;
import java.sql.Date;
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
public class TAssetsDeviceDao extends DAOImpl<TAssetsDeviceRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice, Long> {

    /**
     * Create a new TAssetsDeviceDao without any configuration
     */
    public TAssetsDeviceDao() {
        super(TAssetsDevice.T_ASSETS_DEVICE, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice.class);
    }

    /**
     * Create a new TAssetsDeviceDao with an attached configuration
     */
    public TAssetsDeviceDao(Configuration configuration) {
        super(TAssetsDevice.T_ASSETS_DEVICE, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchById(Long... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice fetchOneById(Long value) {
        return fetchOne(TAssetsDevice.T_ASSETS_DEVICE.ID, value);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchByCustomerId(Integer... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>order_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchByOrderId(String... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.ORDER_ID, values);
    }

    /**
     * Fetch records that have <code>product_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchByProductId(Integer... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.PRODUCT_ID, values);
    }

    /**
     * Fetch records that have <code>sn IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchBySn(String... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.SN, values);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchByTitle(String... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.TITLE, values);
    }

    /**
     * Fetch records that have <code>company_name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchByCompanyName(String... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.COMPANY_NAME, values);
    }

    /**
     * Fetch records that have <code>start_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchByStartDate(Date... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.START_DATE, values);
    }

    /**
     * Fetch records that have <code>end_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchByEndDate(Date... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.END_DATE, values);
    }

    /**
     * Fetch records that have <code>deposit IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchByDeposit(BigDecimal... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.DEPOSIT, values);
    }

    /**
     * Fetch records that have <code>rent IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchByRent(BigDecimal... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.RENT, values);
    }

    /**
     * Fetch records that have <code>market_price IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchByMarketPrice(BigDecimal... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.MARKET_PRICE, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchByStatus(Byte... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.STATUS, values);
    }

    /**
     * Fetch records that have <code>rent_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchByRentStatus(Byte... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.RENT_STATUS, values);
    }

    /**
     * Fetch records that have <code>belong_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchByBelongId(Integer... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.BELONG_ID, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchByCdate(Timestamp... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDevice> fetchByMdate(Timestamp... values) {
        return fetch(TAssetsDevice.T_ASSETS_DEVICE.MDATE, values);
    }
}
