/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TGroupAccounts;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


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
public class TGroupAccountsRecord extends UpdatableRecordImpl<TGroupAccountsRecord> implements Record12<ULong, String, String, String, String, String, Byte, Long, UInteger, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 280840303;

    /**
     * Setter for <code>db_mall.t_group_accounts.id</code>.
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_group_accounts.id</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>db_mall.t_group_accounts.account</code>. 账号
     */
    public void setAccount(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_group_accounts.account</code>. 账号
     */
    public String getAccount() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_group_accounts.true_name</code>. 真是姓名
     */
    public void setTrueName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_group_accounts.true_name</code>. 真是姓名
     */
    public String getTrueName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_group_accounts.password</code>. 密码
     */
    public void setPassword(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_group_accounts.password</code>. 密码
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.t_group_accounts.salt</code>.
     */
    public void setSalt(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_group_accounts.salt</code>.
     */
    public String getSalt() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_group_accounts.phone</code>. 通知手机号
     */
    public void setPhone(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_group_accounts.phone</code>. 通知手机号
     */
    public String getPhone() {
        return (String) get(5);
    }

    /**
     * Setter for <code>db_mall.t_group_accounts.status</code>.
     */
    public void setStatus(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_group_accounts.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>db_mall.t_group_accounts.mall_account_id</code>.
     */
    public void setMallAccountId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_group_accounts.mall_account_id</code>.
     */
    public Long getMallAccountId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>db_mall.t_group_accounts.group_id</code>. 所属集团
     */
    public void setGroupId(UInteger value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_mall.t_group_accounts.group_id</code>. 所属集团
     */
    public UInteger getGroupId() {
        return (UInteger) get(8);
    }

    /**
     * Setter for <code>db_mall.t_group_accounts.error_login_time</code>.
     */
    public void setErrorLoginTime(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>db_mall.t_group_accounts.error_login_time</code>.
     */
    public Integer getErrorLoginTime() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>db_mall.t_group_accounts.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>db_mall.t_group_accounts.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>db_mall.t_group_accounts.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>db_mall.t_group_accounts.mdate</code>.
     */
    public Timestamp getMdate() {
        return (Timestamp) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<ULong, String, String, String, String, String, Byte, Long, UInteger, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<ULong, String, String, String, String, String, Byte, Long, UInteger, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TGroupAccounts.T_GROUP_ACCOUNTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TGroupAccounts.T_GROUP_ACCOUNTS.ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TGroupAccounts.T_GROUP_ACCOUNTS.TRUE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TGroupAccounts.T_GROUP_ACCOUNTS.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TGroupAccounts.T_GROUP_ACCOUNTS.SALT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TGroupAccounts.T_GROUP_ACCOUNTS.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return TGroupAccounts.T_GROUP_ACCOUNTS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return TGroupAccounts.T_GROUP_ACCOUNTS.MALL_ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field9() {
        return TGroupAccounts.T_GROUP_ACCOUNTS.GROUP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return TGroupAccounts.T_GROUP_ACCOUNTS.ERROR_LOGIN_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return TGroupAccounts.T_GROUP_ACCOUNTS.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return TGroupAccounts.T_GROUP_ACCOUNTS.MDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTrueName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getMallAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component9() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getErrorLoginTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTrueName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSalt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getMallAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value9() {
        return getGroupId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getErrorLoginTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupAccountsRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupAccountsRecord value2(String value) {
        setAccount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupAccountsRecord value3(String value) {
        setTrueName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupAccountsRecord value4(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupAccountsRecord value5(String value) {
        setSalt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupAccountsRecord value6(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupAccountsRecord value7(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupAccountsRecord value8(Long value) {
        setMallAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupAccountsRecord value9(UInteger value) {
        setGroupId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupAccountsRecord value10(Integer value) {
        setErrorLoginTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupAccountsRecord value11(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupAccountsRecord value12(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TGroupAccountsRecord values(ULong value1, String value2, String value3, String value4, String value5, String value6, Byte value7, Long value8, UInteger value9, Integer value10, Timestamp value11, Timestamp value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TGroupAccountsRecord
     */
    public TGroupAccountsRecord() {
        super(TGroupAccounts.T_GROUP_ACCOUNTS);
    }

    /**
     * Create a detached, initialised TGroupAccountsRecord
     */
    public TGroupAccountsRecord(ULong id, String account, String trueName, String password, String salt, String phone, Byte status, Long mallAccountId, UInteger groupId, Integer errorLoginTime, Timestamp cdate, Timestamp mdate) {
        super(TGroupAccounts.T_GROUP_ACCOUNTS);

        set(0, id);
        set(1, account);
        set(2, trueName);
        set(3, password);
        set(4, salt);
        set(5, phone);
        set(6, status);
        set(7, mallAccountId);
        set(8, groupId);
        set(9, errorLoginTime);
        set(10, cdate);
        set(11, mdate);
    }
}