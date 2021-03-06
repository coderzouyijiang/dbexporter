/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


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
public class TStatDailyDevices implements Serializable {

    private static final long serialVersionUID = 1829362741;

    private Integer   id;
    private Integer   statDate;
    private Integer   totalNum;
    private Integer   diffNum;
    private Timestamp cdate;
    private Timestamp mdate;

    public TStatDailyDevices() {}

    public TStatDailyDevices(TStatDailyDevices value) {
        this.id = value.id;
        this.statDate = value.statDate;
        this.totalNum = value.totalNum;
        this.diffNum = value.diffNum;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TStatDailyDevices(
        Integer   id,
        Integer   statDate,
        Integer   totalNum,
        Integer   diffNum,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.statDate = statDate;
        this.totalNum = totalNum;
        this.diffNum = diffNum;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TStatDailyDevices setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getStatDate() {
        return this.statDate;
    }

    public TStatDailyDevices setStatDate(Integer statDate) {
        this.statDate = statDate;
        return this;
    }

    public Integer getTotalNum() {
        return this.totalNum;
    }

    public TStatDailyDevices setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    public Integer getDiffNum() {
        return this.diffNum;
    }

    public TStatDailyDevices setDiffNum(Integer diffNum) {
        this.diffNum = diffNum;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TStatDailyDevices setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TStatDailyDevices setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TStatDailyDevices (");

        sb.append(id);
        sb.append(", ").append(statDate);
        sb.append(", ").append(totalNum);
        sb.append(", ").append(diffNum);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
