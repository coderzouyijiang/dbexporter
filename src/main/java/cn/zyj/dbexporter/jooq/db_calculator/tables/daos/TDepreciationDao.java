/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_calculator.tables.daos;


import cn.zyj.dbexporter.jooq.db_calculator.tables.TDepreciation;
import cn.zyj.dbexporter.jooq.db_calculator.tables.records.TDepreciationRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 残值
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDepreciationDao extends DAOImpl<TDepreciationRecord, cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation, Integer> {

    /**
     * Create a new TDepreciationDao without any configuration
     */
    public TDepreciationDao() {
        super(TDepreciation.T_DEPRECIATION, cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation.class);
    }

    /**
     * Create a new TDepreciationDao with an attached configuration
     */
    public TDepreciationDao(Configuration configuration) {
        super(TDepreciation.T_DEPRECIATION, cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchById(Integer... values) {
        return fetch(TDepreciation.T_DEPRECIATION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation fetchOneById(Integer value) {
        return fetchOne(TDepreciation.T_DEPRECIATION.ID, value);
    }

    /**
     * Fetch records that have <code>spu IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchBySpu(String... values) {
        return fetch(TDepreciation.T_DEPRECIATION.SPU, values);
    }

    /**
     * Fetch records that have <code>spu_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchBySpuType(Integer... values) {
        return fetch(TDepreciation.T_DEPRECIATION.SPU_TYPE, values);
    }

    /**
     * Fetch records that have <code>cpu_model IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByCpuModel(Integer... values) {
        return fetch(TDepreciation.T_DEPRECIATION.CPU_MODEL, values);
    }

    /**
     * Fetch records that have <code>ram IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByRam(Integer... values) {
        return fetch(TDepreciation.T_DEPRECIATION.RAM, values);
    }

    /**
     * Fetch records that have <code>hd1 IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByHd1(Integer... values) {
        return fetch(TDepreciation.T_DEPRECIATION.HD1, values);
    }

    /**
     * Fetch records that have <code>hd2 IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByHd2(Integer... values) {
        return fetch(TDepreciation.T_DEPRECIATION.HD2, values);
    }

    /**
     * Fetch records that have <code>gpu IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByGpu(Integer... values) {
        return fetch(TDepreciation.T_DEPRECIATION.GPU, values);
    }

    /**
     * Fetch records that have <code>screen_size IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByScreenSize(Integer... values) {
        return fetch(TDepreciation.T_DEPRECIATION.SCREEN_SIZE, values);
    }

    /**
     * Fetch records that have <code>resolution IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByResolution(Integer... values) {
        return fetch(TDepreciation.T_DEPRECIATION.RESOLUTION, values);
    }

    /**
     * Fetch records that have <code>residual_after_year1 IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByResidualAfterYear1(BigDecimal... values) {
        return fetch(TDepreciation.T_DEPRECIATION.RESIDUAL_AFTER_YEAR1, values);
    }

    /**
     * Fetch records that have <code>residual_after_year2 IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByResidualAfterYear2(BigDecimal... values) {
        return fetch(TDepreciation.T_DEPRECIATION.RESIDUAL_AFTER_YEAR2, values);
    }

    /**
     * Fetch records that have <code>residual_after_year3 IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByResidualAfterYear3(BigDecimal... values) {
        return fetch(TDepreciation.T_DEPRECIATION.RESIDUAL_AFTER_YEAR3, values);
    }

    /**
     * Fetch records that have <code>residual_after_year4 IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByResidualAfterYear4(BigDecimal... values) {
        return fetch(TDepreciation.T_DEPRECIATION.RESIDUAL_AFTER_YEAR4, values);
    }

    /**
     * Fetch records that have <code>residual_after_year5 IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByResidualAfterYear5(BigDecimal... values) {
        return fetch(TDepreciation.T_DEPRECIATION.RESIDUAL_AFTER_YEAR5, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByStatus(Integer... values) {
        return fetch(TDepreciation.T_DEPRECIATION.STATUS, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByCdate(Timestamp... values) {
        return fetch(TDepreciation.T_DEPRECIATION.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByMdate(Timestamp... values) {
        return fetch(TDepreciation.T_DEPRECIATION.MDATE, values);
    }

    /**
     * Fetch records that have <code>creater_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByCreaterId(Integer... values) {
        return fetch(TDepreciation.T_DEPRECIATION.CREATER_ID, values);
    }

    /**
     * Fetch records that have <code>creater_name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByCreaterName(String... values) {
        return fetch(TDepreciation.T_DEPRECIATION.CREATER_NAME, values);
    }

    /**
     * Fetch records that have <code>data_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TDepreciation> fetchByDataStatus(Integer... values) {
        return fetch(TDepreciation.T_DEPRECIATION.DATA_STATUS, values);
    }
}