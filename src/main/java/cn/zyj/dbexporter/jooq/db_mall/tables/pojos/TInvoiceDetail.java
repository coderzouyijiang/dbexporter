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
public class TInvoiceDetail implements Serializable {

    private static final long serialVersionUID = -1513471325;

    private Integer    id;
    private Integer    financeInvoiceId;
    private Integer    requestId;
    private Byte       status;
    private Byte       invoiceType;
    private BigDecimal amount;
    private Integer    exeStatus;
    private String     invoiceNo;
    private String     invoiceCode;
    private Timestamp  invoiceDate;
    private String     path;
    private Timestamp  cdate;
    private Timestamp  mdate;

    public TInvoiceDetail() {}

    public TInvoiceDetail(TInvoiceDetail value) {
        this.id = value.id;
        this.financeInvoiceId = value.financeInvoiceId;
        this.requestId = value.requestId;
        this.status = value.status;
        this.invoiceType = value.invoiceType;
        this.amount = value.amount;
        this.exeStatus = value.exeStatus;
        this.invoiceNo = value.invoiceNo;
        this.invoiceCode = value.invoiceCode;
        this.invoiceDate = value.invoiceDate;
        this.path = value.path;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TInvoiceDetail(
        Integer    id,
        Integer    financeInvoiceId,
        Integer    requestId,
        Byte       status,
        Byte       invoiceType,
        BigDecimal amount,
        Integer    exeStatus,
        String     invoiceNo,
        String     invoiceCode,
        Timestamp  invoiceDate,
        String     path,
        Timestamp  cdate,
        Timestamp  mdate
    ) {
        this.id = id;
        this.financeInvoiceId = financeInvoiceId;
        this.requestId = requestId;
        this.status = status;
        this.invoiceType = invoiceType;
        this.amount = amount;
        this.exeStatus = exeStatus;
        this.invoiceNo = invoiceNo;
        this.invoiceCode = invoiceCode;
        this.invoiceDate = invoiceDate;
        this.path = path;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TInvoiceDetail setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Integer getFinanceInvoiceId() {
        return this.financeInvoiceId;
    }

    public TInvoiceDetail setFinanceInvoiceId(Integer financeInvoiceId) {
        this.financeInvoiceId = financeInvoiceId;
        return this;
    }

    @NotNull
    public Integer getRequestId() {
        return this.requestId;
    }

    public TInvoiceDetail setRequestId(Integer requestId) {
        this.requestId = requestId;
        return this;
    }

    public Byte getStatus() {
        return this.status;
    }

    public TInvoiceDetail setStatus(Byte status) {
        this.status = status;
        return this;
    }

    public Byte getInvoiceType() {
        return this.invoiceType;
    }

    public TInvoiceDetail setInvoiceType(Byte invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public TInvoiceDetail setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    @NotNull
    public Integer getExeStatus() {
        return this.exeStatus;
    }

    public TInvoiceDetail setExeStatus(Integer exeStatus) {
        this.exeStatus = exeStatus;
        return this;
    }

    @Size(max = 100)
    public String getInvoiceNo() {
        return this.invoiceNo;
    }

    public TInvoiceDetail setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
        return this;
    }

    @Size(max = 100)
    public String getInvoiceCode() {
        return this.invoiceCode;
    }

    public TInvoiceDetail setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
        return this;
    }

    public Timestamp getInvoiceDate() {
        return this.invoiceDate;
    }

    public TInvoiceDetail setInvoiceDate(Timestamp invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    @Size(max = 300)
    public String getPath() {
        return this.path;
    }

    public TInvoiceDetail setPath(String path) {
        this.path = path;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TInvoiceDetail setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TInvoiceDetail setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TInvoiceDetail (");

        sb.append(id);
        sb.append(", ").append(financeInvoiceId);
        sb.append(", ").append(requestId);
        sb.append(", ").append(status);
        sb.append(", ").append(invoiceType);
        sb.append(", ").append(amount);
        sb.append(", ").append(exeStatus);
        sb.append(", ").append(invoiceNo);
        sb.append(", ").append(invoiceCode);
        sb.append(", ").append(invoiceDate);
        sb.append(", ").append(path);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
