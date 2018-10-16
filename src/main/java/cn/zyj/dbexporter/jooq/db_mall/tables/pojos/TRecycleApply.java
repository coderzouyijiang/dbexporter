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
public class TRecycleApply implements Serializable {

    private static final long serialVersionUID = -651834484;

    private Integer   id;
    private String    companyName;
    private String    contact;
    private String    phone;
    private Integer   num;
    private String    year;
    private String    category;
    private String    brand;
    private Byte      status;
    private Timestamp cdate;
    private Timestamp mdate;
    private String    remark;
    private String    communicateResult;
    private String    customerManager;
    private String    operator;
    private String    seccustomermanager;

    public TRecycleApply() {}

    public TRecycleApply(TRecycleApply value) {
        this.id = value.id;
        this.companyName = value.companyName;
        this.contact = value.contact;
        this.phone = value.phone;
        this.num = value.num;
        this.year = value.year;
        this.category = value.category;
        this.brand = value.brand;
        this.status = value.status;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
        this.remark = value.remark;
        this.communicateResult = value.communicateResult;
        this.customerManager = value.customerManager;
        this.operator = value.operator;
        this.seccustomermanager = value.seccustomermanager;
    }

    public TRecycleApply(
        Integer   id,
        String    companyName,
        String    contact,
        String    phone,
        Integer   num,
        String    year,
        String    category,
        String    brand,
        Byte      status,
        Timestamp cdate,
        Timestamp mdate,
        String    remark,
        String    communicateResult,
        String    customerManager,
        String    operator,
        String    seccustomermanager
    ) {
        this.id = id;
        this.companyName = companyName;
        this.contact = contact;
        this.phone = phone;
        this.num = num;
        this.year = year;
        this.category = category;
        this.brand = brand;
        this.status = status;
        this.cdate = cdate;
        this.mdate = mdate;
        this.remark = remark;
        this.communicateResult = communicateResult;
        this.customerManager = customerManager;
        this.operator = operator;
        this.seccustomermanager = seccustomermanager;
    }

    public Integer getId() {
        return this.id;
    }

    public TRecycleApply setId(Integer id) {
        this.id = id;
        return this;
    }

    @Size(max = 100)
    public String getCompanyName() {
        return this.companyName;
    }

    public TRecycleApply setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    @Size(max = 100)
    public String getContact() {
        return this.contact;
    }

    public TRecycleApply setContact(String contact) {
        this.contact = contact;
        return this;
    }

    @NotNull
    @Size(max = 50)
    public String getPhone() {
        return this.phone;
    }

    public TRecycleApply setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Integer getNum() {
        return this.num;
    }

    public TRecycleApply setNum(Integer num) {
        this.num = num;
        return this;
    }

    @Size(max = 20)
    public String getYear() {
        return this.year;
    }

    public TRecycleApply setYear(String year) {
        this.year = year;
        return this;
    }

    @Size(max = 500)
    public String getCategory() {
        return this.category;
    }

    public TRecycleApply setCategory(String category) {
        this.category = category;
        return this;
    }

    @Size(max = 500)
    public String getBrand() {
        return this.brand;
    }

    public TRecycleApply setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Byte getStatus() {
        return this.status;
    }

    public TRecycleApply setStatus(Byte status) {
        this.status = status;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TRecycleApply setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TRecycleApply setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Size(max = 500)
    public String getRemark() {
        return this.remark;
    }

    public TRecycleApply setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    @Size(max = 100)
    public String getCommunicateResult() {
        return this.communicateResult;
    }

    public TRecycleApply setCommunicateResult(String communicateResult) {
        this.communicateResult = communicateResult;
        return this;
    }

    @Size(max = 100)
    public String getCustomerManager() {
        return this.customerManager;
    }

    public TRecycleApply setCustomerManager(String customerManager) {
        this.customerManager = customerManager;
        return this;
    }

    @Size(max = 100)
    public String getOperator() {
        return this.operator;
    }

    public TRecycleApply setOperator(String operator) {
        this.operator = operator;
        return this;
    }

    @Size(max = 100)
    public String getSeccustomermanager() {
        return this.seccustomermanager;
    }

    public TRecycleApply setSeccustomermanager(String seccustomermanager) {
        this.seccustomermanager = seccustomermanager;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TRecycleApply (");

        sb.append(id);
        sb.append(", ").append(companyName);
        sb.append(", ").append(contact);
        sb.append(", ").append(phone);
        sb.append(", ").append(num);
        sb.append(", ").append(year);
        sb.append(", ").append(category);
        sb.append(", ").append(brand);
        sb.append(", ").append(status);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);
        sb.append(", ").append(remark);
        sb.append(", ").append(communicateResult);
        sb.append(", ").append(customerManager);
        sb.append(", ").append(operator);
        sb.append(", ").append(seccustomermanager);

        sb.append(")");
        return sb.toString();
    }
}
