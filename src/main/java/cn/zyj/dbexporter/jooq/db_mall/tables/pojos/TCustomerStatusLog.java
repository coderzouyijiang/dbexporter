/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
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
public class TCustomerStatusLog implements Serializable {

    private static final long serialVersionUID = 1161273653;

    private Integer   id;
    private Integer   customerId;
    private Integer   opUserId;
    private Byte      status;
    private String    stopReason;
    private Timestamp cdate;
    private Timestamp mdate;

    public TCustomerStatusLog() {}

    public TCustomerStatusLog(TCustomerStatusLog value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.opUserId = value.opUserId;
        this.status = value.status;
        this.stopReason = value.stopReason;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TCustomerStatusLog(
        Integer   id,
        Integer   customerId,
        Integer   opUserId,
        Byte      status,
        String    stopReason,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.customerId = customerId;
        this.opUserId = opUserId;
        this.status = status;
        this.stopReason = stopReason;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TCustomerStatusLog setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public TCustomerStatusLog setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    public Integer getOpUserId() {
        return this.opUserId;
    }

    public TCustomerStatusLog setOpUserId(Integer opUserId) {
        this.opUserId = opUserId;
        return this;
    }

    @NotNull
    public Byte getStatus() {
        return this.status;
    }

    public TCustomerStatusLog setStatus(Byte status) {
        this.status = status;
        return this;
    }

    @Size(max = 300)
    public String getStopReason() {
        return this.stopReason;
    }

    public TCustomerStatusLog setStopReason(String stopReason) {
        this.stopReason = stopReason;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCustomerStatusLog setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCustomerStatusLog setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCustomerStatusLog (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(opUserId);
        sb.append(", ").append(status);
        sb.append(", ").append(stopReason);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
