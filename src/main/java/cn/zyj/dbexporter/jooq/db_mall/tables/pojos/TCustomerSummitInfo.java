/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.Size;


/**
 * 易点租2017行业峰会 人员记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCustomerSummitInfo implements Serializable {

    private static final long serialVersionUID = 1560635139;

    private Integer   id;
    private String    userName;
    private String    phoneNum;
    private String    userEmail;
    private String    enterpriseName;
    private Integer   peopleSize;
    private String    fromAdSource;
    private Timestamp cdate;
    private Timestamp mdate;

    public TCustomerSummitInfo() {}

    public TCustomerSummitInfo(TCustomerSummitInfo value) {
        this.id = value.id;
        this.userName = value.userName;
        this.phoneNum = value.phoneNum;
        this.userEmail = value.userEmail;
        this.enterpriseName = value.enterpriseName;
        this.peopleSize = value.peopleSize;
        this.fromAdSource = value.fromAdSource;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TCustomerSummitInfo(
        Integer   id,
        String    userName,
        String    phoneNum,
        String    userEmail,
        String    enterpriseName,
        Integer   peopleSize,
        String    fromAdSource,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.userName = userName;
        this.phoneNum = phoneNum;
        this.userEmail = userEmail;
        this.enterpriseName = enterpriseName;
        this.peopleSize = peopleSize;
        this.fromAdSource = fromAdSource;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TCustomerSummitInfo setId(Integer id) {
        this.id = id;
        return this;
    }

    @Size(max = 32)
    public String getUserName() {
        return this.userName;
    }

    public TCustomerSummitInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Size(max = 32)
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public TCustomerSummitInfo setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }

    @Size(max = 255)
    public String getUserEmail() {
        return this.userEmail;
    }

    public TCustomerSummitInfo setUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    @Size(max = 255)
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public TCustomerSummitInfo setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }

    public Integer getPeopleSize() {
        return this.peopleSize;
    }

    public TCustomerSummitInfo setPeopleSize(Integer peopleSize) {
        this.peopleSize = peopleSize;
        return this;
    }

    @Size(max = 32)
    public String getFromAdSource() {
        return this.fromAdSource;
    }

    public TCustomerSummitInfo setFromAdSource(String fromAdSource) {
        this.fromAdSource = fromAdSource;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCustomerSummitInfo setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCustomerSummitInfo setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCustomerSummitInfo (");

        sb.append(id);
        sb.append(", ").append(userName);
        sb.append(", ").append(phoneNum);
        sb.append(", ").append(userEmail);
        sb.append(", ").append(enterpriseName);
        sb.append(", ").append(peopleSize);
        sb.append(", ").append(fromAdSource);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}