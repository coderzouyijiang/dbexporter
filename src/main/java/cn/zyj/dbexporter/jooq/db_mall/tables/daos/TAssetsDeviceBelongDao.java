/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TAssetsDeviceBelong;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TAssetsDeviceBelongRecord;

import java.math.BigDecimal;
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
public class TAssetsDeviceBelongDao extends DAOImpl<TAssetsDeviceBelongRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDeviceBelong, Long> {

    /**
     * Create a new TAssetsDeviceBelongDao without any configuration
     */
    public TAssetsDeviceBelongDao() {
        super(TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDeviceBelong.class);
    }

    /**
     * Create a new TAssetsDeviceBelongDao with an attached configuration
     */
    public TAssetsDeviceBelongDao(Configuration configuration) {
        super(TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDeviceBelong.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDeviceBelong object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDeviceBelong> fetchById(Long... values) {
        return fetch(TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDeviceBelong fetchOneById(Long value) {
        return fetchOne(TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.ID, value);
    }

    /**
     * Fetch records that have <code>sn IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDeviceBelong> fetchBySn(String... values) {
        return fetch(TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.SN, values);
    }

    /**
     * Fetch records that have <code>sku_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDeviceBelong> fetchBySkuId(Integer... values) {
        return fetch(TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.SKU_ID, values);
    }

    /**
     * Fetch records that have <code>platform_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDeviceBelong> fetchByPlatformId(Integer... values) {
        return fetch(TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.PLATFORM_ID, values);
    }

    /**
     * Fetch records that have <code>buy_num IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDeviceBelong> fetchByBuyNum(String... values) {
        return fetch(TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.BUY_NUM, values);
    }

    /**
     * Fetch records that have <code>market_price IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDeviceBelong> fetchByMarketPrice(BigDecimal... values) {
        return fetch(TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.MARKET_PRICE, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDeviceBelong> fetchByStatus(Integer... values) {
        return fetch(TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.STATUS, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDeviceBelong> fetchByCdate(Timestamp... values) {
        return fetch(TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TAssetsDeviceBelong> fetchByMdate(Timestamp... values) {
        return fetch(TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.MDATE, values);
    }
}
