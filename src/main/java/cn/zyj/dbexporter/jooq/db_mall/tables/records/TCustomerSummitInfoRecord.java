/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCustomerSummitInfo;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TCustomerSummitInfoRecord extends UpdatableRecordImpl<TCustomerSummitInfoRecord> implements Record9<Integer, String, String, String, String, Integer, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -113366803;

    /**
     * Setter for <code>db_mall.t_customer_summit_info.id</code>. 主键id
     */
    public TCustomerSummitInfoRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_summit_info.id</code>. 主键id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_customer_summit_info.user_name</code>. 姓名
     */
    public TCustomerSummitInfoRecord setUserName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_summit_info.user_name</code>. 姓名
     */
    @Size(max = 32)
    public String getUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_customer_summit_info.phone_num</code>. 手机号码
     */
    public TCustomerSummitInfoRecord setPhoneNum(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_summit_info.phone_num</code>. 手机号码
     */
    @Size(max = 32)
    public String getPhoneNum() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_customer_summit_info.user_email</code>. 电子邮箱
     */
    public TCustomerSummitInfoRecord setUserEmail(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_summit_info.user_email</code>. 电子邮箱
     */
    @Size(max = 255)
    public String getUserEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.t_customer_summit_info.enterprise_name</code>. 企业名称
     */
    public TCustomerSummitInfoRecord setEnterpriseName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_summit_info.enterprise_name</code>. 企业名称
     */
    @Size(max = 255)
    public String getEnterpriseName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_customer_summit_info.people_size</code>. 参数人数
     */
    public TCustomerSummitInfoRecord setPeopleSize(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_summit_info.people_size</code>. 参数人数
     */
    public Integer getPeopleSize() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>db_mall.t_customer_summit_info.from_ad_source</code>. 渠道
     */
    public TCustomerSummitInfoRecord setFromAdSource(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_summit_info.from_ad_source</code>. 渠道
     */
    @Size(max = 32)
    public String getFromAdSource() {
        return (String) get(6);
    }

    /**
     * Setter for <code>db_mall.t_customer_summit_info.cdate</code>. 创建时间
     */
    public TCustomerSummitInfoRecord setCdate(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_summit_info.cdate</code>. 创建时间
     */
    public Timestamp getCdate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>db_mall.t_customer_summit_info.mdate</code>. 修改时间
     */
    public TCustomerSummitInfoRecord setMdate(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_summit_info.mdate</code>. 修改时间
     */
    public Timestamp getMdate() {
        return (Timestamp) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, Integer, String, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, Integer, String, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TCustomerSummitInfo.T_CUSTOMER_SUMMIT_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TCustomerSummitInfo.T_CUSTOMER_SUMMIT_INFO.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TCustomerSummitInfo.T_CUSTOMER_SUMMIT_INFO.PHONE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TCustomerSummitInfo.T_CUSTOMER_SUMMIT_INFO.USER_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TCustomerSummitInfo.T_CUSTOMER_SUMMIT_INFO.ENTERPRISE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TCustomerSummitInfo.T_CUSTOMER_SUMMIT_INFO.PEOPLE_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TCustomerSummitInfo.T_CUSTOMER_SUMMIT_INFO.FROM_AD_SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TCustomerSummitInfo.T_CUSTOMER_SUMMIT_INFO.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TCustomerSummitInfo.T_CUSTOMER_SUMMIT_INFO.MDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPhoneNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUserEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getEnterpriseName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getPeopleSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getFromAdSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPhoneNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUserEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEnterpriseName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getPeopleSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getFromAdSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSummitInfoRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSummitInfoRecord value2(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSummitInfoRecord value3(String value) {
        setPhoneNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSummitInfoRecord value4(String value) {
        setUserEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSummitInfoRecord value5(String value) {
        setEnterpriseName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSummitInfoRecord value6(Integer value) {
        setPeopleSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSummitInfoRecord value7(String value) {
        setFromAdSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSummitInfoRecord value8(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSummitInfoRecord value9(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSummitInfoRecord values(Integer value1, String value2, String value3, String value4, String value5, Integer value6, String value7, Timestamp value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TCustomerSummitInfoRecord
     */
    public TCustomerSummitInfoRecord() {
        super(TCustomerSummitInfo.T_CUSTOMER_SUMMIT_INFO);
    }

    /**
     * Create a detached, initialised TCustomerSummitInfoRecord
     */
    public TCustomerSummitInfoRecord(Integer id, String userName, String phoneNum, String userEmail, String enterpriseName, Integer peopleSize, String fromAdSource, Timestamp cdate, Timestamp mdate) {
        super(TCustomerSummitInfo.T_CUSTOMER_SUMMIT_INFO);

        set(0, id);
        set(1, userName);
        set(2, phoneNum);
        set(3, userEmail);
        set(4, enterpriseName);
        set(5, peopleSize);
        set(6, fromAdSource);
        set(7, cdate);
        set(8, mdate);
    }
}
