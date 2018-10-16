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
public class TCustomerBlack implements Serializable {

    private static final long serialVersionUID = -614617624;

    private Long      id;
    private Long      customerId;
    private Byte      typeId;
    private Byte      status;
    private Timestamp cdate;
    private Timestamp mdate;

    public TCustomerBlack() {}

    public TCustomerBlack(TCustomerBlack value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.typeId = value.typeId;
        this.status = value.status;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TCustomerBlack(
        Long      id,
        Long      customerId,
        Byte      typeId,
        Byte      status,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.customerId = customerId;
        this.typeId = typeId;
        this.status = status;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Long getId() {
        return this.id;
    }

    public TCustomerBlack setId(Long id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Long getCustomerId() {
        return this.customerId;
    }

    public TCustomerBlack setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    @NotNull
    public Byte getTypeId() {
        return this.typeId;
    }

    public TCustomerBlack setTypeId(Byte typeId) {
        this.typeId = typeId;
        return this;
    }

    @NotNull
    public Byte getStatus() {
        return this.status;
    }

    public TCustomerBlack setStatus(Byte status) {
        this.status = status;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCustomerBlack setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCustomerBlack setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCustomerBlack (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(typeId);
        sb.append(", ").append(status);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
