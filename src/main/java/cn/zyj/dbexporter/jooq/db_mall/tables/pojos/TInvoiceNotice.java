/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.Size;


/**
 * 发票提醒文案
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TInvoiceNotice implements Serializable {

    private static final long serialVersionUID = 2145565481;

    private Integer   id;
    private Integer   invoiceType;
    private Integer   status;
    private String    message;
    private Timestamp cdate;
    private Timestamp mdate;

    public TInvoiceNotice() {}

    public TInvoiceNotice(TInvoiceNotice value) {
        this.id = value.id;
        this.invoiceType = value.invoiceType;
        this.status = value.status;
        this.message = value.message;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TInvoiceNotice(
        Integer   id,
        Integer   invoiceType,
        Integer   status,
        String    message,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.invoiceType = invoiceType;
        this.status = status;
        this.message = message;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TInvoiceNotice setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getInvoiceType() {
        return this.invoiceType;
    }

    public TInvoiceNotice setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public TInvoiceNotice setStatus(Integer status) {
        this.status = status;
        return this;
    }

    @Size(max = 65535)
    public String getMessage() {
        return this.message;
    }

    public TInvoiceNotice setMessage(String message) {
        this.message = message;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TInvoiceNotice setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TInvoiceNotice setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TInvoiceNotice (");

        sb.append(id);
        sb.append(", ").append(invoiceType);
        sb.append(", ").append(status);
        sb.append(", ").append(message);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
