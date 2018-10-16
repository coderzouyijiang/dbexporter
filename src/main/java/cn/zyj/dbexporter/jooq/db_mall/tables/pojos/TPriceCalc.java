/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
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
public class TPriceCalc implements Serializable {

    private static final long serialVersionUID = 1565273044;

    private Integer   id;
    private String    model;
    private String    rent;
    private String    buyPrice;
    private String    dealPrice;
    private String    profit;
    private String    returnRate;
    private String    val;
    private Timestamp cdate;
    private Timestamp mdate;

    public TPriceCalc() {}

    public TPriceCalc(TPriceCalc value) {
        this.id = value.id;
        this.model = value.model;
        this.rent = value.rent;
        this.buyPrice = value.buyPrice;
        this.dealPrice = value.dealPrice;
        this.profit = value.profit;
        this.returnRate = value.returnRate;
        this.val = value.val;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TPriceCalc(
        Integer   id,
        String    model,
        String    rent,
        String    buyPrice,
        String    dealPrice,
        String    profit,
        String    returnRate,
        String    val,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.model = model;
        this.rent = rent;
        this.buyPrice = buyPrice;
        this.dealPrice = dealPrice;
        this.profit = profit;
        this.returnRate = returnRate;
        this.val = val;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TPriceCalc setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    @Size(max = 100)
    public String getModel() {
        return this.model;
    }

    public TPriceCalc setModel(String model) {
        this.model = model;
        return this;
    }

    @NotNull
    @Size(max = 30)
    public String getRent() {
        return this.rent;
    }

    public TPriceCalc setRent(String rent) {
        this.rent = rent;
        return this;
    }

    @NotNull
    @Size(max = 30)
    public String getBuyPrice() {
        return this.buyPrice;
    }

    public TPriceCalc setBuyPrice(String buyPrice) {
        this.buyPrice = buyPrice;
        return this;
    }

    @NotNull
    @Size(max = 30)
    public String getDealPrice() {
        return this.dealPrice;
    }

    public TPriceCalc setDealPrice(String dealPrice) {
        this.dealPrice = dealPrice;
        return this;
    }

    @NotNull
    @Size(max = 30)
    public String getProfit() {
        return this.profit;
    }

    public TPriceCalc setProfit(String profit) {
        this.profit = profit;
        return this;
    }

    @NotNull
    @Size(max = 30)
    public String getReturnRate() {
        return this.returnRate;
    }

    public TPriceCalc setReturnRate(String returnRate) {
        this.returnRate = returnRate;
        return this;
    }

    @Size(max = 65535)
    public String getVal() {
        return this.val;
    }

    public TPriceCalc setVal(String val) {
        this.val = val;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TPriceCalc setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TPriceCalc setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TPriceCalc (");

        sb.append(id);
        sb.append(", ").append(model);
        sb.append(", ").append(rent);
        sb.append(", ").append(buyPrice);
        sb.append(", ").append(dealPrice);
        sb.append(", ").append(profit);
        sb.append(", ").append(returnRate);
        sb.append(", ").append(val);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
