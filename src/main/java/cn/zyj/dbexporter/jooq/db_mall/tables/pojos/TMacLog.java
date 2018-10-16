/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class TMacLog implements Serializable {

    private static final long serialVersionUID = -1151938929;

    private Long      id;
    private String    macValue;
    private String    lat;
    private String    lng;
    private String    volt;
    private Timestamp cdate;
    private Timestamp mdate;

    public TMacLog() {}

    public TMacLog(TMacLog value) {
        this.id = value.id;
        this.macValue = value.macValue;
        this.lat = value.lat;
        this.lng = value.lng;
        this.volt = value.volt;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TMacLog(
        Long      id,
        String    macValue,
        String    lat,
        String    lng,
        String    volt,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.macValue = macValue;
        this.lat = lat;
        this.lng = lng;
        this.volt = volt;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Long getId() {
        return this.id;
    }

    public TMacLog setId(Long id) {
        this.id = id;
        return this;
    }

    @Size(max = 2000)
    public String getMacValue() {
        return this.macValue;
    }

    public TMacLog setMacValue(String macValue) {
        this.macValue = macValue;
        return this;
    }

    @Size(max = 100)
    public String getLat() {
        return this.lat;
    }

    public TMacLog setLat(String lat) {
        this.lat = lat;
        return this;
    }

    @Size(max = 100)
    public String getLng() {
        return this.lng;
    }

    public TMacLog setLng(String lng) {
        this.lng = lng;
        return this;
    }

    @Size(max = 100)
    public String getVolt() {
        return this.volt;
    }

    public TMacLog setVolt(String volt) {
        this.volt = volt;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TMacLog setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TMacLog setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TMacLog (");

        sb.append(id);
        sb.append(", ").append(macValue);
        sb.append(", ").append(lat);
        sb.append(", ").append(lng);
        sb.append(", ").append(volt);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}