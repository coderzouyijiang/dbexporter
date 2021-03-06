/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_calculator.tables.daos;


import cn.zyj.dbexporter.jooq.db_calculator.tables.TCalculator;
import cn.zyj.dbexporter.jooq.db_calculator.tables.records.TCalculatorRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * 计算器报价单
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCalculatorDao extends DAOImpl<TCalculatorRecord, cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator, Integer> {

    /**
     * Create a new TCalculatorDao without any configuration
     */
    public TCalculatorDao() {
        super(TCalculator.T_CALCULATOR, cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator.class);
    }

    /**
     * Create a new TCalculatorDao with an attached configuration
     */
    public TCalculatorDao(Configuration configuration) {
        super(TCalculator.T_CALCULATOR, cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchById(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator fetchOneById(Integer value) {
        return fetchOne(TCalculator.T_CALCULATOR.ID, value);
    }

    /**
     * Fetch records that have <code>sheet_no IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchBySheetNo(String... values) {
        return fetch(TCalculator.T_CALCULATOR.SHEET_NO, values);
    }

    /**
     * Fetch records that have <code>serial_no IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchBySerialNo(String... values) {
        return fetch(TCalculator.T_CALCULATOR.SERIAL_NO, values);
    }

    /**
     * Fetch records that have <code>product_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByProductType(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.PRODUCT_TYPE, values);
    }

    /**
     * Fetch records that have <code>quality IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByQuality(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.QUALITY, values);
    }

    /**
     * Fetch records that have <code>brand IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByBrand(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.BRAND, values);
    }

    /**
     * Fetch records that have <code>model IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByModel(String... values) {
        return fetch(TCalculator.T_CALCULATOR.MODEL, values);
    }

    /**
     * Fetch records that have <code>service_standard IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByServiceStandard(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.SERVICE_STANDARD, values);
    }

    /**
     * Fetch records that have <code>os IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByOs(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.OS, values);
    }

    /**
     * Fetch records that have <code>core_config IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByCoreConfig(String... values) {
        return fetch(TCalculator.T_CALCULATOR.CORE_CONFIG, values);
    }

    /**
     * Fetch records that have <code>uncore_config IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByUncoreConfig(String... values) {
        return fetch(TCalculator.T_CALCULATOR.UNCORE_CONFIG, values);
    }

    /**
     * Fetch records that have <code>purchase_price IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByPurchasePrice(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.PURCHASE_PRICE, values);
    }

    /**
     * Fetch records that have <code>offer_validity IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByOfferValidity(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.OFFER_VALIDITY, values);
    }

    /**
     * Fetch records that have <code>residual_after_year1 IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByResidualAfterYear1(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.RESIDUAL_AFTER_YEAR1, values);
    }

    /**
     * Fetch records that have <code>residual_after_year2 IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByResidualAfterYear2(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.RESIDUAL_AFTER_YEAR2, values);
    }

    /**
     * Fetch records that have <code>residual_after_year3 IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByResidualAfterYear3(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.RESIDUAL_AFTER_YEAR3, values);
    }

    /**
     * Fetch records that have <code>residual_after_year4 IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByResidualAfterYear4(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.RESIDUAL_AFTER_YEAR4, values);
    }

    /**
     * Fetch records that have <code>residual_after_year5 IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByResidualAfterYear5(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.RESIDUAL_AFTER_YEAR5, values);
    }

    /**
     * Fetch records that have <code>is_special_invoice IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByIsSpecialInvoice(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.IS_SPECIAL_INVOICE, values);
    }

    /**
     * Fetch records that have <code>logistic_cost IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByLogisticCost(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.LOGISTIC_COST, values);
    }

    /**
     * Fetch records that have <code>recovery_cost IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByRecoveryCost(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.RECOVERY_COST, values);
    }

    /**
     * Fetch records that have <code>monthly_maintainace_cost IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByMonthlyMaintainaceCost(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.MONTHLY_MAINTAINACE_COST, values);
    }

    /**
     * Fetch records that have <code>free_warranty_year IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByFreeWarrantyYear(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.FREE_WARRANTY_YEAR, values);
    }

    /**
     * Fetch records that have <code>interest_rate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByInterestRate(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.INTEREST_RATE, values);
    }

    /**
     * Fetch records that have <code>risk_rate_normal IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByRiskRateNormal(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.RISK_RATE_NORMAL, values);
    }

    /**
     * Fetch records that have <code>risk_rate_low IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByRiskRateLow(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.RISK_RATE_LOW, values);
    }

    /**
     * Fetch records that have <code>goal_rate_normal IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByGoalRateNormal(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.GOAL_RATE_NORMAL, values);
    }

    /**
     * Fetch records that have <code>goal_rate_low IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByGoalRateLow(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.GOAL_RATE_LOW, values);
    }

    /**
     * Fetch records that have <code>normal_return_rate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByNormalReturnRate(String... values) {
        return fetch(TCalculator.T_CALCULATOR.NORMAL_RETURN_RATE, values);
    }

    /**
     * Fetch records that have <code>low_return_rate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByLowReturnRate(String... values) {
        return fetch(TCalculator.T_CALCULATOR.LOW_RETURN_RATE, values);
    }

    /**
     * Fetch records that have <code>calculation_result IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByCalculationResult(String... values) {
        return fetch(TCalculator.T_CALCULATOR.CALCULATION_RESULT, values);
    }

    /**
     * Fetch records that have <code>is_history IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByIsHistory(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.IS_HISTORY, values);
    }

    /**
     * Fetch records that have <code>is_valid IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByIsValid(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.IS_VALID, values);
    }

    /**
     * Fetch records that have <code>cdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByCdate(Timestamp... values) {
        return fetch(TCalculator.T_CALCULATOR.CDATE, values);
    }

    /**
     * Fetch records that have <code>mdate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByMdate(Timestamp... values) {
        return fetch(TCalculator.T_CALCULATOR.MDATE, values);
    }

    /**
     * Fetch records that have <code>creater_id IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByCreaterId(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.CREATER_ID, values);
    }

    /**
     * Fetch records that have <code>creater_name IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByCreaterName(String... values) {
        return fetch(TCalculator.T_CALCULATOR.CREATER_NAME, values);
    }

    /**
     * Fetch records that have <code>data_status IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByDataStatus(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.DATA_STATUS, values);
    }

    /**
     * Fetch records that have <code>ram IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByRam(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.RAM, values);
    }

    /**
     * Fetch records that have <code>hd1 IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByHd1(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.HD1, values);
    }

    /**
     * Fetch records that have <code>hd2 IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByHd2(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.HD2, values);
    }

    /**
     * Fetch records that have <code>gpu IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByGpu(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.GPU, values);
    }

    /**
     * Fetch records that have <code>screen_size IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByScreenSize(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.SCREEN_SIZE, values);
    }

    /**
     * Fetch records that have <code>resolution IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByResolution(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.RESOLUTION, values);
    }

    /**
     * Fetch records that have <code>deposit IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByDeposit(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.DEPOSIT, values);
    }

    /**
     * Fetch records that have <code>sku IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchBySku(String... values) {
        return fetch(TCalculator.T_CALCULATOR.SKU, values);
    }

    /**
     * Fetch records that have <code>rent_or_sale IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByRentOrSale(Byte... values) {
        return fetch(TCalculator.T_CALCULATOR.RENT_OR_SALE, values);
    }

    /**
     * Fetch records that have <code>sku_rent_or_sale IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchBySkuRentOrSale(Byte... values) {
        return fetch(TCalculator.T_CALCULATOR.SKU_RENT_OR_SALE, values);
    }

    /**
     * Fetch records that have <code>transport_cost IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByTransportCost(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.TRANSPORT_COST, values);
    }

    /**
     * Fetch records that have <code>profit_start_counting IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByProfitStartCounting(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.PROFIT_START_COUNTING, values);
    }

    /**
     * Fetch records that have <code>gross_interest_rate IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByGrossInterestRate(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.GROSS_INTEREST_RATE, values);
    }

    /**
     * Fetch records that have <code>min_sale_price IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByMinSalePrice(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.MIN_SALE_PRICE, values);
    }

    /**
     * Fetch records that have <code>real_sale_price IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByRealSalePrice(BigDecimal... values) {
        return fetch(TCalculator.T_CALCULATOR.REAL_SALE_PRICE, values);
    }

    /**
     * Fetch records that have <code>cpu_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByCpuType(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.CPU_TYPE, values);
    }

    /**
     * Fetch records that have <code>cpu_model IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByCpuModel(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.CPU_MODEL, values);
    }

    /**
     * Fetch records that have <code>resource_type IN (values)</code>
     */
    public List<cn.zyj.dbexporter.jooq.db_calculator.tables.pojos.TCalculator> fetchByResourceType(Integer... values) {
        return fetch(TCalculator.T_CALCULATOR.RESOURCE_TYPE, values);
    }
}
