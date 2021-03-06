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
public class TProductRelet implements Serializable {

    private static final long serialVersionUID = -578167603;

    private Integer    id;
    private Integer    sourceProductId;
    private Integer    reletProductId;
    private BigDecimal rent;
    private Byte       payType;
    private Integer    reletRentTypeId;
    private Timestamp  cdate;
    private Timestamp  mdate;

    public TProductRelet() {}

    public TProductRelet(TProductRelet value) {
        this.id = value.id;
        this.sourceProductId = value.sourceProductId;
        this.reletProductId = value.reletProductId;
        this.rent = value.rent;
        this.payType = value.payType;
        this.reletRentTypeId = value.reletRentTypeId;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TProductRelet(
        Integer    id,
        Integer    sourceProductId,
        Integer    reletProductId,
        BigDecimal rent,
        Byte       payType,
        Integer    reletRentTypeId,
        Timestamp  cdate,
        Timestamp  mdate
    ) {
        this.id = id;
        this.sourceProductId = sourceProductId;
        this.reletProductId = reletProductId;
        this.rent = rent;
        this.payType = payType;
        this.reletRentTypeId = reletRentTypeId;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TProductRelet setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Integer getSourceProductId() {
        return this.sourceProductId;
    }

    public TProductRelet setSourceProductId(Integer sourceProductId) {
        this.sourceProductId = sourceProductId;
        return this;
    }

    @NotNull
    public Integer getReletProductId() {
        return this.reletProductId;
    }

    public TProductRelet setReletProductId(Integer reletProductId) {
        this.reletProductId = reletProductId;
        return this;
    }

    public BigDecimal getRent() {
        return this.rent;
    }

    public TProductRelet setRent(BigDecimal rent) {
        this.rent = rent;
        return this;
    }

    public Byte getPayType() {
        return this.payType;
    }

    public TProductRelet setPayType(Byte payType) {
        this.payType = payType;
        return this;
    }

    public Integer getReletRentTypeId() {
        return this.reletRentTypeId;
    }

    public TProductRelet setReletRentTypeId(Integer reletRentTypeId) {
        this.reletRentTypeId = reletRentTypeId;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TProductRelet setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TProductRelet setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TProductRelet (");

        sb.append(id);
        sb.append(", ").append(sourceProductId);
        sb.append(", ").append(reletProductId);
        sb.append(", ").append(rent);
        sb.append(", ").append(payType);
        sb.append(", ").append(reletRentTypeId);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
