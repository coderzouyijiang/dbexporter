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
public class TMacDevice implements Serializable {

    private static final long serialVersionUID = 1544218175;

    private Integer   id;
    private String    deviceId;
    private String    phone;
    private String    secretKey;
    private String    rate;
    private Timestamp cdate;
    private Timestamp mdate;

    public TMacDevice() {}

    public TMacDevice(TMacDevice value) {
        this.id = value.id;
        this.deviceId = value.deviceId;
        this.phone = value.phone;
        this.secretKey = value.secretKey;
        this.rate = value.rate;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TMacDevice(
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

    public TMacDevice setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    @Size(max = 100)
    public String getDeviceId() {
        return this.deviceId;
    }

    public TMacDevice setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    @Size(max = 20)
    public String getPhone() {
        return this.phone;
    }

    public TMacDevice setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Size(max = 100)
    public String getSecretKey() {
        return this.secretKey;
    }

    public TMacDevice setSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    @Size(max = 100)
    public String getRate() {
        return this.rate;
    }

    public TMacDevice setRate(String rate) {
        this.rate = rate;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TMacDevice setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TMacDevice setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TMacDevice (");

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
