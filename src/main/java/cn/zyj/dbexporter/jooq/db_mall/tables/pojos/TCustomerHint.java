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
public class TCustomerHint implements Serializable {

    private static final long serialVersionUID = 519493127;

    private Integer   id;
    private Byte      status;
    private Byte      type;
    private String    content;
    private Timestamp cdate;
    private Timestamp mdate;

    public TCustomerHint() {}

    public TCustomerHint(TCustomerHint value) {
        this.id = value.id;
        this.status = value.status;
        this.type = value.type;
        this.content = value.content;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TCustomerHint(
        Integer   id,
        Byte      status,
        Byte      type,
        String    content,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.status = status;
        this.type = type;
        this.content = content;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TCustomerHint setId(Integer id) {
        this.id = id;
        return this;
    }

    public Byte getStatus() {
        return this.status;
    }

    public TCustomerHint setStatus(Byte status) {
        this.status = status;
        return this;
    }

    public Byte getType() {
        return this.type;
    }

    public TCustomerHint setType(Byte type) {
        this.type = type;
        return this;
    }

    @NotNull
    @Size(max = 300)
    public String getContent() {
        return this.content;
    }

    public TCustomerHint setContent(String content) {
        this.content = content;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCustomerHint setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCustomerHint setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCustomerHint (");

        sb.append(id);
        sb.append(", ").append(status);
        sb.append(", ").append(type);
        sb.append(", ").append(content);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
