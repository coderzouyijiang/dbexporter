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
public class TProductKey implements Serializable {

    private static final long serialVersionUID = 288325939;

    private Integer    id;
    private Integer    productId;
    private String     keyStr;
    private Byte       checkStatus;
    private Byte       emailStatus;
    private String     title;
    private BigDecimal deposit;
    private BigDecimal creditAmount;
    private String     phone;
    private Integer    stock;
    private Timestamp  cdate;
    private Timestamp  mdate;

    public TProductKey() {}

    public TProductKey(TProductKey value) {
        this.id = value.id;
        this.productId = value.productId;
        this.keyStr = value.keyStr;
        this.checkStatus = value.checkStatus;
        this.emailStatus = value.emailStatus;
        this.title = value.title;
        this.deposit = value.deposit;
        this.creditAmount = value.creditAmount;
        this.phone = value.phone;
        this.stock = value.stock;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TProductKey(
        Integer    id,
        Integer    productId,
        String     keyStr,
        Byte       checkStatus,
        Byte       emailStatus,
        String     title,
        BigDecimal deposit,
        BigDecimal creditAmount,
        String     phone,
        Integer    stock,
        Timestamp  cdate,
        Timestamp  mdate
    ) {
        this.id = id;
        this.productId = productId;
        this.keyStr = keyStr;
        this.checkStatus = checkStatus;
        this.emailStatus = emailStatus;
        this.title = title;
        this.deposit = deposit;
        this.creditAmount = creditAmount;
        this.phone = phone;
        this.stock = stock;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TProductKey setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public TProductKey setProductId(Integer productId) {
        this.productId = productId;
        return this;
    }

    @Size(max = 20)
    public String getKeyStr() {
        return this.keyStr;
    }

    public TProductKey setKeyStr(String keyStr) {
        this.keyStr = keyStr;
        return this;
    }

    public Byte getCheckStatus() {
        return this.checkStatus;
    }

    public TProductKey setCheckStatus(Byte checkStatus) {
        this.checkStatus = checkStatus;
        return this;
    }

    public Byte getEmailStatus() {
        return this.emailStatus;
    }

    public TProductKey setEmailStatus(Byte emailStatus) {
        this.emailStatus = emailStatus;
        return this;
    }

    @Size(max = 500)
    public String getTitle() {
        return this.title;
    }

    public TProductKey setTitle(String title) {
        this.title = title;
        return this;
    }

    public BigDecimal getDeposit() {
        return this.deposit;
    }

    public TProductKey setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
        return this;
    }

    public BigDecimal getCreditAmount() {
        return this.creditAmount;
    }

    public TProductKey setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    @Size(max = 255)
    public String getPhone() {
        return this.phone;
    }

    public TProductKey setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Integer getStock() {
        return this.stock;
    }

    public TProductKey setStock(Integer stock) {
        this.stock = stock;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TProductKey setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TProductKey setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TProductKey (");

        sb.append(id);
        sb.append(", ").append(productId);
        sb.append(", ").append(keyStr);
        sb.append(", ").append(checkStatus);
        sb.append(", ").append(emailStatus);
        sb.append(", ").append(title);
        sb.append(", ").append(deposit);
        sb.append(", ").append(creditAmount);
        sb.append(", ").append(phone);
        sb.append(", ").append(stock);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}