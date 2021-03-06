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
 * 客户跳转至saas日志记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCustomerToSaasLog implements Serializable {

    private static final long serialVersionUID = 2021520693;

    private Integer   id;
    private Integer   customerId;
    private String    companyName;
    private Integer   dayTime;
    private Timestamp cdate;
    private Timestamp mdate;

    public TCustomerToSaasLog() {}

    public TCustomerToSaasLog(TCustomerToSaasLog value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.companyName = value.companyName;
        this.dayTime = value.dayTime;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TCustomerToSaasLog(
        Integer   id,
        Integer   customerId,
        String    companyName,
        Integer   dayTime,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.customerId = customerId;
        this.companyName = companyName;
        this.dayTime = dayTime;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TCustomerToSaasLog setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Integer getCustomerId() {
        return this.customerId;
    }

    public TCustomerToSaasLog setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    @Size(max = 300)
    public String getCompanyName() {
        return this.companyName;
    }

    public TCustomerToSaasLog setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    @NotNull
    public Integer getDayTime() {
        return this.dayTime;
    }

    public TCustomerToSaasLog setDayTime(Integer dayTime) {
        this.dayTime = dayTime;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCustomerToSaasLog setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCustomerToSaasLog setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCustomerToSaasLog (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(companyName);
        sb.append(", ").append(dayTime);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
