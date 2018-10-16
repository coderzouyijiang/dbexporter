/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
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
public class TAssetsPackages implements Serializable {

    private static final long serialVersionUID = 852862986;

    private Integer    id;
    private String     name;
    private Integer    platformId;
    private Integer    typeId;
    private String     sellMoney;
    private BigDecimal fee;
    private BigDecimal interest;
    private Integer    repaymentDate;
    private Date       selfRepaymentDate;
    private BigDecimal repaymentAmount;
    private Integer    month;
    private Date       giveMoneyDate;
    private BigDecimal handMoney;
    private Integer    companyNum;
    private Integer    deviceNum;
    private BigDecimal deposit;
    private Integer    managerId;
    private Byte       status;
    private String     buyNum;
    private Timestamp  cdate;
    private Timestamp  mdate;

    public TAssetsPackages() {}

    public TAssetsPackages(TAssetsPackages value) {
        this.id = value.id;
        this.name = value.name;
        this.platformId = value.platformId;
        this.typeId = value.typeId;
        this.sellMoney = value.sellMoney;
        this.fee = value.fee;
        this.interest = value.interest;
        this.repaymentDate = value.repaymentDate;
        this.selfRepaymentDate = value.selfRepaymentDate;
        this.repaymentAmount = value.repaymentAmount;
        this.month = value.month;
        this.giveMoneyDate = value.giveMoneyDate;
        this.handMoney = value.handMoney;
        this.companyNum = value.companyNum;
        this.deviceNum = value.deviceNum;
        this.deposit = value.deposit;
        this.managerId = value.managerId;
        this.status = value.status;
        this.buyNum = value.buyNum;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TAssetsPackages(
        Integer    id,
        String     name,
        Integer    platformId,
        Integer    typeId,
        String     sellMoney,
        BigDecimal fee,
        BigDecimal interest,
        Integer    repaymentDate,
        Date       selfRepaymentDate,
        BigDecimal repaymentAmount,
        Integer    month,
        Date       giveMoneyDate,
        BigDecimal handMoney,
        Integer    companyNum,
        Integer    deviceNum,
        BigDecimal deposit,
        Integer    managerId,
        Byte       status,
        String     buyNum,
        Timestamp  cdate,
        Timestamp  mdate
    ) {
        this.id = id;
        this.name = name;
        this.platformId = platformId;
        this.typeId = typeId;
        this.sellMoney = sellMoney;
        this.fee = fee;
        this.interest = interest;
        this.repaymentDate = repaymentDate;
        this.selfRepaymentDate = selfRepaymentDate;
        this.repaymentAmount = repaymentAmount;
        this.month = month;
        this.giveMoneyDate = giveMoneyDate;
        this.handMoney = handMoney;
        this.companyNum = companyNum;
        this.deviceNum = deviceNum;
        this.deposit = deposit;
        this.managerId = managerId;
        this.status = status;
        this.buyNum = buyNum;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TAssetsPackages setId(Integer id) {
        this.id = id;
        return this;
    }

    @Size(max = 255)
    public String getName() {
        return this.name;
    }

    public TAssetsPackages setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPlatformId() {
        return this.platformId;
    }

    public TAssetsPackages setPlatformId(Integer platformId) {
        this.platformId = platformId;
        return this;
    }

    public Integer getTypeId() {
        return this.typeId;
    }

    public TAssetsPackages setTypeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    @Size(max = 500)
    public String getSellMoney() {
        return this.sellMoney;
    }

    public TAssetsPackages setSellMoney(String sellMoney) {
        this.sellMoney = sellMoney;
        return this;
    }

    public BigDecimal getFee() {
        return this.fee;
    }

    public TAssetsPackages setFee(BigDecimal fee) {
        this.fee = fee;
        return this;
    }

    public BigDecimal getInterest() {
        return this.interest;
    }

    public TAssetsPackages setInterest(BigDecimal interest) {
        this.interest = interest;
        return this;
    }

    public Integer getRepaymentDate() {
        return this.repaymentDate;
    }

    public TAssetsPackages setRepaymentDate(Integer repaymentDate) {
        this.repaymentDate = repaymentDate;
        return this;
    }

    public Date getSelfRepaymentDate() {
        return this.selfRepaymentDate;
    }

    public TAssetsPackages setSelfRepaymentDate(Date selfRepaymentDate) {
        this.selfRepaymentDate = selfRepaymentDate;
        return this;
    }

    public BigDecimal getRepaymentAmount() {
        return this.repaymentAmount;
    }

    public TAssetsPackages setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
        return this;
    }

    public Integer getMonth() {
        return this.month;
    }

    public TAssetsPackages setMonth(Integer month) {
        this.month = month;
        return this;
    }

    public Date getGiveMoneyDate() {
        return this.giveMoneyDate;
    }

    public TAssetsPackages setGiveMoneyDate(Date giveMoneyDate) {
        this.giveMoneyDate = giveMoneyDate;
        return this;
    }

    @NotNull
    public BigDecimal getHandMoney() {
        return this.handMoney;
    }

    public TAssetsPackages setHandMoney(BigDecimal handMoney) {
        this.handMoney = handMoney;
        return this;
    }

    public Integer getCompanyNum() {
        return this.companyNum;
    }

    public TAssetsPackages setCompanyNum(Integer companyNum) {
        this.companyNum = companyNum;
        return this;
    }

    public Integer getDeviceNum() {
        return this.deviceNum;
    }

    public TAssetsPackages setDeviceNum(Integer deviceNum) {
        this.deviceNum = deviceNum;
        return this;
    }

    public BigDecimal getDeposit() {
        return this.deposit;
    }

    public TAssetsPackages setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
        return this;
    }

    public Integer getManagerId() {
        return this.managerId;
    }

    public TAssetsPackages setManagerId(Integer managerId) {
        this.managerId = managerId;
        return this;
    }

    public Byte getStatus() {
        return this.status;
    }

    public TAssetsPackages setStatus(Byte status) {
        this.status = status;
        return this;
    }

    @Size(max = 64)
    public String getBuyNum() {
        return this.buyNum;
    }

    public TAssetsPackages setBuyNum(String buyNum) {
        this.buyNum = buyNum;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TAssetsPackages setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TAssetsPackages setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TAssetsPackages (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(platformId);
        sb.append(", ").append(typeId);
        sb.append(", ").append(sellMoney);
        sb.append(", ").append(fee);
        sb.append(", ").append(interest);
        sb.append(", ").append(repaymentDate);
        sb.append(", ").append(selfRepaymentDate);
        sb.append(", ").append(repaymentAmount);
        sb.append(", ").append(month);
        sb.append(", ").append(giveMoneyDate);
        sb.append(", ").append(handMoney);
        sb.append(", ").append(companyNum);
        sb.append(", ").append(deviceNum);
        sb.append(", ").append(deposit);
        sb.append(", ").append(managerId);
        sb.append(", ").append(status);
        sb.append(", ").append(buyNum);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}