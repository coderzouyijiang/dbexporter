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
public class TCustomerInvoiceBasedBill implements Serializable {

    private static final long serialVersionUID = 1484105425;

    private Integer    id;
    private Integer    customerId;
    private BigDecimal availableInvoiceBalance;
    private Byte       status;
    private Timestamp  cdate;
    private Timestamp  mdate;
    private String     startMonth;

    public TCustomerInvoiceBasedBill() {}

    public TCustomerInvoiceBasedBill(TCustomerInvoiceBasedBill value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.availableInvoiceBalance = value.availableInvoiceBalance;
        this.status = value.status;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
        this.startMonth = value.startMonth;
    }

    public TCustomerInvoiceBasedBill(
        Integer    id,
        Integer    customerId,
        BigDecimal availableInvoiceBalance,
        Byte       status,
        Timestamp  cdate,
        Timestamp  mdate,
        String     startMonth
    ) {
        this.id = id;
        this.customerId = customerId;
        this.availableInvoiceBalance = availableInvoiceBalance;
        this.status = status;
        this.cdate = cdate;
        this.mdate = mdate;
        this.startMonth = startMonth;
    }

    public Integer getId() {
        return this.id;
    }

    public TCustomerInvoiceBasedBill setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Integer getCustomerId() {
        return this.customerId;
    }

    public TCustomerInvoiceBasedBill setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    public BigDecimal getAvailableInvoiceBalance() {
        return this.availableInvoiceBalance;
    }

    public TCustomerInvoiceBasedBill setAvailableInvoiceBalance(BigDecimal availableInvoiceBalance) {
        this.availableInvoiceBalance = availableInvoiceBalance;
        return this;
    }

    public Byte getStatus() {
        return this.status;
    }

    public TCustomerInvoiceBasedBill setStatus(Byte status) {
        this.status = status;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCustomerInvoiceBasedBill setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCustomerInvoiceBasedBill setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @NotNull
    @Size(max = 20)
    public String getStartMonth() {
        return this.startMonth;
    }

    public TCustomerInvoiceBasedBill setStartMonth(String startMonth) {
        this.startMonth = startMonth;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCustomerInvoiceBasedBill (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(availableInvoiceBalance);
        sb.append(", ").append(status);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);
        sb.append(", ").append(startMonth);

        sb.append(")");
        return sb.toString();
    }
}
