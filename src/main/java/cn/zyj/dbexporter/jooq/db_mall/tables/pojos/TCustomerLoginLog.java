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
public class TCustomerLoginLog implements Serializable {

    private static final long serialVersionUID = 2115483284;

    private Integer   id;
    private Integer   customerId;
    private Byte      typeId;
    private Long      ip;
    private String    userAgent;
    private Byte      syncStatus;
    private Timestamp cdate;
    private Timestamp mdate;
    private String    fromAdSource;
    private Integer   userId;

    public TCustomerLoginLog() {}

    public TCustomerLoginLog(TCustomerLoginLog value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.typeId = value.typeId;
        this.ip = value.ip;
        this.userAgent = value.userAgent;
        this.syncStatus = value.syncStatus;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
        this.fromAdSource = value.fromAdSource;
        this.userId = value.userId;
    }

    public TCustomerLoginLog(
        Integer   id,
        Integer   customerId,
        Byte      typeId,
        Long      ip,
        String    userAgent,
        Byte      syncStatus,
        Timestamp cdate,
        Timestamp mdate,
        String    fromAdSource,
        Integer   userId
    ) {
        this.id = id;
        this.customerId = customerId;
        this.typeId = typeId;
        this.ip = ip;
        this.userAgent = userAgent;
        this.syncStatus = syncStatus;
        this.cdate = cdate;
        this.mdate = mdate;
        this.fromAdSource = fromAdSource;
        this.userId = userId;
    }

    public Integer getId() {
        return this.id;
    }

    public TCustomerLoginLog setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Integer getCustomerId() {
        return this.customerId;
    }

    public TCustomerLoginLog setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    public Byte getTypeId() {
        return this.typeId;
    }

    public TCustomerLoginLog setTypeId(Byte typeId) {
        this.typeId = typeId;
        return this;
    }

    @NotNull
    public Long getIp() {
        return this.ip;
    }

    public TCustomerLoginLog setIp(Long ip) {
        this.ip = ip;
        return this;
    }

    @NotNull
    @Size(max = 500)
    public String getUserAgent() {
        return this.userAgent;
    }

    public TCustomerLoginLog setUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public Byte getSyncStatus() {
        return this.syncStatus;
    }

    public TCustomerLoginLog setSyncStatus(Byte syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCustomerLoginLog setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCustomerLoginLog setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Size(max = 100)
    public String getFromAdSource() {
        return this.fromAdSource;
    }

    public TCustomerLoginLog setFromAdSource(String fromAdSource) {
        this.fromAdSource = fromAdSource;
        return this;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public TCustomerLoginLog setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCustomerLoginLog (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(typeId);
        sb.append(", ").append(ip);
        sb.append(", ").append(userAgent);
        sb.append(", ").append(syncStatus);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);
        sb.append(", ").append(fromAdSource);
        sb.append(", ").append(userId);

        sb.append(")");
        return sb.toString();
    }
}
