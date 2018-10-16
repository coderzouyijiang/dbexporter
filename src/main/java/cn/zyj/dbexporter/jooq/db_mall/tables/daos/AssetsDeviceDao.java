/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.AssetsDevice;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.AssetsDeviceRecord;

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
public class AssetsDeviceDao extends DAOImpl<AssetsDeviceRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice, Long> {

    /**
     * Create a new AssetsDeviceDao without any configuration
     */
    public AssetsDeviceDao() {
        super(AssetsDevice.ASSETS_DEVICE, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice.class);
    }

    /**
     * Create a new AssetsDeviceDao with an attached configuration
     */
    public AssetsDeviceDao(Configuration configuration) {
        super(AssetsDevice.ASSETS_DEVICE, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice> fetchById(Long... values) {
        return fetch(AssetsDevice.ASSETS_DEVICE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice fetchOneById(Long value) {
        return fetchOne(AssetsDevice.ASSETS_DEVICE.ID, value);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice> fetchByTitle(String... values) {
        return fetch(AssetsDevice.ASSETS_DEVICE.TITLE, values);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice> fetchByCustomerId(Long... values) {
        return fetch(AssetsDevice.ASSETS_DEVICE.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice> fetchByStatus(Byte... values) {
        return fetch(AssetsDevice.ASSETS_DEVICE.STATUS, values);
    }

    /**
     * Fetch records that have <code>brand IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice> fetchByBrand(String... values) {
        return fetch(AssetsDevice.ASSETS_DEVICE.BRAND, values);
    }

    /**
     * Fetch records that have <code>sn IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice> fetchBySn(String... values) {
        return fetch(AssetsDevice.ASSETS_DEVICE.SN, values);
    }

    /**
     * Fetch records that have <code>processor IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice> fetchByProcessor(String... values) {
        return fetch(AssetsDevice.ASSETS_DEVICE.PROCESSOR, values);
    }

    /**
     * Fetch records that have <code>ram IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice> fetchByRam(String... values) {
        return fetch(AssetsDevice.ASSETS_DEVICE.RAM, values);
    }

    /**
     * Fetch records that have <code>disk IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice> fetchByDisk(String... values) {
        return fetch(AssetsDevice.ASSETS_DEVICE.DISK, values);
    }

    /**
     * Fetch records that have <code>store_location IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice> fetchByStoreLocation(String... values) {
        return fetch(AssetsDevice.ASSETS_DEVICE.STORE_LOCATION, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice> fetchByCdate(Timestamp... values) {
        return fetch(AssetsDevice.ASSETS_DEVICE.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.AssetsDevice> fetchByMdate(Timestamp... values) {
        return fetch(AssetsDevice.ASSETS_DEVICE.MDATE, values);
    }
}