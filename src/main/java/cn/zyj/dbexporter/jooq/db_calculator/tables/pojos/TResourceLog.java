/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_calculator.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.Size;


/**
 * 资源池日志
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TResourceLog implements Serializable {

    private static final long serialVersionUID = 1745098575;

    private Integer    id;
    private Integer    resourceId;
    private BigDecimal purchasePrice;
    private Integer    offerValidity;
    private String     arrivalCycle;
    private Integer    auditStatus;
    private Integer    createrId;
    private String     createrName;
    private Timestamp  cdate;
    private Timestamp  mdate;
    private Integer    supplyStatus;
    private Integer    includeInstallCost;
    private String     updateRemark;
    private String     articleNo;
    private String     spu;

    public TResourceLog() {}

    public TResourceLog(TResourceLog value) {
        this.id = value.id;
        this.resourceId = value.resourceId;
        this.purchasePrice = value.purchasePrice;
        this.offerValidity = value.offerValidity;
        this.arrivalCycle = value.arrivalCycle;
        this.auditStatus = value.auditStatus;
        this.createrId = value.createrId;
        this.createrName = value.createrName;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
        this.supplyStatus = value.supplyStatus;
        this.includeInstallCost = value.includeInstallCost;
        this.updateRemark = value.updateRemark;
        this.articleNo = value.articleNo;
        this.spu = value.spu;
    }

    public TResourceLog(
        Integer    id,
        Integer    resourceId,
        BigDecimal purchasePrice,
        Integer    offerValidity,
        String     arrivalCycle,
        Integer    auditStatus,
        Integer    createrId,
        String     createrName,
        Timestamp  cdate,
        Timestamp  mdate,
        Integer    supplyStatus,
        Integer    includeInstallCost,
        String     updateRemark,
        String     articleNo,
        String     spu
    ) {
        this.id = id;
        this.resourceId = resourceId;
        this.purchasePrice = purchasePrice;
        this.offerValidity = offerValidity;
        this.arrivalCycle = arrivalCycle;
        this.auditStatus = auditStatus;
        this.createrId = createrId;
        this.createrName = createrName;
        this.cdate = cdate;
        this.mdate = mdate;
        this.supplyStatus = supplyStatus;
        this.includeInstallCost = includeInstallCost;
        this.updateRemark = updateRemark;
        this.articleNo = articleNo;
        this.spu = spu;
    }

    public Integer getId() {
        return this.id;
    }

    public TResourceLog setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getResourceId() {
        return this.resourceId;
    }

    public TResourceLog setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public BigDecimal getPurchasePrice() {
        return this.purchasePrice;
    }

    public TResourceLog setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this;
    }

    public Integer getOfferValidity() {
        return this.offerValidity;
    }

    public TResourceLog setOfferValidity(Integer offerValidity) {
        this.offerValidity = offerValidity;
        return this;
    }

    @Size(max = 200)
    public String getArrivalCycle() {
        return this.arrivalCycle;
    }

    public TResourceLog setArrivalCycle(String arrivalCycle) {
        this.arrivalCycle = arrivalCycle;
        return this;
    }

    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    public TResourceLog setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }

    public Integer getCreaterId() {
        return this.createrId;
    }

    public TResourceLog setCreaterId(Integer createrId) {
        this.createrId = createrId;
        return this;
    }

    @Size(max = 20)
    public String getCreaterName() {
        return this.createrName;
    }

    public TResourceLog setCreaterName(String createrName) {
        this.createrName = createrName;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TResourceLog setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TResourceLog setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    public Integer getSupplyStatus() {
        return this.supplyStatus;
    }

    public TResourceLog setSupplyStatus(Integer supplyStatus) {
        this.supplyStatus = supplyStatus;
        return this;
    }

    public Integer getIncludeInstallCost() {
        return this.includeInstallCost;
    }

    public TResourceLog setIncludeInstallCost(Integer includeInstallCost) {
        this.includeInstallCost = includeInstallCost;
        return this;
    }

    @Size(max = 500)
    public String getUpdateRemark() {
        return this.updateRemark;
    }

    public TResourceLog setUpdateRemark(String updateRemark) {
        this.updateRemark = updateRemark;
        return this;
    }

    @Size(max = 200)
    public String getArticleNo() {
        return this.articleNo;
    }

    public TResourceLog setArticleNo(String articleNo) {
        this.articleNo = articleNo;
        return this;
    }

    @Size(max = 300)
    public String getSpu() {
        return this.spu;
    }

    public TResourceLog setSpu(String spu) {
        this.spu = spu;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TResourceLog (");

        sb.append(id);
        sb.append(", ").append(resourceId);
        sb.append(", ").append(purchasePrice);
        sb.append(", ").append(offerValidity);
        sb.append(", ").append(arrivalCycle);
        sb.append(", ").append(auditStatus);
        sb.append(", ").append(createrId);
        sb.append(", ").append(createrName);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);
        sb.append(", ").append(supplyStatus);
        sb.append(", ").append(includeInstallCost);
        sb.append(", ").append(updateRemark);
        sb.append(", ").append(articleNo);
        sb.append(", ").append(spu);

        sb.append(")");
        return sb.toString();
    }
}