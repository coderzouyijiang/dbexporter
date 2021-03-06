/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


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
public class TOrders implements Serializable {

    private static final long serialVersionUID = 1577459789;

    private Integer    id;
    private String     orderId;
    private String     mainOrderId;
    private Integer    customerId;
    private String     receiverName;
    private String     receiverPhone;
    private String     receiverAddress;
    private Integer    provinceId;
    private Integer    bcityId;
    private Integer    scityId;
    private String     companyName;
    private Byte       paymentType;
    private Byte       payType;
    private Byte       isShow;
    private Byte       source;
    private Byte       rentType;
    private Integer    startDate;
    private Integer    realStartDate;
    private String     userRemark;
    private String     systemRemark;
    private Integer    creditNewR;
    private Integer    creditOldR;
    private Integer    creditNewDiscountPercent;
    private Integer    creditOldDiscountPercent;
    private Integer    goodsNewDiscountPercent;
    private Integer    goodsOldDiscountPercent;
    private Integer    month;
    private Byte       payStatus;
    private Integer    status;
    private Byte       syncErpStatus;
    private String     syncErpFailReason;
    private Timestamp  syncErpDate;
    private Byte       syncStatus;
    private Byte       isSale;
    private Integer    oid;
    private Byte       isNeedBill;
    private Timestamp  payDate;
    private Integer    couponId;
    private BigDecimal couponAmount;
    private Timestamp  deliveryTime;
    private BigDecimal deposit;
    private BigDecimal oldDeposit;
    private BigDecimal rent;
    private BigDecimal oldRent;
    private BigDecimal insuranceAmount;
    private BigDecimal oldInsuranceAmount;
    private BigDecimal addedServiceAmount;
    private BigDecimal softServiceAmount;
    private BigDecimal onsiteServiceAmount;
    private Integer    suitsType;
    private BigDecimal saleAmount;
    private BigDecimal oldSaleAmount;
    private BigDecimal payedAmount;
    private BigDecimal eCurrencyVirtual;
    private BigDecimal creditDeposit;
    private BigDecimal payDeposit;
    private BigDecimal needAmount;
    private Integer    billDate;
    private Integer    nowBalanceNum;
    private Byte       isExpire;
    private Byte       isExchange;
    private String     sourceOrderId;
    private Timestamp  cdate;
    private Timestamp  mdate;
    private BigDecimal realPayDeposit;
    private Integer    rentTypeId;
    private Byte       renewalStatus;
    private Byte       orderType;
    private Integer    warehouseId;
    private String     warehouseName;
    private Byte       interviewStatus;
    private Byte       isAliApp;
    private Byte       isZhimaCredit;
    private Byte       syncErpFailType;
    private String     zhimaOrderNo;
    private String     zhimaCreditOrderNo;
    private String     zhimaLeaseOrderNo;
    private Timestamp  interviewDate;
    private Byte       isVirtual;
    private Byte       virtualReason;
    private String     originalOrderId;

    public TOrders() {}

    public TOrders(TOrders value) {
        this.id = value.id;
        this.orderId = value.orderId;
        this.mainOrderId = value.mainOrderId;
        this.customerId = value.customerId;
        this.receiverName = value.receiverName;
        this.receiverPhone = value.receiverPhone;
        this.receiverAddress = value.receiverAddress;
        this.provinceId = value.provinceId;
        this.bcityId = value.bcityId;
        this.scityId = value.scityId;
        this.companyName = value.companyName;
        this.paymentType = value.paymentType;
        this.payType = value.payType;
        this.isShow = value.isShow;
        this.source = value.source;
        this.rentType = value.rentType;
        this.startDate = value.startDate;
        this.realStartDate = value.realStartDate;
        this.userRemark = value.userRemark;
        this.systemRemark = value.systemRemark;
        this.creditNewR = value.creditNewR;
        this.creditOldR = value.creditOldR;
        this.creditNewDiscountPercent = value.creditNewDiscountPercent;
        this.creditOldDiscountPercent = value.creditOldDiscountPercent;
        this.goodsNewDiscountPercent = value.goodsNewDiscountPercent;
        this.goodsOldDiscountPercent = value.goodsOldDiscountPercent;
        this.month = value.month;
        this.payStatus = value.payStatus;
        this.status = value.status;
        this.syncErpStatus = value.syncErpStatus;
        this.syncErpFailReason = value.syncErpFailReason;
        this.syncErpDate = value.syncErpDate;
        this.syncStatus = value.syncStatus;
        this.isSale = value.isSale;
        this.oid = value.oid;
        this.isNeedBill = value.isNeedBill;
        this.payDate = value.payDate;
        this.couponId = value.couponId;
        this.couponAmount = value.couponAmount;
        this.deliveryTime = value.deliveryTime;
        this.deposit = value.deposit;
        this.oldDeposit = value.oldDeposit;
        this.rent = value.rent;
        this.oldRent = value.oldRent;
        this.insuranceAmount = value.insuranceAmount;
        this.oldInsuranceAmount = value.oldInsuranceAmount;
        this.addedServiceAmount = value.addedServiceAmount;
        this.softServiceAmount = value.softServiceAmount;
        this.onsiteServiceAmount = value.onsiteServiceAmount;
        this.suitsType = value.suitsType;
        this.saleAmount = value.saleAmount;
        this.oldSaleAmount = value.oldSaleAmount;
        this.payedAmount = value.payedAmount;
        this.eCurrencyVirtual = value.eCurrencyVirtual;
        this.creditDeposit = value.creditDeposit;
        this.payDeposit = value.payDeposit;
        this.needAmount = value.needAmount;
        this.billDate = value.billDate;
        this.nowBalanceNum = value.nowBalanceNum;
        this.isExpire = value.isExpire;
        this.isExchange = value.isExchange;
        this.sourceOrderId = value.sourceOrderId;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
        this.realPayDeposit = value.realPayDeposit;
        this.rentTypeId = value.rentTypeId;
        this.renewalStatus = value.renewalStatus;
        this.orderType = value.orderType;
        this.warehouseId = value.warehouseId;
        this.warehouseName = value.warehouseName;
        this.interviewStatus = value.interviewStatus;
        this.isAliApp = value.isAliApp;
        this.isZhimaCredit = value.isZhimaCredit;
        this.syncErpFailType = value.syncErpFailType;
        this.zhimaOrderNo = value.zhimaOrderNo;
        this.zhimaCreditOrderNo = value.zhimaCreditOrderNo;
        this.zhimaLeaseOrderNo = value.zhimaLeaseOrderNo;
        this.interviewDate = value.interviewDate;
        this.isVirtual = value.isVirtual;
        this.virtualReason = value.virtualReason;
        this.originalOrderId = value.originalOrderId;
    }

    public TOrders(
        Integer    id,
        String     orderId,
        String     mainOrderId,
        Integer    customerId,
        String     receiverName,
        String     receiverPhone,
        String     receiverAddress,
        Integer    provinceId,
        Integer    bcityId,
        Integer    scityId,
        String     companyName,
        Byte       paymentType,
        Byte       payType,
        Byte       isShow,
        Byte       source,
        Byte       rentType,
        Integer    startDate,
        Integer    realStartDate,
        String     userRemark,
        String     systemRemark,
        Integer    creditNewR,
        Integer    creditOldR,
        Integer    creditNewDiscountPercent,
        Integer    creditOldDiscountPercent,
        Integer    goodsNewDiscountPercent,
        Integer    goodsOldDiscountPercent,
        Integer    month,
        Byte       payStatus,
        Integer    status,
        Byte       syncErpStatus,
        String     syncErpFailReason,
        Timestamp  syncErpDate,
        Byte       syncStatus,
        Byte       isSale,
        Integer    oid,
        Byte       isNeedBill,
        Timestamp  payDate,
        Integer    couponId,
        BigDecimal couponAmount,
        Timestamp  deliveryTime,
        BigDecimal deposit,
        BigDecimal oldDeposit,
        BigDecimal rent,
        BigDecimal oldRent,
        BigDecimal insuranceAmount,
        BigDecimal oldInsuranceAmount,
        BigDecimal addedServiceAmount,
        BigDecimal softServiceAmount,
        BigDecimal onsiteServiceAmount,
        Integer    suitsType,
        BigDecimal saleAmount,
        BigDecimal oldSaleAmount,
        BigDecimal payedAmount,
        BigDecimal eCurrencyVirtual,
        BigDecimal creditDeposit,
        BigDecimal payDeposit,
        BigDecimal needAmount,
        Integer    billDate,
        Integer    nowBalanceNum,
        Byte       isExpire,
        Byte       isExchange,
        String     sourceOrderId,
        Timestamp  cdate,
        Timestamp  mdate,
        BigDecimal realPayDeposit,
        Integer    rentTypeId,
        Byte       renewalStatus,
        Byte       orderType,
        Integer    warehouseId,
        String     warehouseName,
        Byte       interviewStatus,
        Byte       isAliApp,
        Byte       isZhimaCredit,
        Byte       syncErpFailType,
        String     zhimaOrderNo,
        String     zhimaCreditOrderNo,
        String     zhimaLeaseOrderNo,
        Timestamp  interviewDate,
        Byte       isVirtual,
        Byte       virtualReason,
        String     originalOrderId
    ) {
        this.id = id;
        this.orderId = orderId;
        this.mainOrderId = mainOrderId;
        this.customerId = customerId;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.receiverAddress = receiverAddress;
        this.provinceId = provinceId;
        this.bcityId = bcityId;
        this.scityId = scityId;
        this.companyName = companyName;
        this.paymentType = paymentType;
        this.payType = payType;
        this.isShow = isShow;
        this.source = source;
        this.rentType = rentType;
        this.startDate = startDate;
        this.realStartDate = realStartDate;
        this.userRemark = userRemark;
        this.systemRemark = systemRemark;
        this.creditNewR = creditNewR;
        this.creditOldR = creditOldR;
        this.creditNewDiscountPercent = creditNewDiscountPercent;
        this.creditOldDiscountPercent = creditOldDiscountPercent;
        this.goodsNewDiscountPercent = goodsNewDiscountPercent;
        this.goodsOldDiscountPercent = goodsOldDiscountPercent;
        this.month = month;
        this.payStatus = payStatus;
        this.status = status;
        this.syncErpStatus = syncErpStatus;
        this.syncErpFailReason = syncErpFailReason;
        this.syncErpDate = syncErpDate;
        this.syncStatus = syncStatus;
        this.isSale = isSale;
        this.oid = oid;
        this.isNeedBill = isNeedBill;
        this.payDate = payDate;
        this.couponId = couponId;
        this.couponAmount = couponAmount;
        this.deliveryTime = deliveryTime;
        this.deposit = deposit;
        this.oldDeposit = oldDeposit;
        this.rent = rent;
        this.oldRent = oldRent;
        this.insuranceAmount = insuranceAmount;
        this.oldInsuranceAmount = oldInsuranceAmount;
        this.addedServiceAmount = addedServiceAmount;
        this.softServiceAmount = softServiceAmount;
        this.onsiteServiceAmount = onsiteServiceAmount;
        this.suitsType = suitsType;
        this.saleAmount = saleAmount;
        this.oldSaleAmount = oldSaleAmount;
        this.payedAmount = payedAmount;
        this.eCurrencyVirtual = eCurrencyVirtual;
        this.creditDeposit = creditDeposit;
        this.payDeposit = payDeposit;
        this.needAmount = needAmount;
        this.billDate = billDate;
        this.nowBalanceNum = nowBalanceNum;
        this.isExpire = isExpire;
        this.isExchange = isExchange;
        this.sourceOrderId = sourceOrderId;
        this.cdate = cdate;
        this.mdate = mdate;
        this.realPayDeposit = realPayDeposit;
        this.rentTypeId = rentTypeId;
        this.renewalStatus = renewalStatus;
        this.orderType = orderType;
        this.warehouseId = warehouseId;
        this.warehouseName = warehouseName;
        this.interviewStatus = interviewStatus;
        this.isAliApp = isAliApp;
        this.isZhimaCredit = isZhimaCredit;
        this.syncErpFailType = syncErpFailType;
        this.zhimaOrderNo = zhimaOrderNo;
        this.zhimaCreditOrderNo = zhimaCreditOrderNo;
        this.zhimaLeaseOrderNo = zhimaLeaseOrderNo;
        this.interviewDate = interviewDate;
        this.isVirtual = isVirtual;
        this.virtualReason = virtualReason;
        this.originalOrderId = originalOrderId;
    }

    public Integer getId() {
        return this.id;
    }

    public TOrders setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    @Size(max = 20)
    public String getOrderId() {
        return this.orderId;
    }

    public TOrders setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Size(max = 20)
    public String getMainOrderId() {
        return this.mainOrderId;
    }

    public TOrders setMainOrderId(String mainOrderId) {
        this.mainOrderId = mainOrderId;
        return this;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public TOrders setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    @NotNull
    @Size(max = 50)
    public String getReceiverName() {
        return this.receiverName;
    }

    public TOrders setReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }

    @NotNull
    @Size(max = 32)
    public String getReceiverPhone() {
        return this.receiverPhone;
    }

    public TOrders setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
        return this;
    }

    @NotNull
    @Size(max = 500)
    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    public TOrders setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
        return this;
    }

    @NotNull
    public Integer getProvinceId() {
        return this.provinceId;
    }

    public TOrders setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    @NotNull
    public Integer getBcityId() {
        return this.bcityId;
    }

    public TOrders setBcityId(Integer bcityId) {
        this.bcityId = bcityId;
        return this;
    }

    @NotNull
    public Integer getScityId() {
        return this.scityId;
    }

    public TOrders setScityId(Integer scityId) {
        this.scityId = scityId;
        return this;
    }

    @Size(max = 300)
    public String getCompanyName() {
        return this.companyName;
    }

    public TOrders setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public Byte getPaymentType() {
        return this.paymentType;
    }

    public TOrders setPaymentType(Byte paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    public Byte getPayType() {
        return this.payType;
    }

    public TOrders setPayType(Byte payType) {
        this.payType = payType;
        return this;
    }

    public Byte getIsShow() {
        return this.isShow;
    }

    public TOrders setIsShow(Byte isShow) {
        this.isShow = isShow;
        return this;
    }

    public Byte getSource() {
        return this.source;
    }

    public TOrders setSource(Byte source) {
        this.source = source;
        return this;
    }

    public Byte getRentType() {
        return this.rentType;
    }

    public TOrders setRentType(Byte rentType) {
        this.rentType = rentType;
        return this;
    }

    public Integer getStartDate() {
        return this.startDate;
    }

    public TOrders setStartDate(Integer startDate) {
        this.startDate = startDate;
        return this;
    }

    public Integer getRealStartDate() {
        return this.realStartDate;
    }

    public TOrders setRealStartDate(Integer realStartDate) {
        this.realStartDate = realStartDate;
        return this;
    }

    @Size(max = 500)
    public String getUserRemark() {
        return this.userRemark;
    }

    public TOrders setUserRemark(String userRemark) {
        this.userRemark = userRemark;
        return this;
    }

    @Size(max = 500)
    public String getSystemRemark() {
        return this.systemRemark;
    }

    public TOrders setSystemRemark(String systemRemark) {
        this.systemRemark = systemRemark;
        return this;
    }

    public Integer getCreditNewR() {
        return this.creditNewR;
    }

    public TOrders setCreditNewR(Integer creditNewR) {
        this.creditNewR = creditNewR;
        return this;
    }

    public Integer getCreditOldR() {
        return this.creditOldR;
    }

    public TOrders setCreditOldR(Integer creditOldR) {
        this.creditOldR = creditOldR;
        return this;
    }

    public Integer getCreditNewDiscountPercent() {
        return this.creditNewDiscountPercent;
    }

    public TOrders setCreditNewDiscountPercent(Integer creditNewDiscountPercent) {
        this.creditNewDiscountPercent = creditNewDiscountPercent;
        return this;
    }

    public Integer getCreditOldDiscountPercent() {
        return this.creditOldDiscountPercent;
    }

    public TOrders setCreditOldDiscountPercent(Integer creditOldDiscountPercent) {
        this.creditOldDiscountPercent = creditOldDiscountPercent;
        return this;
    }

    public Integer getGoodsNewDiscountPercent() {
        return this.goodsNewDiscountPercent;
    }

    public TOrders setGoodsNewDiscountPercent(Integer goodsNewDiscountPercent) {
        this.goodsNewDiscountPercent = goodsNewDiscountPercent;
        return this;
    }

    public Integer getGoodsOldDiscountPercent() {
        return this.goodsOldDiscountPercent;
    }

    public TOrders setGoodsOldDiscountPercent(Integer goodsOldDiscountPercent) {
        this.goodsOldDiscountPercent = goodsOldDiscountPercent;
        return this;
    }

    public Integer getMonth() {
        return this.month;
    }

    public TOrders setMonth(Integer month) {
        this.month = month;
        return this;
    }

    public Byte getPayStatus() {
        return this.payStatus;
    }

    public TOrders setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
        return this;
    }

    @NotNull
    public Integer getStatus() {
        return this.status;
    }

    public TOrders setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Byte getSyncErpStatus() {
        return this.syncErpStatus;
    }

    public TOrders setSyncErpStatus(Byte syncErpStatus) {
        this.syncErpStatus = syncErpStatus;
        return this;
    }

    @Size(max = 300)
    public String getSyncErpFailReason() {
        return this.syncErpFailReason;
    }

    public TOrders setSyncErpFailReason(String syncErpFailReason) {
        this.syncErpFailReason = syncErpFailReason;
        return this;
    }

    public Timestamp getSyncErpDate() {
        return this.syncErpDate;
    }

    public TOrders setSyncErpDate(Timestamp syncErpDate) {
        this.syncErpDate = syncErpDate;
        return this;
    }

    @NotNull
    public Byte getSyncStatus() {
        return this.syncStatus;
    }

    public TOrders setSyncStatus(Byte syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    public Byte getIsSale() {
        return this.isSale;
    }

    public TOrders setIsSale(Byte isSale) {
        this.isSale = isSale;
        return this;
    }

    public Integer getOid() {
        return this.oid;
    }

    public TOrders setOid(Integer oid) {
        this.oid = oid;
        return this;
    }

    public Byte getIsNeedBill() {
        return this.isNeedBill;
    }

    public TOrders setIsNeedBill(Byte isNeedBill) {
        this.isNeedBill = isNeedBill;
        return this;
    }

    public Timestamp getPayDate() {
        return this.payDate;
    }

    public TOrders setPayDate(Timestamp payDate) {
        this.payDate = payDate;
        return this;
    }

    public Integer getCouponId() {
        return this.couponId;
    }

    public TOrders setCouponId(Integer couponId) {
        this.couponId = couponId;
        return this;
    }

    public BigDecimal getCouponAmount() {
        return this.couponAmount;
    }

    public TOrders setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }

    public Timestamp getDeliveryTime() {
        return this.deliveryTime;
    }

    public TOrders setDeliveryTime(Timestamp deliveryTime) {
        this.deliveryTime = deliveryTime;
        return this;
    }

    public BigDecimal getDeposit() {
        return this.deposit;
    }

    public TOrders setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
        return this;
    }

    public BigDecimal getOldDeposit() {
        return this.oldDeposit;
    }

    public TOrders setOldDeposit(BigDecimal oldDeposit) {
        this.oldDeposit = oldDeposit;
        return this;
    }

    public BigDecimal getRent() {
        return this.rent;
    }

    public TOrders setRent(BigDecimal rent) {
        this.rent = rent;
        return this;
    }

    public BigDecimal getOldRent() {
        return this.oldRent;
    }

    public TOrders setOldRent(BigDecimal oldRent) {
        this.oldRent = oldRent;
        return this;
    }

    public BigDecimal getInsuranceAmount() {
        return this.insuranceAmount;
    }

    public TOrders setInsuranceAmount(BigDecimal insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
        return this;
    }

    public BigDecimal getOldInsuranceAmount() {
        return this.oldInsuranceAmount;
    }

    public TOrders setOldInsuranceAmount(BigDecimal oldInsuranceAmount) {
        this.oldInsuranceAmount = oldInsuranceAmount;
        return this;
    }

    public BigDecimal getAddedServiceAmount() {
        return this.addedServiceAmount;
    }

    public TOrders setAddedServiceAmount(BigDecimal addedServiceAmount) {
        this.addedServiceAmount = addedServiceAmount;
        return this;
    }

    public BigDecimal getSoftServiceAmount() {
        return this.softServiceAmount;
    }

    public TOrders setSoftServiceAmount(BigDecimal softServiceAmount) {
        this.softServiceAmount = softServiceAmount;
        return this;
    }

    public BigDecimal getOnsiteServiceAmount() {
        return this.onsiteServiceAmount;
    }

    public TOrders setOnsiteServiceAmount(BigDecimal onsiteServiceAmount) {
        this.onsiteServiceAmount = onsiteServiceAmount;
        return this;
    }

    public Integer getSuitsType() {
        return this.suitsType;
    }

    public TOrders setSuitsType(Integer suitsType) {
        this.suitsType = suitsType;
        return this;
    }

    public BigDecimal getSaleAmount() {
        return this.saleAmount;
    }

    public TOrders setSaleAmount(BigDecimal saleAmount) {
        this.saleAmount = saleAmount;
        return this;
    }

    public BigDecimal getOldSaleAmount() {
        return this.oldSaleAmount;
    }

    public TOrders setOldSaleAmount(BigDecimal oldSaleAmount) {
        this.oldSaleAmount = oldSaleAmount;
        return this;
    }

    public BigDecimal getPayedAmount() {
        return this.payedAmount;
    }

    public TOrders setPayedAmount(BigDecimal payedAmount) {
        this.payedAmount = payedAmount;
        return this;
    }

    public BigDecimal getECurrencyVirtual() {
        return this.eCurrencyVirtual;
    }

    public TOrders setECurrencyVirtual(BigDecimal eCurrencyVirtual) {
        this.eCurrencyVirtual = eCurrencyVirtual;
        return this;
    }

    public BigDecimal getCreditDeposit() {
        return this.creditDeposit;
    }

    public TOrders setCreditDeposit(BigDecimal creditDeposit) {
        this.creditDeposit = creditDeposit;
        return this;
    }

    public BigDecimal getPayDeposit() {
        return this.payDeposit;
    }

    public TOrders setPayDeposit(BigDecimal payDeposit) {
        this.payDeposit = payDeposit;
        return this;
    }

    public BigDecimal getNeedAmount() {
        return this.needAmount;
    }

    public TOrders setNeedAmount(BigDecimal needAmount) {
        this.needAmount = needAmount;
        return this;
    }

    public Integer getBillDate() {
        return this.billDate;
    }

    public TOrders setBillDate(Integer billDate) {
        this.billDate = billDate;
        return this;
    }

    public Integer getNowBalanceNum() {
        return this.nowBalanceNum;
    }

    public TOrders setNowBalanceNum(Integer nowBalanceNum) {
        this.nowBalanceNum = nowBalanceNum;
        return this;
    }

    public Byte getIsExpire() {
        return this.isExpire;
    }

    public TOrders setIsExpire(Byte isExpire) {
        this.isExpire = isExpire;
        return this;
    }

    public Byte getIsExchange() {
        return this.isExchange;
    }

    public TOrders setIsExchange(Byte isExchange) {
        this.isExchange = isExchange;
        return this;
    }

    @Size(max = 20)
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    public TOrders setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TOrders setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TOrders setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    public BigDecimal getRealPayDeposit() {
        return this.realPayDeposit;
    }

    public TOrders setRealPayDeposit(BigDecimal realPayDeposit) {
        this.realPayDeposit = realPayDeposit;
        return this;
    }

    public Integer getRentTypeId() {
        return this.rentTypeId;
    }

    public TOrders setRentTypeId(Integer rentTypeId) {
        this.rentTypeId = rentTypeId;
        return this;
    }

    public Byte getRenewalStatus() {
        return this.renewalStatus;
    }

    public TOrders setRenewalStatus(Byte renewalStatus) {
        this.renewalStatus = renewalStatus;
        return this;
    }

    public Byte getOrderType() {
        return this.orderType;
    }

    public TOrders setOrderType(Byte orderType) {
        this.orderType = orderType;
        return this;
    }

    public Integer getWarehouseId() {
        return this.warehouseId;
    }

    public TOrders setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }

    @Size(max = 11)
    public String getWarehouseName() {
        return this.warehouseName;
    }

    public TOrders setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
        return this;
    }

    public Byte getInterviewStatus() {
        return this.interviewStatus;
    }

    public TOrders setInterviewStatus(Byte interviewStatus) {
        this.interviewStatus = interviewStatus;
        return this;
    }

    public Byte getIsAliApp() {
        return this.isAliApp;
    }

    public TOrders setIsAliApp(Byte isAliApp) {
        this.isAliApp = isAliApp;
        return this;
    }

    public Byte getIsZhimaCredit() {
        return this.isZhimaCredit;
    }

    public TOrders setIsZhimaCredit(Byte isZhimaCredit) {
        this.isZhimaCredit = isZhimaCredit;
        return this;
    }

    public Byte getSyncErpFailType() {
        return this.syncErpFailType;
    }

    public TOrders setSyncErpFailType(Byte syncErpFailType) {
        this.syncErpFailType = syncErpFailType;
        return this;
    }

    @Size(max = 255)
    public String getZhimaOrderNo() {
        return this.zhimaOrderNo;
    }

    public TOrders setZhimaOrderNo(String zhimaOrderNo) {
        this.zhimaOrderNo = zhimaOrderNo;
        return this;
    }

    @Size(max = 255)
    public String getZhimaCreditOrderNo() {
        return this.zhimaCreditOrderNo;
    }

    public TOrders setZhimaCreditOrderNo(String zhimaCreditOrderNo) {
        this.zhimaCreditOrderNo = zhimaCreditOrderNo;
        return this;
    }

    @Size(max = 255)
    public String getZhimaLeaseOrderNo() {
        return this.zhimaLeaseOrderNo;
    }

    public TOrders setZhimaLeaseOrderNo(String zhimaLeaseOrderNo) {
        this.zhimaLeaseOrderNo = zhimaLeaseOrderNo;
        return this;
    }

    public Timestamp getInterviewDate() {
        return this.interviewDate;
    }

    public TOrders setInterviewDate(Timestamp interviewDate) {
        this.interviewDate = interviewDate;
        return this;
    }

    public Byte getIsVirtual() {
        return this.isVirtual;
    }

    public TOrders setIsVirtual(Byte isVirtual) {
        this.isVirtual = isVirtual;
        return this;
    }

    public Byte getVirtualReason() {
        return this.virtualReason;
    }

    public TOrders setVirtualReason(Byte virtualReason) {
        this.virtualReason = virtualReason;
        return this;
    }

    @Size(max = 20)
    public String getOriginalOrderId() {
        return this.originalOrderId;
    }

    public TOrders setOriginalOrderId(String originalOrderId) {
        this.originalOrderId = originalOrderId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TOrders (");

        sb.append(id);
        sb.append(", ").append(orderId);
        sb.append(", ").append(mainOrderId);
        sb.append(", ").append(customerId);
        sb.append(", ").append(receiverName);
        sb.append(", ").append(receiverPhone);
        sb.append(", ").append(receiverAddress);
        sb.append(", ").append(provinceId);
        sb.append(", ").append(bcityId);
        sb.append(", ").append(scityId);
        sb.append(", ").append(companyName);
        sb.append(", ").append(paymentType);
        sb.append(", ").append(payType);
        sb.append(", ").append(isShow);
        sb.append(", ").append(source);
        sb.append(", ").append(rentType);
        sb.append(", ").append(startDate);
        sb.append(", ").append(realStartDate);
        sb.append(", ").append(userRemark);
        sb.append(", ").append(systemRemark);
        sb.append(", ").append(creditNewR);
        sb.append(", ").append(creditOldR);
        sb.append(", ").append(creditNewDiscountPercent);
        sb.append(", ").append(creditOldDiscountPercent);
        sb.append(", ").append(goodsNewDiscountPercent);
        sb.append(", ").append(goodsOldDiscountPercent);
        sb.append(", ").append(month);
        sb.append(", ").append(payStatus);
        sb.append(", ").append(status);
        sb.append(", ").append(syncErpStatus);
        sb.append(", ").append(syncErpFailReason);
        sb.append(", ").append(syncErpDate);
        sb.append(", ").append(syncStatus);
        sb.append(", ").append(isSale);
        sb.append(", ").append(oid);
        sb.append(", ").append(isNeedBill);
        sb.append(", ").append(payDate);
        sb.append(", ").append(couponId);
        sb.append(", ").append(couponAmount);
        sb.append(", ").append(deliveryTime);
        sb.append(", ").append(deposit);
        sb.append(", ").append(oldDeposit);
        sb.append(", ").append(rent);
        sb.append(", ").append(oldRent);
        sb.append(", ").append(insuranceAmount);
        sb.append(", ").append(oldInsuranceAmount);
        sb.append(", ").append(addedServiceAmount);
        sb.append(", ").append(softServiceAmount);
        sb.append(", ").append(onsiteServiceAmount);
        sb.append(", ").append(suitsType);
        sb.append(", ").append(saleAmount);
        sb.append(", ").append(oldSaleAmount);
        sb.append(", ").append(payedAmount);
        sb.append(", ").append(eCurrencyVirtual);
        sb.append(", ").append(creditDeposit);
        sb.append(", ").append(payDeposit);
        sb.append(", ").append(needAmount);
        sb.append(", ").append(billDate);
        sb.append(", ").append(nowBalanceNum);
        sb.append(", ").append(isExpire);
        sb.append(", ").append(isExchange);
        sb.append(", ").append(sourceOrderId);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);
        sb.append(", ").append(realPayDeposit);
        sb.append(", ").append(rentTypeId);
        sb.append(", ").append(renewalStatus);
        sb.append(", ").append(orderType);
        sb.append(", ").append(warehouseId);
        sb.append(", ").append(warehouseName);
        sb.append(", ").append(interviewStatus);
        sb.append(", ").append(isAliApp);
        sb.append(", ").append(isZhimaCredit);
        sb.append(", ").append(syncErpFailType);
        sb.append(", ").append(zhimaOrderNo);
        sb.append(", ").append(zhimaCreditOrderNo);
        sb.append(", ").append(zhimaLeaseOrderNo);
        sb.append(", ").append(interviewDate);
        sb.append(", ").append(isVirtual);
        sb.append(", ").append(virtualReason);
        sb.append(", ").append(originalOrderId);

        sb.append(")");
        return sb.toString();
    }
}
