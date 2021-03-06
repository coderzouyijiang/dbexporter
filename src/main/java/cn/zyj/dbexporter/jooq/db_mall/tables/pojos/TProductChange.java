/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
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
public class TProductChange implements Serializable {

    private static final long serialVersionUID = -1842261811;

    private Long       id;
    private Long       productId;
    private Byte       typeId;
    private BigDecimal oldRent;
    private BigDecimal newRent;
    private Byte       oldStatus;
    private Byte       oldCheckStatus;
    private Byte       newStatus;
    private Byte       newCheckStatus;
    private Timestamp  cdate;
    private Timestamp  mdate;
    private String     oldFieldStr;
    private String     newFieldStr;

    public TProductChange() {}

    public TProductChange(TProductChange value) {
        this.id = value.id;
        this.productId = value.productId;
        this.typeId = value.typeId;
        this.oldRent = value.oldRent;
        this.newRent = value.newRent;
        this.oldStatus = value.oldStatus;
        this.oldCheckStatus = value.oldCheckStatus;
        this.newStatus = value.newStatus;
        this.newCheckStatus = value.newCheckStatus;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
        this.oldFieldStr = value.oldFieldStr;
        this.newFieldStr = value.newFieldStr;
    }

    public TProductChange(
        Long       id,
        Long       productId,
        Byte       typeId,
        BigDecimal oldRent,
        BigDecimal newRent,
        Byte       oldStatus,
        Byte       oldCheckStatus,
        Byte       newStatus,
        Byte       newCheckStatus,
        Timestamp  cdate,
        Timestamp  mdate,
        String     oldFieldStr,
        String     newFieldStr
    ) {
        this.id = id;
        this.productId = productId;
        this.typeId = typeId;
        this.oldRent = oldRent;
        this.newRent = newRent;
        this.oldStatus = oldStatus;
        this.oldCheckStatus = oldCheckStatus;
        this.newStatus = newStatus;
        this.newCheckStatus = newCheckStatus;
        this.cdate = cdate;
        this.mdate = mdate;
        this.oldFieldStr = oldFieldStr;
        this.newFieldStr = newFieldStr;
    }

    public Long getId() {
        return this.id;
    }

    public TProductChange setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getProductId() {
        return this.productId;
    }

    public TProductChange setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Byte getTypeId() {
        return this.typeId;
    }

    public TProductChange setTypeId(Byte typeId) {
        this.typeId = typeId;
        return this;
    }

    public BigDecimal getOldRent() {
        return this.oldRent;
    }

    public TProductChange setOldRent(BigDecimal oldRent) {
        this.oldRent = oldRent;
        return this;
    }

    public BigDecimal getNewRent() {
        return this.newRent;
    }

    public TProductChange setNewRent(BigDecimal newRent) {
        this.newRent = newRent;
        return this;
    }

    public Byte getOldStatus() {
        return this.oldStatus;
    }

    public TProductChange setOldStatus(Byte oldStatus) {
        this.oldStatus = oldStatus;
        return this;
    }

    public Byte getOldCheckStatus() {
        return this.oldCheckStatus;
    }

    public TProductChange setOldCheckStatus(Byte oldCheckStatus) {
        this.oldCheckStatus = oldCheckStatus;
        return this;
    }

    public Byte getNewStatus() {
        return this.newStatus;
    }

    public TProductChange setNewStatus(Byte newStatus) {
        this.newStatus = newStatus;
        return this;
    }

    public Byte getNewCheckStatus() {
        return this.newCheckStatus;
    }

    public TProductChange setNewCheckStatus(Byte newCheckStatus) {
        this.newCheckStatus = newCheckStatus;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TProductChange setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TProductChange setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Size(max = 800)
    public String getOldFieldStr() {
        return this.oldFieldStr;
    }

    public TProductChange setOldFieldStr(String oldFieldStr) {
        this.oldFieldStr = oldFieldStr;
        return this;
    }

    @Size(max = 800)
    public String getNewFieldStr() {
        return this.newFieldStr;
    }

    public TProductChange setNewFieldStr(String newFieldStr) {
        this.newFieldStr = newFieldStr;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TProductChange (");

        sb.append(id);
        sb.append(", ").append(productId);
        sb.append(", ").append(typeId);
        sb.append(", ").append(oldRent);
        sb.append(", ").append(newRent);
        sb.append(", ").append(oldStatus);
        sb.append(", ").append(oldCheckStatus);
        sb.append(", ").append(newStatus);
        sb.append(", ").append(newCheckStatus);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);
        sb.append(", ").append(oldFieldStr);
        sb.append(", ").append(newFieldStr);

        sb.append(")");
        return sb.toString();
    }
}
