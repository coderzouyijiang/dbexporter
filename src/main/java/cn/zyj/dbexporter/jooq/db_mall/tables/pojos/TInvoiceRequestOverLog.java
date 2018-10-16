/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
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
public class TInvoiceRequestOverLog implements Serializable {

    private static final long serialVersionUID = 1576094088;

    private Integer    id;
    private Integer    customerId;
    private String     billMonth;
    private BigDecimal billAmount;
    private BigDecimal invoiceAmount;
    private Timestamp  cdate;
    private Timestamp  mdate;

    public TInvoiceRequestOverLog() {}

    public TInvoiceRequestOverLog(TInvoiceRequestOverLog value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.billMonth = value.billMonth;
        this.billAmount = value.billAmount;
        this.invoiceAmount = value.invoiceAmount;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TInvoiceRequestOverLog(
        Integer    id,
        Integer    customerId,
        String     billMonth,
        BigDecimal billAmount,
        BigDecimal invoiceAmount,
        Timestamp  cdate,
        Timestamp  mdate
    ) {
        this.id = id;
        this.customerId = customerId;
        this.billMonth = billMonth;
        this.billAmount = billAmount;
        this.invoiceAmount = invoiceAmount;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TInvoiceRequestOverLog setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public TInvoiceRequestOverLog setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    @Size(max = 255)
    public String getBillMonth() {
        return this.billMonth;
    }

    public TInvoiceRequestOverLog setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }

    public BigDecimal getBillAmount() {
        return this.billAmount;
    }

    public TInvoiceRequestOverLog setBillAmount(BigDecimal billAmount) {
        this.billAmount = billAmount;
        return this;
    }

    public BigDecimal getInvoiceAmount() {
        return this.invoiceAmount;
    }

    public TInvoiceRequestOverLog setInvoiceAmount(BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TInvoiceRequestOverLog setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TInvoiceRequestOverLog setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TInvoiceRequestOverLog (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(billMonth);
        sb.append(", ").append(billAmount);
        sb.append(", ").append(invoiceAmount);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}