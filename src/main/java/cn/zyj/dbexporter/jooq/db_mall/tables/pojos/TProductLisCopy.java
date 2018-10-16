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
public class TProductLisCopy implements Serializable {

    private static final long serialVersionUID = -102575745;

    private Integer    id;
    private Byte       doStatus;
    private String     imagesUrl;
    private Integer    categoryId;
    private Integer    brandId;
    private String     skuIds;
    private Byte       condition;
    private String     title;
    private String     subTitle;
    private String     miniTitle;
    private String     briefTitle;
    private String     images;
    private BigDecimal deposit;
    private Byte       isSale;
    private String     rents;
    private Integer    stock;
    private Integer    oid;
    private Integer    productDescribeCId;
    private Integer    productDescribePId;
    private BigDecimal minRent;
    private String     serviceId;
    private String     tags;
    private String     icoTags;
    private String     insuranceTypeIds;
    private String     addedServiceTypeIds;
    private String     suitsTypes;
    private String     parts;
    private BigDecimal salePrice;
    private Byte       status;
    private Byte       checkStatus;
    private String     checkRemark;
    private Byte       syncStatus;
    private Integer    assembleId;
    private Integer    startDate;
    private Byte       isSendSmsToSale;
    private Byte       isSearch;
    private Timestamp  cdate;
    private Timestamp  mdate;
    private Integer    presaleStock;
    private Integer    isPresale;
    private Byte       isGhost;
    private Byte       isSub;
    private String     subDescribe;
    private String     subLink;

    public TProductLisCopy() {}

    public TProductLisCopy(TProductLisCopy value) {
        this.id = value.id;
        this.doStatus = value.doStatus;
        this.imagesUrl = value.imagesUrl;
        this.categoryId = value.categoryId;
        this.brandId = value.brandId;
        this.skuIds = value.skuIds;
        this.condition = value.condition;
        this.title = value.title;
        this.subTitle = value.subTitle;
        this.miniTitle = value.miniTitle;
        this.briefTitle = value.briefTitle;
        this.images = value.images;
        this.deposit = value.deposit;
        this.isSale = value.isSale;
        this.rents = value.rents;
        this.stock = value.stock;
        this.oid = value.oid;
        this.productDescribeCId = value.productDescribeCId;
        this.productDescribePId = value.productDescribePId;
        this.minRent = value.minRent;
        this.serviceId = value.serviceId;
        this.tags = value.tags;
        this.icoTags = value.icoTags;
        this.insuranceTypeIds = value.insuranceTypeIds;
        this.addedServiceTypeIds = value.addedServiceTypeIds;
        this.suitsTypes = value.suitsTypes;
        this.parts = value.parts;
        this.salePrice = value.salePrice;
        this.status = value.status;
        this.checkStatus = value.checkStatus;
        this.checkRemark = value.checkRemark;
        this.syncStatus = value.syncStatus;
        this.assembleId = value.assembleId;
        this.startDate = value.startDate;
        this.isSendSmsToSale = value.isSendSmsToSale;
        this.isSearch = value.isSearch;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
        this.presaleStock = value.presaleStock;
        this.isPresale = value.isPresale;
        this.isGhost = value.isGhost;
        this.isSub = value.isSub;
        this.subDescribe = value.subDescribe;
        this.subLink = value.subLink;
    }

    public TProductLisCopy(
        Integer    id,
        Byte       doStatus,
        String     imagesUrl,
        Integer    categoryId,
        Integer    brandId,
        String     skuIds,
        Byte       condition,
        String     title,
        String     subTitle,
        String     miniTitle,
        String     briefTitle,
        String     images,
        BigDecimal deposit,
        Byte       isSale,
        String     rents,
        Integer    stock,
        Integer    oid,
        Integer    productDescribeCId,
        Integer    productDescribePId,
        BigDecimal minRent,
        String     serviceId,
        String     tags,
        String     icoTags,
        String     insuranceTypeIds,
        String     addedServiceTypeIds,
        String     suitsTypes,
        String     parts,
        BigDecimal salePrice,
        Byte       status,
        Byte       checkStatus,
        String     checkRemark,
        Byte       syncStatus,
        Integer    assembleId,
        Integer    startDate,
        Byte       isSendSmsToSale,
        Byte       isSearch,
        Timestamp  cdate,
        Timestamp  mdate,
        Integer    presaleStock,
        Integer    isPresale,
        Byte       isGhost,
        Byte       isSub,
        String     subDescribe,
        String     subLink
    ) {
        this.id = id;
        this.doStatus = doStatus;
        this.imagesUrl = imagesUrl;
        this.categoryId = categoryId;
        this.brandId = brandId;
        this.skuIds = skuIds;
        this.condition = condition;
        this.title = title;
        this.subTitle = subTitle;
        this.miniTitle = miniTitle;
        this.briefTitle = briefTitle;
        this.images = images;
        this.deposit = deposit;
        this.isSale = isSale;
        this.rents = rents;
        this.stock = stock;
        this.oid = oid;
        this.productDescribeCId = productDescribeCId;
        this.productDescribePId = productDescribePId;
        this.minRent = minRent;
        this.serviceId = serviceId;
        this.tags = tags;
        this.icoTags = icoTags;
        this.insuranceTypeIds = insuranceTypeIds;
        this.addedServiceTypeIds = addedServiceTypeIds;
        this.suitsTypes = suitsTypes;
        this.parts = parts;
        this.salePrice = salePrice;
        this.status = status;
        this.checkStatus = checkStatus;
        this.checkRemark = checkRemark;
        this.syncStatus = syncStatus;
        this.assembleId = assembleId;
        this.startDate = startDate;
        this.isSendSmsToSale = isSendSmsToSale;
        this.isSearch = isSearch;
        this.cdate = cdate;
        this.mdate = mdate;
        this.presaleStock = presaleStock;
        this.isPresale = isPresale;
        this.isGhost = isGhost;
        this.isSub = isSub;
        this.subDescribe = subDescribe;
        this.subLink = subLink;
    }

    public Integer getId() {
        return this.id;
    }

    public TProductLisCopy setId(Integer id) {
        this.id = id;
        return this;
    }

    public Byte getDoStatus() {
        return this.doStatus;
    }

    public TProductLisCopy setDoStatus(Byte doStatus) {
        this.doStatus = doStatus;
        return this;
    }

    @Size(max = 500)
    public String getImagesUrl() {
        return this.imagesUrl;
    }

    public TProductLisCopy setImagesUrl(String imagesUrl) {
        this.imagesUrl = imagesUrl;
        return this;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public TProductLisCopy setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Integer getBrandId() {
        return this.brandId;
    }

    public TProductLisCopy setBrandId(Integer brandId) {
        this.brandId = brandId;
        return this;
    }

    @Size(max = 100)
    public String getSkuIds() {
        return this.skuIds;
    }

    public TProductLisCopy setSkuIds(String skuIds) {
        this.skuIds = skuIds;
        return this;
    }

    public Byte getCondition() {
        return this.condition;
    }

    public TProductLisCopy setCondition(Byte condition) {
        this.condition = condition;
        return this;
    }

    @NotNull
    @Size(max = 300)
    public String getTitle() {
        return this.title;
    }

    public TProductLisCopy setTitle(String title) {
        this.title = title;
        return this;
    }

    @Size(max = 300)
    public String getSubTitle() {
        return this.subTitle;
    }

    public TProductLisCopy setSubTitle(String subTitle) {
        this.subTitle = subTitle;
        return this;
    }

    @Size(max = 100)
    public String getMiniTitle() {
        return this.miniTitle;
    }

    public TProductLisCopy setMiniTitle(String miniTitle) {
        this.miniTitle = miniTitle;
        return this;
    }

    @Size(max = 100)
    public String getBriefTitle() {
        return this.briefTitle;
    }

    public TProductLisCopy setBriefTitle(String briefTitle) {
        this.briefTitle = briefTitle;
        return this;
    }

    @NotNull
    @Size(max = 500)
    public String getImages() {
        return this.images;
    }

    public TProductLisCopy setImages(String images) {
        this.images = images;
        return this;
    }

    public BigDecimal getDeposit() {
        return this.deposit;
    }

    public TProductLisCopy setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
        return this;
    }

    public Byte getIsSale() {
        return this.isSale;
    }

    public TProductLisCopy setIsSale(Byte isSale) {
        this.isSale = isSale;
        return this;
    }

    @Size(max = 65535)
    public String getRents() {
        return this.rents;
    }

    public TProductLisCopy setRents(String rents) {
        this.rents = rents;
        return this;
    }

    public Integer getStock() {
        return this.stock;
    }

    public TProductLisCopy setStock(Integer stock) {
        this.stock = stock;
        return this;
    }

    public Integer getOid() {
        return this.oid;
    }

    public TProductLisCopy setOid(Integer oid) {
        this.oid = oid;
        return this;
    }

    public Integer getProductDescribeCId() {
        return this.productDescribeCId;
    }

    public TProductLisCopy setProductDescribeCId(Integer productDescribeCId) {
        this.productDescribeCId = productDescribeCId;
        return this;
    }

    public Integer getProductDescribePId() {
        return this.productDescribePId;
    }

    public TProductLisCopy setProductDescribePId(Integer productDescribePId) {
        this.productDescribePId = productDescribePId;
        return this;
    }

    @NotNull
    public BigDecimal getMinRent() {
        return this.minRent;
    }

    public TProductLisCopy setMinRent(BigDecimal minRent) {
        this.minRent = minRent;
        return this;
    }

    @Size(max = 100)
    public String getServiceId() {
        return this.serviceId;
    }

    public TProductLisCopy setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    @Size(max = 500)
    public String getTags() {
        return this.tags;
    }

    public TProductLisCopy setTags(String tags) {
        this.tags = tags;
        return this;
    }

    @Size(max = 500)
    public String getIcoTags() {
        return this.icoTags;
    }

    public TProductLisCopy setIcoTags(String icoTags) {
        this.icoTags = icoTags;
        return this;
    }

    @Size(max = 30)
    public String getInsuranceTypeIds() {
        return this.insuranceTypeIds;
    }

    public TProductLisCopy setInsuranceTypeIds(String insuranceTypeIds) {
        this.insuranceTypeIds = insuranceTypeIds;
        return this;
    }

    @Size(max = 30)
    public String getAddedServiceTypeIds() {
        return this.addedServiceTypeIds;
    }

    public TProductLisCopy setAddedServiceTypeIds(String addedServiceTypeIds) {
        this.addedServiceTypeIds = addedServiceTypeIds;
        return this;
    }

    @Size(max = 30)
    public String getSuitsTypes() {
        return this.suitsTypes;
    }

    public TProductLisCopy setSuitsTypes(String suitsTypes) {
        this.suitsTypes = suitsTypes;
        return this;
    }

    @Size(max = 300)
    public String getParts() {
        return this.parts;
    }

    public TProductLisCopy setParts(String parts) {
        this.parts = parts;
        return this;
    }

    public BigDecimal getSalePrice() {
        return this.salePrice;
    }

    public TProductLisCopy setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
        return this;
    }

    public Byte getStatus() {
        return this.status;
    }

    public TProductLisCopy setStatus(Byte status) {
        this.status = status;
        return this;
    }

    @NotNull
    public Byte getCheckStatus() {
        return this.checkStatus;
    }

    public TProductLisCopy setCheckStatus(Byte checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }

    @Size(max = 500)
    public String getCheckRemark() {
        return this.checkRemark;
    }

    public TProductLisCopy setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark;
        return this;
    }

    public Byte getSyncStatus() {
        return this.syncStatus;
    }

    public TProductLisCopy setSyncStatus(Byte syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    public Integer getAssembleId() {
        return this.assembleId;
    }

    public TProductLisCopy setAssembleId(Integer assembleId) {
        this.assembleId = assembleId;
        return this;
    }

    public Integer getStartDate() {
        return this.startDate;
    }

    public TProductLisCopy setStartDate(Integer startDate) {
        this.startDate = startDate;
        return this;
    }

    public Byte getIsSendSmsToSale() {
        return this.isSendSmsToSale;
    }

    public TProductLisCopy setIsSendSmsToSale(Byte isSendSmsToSale) {
        this.isSendSmsToSale = isSendSmsToSale;
        return this;
    }

    public Byte getIsSearch() {
        return this.isSearch;
    }

    public TProductLisCopy setIsSearch(Byte isSearch) {
        this.isSearch = isSearch;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TProductLisCopy setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TProductLisCopy setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    public Integer getPresaleStock() {
        return this.presaleStock;
    }

    public TProductLisCopy setPresaleStock(Integer presaleStock) {
        this.presaleStock = presaleStock;
        return this;
    }

    public Integer getIsPresale() {
        return this.isPresale;
    }

    public TProductLisCopy setIsPresale(Integer isPresale) {
        this.isPresale = isPresale;
        return this;
    }

    public Byte getIsGhost() {
        return this.isGhost;
    }

    public TProductLisCopy setIsGhost(Byte isGhost) {
        this.isGhost = isGhost;
        return this;
    }

    public Byte getIsSub() {
        return this.isSub;
    }

    public TProductLisCopy setIsSub(Byte isSub) {
        this.isSub = isSub;
        return this;
    }

    @Size(max = 100)
    public String getSubDescribe() {
        return this.subDescribe;
    }

    public TProductLisCopy setSubDescribe(String subDescribe) {
        this.subDescribe = subDescribe;
        return this;
    }

    @Size(max = 300)
    public String getSubLink() {
        return this.subLink;
    }

    public TProductLisCopy setSubLink(String subLink) {
        this.subLink = subLink;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TProductLisCopy (");

        sb.append(id);
        sb.append(", ").append(doStatus);
        sb.append(", ").append(imagesUrl);
        sb.append(", ").append(categoryId);
        sb.append(", ").append(brandId);
        sb.append(", ").append(skuIds);
        sb.append(", ").append(condition);
        sb.append(", ").append(title);
        sb.append(", ").append(subTitle);
        sb.append(", ").append(miniTitle);
        sb.append(", ").append(briefTitle);
        sb.append(", ").append(images);
        sb.append(", ").append(deposit);
        sb.append(", ").append(isSale);
        sb.append(", ").append(rents);
        sb.append(", ").append(stock);
        sb.append(", ").append(oid);
        sb.append(", ").append(productDescribeCId);
        sb.append(", ").append(productDescribePId);
        sb.append(", ").append(minRent);
        sb.append(", ").append(serviceId);
        sb.append(", ").append(tags);
        sb.append(", ").append(icoTags);
        sb.append(", ").append(insuranceTypeIds);
        sb.append(", ").append(addedServiceTypeIds);
        sb.append(", ").append(suitsTypes);
        sb.append(", ").append(parts);
        sb.append(", ").append(salePrice);
        sb.append(", ").append(status);
        sb.append(", ").append(checkStatus);
        sb.append(", ").append(checkRemark);
        sb.append(", ").append(syncStatus);
        sb.append(", ").append(assembleId);
        sb.append(", ").append(startDate);
        sb.append(", ").append(isSendSmsToSale);
        sb.append(", ").append(isSearch);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);
        sb.append(", ").append(presaleStock);
        sb.append(", ").append(isPresale);
        sb.append(", ").append(isGhost);
        sb.append(", ").append(isSub);
        sb.append(", ").append(subDescribe);
        sb.append(", ").append(subLink);

        sb.append(")");
        return sb.toString();
    }
}
