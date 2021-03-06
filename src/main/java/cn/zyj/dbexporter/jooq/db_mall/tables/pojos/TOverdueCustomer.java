/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.Generated;


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
public class TOverdueCustomer implements Serializable {

    private static final long serialVersionUID = -1839829872;

    private Long       id;
    private Integer    balanceDate;
    private Integer    balanceDateCustomer;
    private Integer    overDue_7Customer;
    private BigDecimal overDue_7CustomerPercent;
    private Integer    overDue_90Customer;
    private BigDecimal overDue_90CustomerPercent;
    private Integer    overDue_7_90Customer;
    private BigDecimal overDue_7_90CustomerPercent;

    public TOverdueCustomer() {}

    public TOverdueCustomer(TOverdueCustomer value) {
        this.id = value.id;
        this.balanceDate = value.balanceDate;
        this.balanceDateCustomer = value.balanceDateCustomer;
        this.overDue_7Customer = value.overDue_7Customer;
        this.overDue_7CustomerPercent = value.overDue_7CustomerPercent;
        this.overDue_90Customer = value.overDue_90Customer;
        this.overDue_90CustomerPercent = value.overDue_90CustomerPercent;
        this.overDue_7_90Customer = value.overDue_7_90Customer;
        this.overDue_7_90CustomerPercent = value.overDue_7_90CustomerPercent;
    }

    public TOverdueCustomer(
        Long       id,
        Integer    balanceDate,
        Integer    balanceDateCustomer,
        Integer    overDue_7Customer,
        BigDecimal overDue_7CustomerPercent,
        Integer    overDue_90Customer,
        BigDecimal overDue_90CustomerPercent,
        Integer    overDue_7_90Customer,
        BigDecimal overDue_7_90CustomerPercent
    ) {
        this.id = id;
        this.balanceDate = balanceDate;
        this.balanceDateCustomer = balanceDateCustomer;
        this.overDue_7Customer = overDue_7Customer;
        this.overDue_7CustomerPercent = overDue_7CustomerPercent;
        this.overDue_90Customer = overDue_90Customer;
        this.overDue_90CustomerPercent = overDue_90CustomerPercent;
        this.overDue_7_90Customer = overDue_7_90Customer;
        this.overDue_7_90CustomerPercent = overDue_7_90CustomerPercent;
    }

    public Long getId() {
        return this.id;
    }

    public TOverdueCustomer setId(Long id) {
        this.id = id;
        return this;
    }

    public Integer getBalanceDate() {
        return this.balanceDate;
    }

    public TOverdueCustomer setBalanceDate(Integer balanceDate) {
        this.balanceDate = balanceDate;
        return this;
    }

    public Integer getBalanceDateCustomer() {
        return this.balanceDateCustomer;
    }

    public TOverdueCustomer setBalanceDateCustomer(Integer balanceDateCustomer) {
        this.balanceDateCustomer = balanceDateCustomer;
        return this;
    }

    public Integer getOverDue_7Customer() {
        return this.overDue_7Customer;
    }

    public TOverdueCustomer setOverDue_7Customer(Integer overDue_7Customer) {
        this.overDue_7Customer = overDue_7Customer;
        return this;
    }

    public BigDecimal getOverDue_7CustomerPercent() {
        return this.overDue_7CustomerPercent;
    }

    public TOverdueCustomer setOverDue_7CustomerPercent(BigDecimal overDue_7CustomerPercent) {
        this.overDue_7CustomerPercent = overDue_7CustomerPercent;
        return this;
    }

    public Integer getOverDue_90Customer() {
        return this.overDue_90Customer;
    }

    public TOverdueCustomer setOverDue_90Customer(Integer overDue_90Customer) {
        this.overDue_90Customer = overDue_90Customer;
        return this;
    }

    public BigDecimal getOverDue_90CustomerPercent() {
        return this.overDue_90CustomerPercent;
    }

    public TOverdueCustomer setOverDue_90CustomerPercent(BigDecimal overDue_90CustomerPercent) {
        this.overDue_90CustomerPercent = overDue_90CustomerPercent;
        return this;
    }

    public Integer getOverDue_7_90Customer() {
        return this.overDue_7_90Customer;
    }

    public TOverdueCustomer setOverDue_7_90Customer(Integer overDue_7_90Customer) {
        this.overDue_7_90Customer = overDue_7_90Customer;
        return this;
    }

    public BigDecimal getOverDue_7_90CustomerPercent() {
        return this.overDue_7_90CustomerPercent;
    }

    public TOverdueCustomer setOverDue_7_90CustomerPercent(BigDecimal overDue_7_90CustomerPercent) {
        this.overDue_7_90CustomerPercent = overDue_7_90CustomerPercent;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TOverdueCustomer (");

        sb.append(id);
        sb.append(", ").append(balanceDate);
        sb.append(", ").append(balanceDateCustomer);
        sb.append(", ").append(overDue_7Customer);
        sb.append(", ").append(overDue_7CustomerPercent);
        sb.append(", ").append(overDue_90Customer);
        sb.append(", ").append(overDue_90CustomerPercent);
        sb.append(", ").append(overDue_7_90Customer);
        sb.append(", ").append(overDue_7_90CustomerPercent);

        sb.append(")");
        return sb.toString();
    }
}
