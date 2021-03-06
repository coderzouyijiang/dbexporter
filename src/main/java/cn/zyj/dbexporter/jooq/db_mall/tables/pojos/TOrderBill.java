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
public class TOrderBill implements Serializable {

    private static final long serialVersionUID = -1344471070;

    private Long       id;
    private String     billCode;
    private Integer    customerId;
    private String     orderId;
    private String     mainOrderId;
    private Integer    couponId;
    private BigDecimal couponAmount;
    private BigDecimal amount;
    private Byte       status;
    private Integer    typeId;
    private Integer    source;
    private Integer    month;
    private String     remark;
    private Timestamp  payDate;
    private Integer    balanceDate;
    private Integer    cutMoneyDate;
    private Integer    billMonth;
    private Integer    sourceId;
    private BigDecimal deposit;
    private BigDecimal creditDeposit;
    private Byte       isExpire;
    private Integer    smsDate;
    private BigDecimal payedAmount;
    private BigDecimal eCurrencyVirtual;
    private Timestamp  cdate;
    private Timestamp  mdate;
    private Short      syncStatus;
    private Long       billGroup;
    private Long       batchId;
    private Byte       afterPayed;
    private Integer    effect;

    public TOrderBill() {}

    public TOrderBill(TOrderBill value) {
        this.id = value.id;
        this.billCode = value.billCode;
        this.customerId = value.customerId;
        this.orderId = value.orderId;
        this.mainOrderId = value.mainOrderId;
        this.couponId = value.couponId;
        this.couponAmount = value.couponAmount;
        this.amount = value.amount;
        this.status = value.status;
        this.typeId = value.typeId;
        this.source = value.source;
        this.month = value.month;
        this.remark = value.remark;
        this.payDate = value.payDate;
        this.balanceDate = value.balanceDate;
        this.cutMoneyDate = value.cutMoneyDate;
        this.billMonth = value.billMonth;
        this.sourceId = value.sourceId;
        this.deposit = value.deposit;
        this.creditDeposit = value.creditDeposit;
        this.isExpire = value.isExpire;
        this.smsDate = value.smsDate;
        this.payedAmount = value.payedAmount;
        this.eCurrencyVirtual = value.eCurrencyVirtual;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
        this.syncStatus = value.syncStatus;
        this.billGroup = value.billGroup;
        this.batchId = value.batchId;
        this.afterPayed = value.afterPayed;
        this.effect = value.effect;
    }

    public TOrderBill(
        Long       id,
        String     billCode,
        Integer    customerId,
        String     orderId,
        String     mainOrderId,
        Integer    couponId,
        BigDecimal couponAmount,
        BigDecimal amount,
        Byte       status,
        Integer    typeId,
        Integer    source,
        Integer    month,
        String     remark,
        Timestamp  payDate,
        Integer    balanceDate,
        Integer    cutMoneyDate,
        Integer    billMonth,
        Integer    sourceId,
        BigDecimal deposit,
        BigDecimal creditDeposit,
        Byte       isExpire,
        Integer    smsDate,
        BigDecimal payedAmount,
        BigDecimal eCurrencyVirtual,
        Timestamp  cdate,
        Timestamp  mdate,
        Short      syncStatus,
        Long       billGroup,
        Long       batchId,
        Byte       afterPayed,
        Integer    effect
    ) {
        this.id = id;
        this.billCode = billCode;
        this.customerId = customerId;
        this.orderId = orderId;
        this.mainOrderId = mainOrderId;
        this.couponId = couponId;
        this.couponAmount = couponAmount;
        this.amount = amount;
        this.status = status;
        this.typeId = typeId;
        this.source = source;
        this.month = month;
        this.remark = remark;
        this.payDate = payDate;
        this.balanceDate = balanceDate;
        this.cutMoneyDate = cutMoneyDate;
        this.billMonth = billMonth;
        this.sourceId = sourceId;
        this.deposit = deposit;
        this.creditDeposit = creditDeposit;
        this.isExpire = isExpire;
        this.smsDate = smsDate;
        this.payedAmount = payedAmount;
        this.eCurrencyVirtual = eCurrencyVirtual;
        this.cdate = cdate;
        this.mdate = mdate;
        this.syncStatus = syncStatus;
        this.billGroup = billGroup;
        this.batchId = batchId;
        this.afterPayed = afterPayed;
        this.effect = effect;
    }

    public Long getId() {
        return this.id;
    }

    public TOrderBill setId(Long id) {
        this.id = id;
        return this;
    }

    @Size(max = 30)
    public String getBillCode() {
        return this.billCode;
    }

    public TOrderBill setBillCode(String billCode) {
        this.billCode = billCode;
        return this;
    }

    @NotNull
    public Integer getCustomerId() {
        return this.customerId;
    }

    public TOrderBill setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    @NotNull
    @Size(max = 20)
    public String getOrderId() {
        return this.orderId;
    }

    public TOrderBill setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @NotNull
    @Size(max = 20)
    public String getMainOrderId() {
        return this.mainOrderId;
    }

    public TOrderBill setMainOrderId(String mainOrderId) {
        this.mainOrderId = mainOrderId;
        return this;
    }

    public Integer getCouponId() {
        return this.couponId;
    }

    public TOrderBill setCouponId(Integer couponId) {
        this.couponId = couponId;
        return this;
    }

    public BigDecimal getCouponAmount() {
        return this.couponAmount;
    }

    public TOrderBill setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }

    @NotNull
    public BigDecimal getAmount() {
        return this.amount;
    }

    public TOrderBill setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public Byte getStatus() {
        return this.status;
    }

    public TOrderBill setStatus(Byte status) {
        this.status = status;
        return this;
    }

    public Integer getTypeId() {
        return this.typeId;
    }

    public TOrderBill setTypeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    public Integer getSource() {
        return this.source;
    }

    public TOrderBill setSource(Integer source) {
        this.source = source;
        return this;
    }

    public Integer getMonth() {
        return this.month;
    }

    public TOrderBill setMonth(Integer month) {
        this.month = month;
        return this;
    }

    @Size(max = 100)
    public String getRemark() {
        return this.remark;
    }

    public TOrderBill setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public Timestamp getPayDate() {
        return this.payDate;
    }

    public TOrderBill setPayDate(Timestamp payDate) {
        this.payDate = payDate;
        return this;
    }

    @NotNull
    public Integer getBalanceDate() {
        return this.balanceDate;
    }

    public TOrderBill setBalanceDate(Integer balanceDate) {
        this.balanceDate = balanceDate;
        return this;
    }

    public Integer getCutMoneyDate() {
        return this.cutMoneyDate;
    }

    public TOrderBill setCutMoneyDate(Integer cutMoneyDate) {
        this.cutMoneyDate = cutMoneyDate;
        return this;
    }

    public Integer getBillMonth() {
        return this.billMonth;
    }

    public TOrderBill setBillMonth(Integer billMonth) {
        this.billMonth = billMonth;
        return this;
    }

    public Integer getSourceId() {
        return this.sourceId;
    }

    public TOrderBill setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public BigDecimal getDeposit() {
        return this.deposit;
    }

    public TOrderBill setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
        return this;
    }

    public BigDecimal getCreditDeposit() {
        return this.creditDeposit;
    }

    public TOrderBill setCreditDeposit(BigDecimal creditDeposit) {
        this.creditDeposit = creditDeposit;
        return this;
    }

    public Byte getIsExpire() {
        return this.isExpire;
    }

    public TOrderBill setIsExpire(Byte isExpire) {
        this.isExpire = isExpire;
        return this;
    }

    public Integer getSmsDate() {
        return this.smsDate;
    }

    public TOrderBill setSmsDate(Integer smsDate) {
        this.smsDate = smsDate;
        return this;
    }

    public BigDecimal getPayedAmount() {
        return this.payedAmount;
    }

    public TOrderBill setPayedAmount(BigDecimal payedAmount) {
        this.payedAmount = payedAmount;
        return this;
    }

    public BigDecimal getECurrencyVirtual() {
        return this.eCurrencyVirtual;
    }

    public TOrderBill setECurrencyVirtual(BigDecimal eCurrencyVirtual) {
        this.eCurrencyVirtual = eCurrencyVirtual;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TOrderBill setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TOrderBill setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    public Short getSyncStatus() {
        return this.syncStatus;
    }

    public TOrderBill setSyncStatus(Short syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    public Long getBillGroup() {
        return this.billGroup;
    }

    public TOrderBill setBillGroup(Long billGroup) {
        this.billGroup = billGroup;
        return this;
    }

    public Long getBatchId() {
        return this.batchId;
    }

    public TOrderBill setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }

    public Byte getAfterPayed() {
        return this.afterPayed;
    }

    public TOrderBill setAfterPayed(Byte afterPayed) {
        this.afterPayed = afterPayed;
        return this;
    }

    public Integer getEffect() {
        return this.effect;
    }

    public TOrderBill setEffect(Integer effect) {
        this.effect = effect;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TOrderBill (");

        sb.append(id);
        sb.append(", ").append(billCode);
        sb.append(", ").append(customerId);
        sb.append(", ").append(orderId);
        sb.append(", ").append(mainOrderId);
        sb.append(", ").append(couponId);
        sb.append(", ").append(couponAmount);
        sb.append(", ").append(amount);
        sb.append(", ").append(status);
        sb.append(", ").append(typeId);
        sb.append(", ").append(source);
        sb.append(", ").append(month);
        sb.append(", ").append(remark);
        sb.append(", ").append(payDate);
        sb.append(", ").append(balanceDate);
        sb.append(", ").append(cutMoneyDate);
        sb.append(", ").append(billMonth);
        sb.append(", ").append(sourceId);
        sb.append(", ").append(deposit);
        sb.append(", ").append(creditDeposit);
        sb.append(", ").append(isExpire);
        sb.append(", ").append(smsDate);
        sb.append(", ").append(payedAmount);
        sb.append(", ").append(eCurrencyVirtual);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);
        sb.append(", ").append(syncStatus);
        sb.append(", ").append(billGroup);
        sb.append(", ").append(batchId);
        sb.append(", ").append(afterPayed);
        sb.append(", ").append(effect);

        sb.append(")");
        return sb.toString();
    }
}
