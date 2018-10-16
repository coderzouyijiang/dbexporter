/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_calculator.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.Size;


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
public class TCalculator implements Serializable {

    private static final long serialVersionUID = -1001170115;

    private Integer    id;
    private String     sheetNo;
    private String     serialNo;
    private Integer    productType;
    private Integer    quality;
    private Integer    brand;
    private String     model;
    private Integer    serviceStandard;
    private Integer    os;
    private String     coreConfig;
    private String     uncoreConfig;
    private BigDecimal purchasePrice;
    private Integer    offerValidity;
    private BigDecimal residualAfterYear1;
    private BigDecimal residualAfterYear2;
    private BigDecimal residualAfterYear3;
    private BigDecimal residualAfterYear4;
    private BigDecimal residualAfterYear5;
    private Integer    isSpecialInvoice;
    private BigDecimal logisticCost;
    private BigDecimal recoveryCost;
    private BigDecimal monthlyMaintainaceCost;
    private Integer    freeWarrantyYear;
    private BigDecimal interestRate;
    private BigDecimal riskRateNormal;
    private BigDecimal riskRateLow;
    private BigDecimal goalRateNormal;
    private BigDecimal goalRateLow;
    private String     normalReturnRate;
    private String     lowReturnRate;
    private String     calculationResult;
    private Integer    isHistory;
    private Integer    isValid;
    private Timestamp  cdate;
    private Timestamp  mdate;
    private Integer    createrId;
    private String     createrName;
    private Integer    dataStatus;
    private Integer    ram;
    private Integer    hd1;
    private Integer    hd2;
    private Integer    gpu;
    private Integer    screenSize;
    private Integer    resolution;
    private BigDecimal deposit;
    private String     sku;
    private Byte       rentOrSale;
    private Byte       skuRentOrSale;
    private BigDecimal transportCost;
    private BigDecimal profitStartCounting;
    private BigDecimal grossInterestRate;
    private BigDecimal minSalePrice;
    private BigDecimal realSalePrice;
    private Integer    cpuType;
    private Integer    cpuModel;
    private Integer    resourceType;

    public TCalculator() {}

    public TCalculator(TCalculator value) {
        this.id = value.id;
        this.sheetNo = value.sheetNo;
        this.serialNo = value.serialNo;
        this.productType = value.productType;
        this.quality = value.quality;
        this.brand = value.brand;
        this.model = value.model;
        this.serviceStandard = value.serviceStandard;
        this.os = value.os;
        this.coreConfig = value.coreConfig;
        this.uncoreConfig = value.uncoreConfig;
        this.purchasePrice = value.purchasePrice;
        this.offerValidity = value.offerValidity;
        this.residualAfterYear1 = value.residualAfterYear1;
        this.residualAfterYear2 = value.residualAfterYear2;
        this.residualAfterYear3 = value.residualAfterYear3;
        this.residualAfterYear4 = value.residualAfterYear4;
        this.residualAfterYear5 = value.residualAfterYear5;
        this.isSpecialInvoice = value.isSpecialInvoice;
        this.logisticCost = value.logisticCost;
        this.recoveryCost = value.recoveryCost;
        this.monthlyMaintainaceCost = value.monthlyMaintainaceCost;
        this.freeWarrantyYear = value.freeWarrantyYear;
        this.interestRate = value.interestRate;
        this.riskRateNormal = value.riskRateNormal;
        this.riskRateLow = value.riskRateLow;
        this.goalRateNormal = value.goalRateNormal;
        this.goalRateLow = value.goalRateLow;
        this.normalReturnRate = value.normalReturnRate;
        this.lowReturnRate = value.lowReturnRate;
        this.calculationResult = value.calculationResult;
        this.isHistory = value.isHistory;
        this.isValid = value.isValid;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
        this.createrId = value.createrId;
        this.createrName = value.createrName;
        this.dataStatus = value.dataStatus;
        this.ram = value.ram;
        this.hd1 = value.hd1;
        this.hd2 = value.hd2;
        this.gpu = value.gpu;
        this.screenSize = value.screenSize;
        this.resolution = value.resolution;
        this.deposit = value.deposit;
        this.sku = value.sku;
        this.rentOrSale = value.rentOrSale;
        this.skuRentOrSale = value.skuRentOrSale;
        this.transportCost = value.transportCost;
        this.profitStartCounting = value.profitStartCounting;
        this.grossInterestRate = value.grossInterestRate;
        this.minSalePrice = value.minSalePrice;
        this.realSalePrice = value.realSalePrice;
        this.cpuType = value.cpuType;
        this.cpuModel = value.cpuModel;
        this.resourceType = value.resourceType;
    }

    public TCalculator(
        Integer    id,
        String     sheetNo,
        String     serialNo,
        Integer    productType,
        Integer    quality,
        Integer    brand,
        String     model,
        Integer    serviceStandard,
        Integer    os,
        String     coreConfig,
        String     uncoreConfig,
        BigDecimal purchasePrice,
        Integer    offerValidity,
        BigDecimal residualAfterYear1,
        BigDecimal residualAfterYear2,
        BigDecimal residualAfterYear3,
        BigDecimal residualAfterYear4,
        BigDecimal residualAfterYear5,
        Integer    isSpecialInvoice,
        BigDecimal logisticCost,
        BigDecimal recoveryCost,
        BigDecimal monthlyMaintainaceCost,
        Integer    freeWarrantyYear,
        BigDecimal interestRate,
        BigDecimal riskRateNormal,
        BigDecimal riskRateLow,
        BigDecimal goalRateNormal,
        BigDecimal goalRateLow,
        String     normalReturnRate,
        String     lowReturnRate,
        String     calculationResult,
        Integer    isHistory,
        Integer    isValid,
        Timestamp  cdate,
        Timestamp  mdate,
        Integer    createrId,
        String     createrName,
        Integer    dataStatus,
        Integer    ram,
        Integer    hd1,
        Integer    hd2,
        Integer    gpu,
        Integer    screenSize,
        Integer    resolution,
        BigDecimal deposit,
        String     sku,
        Byte       rentOrSale,
        Byte       skuRentOrSale,
        BigDecimal transportCost,
        BigDecimal profitStartCounting,
        BigDecimal grossInterestRate,
        BigDecimal minSalePrice,
        BigDecimal realSalePrice,
        Integer    cpuType,
        Integer    cpuModel,
        Integer    resourceType
    ) {
        this.id = id;
        this.sheetNo = sheetNo;
        this.serialNo = serialNo;
        this.productType = productType;
        this.quality = quality;
        this.brand = brand;
        this.model = model;
        this.serviceStandard = serviceStandard;
        this.os = os;
        this.coreConfig = coreConfig;
        this.uncoreConfig = uncoreConfig;
        this.purchasePrice = purchasePrice;
        this.offerValidity = offerValidity;
        this.residualAfterYear1 = residualAfterYear1;
        this.residualAfterYear2 = residualAfterYear2;
        this.residualAfterYear3 = residualAfterYear3;
        this.residualAfterYear4 = residualAfterYear4;
        this.residualAfterYear5 = residualAfterYear5;
        this.isSpecialInvoice = isSpecialInvoice;
        this.logisticCost = logisticCost;
        this.recoveryCost = recoveryCost;
        this.monthlyMaintainaceCost = monthlyMaintainaceCost;
        this.freeWarrantyYear = freeWarrantyYear;
        this.interestRate = interestRate;
        this.riskRateNormal = riskRateNormal;
        this.riskRateLow = riskRateLow;
        this.goalRateNormal = goalRateNormal;
        this.goalRateLow = goalRateLow;
        this.normalReturnRate = normalReturnRate;
        this.lowReturnRate = lowReturnRate;
        this.calculationResult = calculationResult;
        this.isHistory = isHistory;
        this.isValid = isValid;
        this.cdate = cdate;
        this.mdate = mdate;
        this.createrId = createrId;
        this.createrName = createrName;
        this.dataStatus = dataStatus;
        this.ram = ram;
        this.hd1 = hd1;
        this.hd2 = hd2;
        this.gpu = gpu;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.deposit = deposit;
        this.sku = sku;
        this.rentOrSale = rentOrSale;
        this.skuRentOrSale = skuRentOrSale;
        this.transportCost = transportCost;
        this.profitStartCounting = profitStartCounting;
        this.grossInterestRate = grossInterestRate;
        this.minSalePrice = minSalePrice;
        this.realSalePrice = realSalePrice;
        this.cpuType = cpuType;
        this.cpuModel = cpuModel;
        this.resourceType = resourceType;
    }

    public Integer getId() {
        return this.id;
    }

    public TCalculator setId(Integer id) {
        this.id = id;
        return this;
    }

    @Size(max = 50)
    public String getSheetNo() {
        return this.sheetNo;
    }

    public TCalculator setSheetNo(String sheetNo) {
        this.sheetNo = sheetNo;
        return this;
    }

    @Size(max = 50)
    public String getSerialNo() {
        return this.serialNo;
    }

    public TCalculator setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }

    public Integer getProductType() {
        return this.productType;
    }

    public TCalculator setProductType(Integer productType) {
        this.productType = productType;
        return this;
    }

    public Integer getQuality() {
        return this.quality;
    }

    public TCalculator setQuality(Integer quality) {
        this.quality = quality;
        return this;
    }

    public Integer getBrand() {
        return this.brand;
    }

    public TCalculator setBrand(Integer brand) {
        this.brand = brand;
        return this;
    }

    @Size(max = 200)
    public String getModel() {
        return this.model;
    }

    public TCalculator setModel(String model) {
        this.model = model;
        return this;
    }

    public Integer getServiceStandard() {
        return this.serviceStandard;
    }

    public TCalculator setServiceStandard(Integer serviceStandard) {
        this.serviceStandard = serviceStandard;
        return this;
    }

    public Integer getOs() {
        return this.os;
    }

    public TCalculator setOs(Integer os) {
        this.os = os;
        return this;
    }

    @Size(max = 500)
    public String getCoreConfig() {
        return this.coreConfig;
    }

    public TCalculator setCoreConfig(String coreConfig) {
        this.coreConfig = coreConfig;
        return this;
    }

    @Size(max = 500)
    public String getUncoreConfig() {
        return this.uncoreConfig;
    }

    public TCalculator setUncoreConfig(String uncoreConfig) {
        this.uncoreConfig = uncoreConfig;
        return this;
    }

    public BigDecimal getPurchasePrice() {
        return this.purchasePrice;
    }

    public TCalculator setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }

    public Integer getOfferValidity() {
        return this.offerValidity;
    }

    public TCalculator setOfferValidity(Integer offerValidity) {
        this.offerValidity = offerValidity;
        return this;
    }

    public BigDecimal getResidualAfterYear1() {
        return this.residualAfterYear1;
    }

    public TCalculator setResidualAfterYear1(BigDecimal residualAfterYear1) {
        this.residualAfterYear1 = residualAfterYear1;
        return this;
    }

    public BigDecimal getResidualAfterYear2() {
        return this.residualAfterYear2;
    }

    public TCalculator setResidualAfterYear2(BigDecimal residualAfterYear2) {
        this.residualAfterYear2 = residualAfterYear2;
        return this;
    }

    public BigDecimal getResidualAfterYear3() {
        return this.residualAfterYear3;
    }

    public TCalculator setResidualAfterYear3(BigDecimal residualAfterYear3) {
        this.residualAfterYear3 = residualAfterYear3;
        return this;
    }

    public BigDecimal getResidualAfterYear4() {
        return this.residualAfterYear4;
    }

    public TCalculator setResidualAfterYear4(BigDecimal residualAfterYear4) {
        this.residualAfterYear4 = residualAfterYear4;
        return this;
    }

    public BigDecimal getResidualAfterYear5() {
        return this.residualAfterYear5;
    }

    public TCalculator setResidualAfterYear5(BigDecimal residualAfterYear5) {
        this.residualAfterYear5 = residualAfterYear5;
        return this;
    }

    public Integer getIsSpecialInvoice() {
        return this.isSpecialInvoice;
    }

    public TCalculator setIsSpecialInvoice(Integer isSpecialInvoice) {
        this.isSpecialInvoice = isSpecialInvoice;
        return this;
    }

    public BigDecimal getLogisticCost() {
        return this.logisticCost;
    }

    public TCalculator setLogisticCost(BigDecimal logisticCost) {
        this.logisticCost = logisticCost;
        return this;
    }

    public BigDecimal getRecoveryCost() {
        return this.recoveryCost;
    }

    public TCalculator setRecoveryCost(BigDecimal recoveryCost) {
        this.recoveryCost = recoveryCost;
        return this;
    }

    public BigDecimal getMonthlyMaintainaceCost() {
        return this.monthlyMaintainaceCost;
    }

    public TCalculator setMonthlyMaintainaceCost(BigDecimal monthlyMaintainaceCost) {
        this.monthlyMaintainaceCost = monthlyMaintainaceCost;
        return this;
    }

    public Integer getFreeWarrantyYear() {
        return this.freeWarrantyYear;
    }

    public TCalculator setFreeWarrantyYear(Integer freeWarrantyYear) {
        this.freeWarrantyYear = freeWarrantyYear;
        return this;
    }

    public BigDecimal getInterestRate() {
        return this.interestRate;
    }

    public TCalculator setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
        return this;
    }

    public BigDecimal getRiskRateNormal() {
        return this.riskRateNormal;
    }

    public TCalculator setRiskRateNormal(BigDecimal riskRateNormal) {
        this.riskRateNormal = riskRateNormal;
        return this;
    }

    public BigDecimal getRiskRateLow() {
        return this.riskRateLow;
    }

    public TCalculator setRiskRateLow(BigDecimal riskRateLow) {
        this.riskRateLow = riskRateLow;
        return this;
    }

    public BigDecimal getGoalRateNormal() {
        return this.goalRateNormal;
    }

    public TCalculator setGoalRateNormal(BigDecimal goalRateNormal) {
        this.goalRateNormal = goalRateNormal;
        return this;
    }

    public BigDecimal getGoalRateLow() {
        return this.goalRateLow;
    }

    public TCalculator setGoalRateLow(BigDecimal goalRateLow) {
        this.goalRateLow = goalRateLow;
        return this;
    }

    @Size(max = 65535)
    public String getNormalReturnRate() {
        return this.normalReturnRate;
    }

    public TCalculator setNormalReturnRate(String normalReturnRate) {
        this.normalReturnRate = normalReturnRate;
        return this;
    }

    @Size(max = 65535)
    public String getLowReturnRate() {
        return this.lowReturnRate;
    }

    public TCalculator setLowReturnRate(String lowReturnRate) {
        this.lowReturnRate = lowReturnRate;
        return this;
    }

    @Size(max = 65535)
    public String getCalculationResult() {
        return this.calculationResult;
    }

    public TCalculator setCalculationResult(String calculationResult) {
        this.calculationResult = calculationResult;
        return this;
    }

    public Integer getIsHistory() {
        return this.isHistory;
    }

    public TCalculator setIsHistory(Integer isHistory) {
        this.isHistory = isHistory;
        return this;
    }

    public Integer getIsValid() {
        return this.isValid;
    }

    public TCalculator setIsValid(Integer isValid) {
        this.isValid = isValid;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCalculator setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCalculator setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    public Integer getCreaterId() {
        return this.createrId;
    }

    public TCalculator setCreaterId(Integer createrId) {
        this.createrId = createrId;
        return this;
    }

    @Size(max = 20)
    public String getCreaterName() {
        return this.createrName;
    }

    public TCalculator setCreaterName(String createrName) {
        this.createrName = createrName;
        return this;
    }

    public Integer getDataStatus() {
        return this.dataStatus;
    }

    public TCalculator setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
        return this;
    }

    public Integer getRam() {
        return this.ram;
    }

    public TCalculator setRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public Integer getHd1() {
        return this.hd1;
    }

    public TCalculator setHd1(Integer hd1) {
        this.hd1 = hd1;
        return this;
    }

    public Integer getHd2() {
        return this.hd2;
    }

    public TCalculator setHd2(Integer hd2) {
        this.hd2 = hd2;
        return this;
    }

    public Integer getGpu() {
        return this.gpu;
    }

    public TCalculator setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }

    public Integer getScreenSize() {
        return this.screenSize;
    }

    public TCalculator setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public Integer getResolution() {
        return this.resolution;
    }

    public TCalculator setResolution(Integer resolution) {
        this.resolution = resolution;
        return this;
    }

    public BigDecimal getDeposit() {
        return this.deposit;
    }

    public TCalculator setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
        return this;
    }

    @Size(max = 300)
    public String getSku() {
        return this.sku;
    }

    public TCalculator setSku(String sku) {
        this.sku = sku;
        return this;
    }

    public Byte getRentOrSale() {
        return this.rentOrSale;
    }

    public TCalculator setRentOrSale(Byte rentOrSale) {
        this.rentOrSale = rentOrSale;
        return this;
    }

    public Byte getSkuRentOrSale() {
        return this.skuRentOrSale;
    }

    public TCalculator setSkuRentOrSale(Byte skuRentOrSale) {
        this.skuRentOrSale = skuRentOrSale;
        return this;
    }

    public BigDecimal getTransportCost() {
        return this.transportCost;
    }

    public TCalculator setTransportCost(BigDecimal transportCost) {
        this.transportCost = transportCost;
        return this;
    }

    public BigDecimal getProfitStartCounting() {
        return this.profitStartCounting;
    }

    public TCalculator setProfitStartCounting(BigDecimal profitStartCounting) {
        this.profitStartCounting = profitStartCounting;
        return this;
    }

    public BigDecimal getGrossInterestRate() {
        return this.grossInterestRate;
    }

    public TCalculator setGrossInterestRate(BigDecimal grossInterestRate) {
        this.grossInterestRate = grossInterestRate;
        return this;
    }

    public BigDecimal getMinSalePrice() {
        return this.minSalePrice;
    }

    public TCalculator setMinSalePrice(BigDecimal minSalePrice) {
        this.minSalePrice = minSalePrice;
        return this;
    }

    public BigDecimal getRealSalePrice() {
        return this.realSalePrice;
    }

    public TCalculator setRealSalePrice(BigDecimal realSalePrice) {
        this.realSalePrice = realSalePrice;
        return this;
    }

    public Integer getCpuType() {
        return this.cpuType;
    }

    public TCalculator setCpuType(Integer cpuType) {
        this.cpuType = cpuType;
        return this;
    }

    public Integer getCpuModel() {
        return this.cpuModel;
    }

    public TCalculator setCpuModel(Integer cpuModel) {
        this.cpuModel = cpuModel;
        return this;
    }

    public Integer getResourceType() {
        return this.resourceType;
    }

    public TCalculator setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCalculator (");

        sb.append(id);
        sb.append(", ").append(sheetNo);
        sb.append(", ").append(serialNo);
        sb.append(", ").append(productType);
        sb.append(", ").append(quality);
        sb.append(", ").append(brand);
        sb.append(", ").append(model);
        sb.append(", ").append(serviceStandard);
        sb.append(", ").append(os);
        sb.append(", ").append(coreConfig);
        sb.append(", ").append(uncoreConfig);
        sb.append(", ").append(purchasePrice);
        sb.append(", ").append(offerValidity);
        sb.append(", ").append(residualAfterYear1);
        sb.append(", ").append(residualAfterYear2);
        sb.append(", ").append(residualAfterYear3);
        sb.append(", ").append(residualAfterYear4);
        sb.append(", ").append(residualAfterYear5);
        sb.append(", ").append(isSpecialInvoice);
        sb.append(", ").append(logisticCost);
        sb.append(", ").append(recoveryCost);
        sb.append(", ").append(monthlyMaintainaceCost);
        sb.append(", ").append(freeWarrantyYear);
        sb.append(", ").append(interestRate);
        sb.append(", ").append(riskRateNormal);
        sb.append(", ").append(riskRateLow);
        sb.append(", ").append(goalRateNormal);
        sb.append(", ").append(goalRateLow);
        sb.append(", ").append(normalReturnRate);
        sb.append(", ").append(lowReturnRate);
        sb.append(", ").append(calculationResult);
        sb.append(", ").append(isHistory);
        sb.append(", ").append(isValid);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);
        sb.append(", ").append(createrId);
        sb.append(", ").append(createrName);
        sb.append(", ").append(dataStatus);
        sb.append(", ").append(ram);
        sb.append(", ").append(hd1);
        sb.append(", ").append(hd2);
        sb.append(", ").append(gpu);
        sb.append(", ").append(screenSize);
        sb.append(", ").append(resolution);
        sb.append(", ").append(deposit);
        sb.append(", ").append(sku);
        sb.append(", ").append(rentOrSale);
        sb.append(", ").append(skuRentOrSale);
        sb.append(", ").append(transportCost);
        sb.append(", ").append(profitStartCounting);
        sb.append(", ").append(grossInterestRate);
        sb.append(", ").append(minSalePrice);
        sb.append(", ").append(realSalePrice);
        sb.append(", ").append(cpuType);
        sb.append(", ").append(cpuModel);
        sb.append(", ").append(resourceType);

        sb.append(")");
        return sb.toString();
    }
}