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
public class TMacBindLog implements Serializable {

    private static final long serialVersionUID = -450726032;

    private Integer   id;
    private String    deviceId;
    private String    phone;
    private String    secretKey;
    private String    rate;
    private Timestamp cdate;
    private Timestamp mdate;

    public TMacBindLog() {}

    public TMacBindLog(TMacBindLog value) {
        this.id = value.id;
        this.deviceId = value.deviceId;
        this.phone = value.phone;
        this.secretKey = value.secretKey;
        this.rate = value.rate;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TMacBindLog(
        Integer   id,
        String    deviceId,
        String    phone,
        String    secretKey,
        String    rate,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.deviceId = deviceId;
        this.phone = phone;
        this.secretKey = secretKey;
        this.rate = rate;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TMacBindLog setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    @Size(max = 100)
    public String getDeviceId() {
        return this.deviceId;
    }

    public TMacBindLog setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Size(max = 20)
    public String getPhone() {
        return this.phone;
    }

    public TMacBindLog setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Size(max = 100)
    public String getSecretKey() {
        return this.secretKey;
    }

    public TMacBindLog setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    @Size(max = 100)
    public String getRate() {
        return this.rate;
    }

    public TMacBindLog setRate(String rate) {
        this.rate = rate;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TMacBindLog setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TMacBindLog setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TMacBindLog (");

        sb.append(id);
        sb.append(", ").append(deviceId);
        sb.append(", ").append(phone);
        sb.append(", ").append(secretKey);
        sb.append(", ").append(rate);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
