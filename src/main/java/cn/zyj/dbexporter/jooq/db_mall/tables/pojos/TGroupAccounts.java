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
public class TGroupAccounts implements Serializable {

    private static final long serialVersionUID = 1581093679;

    private Long      id;
    private String    account;
    private String    trueName;
    private String    password;
    private String    salt;
    private String    phone;
    private Byte      status;
    private Long      mallAccountId;
    private Integer   groupId;
    private Integer   errorLoginTime;
    private Timestamp cdate;
    private Timestamp mdate;

    public TGroupAccounts() {}

    public TGroupAccounts(TGroupAccounts value) {
        this.id = value.id;
        this.account = value.account;
        this.trueName = value.trueName;
        this.password = value.password;
        this.salt = value.salt;
        this.phone = value.phone;
        this.status = value.status;
        this.mallAccountId = value.mallAccountId;
        this.groupId = value.groupId;
        this.errorLoginTime = value.errorLoginTime;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TGroupAccounts(
        Long      id,
        String    account,
        String    trueName,
        String    password,
        String    salt,
        String    phone,
        Byte      status,
        Long      mallAccountId,
        Integer   groupId,
        Integer   errorLoginTime,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.account = account;
        this.trueName = trueName;
        this.password = password;
        this.salt = salt;
        this.phone = phone;
        this.status = status;
        this.mallAccountId = mallAccountId;
        this.groupId = groupId;
        this.errorLoginTime = errorLoginTime;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Long getId() {
        return this.id;
    }

    public TGroupAccounts setId(Long id) {
        this.id = id;
        return this;
    }

    @Size(max = 20)
    public String getAccount() {
        return this.account;
    }

    public TGroupAccounts setAccount(String account) {
        this.account = account;
        return this;
    }

    @Size(max = 50)
    public String getTrueName() {
        return this.trueName;
    }

    public TGroupAccounts setTrueName(String trueName) {
        this.trueName = trueName;
        return this;
    }

    @NotNull
    @Size(max = 32)
    public String getPassword() {
        return this.password;
    }

    public TGroupAccounts setPassword(String password) {
        this.password = password;
        return this;
    }

    @Size(max = 100)
    public String getSalt() {
        return this.salt;
    }

    public TGroupAccounts setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    @Size(max = 11)
    public String getPhone() {
        return this.phone;
    }

    public TGroupAccounts setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Byte getStatus() {
        return this.status;
    }

    public TGroupAccounts setStatus(Byte status) {
        this.status = status;
        return this;
    }

    @NotNull
    public Long getMallAccountId() {
        return this.mallAccountId;
    }

    public TGroupAccounts setMallAccountId(Long mallAccountId) {
        this.mallAccountId = mallAccountId;
        return this;
    }

    @NotNull
    public Integer getGroupId() {
        return this.groupId;
    }

    public TGroupAccounts setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    public Integer getErrorLoginTime() {
        return this.errorLoginTime;
    }

    public TGroupAccounts setErrorLoginTime(Integer errorLoginTime) {
        this.errorLoginTime = errorLoginTime;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TGroupAccounts setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TGroupAccounts setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TGroupAccounts (");

        sb.append(id);
        sb.append(", ").append(account);
        sb.append(", ").append(trueName);
        sb.append(", ").append(password);
        sb.append(", ").append(salt);
        sb.append(", ").append(phone);
        sb.append(", ").append(status);
        sb.append(", ").append(mallAccountId);
        sb.append(", ").append(groupId);
        sb.append(", ").append(errorLoginTime);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
