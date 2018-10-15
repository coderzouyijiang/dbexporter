/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TProductKey;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class TProductKeyRecord extends UpdatableRecordImpl<TProductKeyRecord> implements Record12<Integer, Integer, String, Byte, Byte, String, BigDecimal, BigDecimal, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -193137416;

    /**
     * Setter for <code>db_mall.t_product_key.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_product_key.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_product_key.product_id</code>. 商品ID
     */
    public void setProductId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_product_key.product_id</code>. 商品ID
     */
    public Integer getProductId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_product_key.key_str</code>. 秘钥
     */
    public void setKeyStr(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_product_key.key_str</code>. 秘钥
     */
    public String getKeyStr() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_product_key.check_status</code>. 审核状态 0:未审核 1 : 已审核
     */
    public void setCheckStatus(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_product_key.check_status</code>. 审核状态 0:未审核 1 : 已审核
     */
    public Byte getCheckStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>db_mall.t_product_key.email_status</code>. 邮件发送状态   0:未发送   1:发送
     */
    public void setEmailStatus(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_product_key.email_status</code>. 邮件发送状态   0:未发送   1:发送
     */
    public Byte getEmailStatus() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>db_mall.t_product_key.title</code>. 标题
     */
    public void setTitle(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_product_key.title</code>. 标题
     */
    public String getTitle() {
        return (String) get(5);
    }

    /**
     * Setter for <code>db_mall.t_product_key.deposit</code>. 押金
     */
    public void setDeposit(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_product_key.deposit</code>. 押金
     */
    public BigDecimal getDeposit() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>db_mall.t_product_key.credit_amount</code>. 风控授信额度
     */
    public void setCreditAmount(BigDecimal value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_product_key.credit_amount</code>. 风控授信额度
     */
    public BigDecimal getCreditAmount() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>db_mall.t_product_key.phone</code>. 专属手机号
     */
    public void setPhone(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_mall.t_product_key.phone</code>. 专属手机号
     */
    public String getPhone() {
        return (String) get(8);
    }

    /**
     * Setter for <code>db_mall.t_product_key.stock</code>. 预售库存
     */
    public void setStock(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>db_mall.t_product_key.stock</code>. 预售库存
     */
    public Integer getStock() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>db_mall.t_product_key.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>db_mall.t_product_key.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>db_mall.t_product_key.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>db_mall.t_product_key.mdate</code>.
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
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, Byte, Byte, String, BigDecimal, BigDecimal, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, Byte, Byte, String, BigDecimal, BigDecimal, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TProductKey.T_PRODUCT_KEY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TProductKey.T_PRODUCT_KEY.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TProductKey.T_PRODUCT_KEY.KEY_STR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TProductKey.T_PRODUCT_KEY.CHECK_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TProductKey.T_PRODUCT_KEY.EMAIL_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TProductKey.T_PRODUCT_KEY.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return TProductKey.T_PRODUCT_KEY.DEPOSIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TProductKey.T_PRODUCT_KEY.CREDIT_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TProductKey.T_PRODUCT_KEY.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return TProductKey.T_PRODUCT_KEY.STOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return TProductKey.T_PRODUCT_KEY.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return TProductKey.T_PRODUCT_KEY.MDATE;
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
    public Integer component2() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getKeyStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getCheckStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getEmailStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getDeposit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getCreditAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getStock();
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
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getKeyStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getCheckStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getEmailStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getDeposit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getCreditAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getStock();
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
    public TProductKeyRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductKeyRecord value2(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductKeyRecord value3(String value) {
        setKeyStr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductKeyRecord value4(Byte value) {
        setCheckStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductKeyRecord value5(Byte value) {
        setEmailStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductKeyRecord value6(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductKeyRecord value7(BigDecimal value) {
        setDeposit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductKeyRecord value8(BigDecimal value) {
        setCreditAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductKeyRecord value9(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductKeyRecord value10(Integer value) {
        setStock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductKeyRecord value11(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductKeyRecord value12(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductKeyRecord values(Integer value1, Integer value2, String value3, Byte value4, Byte value5, String value6, BigDecimal value7, BigDecimal value8, String value9, Integer value10, Timestamp value11, Timestamp value12) {
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
     * Create a detached TProductKeyRecord
     */
    public TProductKeyRecord() {
        super(TProductKey.T_PRODUCT_KEY);
    }

    /**
     * Create a detached, initialised TProductKeyRecord
     */
    public TProductKeyRecord(Integer id, Integer productId, String keyStr, Byte checkStatus, Byte emailStatus, String title, BigDecimal deposit, BigDecimal creditAmount, String phone, Integer stock, Timestamp cdate, Timestamp mdate) {
        super(TProductKey.T_PRODUCT_KEY);

        set(0, id);
        set(1, productId);
        set(2, keyStr);
        set(3, checkStatus);
        set(4, emailStatus);
        set(5, title);
        set(6, deposit);
        set(7, creditAmount);
        set(8, phone);
        set(9, stock);
        set(10, cdate);
        set(11, mdate);
    }
}
