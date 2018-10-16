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
public class TProductSkuidInfo implements Serializable {

    private static final long serialVersionUID = -1065875112;

    private Long      id;
    private Integer   productId;
    private Integer   skuId;
    private Integer   stock;
    private Integer   realStock;
    private Byte      isPresale;
    private Byte      syncStatus;
    private String    rents;
    private Timestamp cdate;
    private Timestamp mdate;

    public TProductSkuidInfo() {}

    public TProductSkuidInfo(TProductSkuidInfo value) {
        this.id = value.id;
        this.productId = value.productId;
        this.skuId = value.skuId;
        this.stock = value.stock;
        this.realStock = value.realStock;
        this.isPresale = value.isPresale;
        this.syncStatus = value.syncStatus;
        this.rents = value.rents;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TProductSkuidInfo(
        Long      id,
        Integer   productId,
        Integer   skuId,
        Integer   stock,
        Integer   realStock,
        Byte      isPresale,
        Byte      syncStatus,
        String    rents,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.productId = productId;
        this.skuId = skuId;
        this.stock = stock;
        this.realStock = realStock;
        this.isPresale = isPresale;
        this.syncStatus = syncStatus;
        this.rents = rents;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Long getId() {
        return this.id;
    }

    public TProductSkuidInfo setId(Long id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Integer getProductId() {
        return this.productId;
    }

    public TProductSkuidInfo setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    @NotNull
    public Integer getSkuId() {
        return this.skuId;
    }

    public TProductSkuidInfo setSkuId(Integer skuId) {
        this.skuId = skuId;
        return this;
    }

    public Integer getStock() {
        return this.stock;
    }

    public TProductSkuidInfo setStock(Integer stock) {
        this.stock = stock;
        return this;
    }

    @NotNull
    public Integer getRealStock() {
        return this.realStock;
    }

    public TProductSkuidInfo setRealStock(Integer realStock) {
        this.realStock = realStock;
        return this;
    }

    public Byte getIsPresale() {
        return this.isPresale;
    }

    public TProductSkuidInfo setIsPresale(Byte isPresale) {
        this.isPresale = isPresale;
        return this;
    }

    public Byte getSyncStatus() {
        return this.syncStatus;
    }

    public TProductSkuidInfo setSyncStatus(Byte syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    @Size(max = 65535)
    public String getRents() {
        return this.rents;
    }

    public TProductSkuidInfo setRents(String rents) {
        this.rents = rents;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TProductSkuidInfo setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TProductSkuidInfo setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TProductSkuidInfo (");

        sb.append(id);
        sb.append(", ").append(productId);
        sb.append(", ").append(skuId);
        sb.append(", ").append(stock);
        sb.append(", ").append(realStock);
        sb.append(", ").append(isPresale);
        sb.append(", ").append(syncStatus);
        sb.append(", ").append(rents);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}