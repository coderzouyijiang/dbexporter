/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.daos;


import cn.zyj.dbexporter.jooq.db_mall.tables.TStatDailyEquipment;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TStatDailyEquipmentRecord;

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
public class TStatDailyEquipmentDao extends DAOImpl<TStatDailyEquipmentRecord, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TStatDailyEquipment, Long> {

    /**
     * Create a new TStatDailyEquipmentDao without any configuration
     */
    public TStatDailyEquipmentDao() {
        super(TStatDailyEquipment.T_STAT_DAILY_EQUIPMENT, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TStatDailyEquipment.class);
    }

    /**
     * Create a new TStatDailyEquipmentDao with an attached configuration
     */
    public TStatDailyEquipmentDao(Configuration configuration) {
        super(TStatDailyEquipment.T_STAT_DAILY_EQUIPMENT, cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TStatDailyEquipment.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TStatDailyEquipment object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TStatDailyEquipment> fetchById(Long... values) {
        return fetch(TStatDailyEquipment.T_STAT_DAILY_EQUIPMENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TStatDailyEquipment fetchOneById(Long value) {
        return fetchOne(TStatDailyEquipment.T_STAT_DAILY_EQUIPMENT.ID, value);
    }

    /**
     * Fetch records that have <code>stat_date IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TStatDailyEquipment> fetchByStatDate(Date... values) {
        return fetch(TStatDailyEquipment.T_STAT_DAILY_EQUIPMENT.STAT_DATE, values);
    }

    /**
     * Fetch a unique record that has <code>stat_date = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TStatDailyEquipment fetchOneByStatDate(Date value) {
        return fetchOne(TStatDailyEquipment.T_STAT_DAILY_EQUIPMENT.STAT_DATE, value);
    }

    /**
     * Fetch records that have <code>total_num IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TStatDailyEquipment> fetchByTotalNum(Long... values) {
        return fetch(TStatDailyEquipment.T_STAT_DAILY_EQUIPMENT.TOTAL_NUM, values);
    }

    /**
     * Fetch records that have <code>added_num IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TStatDailyEquipment> fetchByAddedNum(Integer... values) {
        return fetch(TStatDailyEquipment.T_STAT_DAILY_EQUIPMENT.ADDED_NUM, values);
    }

    /**
     * Fetch records that have <code>canceled_num IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TStatDailyEquipment> fetchByCanceledNum(Integer... values) {
        return fetch(TStatDailyEquipment.T_STAT_DAILY_EQUIPMENT.CANCELED_NUM, values);
    }

    /**
     * Fetch records that have <code>diff_num IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TStatDailyEquipment> fetchByDiffNum(Integer... values) {
        return fetch(TStatDailyEquipment.T_STAT_DAILY_EQUIPMENT.DIFF_NUM, values);
    }

    /**
     * Fetch records that have <code>addcanceled_num IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TStatDailyEquipment> fetchByAddcanceledNum(Integer... values) {
        return fetch(TStatDailyEquipment.T_STAT_DAILY_EQUIPMENT.ADDCANCELED_NUM, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TStatDailyEquipment> fetchByCdate(Timestamp... values) {
        return fetch(TStatDailyEquipment.T_STAT_DAILY_EQUIPMENT.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_mall.tables.pojos.TStatDailyEquipment> fetchByMdate(Timestamp... values) {
        return fetch(TStatDailyEquipment.T_STAT_DAILY_EQUIPMENT.MDATE, values);
    }
}
