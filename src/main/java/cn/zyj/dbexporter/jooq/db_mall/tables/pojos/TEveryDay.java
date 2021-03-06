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
public class TEveryDay implements Serializable {

    private static final long serialVersionUID = -1712279341;

    private Integer   id;
    private Integer   day;
    private Byte      status;
    private Timestamp cdate;
    private Timestamp mdate;

    public TEveryDay() {}

    public TEveryDay(TEveryDay value) {
        this.id = value.id;
        this.day = value.day;
        this.status = value.status;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TEveryDay(
        Integer   id,
        Integer   day,
        Byte      status,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.day = day;
        this.status = status;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TEveryDay setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getDay() {
        return this.day;
    }

    public TEveryDay setDay(Integer day) {
        this.day = day;
        return this;
    }

    public Byte getStatus() {
        return this.status;
    }

    public TEveryDay setStatus(Byte status) {
        this.status = status;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TEveryDay setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TEveryDay setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TEveryDay (");

        sb.append(id);
        sb.append(", ").append(day);
        sb.append(", ").append(status);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
