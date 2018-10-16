/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
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
public class TAssetsDeviceBelongCopy implements Serializable {

    private static final long serialVersionUID = 20577806;

    private Long       id;
    private String     sn;
    private Integer    skuId;
    private Integer    platformId;
    private String     buyNum;
    private BigDecimal marketPrice;
    private Integer    status;
    private Timestamp  cdate;
    private Timestamp  mdate;

    public TAssetsDeviceBelongCopy() {}

    public TAssetsDeviceBelongCopy(TAssetsDeviceBelongCopy value) {
        this.id = value.id;
        this.sn = value.sn;
        this.skuId = value.skuId;
        this.platformId = value.platformId;
        this.buyNum = value.buyNum;
        this.marketPrice = value.marketPrice;
        this.status = value.status;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TAssetsDeviceBelongCopy(
        Long       id,
        String     sn,
        Integer    skuId,
        Integer    platformId,
        String     buyNum,
        BigDecimal marketPrice,
        Integer    status,
        Timestamp  cdate,
        Timestamp  mdate
    ) {
        this.id = id;
        this.sn = sn;
        this.skuId = skuId;
        this.platformId = platformId;
        this.buyNum = buyNum;
        this.marketPrice = marketPrice;
        this.status = status;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Long getId() {
        return this.id;
    }

    public TAssetsDeviceBelongCopy setId(Long id) {
        this.id = id;
        return this;
    }

    @Size(max = 50)
    public String getSn() {
        return this.sn;
    }

    public TAssetsDeviceBelongCopy setSn(String sn) {
        this.sn = sn;
        return this;
    }

    @NotNull
    public Integer getSkuId() {
        return this.skuId;
    }

    public TAssetsDeviceBelongCopy setSkuId(Integer skuId) {
        this.skuId = skuId;
        return this;
    }

    @NotNull
    public Integer getPlatformId() {
        return this.platformId;
    }

    public TAssetsDeviceBelongCopy setPlatformId(Integer platformId) {
        this.platformId = platformId;
        return this;
    }

    @Size(max = 64)
    public String getBuyNum() {
        return this.buyNum;
    }

    public TAssetsDeviceBelongCopy setBuyNum(String buyNum) {
        this.buyNum = buyNum;
        return this;
    }

    public BigDecimal getMarketPrice() {
        return this.marketPrice;
    }

    public TAssetsDeviceBelongCopy setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public TAssetsDeviceBelongCopy setStatus(Integer status) {
        this.status = status;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TAssetsDeviceBelongCopy setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TAssetsDeviceBelongCopy setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TAssetsDeviceBelongCopy (");

        sb.append(id);
        sb.append(", ").append(sn);
        sb.append(", ").append(skuId);
        sb.append(", ").append(platformId);
        sb.append(", ").append(buyNum);
        sb.append(", ").append(marketPrice);
        sb.append(", ").append(status);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
