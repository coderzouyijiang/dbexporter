/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_calculator.tables.pojos;


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
public class TSequence implements Serializable {

    private static final long serialVersionUID = 1430699470;

    private Integer   id;
    private String    typeName;
    private Integer   currentNo;
    private Timestamp cdate;
    private Timestamp mdate;

    public TSequence() {}

    public TSequence(TSequence value) {
        this.id = value.id;
        this.typeName = value.typeName;
        this.currentNo = value.currentNo;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TSequence(
        Integer   id,
        String    typeName,
        Integer   currentNo,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.typeName = typeName;
        this.currentNo = currentNo;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TSequence setId(Integer id) {
        this.id = id;
        return this;
    }

    @Size(max = 100)
    public String getTypeName() {
        return this.typeName;
    }

    public TSequence setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public Integer getCurrentNo() {
        return this.currentNo;
    }

    public TSequence setCurrentNo(Integer currentNo) {
        this.currentNo = currentNo;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TSequence setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TSequence setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TSequence (");

        sb.append(id);
        sb.append(", ").append(typeName);
        sb.append(", ").append(currentNo);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
