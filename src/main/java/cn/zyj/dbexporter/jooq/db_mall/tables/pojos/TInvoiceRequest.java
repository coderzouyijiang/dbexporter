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
public class TInvoiceRequest implements Serializable {

    private static final long serialVersionUID = 1316956198;

    private Long       id;
    private Integer    customerId;
    private BigDecimal amount;
    private Byte       typeId;
    private String     title;
    private String     companyName;
    private Byte       postType;
    private String     applyRemark;
    private String     proofFile;
    private String     file;
    private String     taxerId;
    private String     companyAddress;
    private String     companyTel;
    private String     companyBank;
    private String     companyAccount;
    private String     receiverName;
    private String     receiverPhone;
    private String     receiverAddress;
    private String     invoiceNumber;
    private BigDecimal yetInvoiceAmount;
    private String     expressIds;
    private Integer    expressId;
    private String     expressNumber;
    private Timestamp  invoiceTime;
    private Integer    invoiceManagerId;
    private Timestamp  postedTime;
    private Integer    postedManagerId;
    private Timestamp  cancelTime;
    private Integer    cancelManagerId;
    private String     cancelCause;
    private Byte       invoiceContentId;
    private Byte       status;
    private String     checkRemark;
    private Integer    checkManagerId;
    private Timestamp  checkTime;
    private Timestamp  cdate;
    private Timestamp  mdate;
    private Integer    receiverAddressId;
    private Byte       isPayedPostage;
    private String     belongMonth;
    private Byte       sourceType;
    private String     billid;
    private Byte       titletype;
    private String     invoiceRemark;
    private Byte       smsStatus;

    public TInvoiceRequest() {}

    public TInvoiceRequest(TInvoiceRequest value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.amount = value.amount;
        this.typeId = value.typeId;
        this.title = value.title;
        this.companyName = value.companyName;
        this.postType = value.postType;
        this.applyRemark = value.applyRemark;
        this.proofFile = value.proofFile;
        this.file = value.file;
        this.taxerId = value.taxerId;
        this.companyAddress = value.companyAddress;
        this.companyTel = value.companyTel;
        this.companyBank = value.companyBank;
        this.companyAccount = value.companyAccount;
        this.receiverName = value.receiverName;
        this.receiverPhone = value.receiverPhone;
        this.receiverAddress = value.receiverAddress;
        this.invoiceNumber = value.invoiceNumber;
        this.yetInvoiceAmount = value.yetInvoiceAmount;
        this.expressIds = value.expressIds;
        this.expressId = value.expressId;
        this.expressNumber = value.expressNumber;
        this.invoiceTime = value.invoiceTime;
        this.invoiceManagerId = value.invoiceManagerId;
        this.postedTime = value.postedTime;
        this.postedManagerId = value.postedManagerId;
        this.cancelTime = value.cancelTime;
        this.cancelManagerId = value.cancelManagerId;
        this.cancelCause = value.cancelCause;
        this.invoiceContentId = value.invoiceContentId;
        this.status = value.status;
        this.checkRemark = value.checkRemark;
        this.checkManagerId = value.checkManagerId;
        this.checkTime = value.checkTime;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
        this.receiverAddressId = value.receiverAddressId;
        this.isPayedPostage = value.isPayedPostage;
        this.belongMonth = value.belongMonth;
        this.sourceType = value.sourceType;
        this.billid = value.billid;
        this.titletype = value.titletype;
        this.invoiceRemark = value.invoiceRemark;
        this.smsStatus = value.smsStatus;
    }

    public TInvoiceRequest(
        Long       id,
        Integer    customerId,
        BigDecimal amount,
        Byte       typeId,
        String     title,
        String     companyName,
        Byte       postType,
        String     applyRemark,
        String     proofFile,
        String     file,
        String     taxerId,
        String     companyAddress,
        String     companyTel,
        String     companyBank,
        String     companyAccount,
        String     receiverName,
        String     receiverPhone,
        String     receiverAddress,
        String     invoiceNumber,
        BigDecimal yetInvoiceAmount,
        String     expressIds,
        Integer    expressId,
        String     expressNumber,
        Timestamp  invoiceTime,
        Integer    invoiceManagerId,
        Timestamp  postedTime,
        Integer    postedManagerId,
        Timestamp  cancelTime,
        Integer    cancelManagerId,
        String     cancelCause,
        Byte       invoiceContentId,
        Byte       status,
        String     checkRemark,
        Integer    checkManagerId,
        Timestamp  checkTime,
        Timestamp  cdate,
        Timestamp  mdate,
        Integer    receiverAddressId,
        Byte       isPayedPostage,
        String     belongMonth,
        Byte       sourceType,
        String     billid,
        Byte       titletype,
        String     invoiceRemark,
        Byte       smsStatus
    ) {
        this.id = id;
        this.customerId = customerId;
        this.amount = amount;
        this.typeId = typeId;
        this.title = title;
        this.companyName = companyName;
        this.postType = postType;
        this.applyRemark = applyRemark;
        this.proofFile = proofFile;
        this.file = file;
        this.taxerId = taxerId;
        this.companyAddress = companyAddress;
        this.companyTel = companyTel;
        this.companyBank = companyBank;
        this.companyAccount = companyAccount;
        this.receiverName = receiverName;
        this.receiverPhone = receiverPhone;
        this.receiverAddress = receiverAddress;
        this.invoiceNumber = invoiceNumber;
        this.yetInvoiceAmount = yetInvoiceAmount;
        this.expressIds = expressIds;
        this.expressId = expressId;
        this.expressNumber = expressNumber;
        this.invoiceTime = invoiceTime;
        this.invoiceManagerId = invoiceManagerId;
        this.postedTime = postedTime;
        this.postedManagerId = postedManagerId;
        this.cancelTime = cancelTime;
        this.cancelManagerId = cancelManagerId;
        this.cancelCause = cancelCause;
        this.invoiceContentId = invoiceContentId;
        this.status = status;
        this.checkRemark = checkRemark;
        this.checkManagerId = checkManagerId;
        this.checkTime = checkTime;
        this.cdate = cdate;
        this.mdate = mdate;
        this.receiverAddressId = receiverAddressId;
        this.isPayedPostage = isPayedPostage;
        this.belongMonth = belongMonth;
        this.sourceType = sourceType;
        this.billid = billid;
        this.titletype = titletype;
        this.invoiceRemark = invoiceRemark;
        this.smsStatus = smsStatus;
    }

    public Long getId() {
        return this.id;
    }

    public TInvoiceRequest setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public TInvoiceRequest setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public TInvoiceRequest setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public Byte getTypeId() {
        return this.typeId;
    }

    public TInvoiceRequest setTypeId(Byte typeId) {
        this.typeId = typeId;
        return this;
    }

    @Size(max = 300)
    public String getTitle() {
        return this.title;
    }

    public TInvoiceRequest setTitle(String title) {
        this.title = title;
        return this;
    }

    @Size(max = 300)
    public String getCompanyName() {
        return this.companyName;
    }

    public TInvoiceRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public Byte getPostType() {
        return this.postType;
    }

    public TInvoiceRequest setPostType(Byte postType) {
        this.postType = postType;
        return this;
    }

    @Size(max = 600)
    public String getApplyRemark() {
        return this.applyRemark;
    }

    public TInvoiceRequest setApplyRemark(String applyRemark) {
        this.applyRemark = applyRemark;
        return this;
    }

    @Size(max = 300)
    public String getProofFile() {
        return this.proofFile;
    }

    public TInvoiceRequest setProofFile(String proofFile) {
        this.proofFile = proofFile;
        return this;
    }

    @Size(max = 300)
    public String getFile() {
        return this.file;
    }

    public TInvoiceRequest setFile(String file) {
        this.file = file;
        return this;
    }

    @Size(max = 100)
    public String getTaxerId() {
        return this.taxerId;
    }

    public TInvoiceRequest setTaxerId(String taxerId) {
        this.taxerId = taxerId;
        return this;
    }

    @Size(max = 300)
    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public TInvoiceRequest setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
        return this;
    }

    @Size(max = 300)
    public String getCompanyTel() {
        return this.companyTel;
    }

    public TInvoiceRequest setCompanyTel(String companyTel) {
        this.companyTel = companyTel;
        return this;
    }

    @Size(max = 300)
    public String getCompanyBank() {
        return this.companyBank;
    }

    public TInvoiceRequest setCompanyBank(String companyBank) {
        this.companyBank = companyBank;
        return this;
    }

    @Size(max = 300)
    public String getCompanyAccount() {
        return this.companyAccount;
    }

    public TInvoiceRequest setCompanyAccount(String companyAccount) {
        this.companyAccount = companyAccount;
        return this;
    }

    @Size(max = 32)
    public String getReceiverName() {
        return this.receiverName;
    }

    public TInvoiceRequest setReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }

    @NotNull
    @Size(max = 50)
    public String getReceiverPhone() {
        return this.receiverPhone;
    }

    public TInvoiceRequest setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
        return this;
    }

    @Size(max = 400)
    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    public TInvoiceRequest setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
        return this;
    }

    @Size(max = 100)
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public TInvoiceRequest setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    public BigDecimal getYetInvoiceAmount() {
        return this.yetInvoiceAmount;
    }

    public TInvoiceRequest setYetInvoiceAmount(BigDecimal yetInvoiceAmount) {
        this.yetInvoiceAmount = yetInvoiceAmount;
        return this;
    }

    @Size(max = 20)
    public String getExpressIds() {
        return this.expressIds;
    }

    public TInvoiceRequest setExpressIds(String expressIds) {
        this.expressIds = expressIds;
        return this;
    }

    public Integer getExpressId() {
        return this.expressId;
    }

    public TInvoiceRequest setExpressId(Integer expressId) {
        this.expressId = expressId;
        return this;
    }

    @Size(max = 100)
    public String getExpressNumber() {
        return this.expressNumber;
    }

    public TInvoiceRequest setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber;
        return this;
    }

    public Timestamp getInvoiceTime() {
        return this.invoiceTime;
    }

    public TInvoiceRequest setInvoiceTime(Timestamp invoiceTime) {
        this.invoiceTime = invoiceTime;
        return this;
    }

    public Integer getInvoiceManagerId() {
        return this.invoiceManagerId;
    }

    public TInvoiceRequest setInvoiceManagerId(Integer invoiceManagerId) {
        this.invoiceManagerId = invoiceManagerId;
        return this;
    }

    public Timestamp getPostedTime() {
        return this.postedTime;
    }

    public TInvoiceRequest setPostedTime(Timestamp postedTime) {
        this.postedTime = postedTime;
        return this;
    }

    public Integer getPostedManagerId() {
        return this.postedManagerId;
    }

    public TInvoiceRequest setPostedManagerId(Integer postedManagerId) {
        this.postedManagerId = postedManagerId;
        return this;
    }

    public Timestamp getCancelTime() {
        return this.cancelTime;
    }

    public TInvoiceRequest setCancelTime(Timestamp cancelTime) {
        this.cancelTime = cancelTime;
        return this;
    }

    public Integer getCancelManagerId() {
        return this.cancelManagerId;
    }

    public TInvoiceRequest setCancelManagerId(Integer cancelManagerId) {
        this.cancelManagerId = cancelManagerId;
        return this;
    }

    @Size(max = 255)
    public String getCancelCause() {
        return this.cancelCause;
    }

    public TInvoiceRequest setCancelCause(String cancelCause) {
        this.cancelCause = cancelCause;
        return this;
    }

    public Byte getInvoiceContentId() {
        return this.invoiceContentId;
    }

    public TInvoiceRequest setInvoiceContentId(Byte invoiceContentId) {
        this.invoiceContentId = invoiceContentId;
        return this;
    }

    public Byte getStatus() {
        return this.status;
    }

    public TInvoiceRequest setStatus(Byte status) {
        this.status = status;
        return this;
    }

    @Size(max = 500)
    public String getCheckRemark() {
        return this.checkRemark;
    }

    public TInvoiceRequest setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark;
        return this;
    }

    public Integer getCheckManagerId() {
        return this.checkManagerId;
    }

    public TInvoiceRequest setCheckManagerId(Integer checkManagerId) {
        this.checkManagerId = checkManagerId;
        return this;
    }

    public Timestamp getCheckTime() {
        return this.checkTime;
    }

    public TInvoiceRequest setCheckTime(Timestamp checkTime) {
        this.checkTime = checkTime;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TInvoiceRequest setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TInvoiceRequest setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    public Integer getReceiverAddressId() {
        return this.receiverAddressId;
    }

    public TInvoiceRequest setReceiverAddressId(Integer receiverAddressId) {
        this.receiverAddressId = receiverAddressId;
        return this;
    }

    public Byte getIsPayedPostage() {
        return this.isPayedPostage;
    }

    public TInvoiceRequest setIsPayedPostage(Byte isPayedPostage) {
        this.isPayedPostage = isPayedPostage;
        return this;
    }

    @Size(max = 20)
    public String getBelongMonth() {
        return this.belongMonth;
    }

    public TInvoiceRequest setBelongMonth(String belongMonth) {
        this.belongMonth = belongMonth;
        return this;
    }

    public Byte getSourceType() {
        return this.sourceType;
    }

    public TInvoiceRequest setSourceType(Byte sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    @Size(max = 100)
    public String getBillid() {
        return this.billid;
    }

    public TInvoiceRequest setBillid(String billid) {
        this.billid = billid;
        return this;
    }

    public Byte getTitletype() {
        return this.titletype;
    }

    public TInvoiceRequest setTitletype(Byte titletype) {
        this.titletype = titletype;
        return this;
    }

    @Size(max = 400)
    public String getInvoiceRemark() {
        return this.invoiceRemark;
    }

    public TInvoiceRequest setInvoiceRemark(String invoiceRemark) {
        this.invoiceRemark = invoiceRemark;
        return this;
    }

    public Byte getSmsStatus() {
        return this.smsStatus;
    }

    public TInvoiceRequest setSmsStatus(Byte smsStatus) {
        this.smsStatus = smsStatus;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TInvoiceRequest (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(amount);
        sb.append(", ").append(typeId);
        sb.append(", ").append(title);
        sb.append(", ").append(companyName);
        sb.append(", ").append(postType);
        sb.append(", ").append(applyRemark);
        sb.append(", ").append(proofFile);
        sb.append(", ").append(file);
        sb.append(", ").append(taxerId);
        sb.append(", ").append(companyAddress);
        sb.append(", ").append(companyTel);
        sb.append(", ").append(companyBank);
        sb.append(", ").append(companyAccount);
        sb.append(", ").append(receiverName);
        sb.append(", ").append(receiverPhone);
        sb.append(", ").append(receiverAddress);
        sb.append(", ").append(invoiceNumber);
        sb.append(", ").append(yetInvoiceAmount);
        sb.append(", ").append(expressIds);
        sb.append(", ").append(expressId);
        sb.append(", ").append(expressNumber);
        sb.append(", ").append(invoiceTime);
        sb.append(", ").append(invoiceManagerId);
        sb.append(", ").append(postedTime);
        sb.append(", ").append(postedManagerId);
        sb.append(", ").append(cancelTime);
        sb.append(", ").append(cancelManagerId);
        sb.append(", ").append(cancelCause);
        sb.append(", ").append(invoiceContentId);
        sb.append(", ").append(status);
        sb.append(", ").append(checkRemark);
        sb.append(", ").append(checkManagerId);
        sb.append(", ").append(checkTime);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);
        sb.append(", ").append(receiverAddressId);
        sb.append(", ").append(isPayedPostage);
        sb.append(", ").append(belongMonth);
        sb.append(", ").append(sourceType);
        sb.append(", ").append(billid);
        sb.append(", ").append(titletype);
        sb.append(", ").append(invoiceRemark);
        sb.append(", ").append(smsStatus);

        sb.append(")");
        return sb.toString();
    }
}
