/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCustomerWechat;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TCustomerWechatRecord extends UpdatableRecordImpl<TCustomerWechatRecord> implements Record9<Integer, Long, String, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 791388332;

    /**
     * Setter for <code>db_mall.t_customer_wechat.id</code>.
     */
    public TCustomerWechatRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_wechat.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_customer_wechat.user_id</code>. 用户id
     */
    public TCustomerWechatRecord setUserId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_wechat.user_id</code>. 用户id
     */
    public Long getUserId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>db_mall.t_customer_wechat.openid</code>. 授权用户唯一标识
     */
    public TCustomerWechatRecord setOpenid(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_wechat.openid</code>. 授权用户唯一标识
     */
    @Size(max = 40)
    public String getOpenid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_customer_wechat.phone</code>. 手机号
     */
    public TCustomerWechatRecord setPhone(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_wechat.phone</code>. 手机号
     */
    @Size(max = 15)
    public String getPhone() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.t_customer_wechat.unionid</code>. 用户在开放平台的唯一标识符
     */
    public TCustomerWechatRecord setUnionid(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_wechat.unionid</code>. 用户在开放平台的唯一标识符
     */
    @Size(max = 40)
    public String getUnionid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_customer_wechat.nick_name</code>. 用户昵称
     */
    public TCustomerWechatRecord setNickName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_wechat.nick_name</code>. 用户昵称
     */
    @Size(max = 20)
    public String getNickName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>db_mall.t_customer_wechat.avatar_url</code>. 用户头像
     */
    public TCustomerWechatRecord setAvatarUrl(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_wechat.avatar_url</code>. 用户头像
     */
    @Size(max = 150)
    public String getAvatarUrl() {
        return (String) get(6);
    }

    /**
     * Setter for <code>db_mall.t_customer_wechat.cdate</code>. 创建时间
     */
    public TCustomerWechatRecord setCdate(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_wechat.cdate</code>. 创建时间
     */
    public Timestamp getCdate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>db_mall.t_customer_wechat.mdate</code>. 修改时间
     */
    public TCustomerWechatRecord setMdate(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_wechat.mdate</code>. 修改时间
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
    public Row9<Integer, Long, String, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Long, String, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TCustomerWechat.T_CUSTOMER_WECHAT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TCustomerWechat.T_CUSTOMER_WECHAT.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TCustomerWechat.T_CUSTOMER_WECHAT.OPENID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TCustomerWechat.T_CUSTOMER_WECHAT.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TCustomerWechat.T_CUSTOMER_WECHAT.UNIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TCustomerWechat.T_CUSTOMER_WECHAT.NICK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TCustomerWechat.T_CUSTOMER_WECHAT.AVATAR_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TCustomerWechat.T_CUSTOMER_WECHAT.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TCustomerWechat.T_CUSTOMER_WECHAT.MDATE;
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
    public Long component2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getOpenid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUnionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getNickName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAvatarUrl();
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
    public Long value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getOpenid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUnionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getNickName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAvatarUrl();
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
    public TCustomerWechatRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerWechatRecord value2(Long value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerWechatRecord value3(String value) {
        setOpenid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerWechatRecord value4(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerWechatRecord value5(String value) {
        setUnionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerWechatRecord value6(String value) {
        setNickName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerWechatRecord value7(String value) {
        setAvatarUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerWechatRecord value8(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerWechatRecord value9(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerWechatRecord values(Integer value1, Long value2, String value3, String value4, String value5, String value6, String value7, Timestamp value8, Timestamp value9) {
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
     * Create a detached TCustomerWechatRecord
     */
    public TCustomerWechatRecord() {
        super(TCustomerWechat.T_CUSTOMER_WECHAT);
    }

    /**
     * Create a detached, initialised TCustomerWechatRecord
     */
    public TCustomerWechatRecord(Integer id, Long userId, String openid, String phone, String unionid, String nickName, String avatarUrl, Timestamp cdate, Timestamp mdate) {
        super(TCustomerWechat.T_CUSTOMER_WECHAT);

        set(0, id);
        set(1, userId);
        set(2, openid);
        set(3, phone);
        set(4, unionid);
        set(5, nickName);
        set(6, avatarUrl);
        set(7, cdate);
        set(8, mdate);
    }
}
