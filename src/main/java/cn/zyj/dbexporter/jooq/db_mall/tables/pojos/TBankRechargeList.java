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
public class TBankRechargeList implements Serializable {

    private static final long serialVersionUID = -1414852518;

    private Long       id;
    private Integer    customerId;
    private String     companyName;
    private String     cardNo;
    private String     bankName;
    private Byte       typeId;
    private String     flag;
    private BigDecimal amount;
    private Integer    managerId;
    private String     remark;
    private Byte       syncStatus;
    private String     billCode;
    private Timestamp  cdate;
    private Timestamp  mdate;

    public TBankRechargeList() {}

    public TBankRechargeList(TBankRechargeList value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.companyName = value.companyName;
        this.cardNo = value.cardNo;
        this.bankName = value.bankName;
        this.typeId = value.typeId;
        this.flag = value.flag;
        this.amount = value.amount;
        this.managerId = value.managerId;
        this.remark = value.remark;
        this.syncStatus = value.syncStatus;
        this.billCode = value.billCode;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TBankRechargeList(
        Long       id,
        Integer    customerId,
        String     companyName,
        String     cardNo,
        String     bankName,
        Byte       typeId,
        String     flag,
        BigDecimal amount,
        Integer    managerId,
        String     remark,
        Byte       syncStatus,
        String     billCode,
        Timestamp  cdate,
        Timestamp  mdate
    ) {
        this.id = id;
        this.customerId = customerId;
        this.companyName = companyName;
        this.cardNo = cardNo;
        this.bankName = bankName;
        this.typeId = typeId;
        this.flag = flag;
        this.amount = amount;
        this.managerId = managerId;
        this.remark = remark;
        this.syncStatus = syncStatus;
        this.billCode = billCode;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Long getId() {
        return this.id;
    }

    public TBankRechargeList setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public TBankRechargeList setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    @Size(max = 500)
    public String getCompanyName() {
        return this.companyName;
    }

    public TBankRechargeList setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    @Size(max = 100)
    public String getCardNo() {
        return this.cardNo;
    }

    public TBankRechargeList setCardNo(String cardNo) {
        this.cardNo = cardNo;
        return this;
    }

    @Size(max = 500)
    public String getBankName() {
        return this.bankName;
    }

    public TBankRechargeList setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    public Byte getTypeId() {
        return this.typeId;
    }

    public TBankRechargeList setTypeId(Byte typeId) {
        this.typeId = typeId;
        return this;
    }

    @Size(max = 100)
    public String getFlag() {
        return this.flag;
    }

    public TBankRechargeList setFlag(String flag) {
        this.flag = flag;
        return this;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public TBankRechargeList setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public Integer getManagerId() {
        return this.managerId;
    }

    public TBankRechargeList setManagerId(Integer managerId) {
        this.managerId = managerId;
        return this;
    }

    @Size(max = 500)
    public String getRemark() {
        return this.remark;
    }

    public TBankRechargeList setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public Byte getSyncStatus() {
        return this.syncStatus;
    }

    public TBankRechargeList setSyncStatus(Byte syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    @Size(max = 50)
    public String getBillCode() {
        return this.billCode;
    }

    public TBankRechargeList setBillCode(String billCode) {
        this.billCode = billCode;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TBankRechargeList setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TBankRechargeList setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TBankRechargeList (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(companyName);
        sb.append(", ").append(cardNo);
        sb.append(", ").append(bankName);
        sb.append(", ").append(typeId);
        sb.append(", ").append(flag);
        sb.append(", ").append(amount);
        sb.append(", ").append(managerId);
        sb.append(", ").append(remark);
        sb.append(", ").append(syncStatus);
        sb.append(", ").append(billCode);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}