/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
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
public class TCouponList implements Serializable {

    private static final long serialVersionUID = -1407930643;

    private Integer   id;
    private String    name;
    private Date      startDate;
    private Date      endDate;
    private Byte      typeId;
    private Byte      isCustomerLimit;
    private Byte      discountTypeId;
    private String    discountValue;
    private Byte      isFirstOrder;
    private Integer   limitNum;
    private Byte      isFirstMonth;
    private String    getCode;
    private Byte      status;
    private Byte      isNewDevice;
    private Byte      isExpire;
    private Timestamp cdate;
    private Timestamp mdate;

    public TCouponList() {}

    public TCouponList(TCouponList value) {
        this.id = value.id;
        this.name = value.name;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
        this.typeId = value.typeId;
        this.isCustomerLimit = value.isCustomerLimit;
        this.discountTypeId = value.discountTypeId;
        this.discountValue = value.discountValue;
        this.isFirstOrder = value.isFirstOrder;
        this.limitNum = value.limitNum;
        this.isFirstMonth = value.isFirstMonth;
        this.getCode = value.getCode;
        this.status = value.status;
        this.isNewDevice = value.isNewDevice;
        this.isExpire = value.isExpire;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TCouponList(
        Integer   id,
        String    name,
        Date      startDate,
        Date      endDate,
        Byte      typeId,
        Byte      isCustomerLimit,
        Byte      discountTypeId,
        String    discountValue,
        Byte      isFirstOrder,
        Integer   limitNum,
        Byte      isFirstMonth,
        String    getCode,
        Byte      status,
        Byte      isNewDevice,
        Byte      isExpire,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.typeId = typeId;
        this.isCustomerLimit = isCustomerLimit;
        this.discountTypeId = discountTypeId;
        this.discountValue = discountValue;
        this.isFirstOrder = isFirstOrder;
        this.limitNum = limitNum;
        this.isFirstMonth = isFirstMonth;
        this.getCode = getCode;
        this.status = status;
        this.isNewDevice = isNewDevice;
        this.isExpire = isExpire;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TCouponList setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    @Size(max = 200)
    public String getName() {
        return this.name;
    }

    public TCouponList setName(String name) {
        this.name = name;
        return this;
    }

    @NotNull
    public Date getStartDate() {
        return this.startDate;
    }

    public TCouponList setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    @NotNull
    public Date getEndDate() {
        return this.endDate;
    }

    public TCouponList setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public Byte getTypeId() {
        return this.typeId;
    }

    public TCouponList setTypeId(Byte typeId) {
        this.typeId = typeId;
        return this;
    }

    public Byte getIsCustomerLimit() {
        return this.isCustomerLimit;
    }

    public TCouponList setIsCustomerLimit(Byte isCustomerLimit) {
        this.isCustomerLimit = isCustomerLimit;
        return this;
    }

    public Byte getDiscountTypeId() {
        return this.discountTypeId;
    }

    public TCouponList setDiscountTypeId(Byte discountTypeId) {
        this.discountTypeId = discountTypeId;
        return this;
    }

    @NotNull
    @Size(max = 100)
    public String getDiscountValue() {
        return this.discountValue;
    }

    public TCouponList setDiscountValue(String discountValue) {
        this.discountValue = discountValue;
        return this;
    }

    public Byte getIsFirstOrder() {
        return this.isFirstOrder;
    }

    public TCouponList setIsFirstOrder(Byte isFirstOrder) {
        this.isFirstOrder = isFirstOrder;
        return this;
    }

    public Integer getLimitNum() {
        return this.limitNum;
    }

    public TCouponList setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
        return this;
    }

    public Byte getIsFirstMonth() {
        return this.isFirstMonth;
    }

    public TCouponList setIsFirstMonth(Byte isFirstMonth) {
        this.isFirstMonth = isFirstMonth;
        return this;
    }

    @Size(max = 32)
    public String getGetCode() {
        return this.getCode;
    }

    public TCouponList setGetCode(String getCode) {
        this.getCode = getCode;
        return this;
    }

    public Byte getStatus() {
        return this.status;
    }

    public TCouponList setStatus(Byte status) {
        this.status = status;
        return this;
    }

    public Byte getIsNewDevice() {
        return this.isNewDevice;
    }

    public TCouponList setIsNewDevice(Byte isNewDevice) {
        this.isNewDevice = isNewDevice;
        return this;
    }

    public Byte getIsExpire() {
        return this.isExpire;
    }

    public TCouponList setIsExpire(Byte isExpire) {
        this.isExpire = isExpire;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCouponList setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCouponList setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCouponList (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);
        sb.append(", ").append(typeId);
        sb.append(", ").append(isCustomerLimit);
        sb.append(", ").append(discountTypeId);
        sb.append(", ").append(discountValue);
        sb.append(", ").append(isFirstOrder);
        sb.append(", ").append(limitNum);
        sb.append(", ").append(isFirstMonth);
        sb.append(", ").append(getCode);
        sb.append(", ").append(status);
        sb.append(", ").append(isNewDevice);
        sb.append(", ").append(isExpire);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}