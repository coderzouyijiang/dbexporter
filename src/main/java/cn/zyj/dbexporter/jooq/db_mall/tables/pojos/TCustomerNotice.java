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
public class TCustomerNotice implements Serializable {

    private static final long serialVersionUID = -1446375811;

    private Integer   id;
    private Long      customerId;
    private Byte      type;
    private Byte      isNotice;
    private Timestamp cdate;
    private Timestamp mdate;

    public TCustomerNotice() {}

    public TCustomerNotice(TCustomerNotice value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.type = value.type;
        this.isNotice = value.isNotice;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TCustomerNotice(
        Integer   id,
        Long      customerId,
        Byte      type,
        Byte      isNotice,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.customerId = customerId;
        this.type = type;
        this.isNotice = isNotice;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TCustomerNotice setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Long getCustomerId() {
        return this.customerId;
    }

    public TCustomerNotice setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public Byte getType() {
        return this.type;
    }

    public TCustomerNotice setType(Byte type) {
        this.type = type;
        return this;
    }

    public Byte getIsNotice() {
        return this.isNotice;
    }

    public TCustomerNotice setIsNotice(Byte isNotice) {
        this.isNotice = isNotice;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCustomerNotice setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCustomerNotice setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCustomerNotice (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(type);
        sb.append(", ").append(isNotice);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
