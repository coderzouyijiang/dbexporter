/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TCouponList;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class TCouponListRecord extends UpdatableRecordImpl<TCouponListRecord> implements Record17<Integer, String, Date, Date, Byte, Byte, Byte, String, Byte, Integer, Byte, String, Byte, Byte, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -417898548;

    /**
     * Setter for <code>db_mall.t_coupon_list.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.start_date</code>.
     */
    public void setStartDate(Date value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.start_date</code>.
     */
    public Date getStartDate() {
        return (Date) get(2);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.end_date</code>.
     */
    public void setEndDate(Date value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.end_date</code>.
     */
    public Date getEndDate() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.type_id</code>.
     */
    public void setTypeId(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.type_id</code>.
     */
    public Byte getTypeId() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.is_customer_limit</code>.
     */
    public void setIsCustomerLimit(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.is_customer_limit</code>.
     */
    public Byte getIsCustomerLimit() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.discount_type_id</code>.
     */
    public void setDiscountTypeId(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.discount_type_id</code>.
     */
    public Byte getDiscountTypeId() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.discount_value</code>.
     */
    public void setDiscountValue(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.discount_value</code>.
     */
    public String getDiscountValue() {
        return (String) get(7);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.is_first_order</code>.
     */
    public void setIsFirstOrder(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.is_first_order</code>.
     */
    public Byte getIsFirstOrder() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.limit_num</code>.
     */
    public void setLimitNum(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.limit_num</code>.
     */
    public Integer getLimitNum() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.is_first_month</code>.
     */
    public void setIsFirstMonth(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.is_first_month</code>.
     */
    public Byte getIsFirstMonth() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.get_code</code>.
     */
    public void setGetCode(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.get_code</code>.
     */
    public String getGetCode() {
        return (String) get(11);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.status</code>.
     */
    public void setStatus(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.is_new_device</code>.
     */
    public void setIsNewDevice(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.is_new_device</code>.
     */
    public Byte getIsNewDevice() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.is_expire</code>.
     */
    public void setIsExpire(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.is_expire</code>.
     */
    public Byte getIsExpire() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>db_mall.t_coupon_list.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>db_mall.t_coupon_list.mdate</code>.
     */
    public Timestamp getMdate() {
        return (Timestamp) get(16);
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
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, String, Date, Date, Byte, Byte, Byte, String, Byte, Integer, Byte, String, Byte, Byte, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Integer, String, Date, Date, Byte, Byte, Byte, String, Byte, Integer, Byte, String, Byte, Byte, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TCouponList.T_COUPON_LIST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TCouponList.T_COUPON_LIST.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field3() {
        return TCouponList.T_COUPON_LIST.START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return TCouponList.T_COUPON_LIST.END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TCouponList.T_COUPON_LIST.TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TCouponList.T_COUPON_LIST.IS_CUSTOMER_LIMIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return TCouponList.T_COUPON_LIST.DISCOUNT_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TCouponList.T_COUPON_LIST.DISCOUNT_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return TCouponList.T_COUPON_LIST.IS_FIRST_ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return TCouponList.T_COUPON_LIST.LIMIT_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return TCouponList.T_COUPON_LIST.IS_FIRST_MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return TCouponList.T_COUPON_LIST.GET_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return TCouponList.T_COUPON_LIST.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field14() {
        return TCouponList.T_COUPON_LIST.IS_NEW_DEVICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field15() {
        return TCouponList.T_COUPON_LIST.IS_EXPIRE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return TCouponList.T_COUPON_LIST.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return TCouponList.T_COUPON_LIST.MDATE;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component3() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component4() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getIsCustomerLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getDiscountTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDiscountValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component9() {
        return getIsFirstOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getLimitNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getIsFirstMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getGetCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component13() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component14() {
        return getIsNewDevice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component15() {
        return getIsExpire();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value3() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getIsCustomerLimit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getDiscountTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDiscountValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getIsFirstOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getLimitNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getIsFirstMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getGetCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value13() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value14() {
        return getIsNewDevice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value15() {
        return getIsExpire();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value3(Date value) {
        setStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value4(Date value) {
        setEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value5(Byte value) {
        setTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value6(Byte value) {
        setIsCustomerLimit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value7(Byte value) {
        setDiscountTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value8(String value) {
        setDiscountValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value9(Byte value) {
        setIsFirstOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value10(Integer value) {
        setLimitNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value11(Byte value) {
        setIsFirstMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value12(String value) {
        setGetCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value13(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value14(Byte value) {
        setIsNewDevice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value15(Byte value) {
        setIsExpire(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value16(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord value17(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCouponListRecord values(Integer value1, String value2, Date value3, Date value4, Byte value5, Byte value6, Byte value7, String value8, Byte value9, Integer value10, Byte value11, String value12, Byte value13, Byte value14, Byte value15, Timestamp value16, Timestamp value17) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TCouponListRecord
     */
    public TCouponListRecord() {
        super(TCouponList.T_COUPON_LIST);
    }

    /**
     * Create a detached, initialised TCouponListRecord
     */
    public TCouponListRecord(Integer id, String name, Date startDate, Date endDate, Byte typeId, Byte isCustomerLimit, Byte discountTypeId, String discountValue, Byte isFirstOrder, Integer limitNum, Byte isFirstMonth, String getCode, Byte status, Byte isNewDevice, Byte isExpire, Timestamp cdate, Timestamp mdate) {
        super(TCouponList.T_COUPON_LIST);

        set(0, id);
        set(1, name);
        set(2, startDate);
        set(3, endDate);
        set(4, typeId);
        set(5, isCustomerLimit);
        set(6, discountTypeId);
        set(7, discountValue);
        set(8, isFirstOrder);
        set(9, limitNum);
        set(10, isFirstMonth);
        set(11, getCode);
        set(12, status);
        set(13, isNewDevice);
        set(14, isExpire);
        set(15, cdate);
        set(16, mdate);
    }
}
