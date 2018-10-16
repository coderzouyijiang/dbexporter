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
public class TProductGhost implements Serializable {

    private static final long serialVersionUID = 1459323745;

    private Integer   id;
    private Long      customerId;
    private Long      productId;
    private Byte      status;
    private Timestamp cdate;
    private Timestamp mdate;

    public TProductGhost() {}

    public TProductGhost(TProductGhost value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.productId = value.productId;
        this.status = value.status;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TProductGhost(
        Integer   id,
        Long      customerId,
        Long      productId,
        Byte      status,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.status = status;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TProductGhost setId(Integer id) {
        this.id = id;
        return this;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public TProductGhost setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public Long getProductId() {
        return this.productId;
    }

    public TProductGhost setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Byte getStatus() {
        return this.status;
    }

    public TProductGhost setStatus(Byte status) {
        this.status = status;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TProductGhost setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TProductGhost setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TProductGhost (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(productId);
        sb.append(", ").append(status);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
