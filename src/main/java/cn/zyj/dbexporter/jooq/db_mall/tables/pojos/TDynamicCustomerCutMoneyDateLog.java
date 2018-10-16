/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class TDynamicCustomerCutMoneyDateLog implements Serializable {

    private static final long serialVersionUID = -926606011;

    private Long      id;
    private Long      customerId;
    private Integer   dynamicOrDefault;
    private Integer   month;
    private Timestamp cdate;
    private Timestamp mdate;

    public TDynamicCustomerCutMoneyDateLog() {}

    public TDynamicCustomerCutMoneyDateLog(TDynamicCustomerCutMoneyDateLog value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.dynamicOrDefault = value.dynamicOrDefault;
        this.month = value.month;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TDynamicCustomerCutMoneyDateLog(
        Long      id,
        Long      customerId,
        Integer   dynamicOrDefault,
        Integer   month,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.customerId = customerId;
        this.dynamicOrDefault = dynamicOrDefault;
        this.month = month;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Long getId() {
        return this.id;
    }

    public TDynamicCustomerCutMoneyDateLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public TDynamicCustomerCutMoneyDateLog setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public Integer getDynamicOrDefault() {
        return this.dynamicOrDefault;
    }

    public TDynamicCustomerCutMoneyDateLog setDynamicOrDefault(Integer dynamicOrDefault) {
        this.dynamicOrDefault = dynamicOrDefault;
        return this;
    }

    public Integer getMonth() {
        return this.month;
    }

    public TDynamicCustomerCutMoneyDateLog setMonth(Integer month) {
        this.month = month;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TDynamicCustomerCutMoneyDateLog setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TDynamicCustomerCutMoneyDateLog setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TDynamicCustomerCutMoneyDateLog (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(dynamicOrDefault);
        sb.append(", ").append(month);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
