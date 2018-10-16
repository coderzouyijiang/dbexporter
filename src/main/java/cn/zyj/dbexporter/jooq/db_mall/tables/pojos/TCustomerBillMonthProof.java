/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


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
public class TCustomerBillMonthProof implements Serializable {

    private static final long serialVersionUID = 1849972954;

    private Integer   id;
    private Integer   customerId;
    private Integer   payType;
    private Integer   balanceDate;
    private Integer   billMonth;
    private Integer   status;
    private Timestamp cdate;
    private Timestamp mdate;

    public TCustomerBillMonthProof() {}

    public TCustomerBillMonthProof(TCustomerBillMonthProof value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.payType = value.payType;
        this.balanceDate = value.balanceDate;
        this.billMonth = value.billMonth;
        this.status = value.status;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TCustomerBillMonthProof(
        Integer   id,
        Integer   customerId,
        Integer   payType,
        Integer   balanceDate,
        Integer   billMonth,
        Integer   status,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.customerId = customerId;
        this.payType = payType;
        this.balanceDate = balanceDate;
        this.billMonth = billMonth;
        this.status = status;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TCustomerBillMonthProof setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Integer getCustomerId() {
        return this.customerId;
    }

    public TCustomerBillMonthProof setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    public Integer getPayType() {
        return this.payType;
    }

    public TCustomerBillMonthProof setPayType(Integer payType) {
        this.payType = payType;
        return this;
    }

    @NotNull
    public Integer getBalanceDate() {
        return this.balanceDate;
    }

    public TCustomerBillMonthProof setBalanceDate(Integer balanceDate) {
        this.balanceDate = balanceDate;
        return this;
    }

    @NotNull
    public Integer getBillMonth() {
        return this.billMonth;
    }

    public TCustomerBillMonthProof setBillMonth(Integer billMonth) {
        this.billMonth = billMonth;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public TCustomerBillMonthProof setStatus(Integer status) {
        this.status = status;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCustomerBillMonthProof setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCustomerBillMonthProof setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCustomerBillMonthProof (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(payType);
        sb.append(", ").append(balanceDate);
        sb.append(", ").append(billMonth);
        sb.append(", ").append(status);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
