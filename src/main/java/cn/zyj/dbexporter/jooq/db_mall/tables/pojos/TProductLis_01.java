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
public class TProductLis_01 implements Serializable {

    private static final long serialVersionUID = 1254284273;

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

    public TProductLis_01() {}

    public TProductLis_01(TProductLis_01 value) {
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

    public TProductLis_01(
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

    public TProductLis_01 setId(Integer id) {
        this.id = id;
        return this;
    }

    public Byte getDoStatus() {
        return this.doStatus;
    }

    public TProductLis_01 setDoStatus(Byte doStatus) {
        this.doStatus = doStatus;
        return this;
    }

    @Size(max = 500)
    public String getImagesUrl() {
        return this.imagesUrl;
    }

    public TProductLis_01 setImagesUrl(String imagesUrl) {
        this.imagesUrl = imagesUrl;
        return this;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public TProductLis_01 setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public Integer getBrandId() {
        return this.brandId;
    }

    public TProductLis_01 setBrandId(Integer brandId) {
        this.brandId = brandId;
        return this;
    }

    @Size(max = 100)
    public String getSkuIds() {
        return this.skuIds;
    }

    public TProductLis_01 setSkuIds(String skuIds) {
        this.skuIds = skuIds;
        return this;
    }

    public Byte getCondition() {
        return this.condition;
    }

    public TProductLis_01 setCondition(Byte condition) {
        this.condition = condition;
        return this;
    }

    @NotNull
    @Size(max = 300)
    public String getTitle() {
        return this.title;
    }

    public TProductLis_01 setTitle(String title) {
        this.title = title;
        return this;
    }

    @Size(max = 300)
    public String getSubTitle() {
        return this.subTitle;
    }

    public TProductLis_01 setSubTitle(String subTitle) {
        this.subTitle = subTitle;
        return this;
    }

    @Size(max = 100)
    public String getMiniTitle() {
        return this.miniTitle;
    }

    public TProductLis_01 setMiniTitle(String miniTitle) {
        this.miniTitle = miniTitle;
        return this;
    }

    @Size(max = 100)
    public String getBriefTitle() {
        return this.briefTitle;
    }

    public TProductLis_01 setBriefTitle(String briefTitle) {
        this.briefTitle = briefTitle;
        return this;
    }

    @NotNull
    @Size(max = 500)
    public String getImages() {
        return this.images;
    }

    public TProductLis_01 setImages(String images) {
        this.images = images;
        return this;
    }

    public BigDecimal getDeposit() {
        return this.deposit;
    }

    public TProductLis_01 setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
        return this;
    }

    public Byte getIsSale() {
        return this.isSale;
    }

    public TProductLis_01 setIsSale(Byte isSale) {
        this.isSale = isSale;
        return this;
    }

    @Size(max = 65535)
    public String getRents() {
        return this.rents;
    }

    public TProductLis_01 setRents(String rents) {
        this.rents = rents;
        return this;
    }

    public Integer getStock() {
        return this.stock;
    }

    public TProductLis_01 setStock(Integer stock) {
        this.stock = stock;
        return this;
    }

    public Integer getOid() {
        return this.oid;
    }

    public TProductLis_01 setOid(Integer oid) {
        this.oid = oid;
        return this;
    }

    public Integer getProductDescribeCId() {
        return this.productDescribeCId;
    }

    public TProductLis_01 setProductDescribeCId(Integer productDescribeCId) {
        this.productDescribeCId = productDescribeCId;
        return this;
    }

    public Integer getProductDescribePId() {
        return this.productDescribePId;
    }

    public TProductLis_01 setProductDescribePId(Integer productDescribePId) {
        this.productDescribePId = productDescribePId;
        return this;
    }

    @NotNull
    public BigDecimal getMinRent() {
        return this.minRent;
    }

    public TProductLis_01 setMinRent(BigDecimal minRent) {
        this.minRent = minRent;
        return this;
    }

    @Size(max = 100)
    public String getServiceId() {
        return this.serviceId;
    }

    public TProductLis_01 setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    @Size(max = 500)
    public String getTags() {
        return this.tags;
    }

    public TProductLis_01 setTags(String tags) {
        this.tags = tags;
        return this;
    }

    @Size(max = 500)
    public String getIcoTags() {
        return this.icoTags;
    }

    public TProductLis_01 setIcoTags(String icoTags) {
        this.icoTags = icoTags;
        return this;
    }

    @Size(max = 30)
    public String getInsuranceTypeIds() {
        return this.insuranceTypeIds;
    }

    public TProductLis_01 setInsuranceTypeIds(String insuranceTypeIds) {
        this.insuranceTypeIds = insuranceTypeIds;
        return this;
    }

    @Size(max = 30)
    public String getAddedServiceTypeIds() {
        return this.addedServiceTypeIds;
    }

    public TProductLis_01 setAddedServiceTypeIds(String addedServiceTypeIds) {
        this.addedServiceTypeIds = addedServiceTypeIds;
        return this;
    }

    @Size(max = 30)
    public String getSuitsTypes() {
        return this.suitsTypes;
    }

    public TProductLis_01 setSuitsTypes(String suitsTypes) {
        this.suitsTypes = suitsTypes;
        return this;
    }

    @Size(max = 300)
    public String getParts() {
        return this.parts;
    }

    public TProductLis_01 setParts(String parts) {
        this.parts = parts;
        return this;
    }

    public BigDecimal getSalePrice() {
        return this.salePrice;
    }

    public TProductLis_01 setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
        return this;
    }

    public Byte getStatus() {
        return this.status;
    }

    public TProductLis_01 setStatus(Byte status) {
        this.status = status;
        return this;
    }

    @NotNull
    public Byte getCheckStatus() {
        return this.checkStatus;
    }

    public TProductLis_01 setCheckStatus(Byte checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }

    @Size(max = 500)
    public String getCheckRemark() {
        return this.checkRemark;
    }

    public TProductLis_01 setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark;
        return this;
    }

    public Byte getSyncStatus() {
        return this.syncStatus;
    }

    public TProductLis_01 setSyncStatus(Byte syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    public Integer getAssembleId() {
        return this.assembleId;
    }

    public TProductLis_01 setAssembleId(Integer assembleId) {
        this.assembleId = assembleId;
        return this;
    }

    public Integer getStartDate() {
        return this.startDate;
    }

    public TProductLis_01 setStartDate(Integer startDate) {
        this.startDate = startDate;
        return this;
    }

    public Byte getIsSendSmsToSale() {
        return this.isSendSmsToSale;
    }

    public TProductLis_01 setIsSendSmsToSale(Byte isSendSmsToSale) {
        this.isSendSmsToSale = isSendSmsToSale;
        return this;
    }

    public Byte getIsSearch() {
        return this.isSearch;
    }

    public TProductLis_01 setIsSearch(Byte isSearch) {
        this.isSearch = isSearch;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TProductLis_01 setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TProductLis_01 setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    public Integer getPresaleStock() {
        return this.presaleStock;
    }

    public TProductLis_01 setPresaleStock(Integer presaleStock) {
        this.presaleStock = presaleStock;
        return this;
    }

    public Integer getIsPresale() {
        return this.isPresale;
    }

    public TProductLis_01 setIsPresale(Integer isPresale) {
        this.isPresale = isPresale;
        return this;
    }

    public Byte getIsGhost() {
        return this.isGhost;
    }

    public TProductLis_01 setIsGhost(Byte isGhost) {
        this.isGhost = isGhost;
        return this;
    }

    public Byte getIsSub() {
        return this.isSub;
    }

    public TProductLis_01 setIsSub(Byte isSub) {
        this.isSub = isSub;
        return this;
    }

    @Size(max = 100)
    public String getSubDescribe() {
        return this.subDescribe;
    }

    public TProductLis_01 setSubDescribe(String subDescribe) {
        this.subDescribe = subDescribe;
        return this;
    }

    @Size(max = 300)
    public String getSubLink() {
        return this.subLink;
    }

    public TProductLis_01 setSubLink(String subLink) {
        this.subLink = subLink;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TProductLis_01 (");

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
