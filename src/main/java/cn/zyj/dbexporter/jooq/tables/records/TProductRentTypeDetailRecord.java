/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TProductRentTypeDetail;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


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
public class TProductRentTypeDetailRecord extends UpdatableRecordImpl<TProductRentTypeDetailRecord> implements Record13<UInteger, Integer, Short, Short, Byte, BigDecimal, Byte, Byte, Timestamp, Timestamp, Byte, String, String> {

    private static final long serialVersionUID = 62876553;

    /**
     * Setter for <code>db_mall.t_product_rent_type_detail.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type_detail.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type_detail.rent_type_id</code>.
     */
    public void setRentTypeId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type_detail.rent_type_id</code>.
     */
    public Integer getRentTypeId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type_detail.start_month</code>. 起始月份
     */
    public void setStartMonth(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type_detail.start_month</code>. 起始月份
     */
    public Short getStartMonth() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type_detail.end_month</code>. 结束月份
     */
    public void setEndMonth(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type_detail.end_month</code>. 结束月份
     */
    public Short getEndMonth() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type_detail.rent_type</code>. 租赁类型
     */
    public void setRentType(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type_detail.rent_type</code>. 租赁类型
     */
    public Byte getRentType() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type_detail.rent</code>. 租金
     */
    public void setRent(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type_detail.rent</code>. 租金
     */
    public BigDecimal getRent() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type_detail.pay_type</code>. 商品支付方式 0:销售,1:月付, 2:季付,  3:半年付, 4:年付
     */
    public void setPayType(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type_detail.pay_type</code>. 商品支付方式 0:销售,1:月付, 2:季付,  3:半年付, 4:年付
     */
    public Byte getPayType() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type_detail.status</code>.
     */
    public void setStatus(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type_detail.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type_detail.cdate</code>. 创建时间
     */
    public void setCdate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type_detail.cdate</code>. 创建时间
     */
    public Timestamp getCdate() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type_detail.mdate</code>. 修改时间
     */
    public void setMdate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type_detail.mdate</code>. 修改时间
     */
    public Timestamp getMdate() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type_detail.condition</code>. 成色
     */
    public void setCondition(Byte value) {
        set(10, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type_detail.condition</code>. 成色
     */
    public Byte getCondition() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type_detail.service_id</code>. 售后服务
     */
    public void setServiceId(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type_detail.service_id</code>. 售后服务
     */
    public String getServiceId() {
        return (String) get(11);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type_detail.sku_info</code>. sku租金信息
     */
    public void setSkuInfo(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type_detail.sku_info</code>. sku租金信息
     */
    public String getSkuInfo() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<UInteger, Integer, Short, Short, Byte, BigDecimal, Byte, Byte, Timestamp, Timestamp, Byte, String, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<UInteger, Integer, Short, Short, Byte, BigDecimal, Byte, Byte, Timestamp, Timestamp, Byte, String, String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.RENT_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.START_MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.END_MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.RENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.RENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.PAY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.MDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.CONDITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL.SKU_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getRentTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getStartMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getEndMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getRentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getRent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getPayType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component11() {
        return getCondition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getSkuInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRentTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getStartMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getEndMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getRentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getRent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getPayType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value11() {
        return getCondition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getSkuInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeDetailRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeDetailRecord value2(Integer value) {
        setRentTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeDetailRecord value3(Short value) {
        setStartMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeDetailRecord value4(Short value) {
        setEndMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeDetailRecord value5(Byte value) {
        setRentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeDetailRecord value6(BigDecimal value) {
        setRent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeDetailRecord value7(Byte value) {
        setPayType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeDetailRecord value8(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeDetailRecord value9(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeDetailRecord value10(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeDetailRecord value11(Byte value) {
        setCondition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeDetailRecord value12(String value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeDetailRecord value13(String value) {
        setSkuInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeDetailRecord values(UInteger value1, Integer value2, Short value3, Short value4, Byte value5, BigDecimal value6, Byte value7, Byte value8, Timestamp value9, Timestamp value10, Byte value11, String value12, String value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TProductRentTypeDetailRecord
     */
    public TProductRentTypeDetailRecord() {
        super(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL);
    }

    /**
     * Create a detached, initialised TProductRentTypeDetailRecord
     */
    public TProductRentTypeDetailRecord(UInteger id, Integer rentTypeId, Short startMonth, Short endMonth, Byte rentType, BigDecimal rent, Byte payType, Byte status, Timestamp cdate, Timestamp mdate, Byte condition, String serviceId, String skuInfo) {
        super(TProductRentTypeDetail.T_PRODUCT_RENT_TYPE_DETAIL);

        set(0, id);
        set(1, rentTypeId);
        set(2, startMonth);
        set(3, endMonth);
        set(4, rentType);
        set(5, rent);
        set(6, payType);
        set(7, status);
        set(8, cdate);
        set(9, mdate);
        set(10, condition);
        set(11, serviceId);
        set(12, skuInfo);
    }
}
