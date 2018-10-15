/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TCarts;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
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
public class TCartsRecord extends UpdatableRecordImpl<TCartsRecord> implements Record20<Long, Integer, Integer, Byte, Integer, Integer, Integer, Integer, Byte, Byte, Byte, Byte, Byte, Integer, Byte, Byte, Timestamp, Timestamp, Integer, Byte> {

    private static final long serialVersionUID = -1144083697;

    /**
     * Setter for <code>db_mall.t_carts.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_carts.product_id</code>.
     */
    public void setProductId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.product_id</code>.
     */
    public Integer getProductId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_carts.num</code>.
     */
    public void setNum(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.num</code>.
     */
    public Integer getNum() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_carts.status</code>.
     */
    public void setStatus(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>db_mall.t_carts.customer_id</code>.
     */
    public void setCustomerId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.customer_id</code>.
     */
    public Integer getCustomerId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>db_mall.t_carts.rent_type</code>.
     */
    public void setRentType(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.rent_type</code>.
     */
    public Integer getRentType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>db_mall.t_carts.start_date</code>.
     */
    public void setStartDate(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.start_date</code>.
     */
    public Integer getStartDate() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>db_mall.t_carts.month</code>.
     */
    public void setMonth(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.month</code>.
     */
    public Integer getMonth() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>db_mall.t_carts.is_sale</code>.
     */
    public void setIsSale(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.is_sale</code>.
     */
    public Byte getIsSale() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>db_mall.t_carts.insurance_type_id</code>.
     */
    public void setInsuranceTypeId(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.insurance_type_id</code>.
     */
    public Byte getInsuranceTypeId() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>db_mall.t_carts.added_service_type_id</code>. 增值服务类型
     */
    public void setAddedServiceTypeId(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.added_service_type_id</code>. 增值服务类型
     */
    public Byte getAddedServiceTypeId() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>db_mall.t_carts.soft_service_type_id</code>. 软件预装服务
     */
    public void setSoftServiceTypeId(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.soft_service_type_id</code>. 软件预装服务
     */
    public Byte getSoftServiceTypeId() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>db_mall.t_carts.onsite_service_type_id</code>. 上门安装服务
     */
    public void setOnsiteServiceTypeId(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.onsite_service_type_id</code>. 上门安装服务
     */
    public Byte getOnsiteServiceTypeId() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>db_mall.t_carts.suits_type</code>. 优惠套装商品
     */
    public void setSuitsType(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.suits_type</code>. 优惠套装商品
     */
    public Integer getSuitsType() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>db_mall.t_carts.is_checked</code>.
     */
    public void setIsChecked(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.is_checked</code>.
     */
    public Byte getIsChecked() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>db_mall.t_carts.service_id</code>.
     */
    public void setServiceId(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.service_id</code>.
     */
    public Byte getServiceId() {
        return (Byte) get(15);
    }

    /**
     * Setter for <code>db_mall.t_carts.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(16);
    }

    /**
     * Setter for <code>db_mall.t_carts.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.mdate</code>.
     */
    public Timestamp getMdate() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>db_mall.t_carts.rent_type_id</code>.
     */
    public void setRentTypeId(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.rent_type_id</code>.
     */
    public Integer getRentTypeId() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>db_mall.t_carts.pay_type</code>. 商品支付方式 0:销售,1:月付, 2:季付,  3:半年付, 4:年付
     */
    public void setPayType(Byte value) {
        set(19, value);
    }

    /**
     * Getter for <code>db_mall.t_carts.pay_type</code>. 商品支付方式 0:销售,1:月付, 2:季付,  3:半年付, 4:年付
     */
    public Byte getPayType() {
        return (Byte) get(19);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Long, Integer, Integer, Byte, Integer, Integer, Integer, Integer, Byte, Byte, Byte, Byte, Byte, Integer, Byte, Byte, Timestamp, Timestamp, Integer, Byte> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Long, Integer, Integer, Byte, Integer, Integer, Integer, Integer, Byte, Byte, Byte, Byte, Byte, Integer, Byte, Byte, Timestamp, Timestamp, Integer, Byte> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TCarts.T_CARTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TCarts.T_CARTS.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TCarts.T_CARTS.NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TCarts.T_CARTS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TCarts.T_CARTS.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TCarts.T_CARTS.RENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TCarts.T_CARTS.START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return TCarts.T_CARTS.MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return TCarts.T_CARTS.IS_SALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return TCarts.T_CARTS.INSURANCE_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return TCarts.T_CARTS.ADDED_SERVICE_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return TCarts.T_CARTS.SOFT_SERVICE_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field13() {
        return TCarts.T_CARTS.ONSITE_SERVICE_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return TCarts.T_CARTS.SUITS_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field15() {
        return TCarts.T_CARTS.IS_CHECKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field16() {
        return TCarts.T_CARTS.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return TCarts.T_CARTS.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return TCarts.T_CARTS.MDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field19() {
        return TCarts.T_CARTS.RENT_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field20() {
        return TCarts.T_CARTS.PAY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
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
    public Integer component3() {
        return getNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getRentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component9() {
        return getIsSale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component10() {
        return getInsuranceTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getAddedServiceTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component12() {
        return getSoftServiceTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component13() {
        return getOnsiteServiceTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getSuitsType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component15() {
        return getIsChecked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component16() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component18() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component19() {
        return getRentTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component20() {
        return getPayType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
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
    public Integer value3() {
        return getNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getRentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getIsSale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getInsuranceTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getAddedServiceTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getSoftServiceTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value13() {
        return getOnsiteServiceTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getSuitsType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value15() {
        return getIsChecked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value16() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value19() {
        return getRentTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value20() {
        return getPayType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value2(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value3(Integer value) {
        setNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value4(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value5(Integer value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value6(Integer value) {
        setRentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value7(Integer value) {
        setStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value8(Integer value) {
        setMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value9(Byte value) {
        setIsSale(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value10(Byte value) {
        setInsuranceTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value11(Byte value) {
        setAddedServiceTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value12(Byte value) {
        setSoftServiceTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value13(Byte value) {
        setOnsiteServiceTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value14(Integer value) {
        setSuitsType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value15(Byte value) {
        setIsChecked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value16(Byte value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value17(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value18(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value19(Integer value) {
        setRentTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord value20(Byte value) {
        setPayType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsRecord values(Long value1, Integer value2, Integer value3, Byte value4, Integer value5, Integer value6, Integer value7, Integer value8, Byte value9, Byte value10, Byte value11, Byte value12, Byte value13, Integer value14, Byte value15, Byte value16, Timestamp value17, Timestamp value18, Integer value19, Byte value20) {
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
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TCartsRecord
     */
    public TCartsRecord() {
        super(TCarts.T_CARTS);
    }

    /**
     * Create a detached, initialised TCartsRecord
     */
    public TCartsRecord(Long id, Integer productId, Integer num, Byte status, Integer customerId, Integer rentType, Integer startDate, Integer month, Byte isSale, Byte insuranceTypeId, Byte addedServiceTypeId, Byte softServiceTypeId, Byte onsiteServiceTypeId, Integer suitsType, Byte isChecked, Byte serviceId, Timestamp cdate, Timestamp mdate, Integer rentTypeId, Byte payType) {
        super(TCarts.T_CARTS);

        set(0, id);
        set(1, productId);
        set(2, num);
        set(3, status);
        set(4, customerId);
        set(5, rentType);
        set(6, startDate);
        set(7, month);
        set(8, isSale);
        set(9, insuranceTypeId);
        set(10, addedServiceTypeId);
        set(11, softServiceTypeId);
        set(12, onsiteServiceTypeId);
        set(13, suitsType);
        set(14, isChecked);
        set(15, serviceId);
        set(16, cdate);
        set(17, mdate);
        set(18, rentTypeId);
        set(19, payType);
    }
}
