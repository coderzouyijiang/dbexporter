/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
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
public class TReleaseFrozenBalance implements Serializable {

    private static final long serialVersionUID = -1098093226;

    private Long       id;
    private Long       customerId;
    private BigDecimal amount;
    private Byte       type;
    private Long       itemDetailId;
    private Byte       processStatus;
    private Long       sourceId;
    private Timestamp  cdate;
    private Timestamp  mdate;
    private Long       timestamp;
    private BigDecimal totalAmount;

    public TReleaseFrozenBalance() {}

    public TReleaseFrozenBalance(TReleaseFrozenBalance value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.amount = value.amount;
        this.type = value.type;
        this.itemDetailId = value.itemDetailId;
        this.processStatus = value.processStatus;
        this.sourceId = value.sourceId;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
        this.timestamp = value.timestamp;
        this.totalAmount = value.totalAmount;
    }

    public TReleaseFrozenBalance(
        Long       id,
        Long       customerId,
        BigDecimal amount,
        Byte       type,
        Long       itemDetailId,
        Byte       processStatus,
        Long       sourceId,
        Timestamp  cdate,
        Timestamp  mdate,
        Long       timestamp,
        BigDecimal totalAmount
    ) {
        this.id = id;
        this.customerId = customerId;
        this.amount = amount;
        this.type = type;
        this.itemDetailId = itemDetailId;
        this.processStatus = processStatus;
        this.sourceId = sourceId;
        this.cdate = cdate;
        this.mdate = mdate;
        this.timestamp = timestamp;
        this.totalAmount = totalAmount;
    }

    public Long getId() {
        return this.id;
    }

    public TReleaseFrozenBalance setId(Long id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Long getCustomerId() {
        return this.customerId;
    }

    public TReleaseFrozenBalance setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    @NotNull
    public BigDecimal getAmount() {
        return this.amount;
    }

    public TReleaseFrozenBalance setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public Byte getType() {
        return this.type;
    }

    public TReleaseFrozenBalance setType(Byte type) {
        this.type = type;
        return this;
    }

    @NotNull
    public Long getItemDetailId() {
        return this.itemDetailId;
    }

    public TReleaseFrozenBalance setItemDetailId(Long itemDetailId) {
        this.itemDetailId = itemDetailId;
        return this;
    }

    @NotNull
    public Byte getProcessStatus() {
        return this.processStatus;
    }

    public TReleaseFrozenBalance setProcessStatus(Byte processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    @NotNull
    public Long getSourceId() {
        return this.sourceId;
    }

    public TReleaseFrozenBalance setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TReleaseFrozenBalance setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TReleaseFrozenBalance setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @NotNull
    public Long getTimestamp() {
        return this.timestamp;
    }

    public TReleaseFrozenBalance setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public TReleaseFrozenBalance setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TReleaseFrozenBalance (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(amount);
        sb.append(", ").append(type);
        sb.append(", ").append(itemDetailId);
        sb.append(", ").append(processStatus);
        sb.append(", ").append(sourceId);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);
        sb.append(", ").append(timestamp);
        sb.append(", ").append(totalAmount);

        sb.append(")");
        return sb.toString();
    }
}
