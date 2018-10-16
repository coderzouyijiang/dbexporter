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
public class TOrderCount implements Serializable {

    private static final long serialVersionUID = 765618213;

    private Long      id;
    private Long      customerId;
    private Date      countDate;
    private Integer   count;
    private Timestamp cdate;
    private Timestamp mdate;

    public TOrderCount() {}

    public TOrderCount(TOrderCount value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.countDate = value.countDate;
        this.count = value.count;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TOrderCount(
        Long      id,
        Long      customerId,
        Date      countDate,
        Integer   count,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.customerId = customerId;
        this.countDate = countDate;
        this.count = count;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Long getId() {
        return this.id;
    }

    public TOrderCount setId(Long id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Long getCustomerId() {
        return this.customerId;
    }

    public TOrderCount setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public Date getCountDate() {
        return this.countDate;
    }

    public TOrderCount setCountDate(Date countDate) {
        this.countDate = countDate;
        return this;
    }

    public Integer getCount() {
        return this.count;
    }

    public TOrderCount setCount(Integer count) {
        this.count = count;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TOrderCount setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TOrderCount setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TOrderCount (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(countDate);
        sb.append(", ").append(count);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
