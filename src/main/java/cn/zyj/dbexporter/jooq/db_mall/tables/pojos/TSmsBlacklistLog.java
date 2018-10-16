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
public class TSmsBlacklistLog implements Serializable {

    private static final long serialVersionUID = 1377385113;

    private Long      id;
    private String    phone;
    private Timestamp cdate;

    public TSmsBlacklistLog() {}

    public TSmsBlacklistLog(TSmsBlacklistLog value) {
        this.id = value.id;
        this.phone = value.phone;
        this.cdate = value.cdate;
    }

    public TSmsBlacklistLog(
        Long      id,
        String    phone,
        Timestamp cdate
    ) {
        this.id = id;
        this.phone = phone;
        this.cdate = cdate;
    }

    public Long getId() {
        return this.id;
    }

    public TSmsBlacklistLog setId(Long id) {
        this.id = id;
        return this;
    }

    @NotNull
    @Size(max = 255)
    public String getPhone() {
        return this.phone;
    }

    public TSmsBlacklistLog setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TSmsBlacklistLog setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TSmsBlacklistLog (");

        sb.append(id);
        sb.append(", ").append(phone);
        sb.append(", ").append(cdate);

        sb.append(")");
        return sb.toString();
    }
}