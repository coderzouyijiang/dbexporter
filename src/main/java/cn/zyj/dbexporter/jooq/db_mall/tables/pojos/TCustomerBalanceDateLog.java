/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


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
public class TCustomerBalanceDateLog implements Serializable {

    private static final long serialVersionUID = -1793128654;

    private Long      id;
    private Long      customerId;
    private Integer   nowBalanceDate;
    private Integer   expectBalanceDate;
    private Integer   effectDate;
    private Integer   isEffect;
    private Timestamp mdate;
    private Timestamp cdate;

    public TCustomerBalanceDateLog() {}

    public TCustomerBalanceDateLog(TCustomerBalanceDateLog value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.nowBalanceDate = value.nowBalanceDate;
        this.expectBalanceDate = value.expectBalanceDate;
        this.effectDate = value.effectDate;
        this.isEffect = value.isEffect;
        this.mdate = value.mdate;
        this.cdate = value.cdate;
    }

    public TCustomerBalanceDateLog(
        Long      id,
        Long      customerId,
        Integer   nowBalanceDate,
        Integer   expectBalanceDate,
        Integer   effectDate,
        Integer   isEffect,
        Timestamp mdate,
        Timestamp cdate
    ) {
        this.id = id;
        this.customerId = customerId;
        this.nowBalanceDate = nowBalanceDate;
        this.expectBalanceDate = expectBalanceDate;
        this.effectDate = effectDate;
        this.isEffect = isEffect;
        this.mdate = mdate;
        this.cdate = cdate;
    }

    public Long getId() {
        return this.id;
    }

    public TCustomerBalanceDateLog setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public TCustomerBalanceDateLog setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public Integer getNowBalanceDate() {
        return this.nowBalanceDate;
    }

    public TCustomerBalanceDateLog setNowBalanceDate(Integer nowBalanceDate) {
        this.nowBalanceDate = nowBalanceDate;
        return this;
    }

    public Integer getExpectBalanceDate() {
        return this.expectBalanceDate;
    }

    public TCustomerBalanceDateLog setExpectBalanceDate(Integer expectBalanceDate) {
        this.expectBalanceDate = expectBalanceDate;
        return this;
    }

    public Integer getEffectDate() {
        return this.effectDate;
    }

    public TCustomerBalanceDateLog setEffectDate(Integer effectDate) {
        this.effectDate = effectDate;
        return this;
    }

    public Integer getIsEffect() {
        return this.isEffect;
    }

    public TCustomerBalanceDateLog setIsEffect(Integer isEffect) {
        this.isEffect = isEffect;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCustomerBalanceDateLog setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCustomerBalanceDateLog setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCustomerBalanceDateLog (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(nowBalanceDate);
        sb.append(", ").append(expectBalanceDate);
        sb.append(", ").append(effectDate);
        sb.append(", ").append(isEffect);
        sb.append(", ").append(mdate);
        sb.append(", ").append(cdate);

        sb.append(")");
        return sb.toString();
    }
}
