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
public class TCarts implements Serializable {

    private static final long serialVersionUID = 1698183673;

    private Long      id;
    private Integer   productId;
    private Integer   num;
    private Byte      status;
    private Integer   customerId;
    private Integer   rentType;
    private Integer   startDate;
    private Integer   month;
    private Byte      isSale;
    private Byte      insuranceTypeId;
    private Byte      addedServiceTypeId;
    private Byte      softServiceTypeId;
    private Byte      onsiteServiceTypeId;
    private Integer   suitsType;
    private Byte      isChecked;
    private Byte      serviceId;
    private Timestamp cdate;
    private Timestamp mdate;
    private Integer   rentTypeId;
    private Byte      payType;

    public TCarts() {}

    public TCarts(TCarts value) {
        this.id = value.id;
        this.productId = value.productId;
        this.num = value.num;
        this.status = value.status;
        this.customerId = value.customerId;
        this.rentType = value.rentType;
        this.startDate = value.startDate;
        this.month = value.month;
        this.isSale = value.isSale;
        this.insuranceTypeId = value.insuranceTypeId;
        this.addedServiceTypeId = value.addedServiceTypeId;
        this.softServiceTypeId = value.softServiceTypeId;
        this.onsiteServiceTypeId = value.onsiteServiceTypeId;
        this.suitsType = value.suitsType;
        this.isChecked = value.isChecked;
        this.serviceId = value.serviceId;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
        this.rentTypeId = value.rentTypeId;
        this.payType = value.payType;
    }

    public TCarts(
        Long      id,
        Integer   productId,
        Integer   num,
        Byte      status,
        Integer   customerId,
        Integer   rentType,
        Integer   startDate,
        Integer   month,
        Byte      isSale,
        Byte      insuranceTypeId,
        Byte      addedServiceTypeId,
        Byte      softServiceTypeId,
        Byte      onsiteServiceTypeId,
        Integer   suitsType,
        Byte      isChecked,
        Byte      serviceId,
        Timestamp cdate,
        Timestamp mdate,
        Integer   rentTypeId,
        Byte      payType
    ) {
        this.id = id;
        this.productId = productId;
        this.num = num;
        this.status = status;
        this.customerId = customerId;
        this.rentType = rentType;
        this.startDate = startDate;
        this.month = month;
        this.isSale = isSale;
        this.insuranceTypeId = insuranceTypeId;
        this.addedServiceTypeId = addedServiceTypeId;
        this.softServiceTypeId = softServiceTypeId;
        this.onsiteServiceTypeId = onsiteServiceTypeId;
        this.suitsType = suitsType;
        this.isChecked = isChecked;
        this.serviceId = serviceId;
        this.cdate = cdate;
        this.mdate = mdate;
        this.rentTypeId = rentTypeId;
        this.payType = payType;
    }

    public Long getId() {
        return this.id;
    }

    public TCarts setId(Long id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Integer getProductId() {
        return this.productId;
    }

    public TCarts setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    @NotNull
    public Integer getNum() {
        return this.num;
    }

    public TCarts setNum(Integer num) {
        this.num = num;
        return this;
    }

    @NotNull
    public Byte getStatus() {
        return this.status;
    }

    public TCarts setStatus(Byte status) {
        this.status = status;
        return this;
    }

    @NotNull
    public Integer getCustomerId() {
        return this.customerId;
    }

    public TCarts setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    public Integer getRentType() {
        return this.rentType;
    }

    public TCarts setRentType(Integer rentType) {
        this.rentType = rentType;
        return this;
    }

    public Integer getStartDate() {
        return this.startDate;
    }

    public TCarts setStartDate(Integer startDate) {
        this.startDate = startDate;
        return this;
    }

    public Integer getMonth() {
        return this.month;
    }

    public TCarts setMonth(Integer month) {
        this.month = month;
        return this;
    }

    public Byte getIsSale() {
        return this.isSale;
    }

    public TCarts setIsSale(Byte isSale) {
        this.isSale = isSale;
        return this;
    }

    public Byte getInsuranceTypeId() {
        return this.insuranceTypeId;
    }

    public TCarts setInsuranceTypeId(Byte insuranceTypeId) {
        this.insuranceTypeId = insuranceTypeId;
        return this;
    }

    public Byte getAddedServiceTypeId() {
        return this.addedServiceTypeId;
    }

    public TCarts setAddedServiceTypeId(Byte addedServiceTypeId) {
        this.addedServiceTypeId = addedServiceTypeId;
        return this;
    }

    public Byte getSoftServiceTypeId() {
        return this.softServiceTypeId;
    }

    public TCarts setSoftServiceTypeId(Byte softServiceTypeId) {
        this.softServiceTypeId = softServiceTypeId;
        return this;
    }

    public Byte getOnsiteServiceTypeId() {
        return this.onsiteServiceTypeId;
    }

    public TCarts setOnsiteServiceTypeId(Byte onsiteServiceTypeId) {
        this.onsiteServiceTypeId = onsiteServiceTypeId;
        return this;
    }

    public Integer getSuitsType() {
        return this.suitsType;
    }

    public TCarts setSuitsType(Integer suitsType) {
        this.suitsType = suitsType;
        return this;
    }

    public Byte getIsChecked() {
        return this.isChecked;
    }

    public TCarts setIsChecked(Byte isChecked) {
        this.isChecked = isChecked;
        return this;
    }

    public Byte getServiceId() {
        return this.serviceId;
    }

    public TCarts setServiceId(Byte serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCarts setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCarts setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    public Integer getRentTypeId() {
        return this.rentTypeId;
    }

    public TCarts setRentTypeId(Integer rentTypeId) {
        this.rentTypeId = rentTypeId;
        return this;
    }

    public Byte getPayType() {
        return this.payType;
    }

    public TCarts setPayType(Byte payType) {
        this.payType = payType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCarts (");

        sb.append(id);
        sb.append(", ").append(productId);
        sb.append(", ").append(num);
        sb.append(", ").append(status);
        sb.append(", ").append(customerId);
        sb.append(", ").append(rentType);
        sb.append(", ").append(startDate);
        sb.append(", ").append(month);
        sb.append(", ").append(isSale);
        sb.append(", ").append(insuranceTypeId);
        sb.append(", ").append(addedServiceTypeId);
        sb.append(", ").append(softServiceTypeId);
        sb.append(", ").append(onsiteServiceTypeId);
        sb.append(", ").append(suitsType);
        sb.append(", ").append(isChecked);
        sb.append(", ").append(serviceId);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);
        sb.append(", ").append(rentTypeId);
        sb.append(", ").append(payType);

        sb.append(")");
        return sb.toString();
    }
}
