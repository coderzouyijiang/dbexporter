/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
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
public class TBillCheck implements Serializable {

    private static final long serialVersionUID = -1886649703;

    private Integer id;
    private Long    customerId;
    private String  phone;
    private String  month;
    private Byte    payType;
    private Integer bandId;
    private Byte    payStatus;
    private Byte    isExpire;
    private Long    timestamp;
    private Byte    notEqual;

    public TBillCheck() {}

    public TBillCheck(TBillCheck value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.phone = value.phone;
        this.month = value.month;
        this.payType = value.payType;
        this.bandId = value.bandId;
        this.payStatus = value.payStatus;
        this.isExpire = value.isExpire;
        this.timestamp = value.timestamp;
        this.notEqual = value.notEqual;
    }

    public TBillCheck(
        Integer id,
        Long    customerId,
        String  phone,
        String  month,
        Byte    payType,
        Integer bandId,
        Byte    payStatus,
        Byte    isExpire,
        Long    timestamp,
        Byte    notEqual
    ) {
        this.id = id;
        this.customerId = customerId;
        this.phone = phone;
        this.month = month;
        this.payType = payType;
        this.bandId = bandId;
        this.payStatus = payStatus;
        this.isExpire = isExpire;
        this.timestamp = timestamp;
        this.notEqual = notEqual;
    }

    public Integer getId() {
        return this.id;
    }

    public TBillCheck setId(Integer id) {
        this.id = id;
        return this;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public TBillCheck setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    @Size(max = 255)
    public String getPhone() {
        return this.phone;
    }

    public TBillCheck setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Size(max = 10)
    public String getMonth() {
        return this.month;
    }

    public TBillCheck setMonth(String month) {
        this.month = month;
        return this;
    }

    public Byte getPayType() {
        return this.payType;
    }

    public TBillCheck setPayType(Byte payType) {
        this.payType = payType;
        return this;
    }

    public Integer getBandId() {
        return this.bandId;
    }

    public TBillCheck setBandId(Integer bandId) {
        this.bandId = bandId;
        return this;
    }

    public Byte getPayStatus() {
        return this.payStatus;
    }

    public TBillCheck setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
        return this;
    }

    public Byte getIsExpire() {
        return this.isExpire;
    }

    public TBillCheck setIsExpire(Byte isExpire) {
        this.isExpire = isExpire;
        return this;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public TBillCheck setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Byte getNotEqual() {
        return this.notEqual;
    }

    public TBillCheck setNotEqual(Byte notEqual) {
        this.notEqual = notEqual;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TBillCheck (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(phone);
        sb.append(", ").append(month);
        sb.append(", ").append(payType);
        sb.append(", ").append(bandId);
        sb.append(", ").append(payStatus);
        sb.append(", ").append(isExpire);
        sb.append(", ").append(timestamp);
        sb.append(", ").append(notEqual);

        sb.append(")");
        return sb.toString();
    }
}
