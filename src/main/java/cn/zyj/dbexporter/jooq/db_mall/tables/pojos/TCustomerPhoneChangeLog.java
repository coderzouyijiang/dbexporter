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
public class TCustomerPhoneChangeLog implements Serializable {

    private static final long serialVersionUID = 903226261;

    private Integer   id;
    private String    newPhone;
    private String    oldPhone;
    private Integer   customerId;
    private Long      ip;
    private String    userAgent;
    private Byte      syncStatus;
    private Timestamp cdate;
    private Timestamp mdate;

    public TCustomerPhoneChangeLog() {}

    public TCustomerPhoneChangeLog(TCustomerPhoneChangeLog value) {
        this.id = value.id;
        this.newPhone = value.newPhone;
        this.oldPhone = value.oldPhone;
        this.customerId = value.customerId;
        this.ip = value.ip;
        this.userAgent = value.userAgent;
        this.syncStatus = value.syncStatus;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TCustomerPhoneChangeLog(
        Integer   id,
        String    newPhone,
        String    oldPhone,
        Integer   customerId,
        Long      ip,
        String    userAgent,
        Byte      syncStatus,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.newPhone = newPhone;
        this.oldPhone = oldPhone;
        this.customerId = customerId;
        this.ip = ip;
        this.userAgent = userAgent;
        this.syncStatus = syncStatus;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TCustomerPhoneChangeLog setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    @Size(max = 11)
    public String getNewPhone() {
        return this.newPhone;
    }

    public TCustomerPhoneChangeLog setNewPhone(String newPhone) {
        this.newPhone = newPhone;
        return this;
    }

    @NotNull
    @Size(max = 11)
    public String getOldPhone() {
        return this.oldPhone;
    }

    public TCustomerPhoneChangeLog setOldPhone(String oldPhone) {
        this.oldPhone = oldPhone;
        return this;
    }

    @NotNull
    public Integer getCustomerId() {
        return this.customerId;
    }

    public TCustomerPhoneChangeLog setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    @NotNull
    public Long getIp() {
        return this.ip;
    }

    public TCustomerPhoneChangeLog setIp(Long ip) {
        this.ip = ip;
        return this;
    }

    @NotNull
    @Size(max = 300)
    public String getUserAgent() {
        return this.userAgent;
    }

    public TCustomerPhoneChangeLog setUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    public Byte getSyncStatus() {
        return this.syncStatus;
    }

    public TCustomerPhoneChangeLog setSyncStatus(Byte syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCustomerPhoneChangeLog setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCustomerPhoneChangeLog setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCustomerPhoneChangeLog (");

        sb.append(id);
        sb.append(", ").append(newPhone);
        sb.append(", ").append(oldPhone);
        sb.append(", ").append(customerId);
        sb.append(", ").append(ip);
        sb.append(", ").append(userAgent);
        sb.append(", ").append(syncStatus);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
