/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
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
public class TStatDailyEquipment implements Serializable {

    private static final long serialVersionUID = 190756142;

    private Long      id;
    private Date      statDate;
    private Long      totalNum;
    private Integer   addedNum;
    private Integer   canceledNum;
    private Integer   diffNum;
    private Integer   addcanceledNum;
    private Timestamp cdate;
    private Timestamp mdate;

    public TStatDailyEquipment() {}

    public TStatDailyEquipment(TStatDailyEquipment value) {
        this.id = value.id;
        this.statDate = value.statDate;
        this.totalNum = value.totalNum;
        this.addedNum = value.addedNum;
        this.canceledNum = value.canceledNum;
        this.diffNum = value.diffNum;
        this.addcanceledNum = value.addcanceledNum;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TStatDailyEquipment(
        Long      id,
        Date      statDate,
        Long      totalNum,
        Integer   addedNum,
        Integer   canceledNum,
        Integer   diffNum,
        Integer   addcanceledNum,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.statDate = statDate;
        this.totalNum = totalNum;
        this.addedNum = addedNum;
        this.canceledNum = canceledNum;
        this.diffNum = diffNum;
        this.addcanceledNum = addcanceledNum;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Long getId() {
        return this.id;
    }

    public TStatDailyEquipment setId(Long id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Date getStatDate() {
        return this.statDate;
    }

    public TStatDailyEquipment setStatDate(Date statDate) {
        this.statDate = statDate;
        return this;
    }

    public Long getTotalNum() {
        return this.totalNum;
    }

    public TStatDailyEquipment setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    public Integer getAddedNum() {
        return this.addedNum;
    }

    public TStatDailyEquipment setAddedNum(Integer addedNum) {
        this.addedNum = addedNum;
        return this;
    }

    public Integer getCanceledNum() {
        return this.canceledNum;
    }

    public TStatDailyEquipment setCanceledNum(Integer canceledNum) {
        this.canceledNum = canceledNum;
        return this;
    }

    public Integer getDiffNum() {
        return this.diffNum;
    }

    public TStatDailyEquipment setDiffNum(Integer diffNum) {
        this.diffNum = diffNum;
        return this;
    }

    public Integer getAddcanceledNum() {
        return this.addcanceledNum;
    }

    public TStatDailyEquipment setAddcanceledNum(Integer addcanceledNum) {
        this.addcanceledNum = addcanceledNum;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TStatDailyEquipment setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TStatDailyEquipment setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TStatDailyEquipment (");

        sb.append(id);
        sb.append(", ").append(statDate);
        sb.append(", ").append(totalNum);
        sb.append(", ").append(addedNum);
        sb.append(", ").append(canceledNum);
        sb.append(", ").append(diffNum);
        sb.append(", ").append(addcanceledNum);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
