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
public class TBcity implements Serializable {

    private static final long serialVersionUID = -1988840076;

    private Integer   id;
    private String    bcityCode;
    private Integer   pid;
    private String    name;
    private Timestamp cdate;
    private Timestamp mdate;

    public TBcity() {}

    public TBcity(TBcity value) {
        this.id = value.id;
        this.bcityCode = value.bcityCode;
        this.pid = value.pid;
        this.name = value.name;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TBcity(
        Integer   id,
        String    bcityCode,
        Integer   pid,
        String    name,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.bcityCode = bcityCode;
        this.pid = pid;
        this.name = name;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TBcity setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    @Size(max = 32)
    public String getBcityCode() {
        return this.bcityCode;
    }

    public TBcity setBcityCode(String bcityCode) {
        this.bcityCode = bcityCode;
        return this;
    }

    @NotNull
    public Integer getPid() {
        return this.pid;
    }

    public TBcity setPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    @NotNull
    @Size(max = 32)
    public String getName() {
        return this.name;
    }

    public TBcity setName(String name) {
        this.name = name;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TBcity setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TBcity setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TBcity (");

        sb.append(id);
        sb.append(", ").append(bcityCode);
        sb.append(", ").append(pid);
        sb.append(", ").append(name);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}