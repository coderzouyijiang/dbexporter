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
public class TOfferGoods implements Serializable {

    private static final long serialVersionUID = 1206788443;

    private Integer    id;
    private Byte       typeId;
    private String     title;
    private String     simpleTitle;
    private String     tags;
    private BigDecimal oldRent;
    private String     url;
    private Long       productId;
    private Integer    oid;
    private Timestamp  cdate;
    private Timestamp  mdate;

    public TOfferGoods() {}

    public TOfferGoods(TOfferGoods value) {
        this.id = value.id;
        this.typeId = value.typeId;
        this.title = value.title;
        this.simpleTitle = value.simpleTitle;
        this.tags = value.tags;
        this.oldRent = value.oldRent;
        this.url = value.url;
        this.productId = value.productId;
        this.oid = value.oid;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TOfferGoods(
        Integer    id,
        Byte       typeId,
        String     title,
        String     simpleTitle,
        String     tags,
        BigDecimal oldRent,
        String     url,
        Long       productId,
        Integer    oid,
        Timestamp  cdate,
        Timestamp  mdate
    ) {
        this.id = id;
        this.typeId = typeId;
        this.title = title;
        this.simpleTitle = simpleTitle;
        this.tags = tags;
        this.oldRent = oldRent;
        this.url = url;
        this.productId = productId;
        this.oid = oid;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TOfferGoods setId(Integer id) {
        this.id = id;
        return this;
    }

    public Byte getTypeId() {
        return this.typeId;
    }

    public TOfferGoods setTypeId(Byte typeId) {
        this.typeId = typeId;
        return this;
    }

    @NotNull
    @Size(max = 100)
    public String getTitle() {
        return this.title;
    }

    public TOfferGoods setTitle(String title) {
        this.title = title;
        return this;
    }

    @Size(max = 100)
    public String getSimpleTitle() {
        return this.simpleTitle;
    }

    public TOfferGoods setSimpleTitle(String simpleTitle) {
        this.simpleTitle = simpleTitle;
        return this;
    }

    @Size(max = 100)
    public String getTags() {
        return this.tags;
    }

    public TOfferGoods setTags(String tags) {
        this.tags = tags;
        return this;
    }

    public BigDecimal getOldRent() {
        return this.oldRent;
    }

    public TOfferGoods setOldRent(BigDecimal oldRent) {
        this.oldRent = oldRent;
        return this;
    }

    @Size(max = 100)
    public String getUrl() {
        return this.url;
    }

    public TOfferGoods setUrl(String url) {
        this.url = url;
        return this;
    }

    public Long getProductId() {
        return this.productId;
    }

    public TOfferGoods setProductId(Long productId) {
        this.productId = productId;
        return this;
    }

    public Integer getOid() {
        return this.oid;
    }

    public TOfferGoods setOid(Integer oid) {
        this.oid = oid;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TOfferGoods setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TOfferGoods setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TOfferGoods (");

        sb.append(id);
        sb.append(", ").append(typeId);
        sb.append(", ").append(title);
        sb.append(", ").append(simpleTitle);
        sb.append(", ").append(tags);
        sb.append(", ").append(oldRent);
        sb.append(", ").append(url);
        sb.append(", ").append(productId);
        sb.append(", ").append(oid);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}