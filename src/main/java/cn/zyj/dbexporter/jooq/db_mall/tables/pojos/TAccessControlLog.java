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
public class TAccessControlLog implements Serializable {

    private static final long serialVersionUID = 394380673;

    private Integer   id;
    private String    keyStr;
    private String    requestStr;
    private String    responseStr;
    private Integer   useTime;
    private Timestamp cdate;
    private Timestamp mdate;

    public TAccessControlLog() {}

    public TAccessControlLog(TAccessControlLog value) {
        this.id = value.id;
        this.keyStr = value.keyStr;
        this.requestStr = value.requestStr;
        this.responseStr = value.responseStr;
        this.useTime = value.useTime;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TAccessControlLog(
        Integer   id,
        String    keyStr,
        String    requestStr,
        String    responseStr,
        Integer   useTime,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.keyStr = keyStr;
        this.requestStr = requestStr;
        this.responseStr = responseStr;
        this.useTime = useTime;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TAccessControlLog setId(Integer id) {
        this.id = id;
        return this;
    }

    @Size(max = 180)
    public String getKeyStr() {
        return this.keyStr;
    }

    public TAccessControlLog setKeyStr(String keyStr) {
        this.keyStr = keyStr;
        return this;
    }

    @Size(max = 65535)
    public String getRequestStr() {
        return this.requestStr;
    }

    public TAccessControlLog setRequestStr(String requestStr) {
        this.requestStr = requestStr;
        return this;
    }

    @Size(max = 65535)
    public String getResponseStr() {
        return this.responseStr;
    }

    public TAccessControlLog setResponseStr(String responseStr) {
        this.responseStr = responseStr;
        return this;
    }

    public Integer getUseTime() {
        return this.useTime;
    }

    public TAccessControlLog setUseTime(Integer useTime) {
        this.useTime = useTime;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TAccessControlLog setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TAccessControlLog setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TAccessControlLog (");

        sb.append(id);
        sb.append(", ").append(keyStr);
        sb.append(", ").append(requestStr);
        sb.append(", ").append(responseStr);
        sb.append(", ").append(useTime);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
