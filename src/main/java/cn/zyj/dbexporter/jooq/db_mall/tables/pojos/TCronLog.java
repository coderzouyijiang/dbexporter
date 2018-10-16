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
public class TCronLog implements Serializable {

    private static final long serialVersionUID = -1252516690;

    private Long      id;
    private String    content;
    private Byte      syncStatus;
    private Timestamp cdate;
    private Timestamp mdate;

    public TCronLog() {}

    public TCronLog(TCronLog value) {
        this.id = value.id;
        this.content = value.content;
        this.syncStatus = value.syncStatus;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TCronLog(
        Long      id,
        String    content,
        Byte      syncStatus,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.content = content;
        this.syncStatus = syncStatus;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Long getId() {
        return this.id;
    }

    public TCronLog setId(Long id) {
        this.id = id;
        return this;
    }

    @Size(max = 65535)
    public String getContent() {
        return this.content;
    }

    public TCronLog setContent(String content) {
        this.content = content;
        return this;
    }

    public Byte getSyncStatus() {
        return this.syncStatus;
    }

    public TCronLog setSyncStatus(Byte syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCronLog setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCronLog setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCronLog (");

        sb.append(id);
        sb.append(", ").append(content);
        sb.append(", ").append(syncStatus);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
