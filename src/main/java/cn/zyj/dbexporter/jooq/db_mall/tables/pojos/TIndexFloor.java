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
public class TIndexFloor implements Serializable {

    private static final long serialVersionUID = 2015925096;

    private Integer   id;
    private String    name;
    private Integer   oid;
    private Byte      status;
    private Timestamp cdate;
    private Timestamp mdate;

    public TIndexFloor() {}

    public TIndexFloor(TIndexFloor value) {
        this.id = value.id;
        this.name = value.name;
        this.oid = value.oid;
        this.status = value.status;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TIndexFloor(
        Integer   id,
        String    name,
        Integer   oid,
        Byte      status,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.name = name;
        this.oid = oid;
        this.status = status;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TIndexFloor setId(Integer id) {
        this.id = id;
        return this;
    }

    @Size(max = 50)
    public String getName() {
        return this.name;
    }

    public TIndexFloor setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getOid() {
        return this.oid;
    }

    public TIndexFloor setOid(Integer oid) {
        this.oid = oid;
        return this;
    }

    public Byte getStatus() {
        return this.status;
    }

    public TIndexFloor setStatus(Byte status) {
        this.status = status;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TIndexFloor setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TIndexFloor setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TIndexFloor (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(oid);
        sb.append(", ").append(status);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
