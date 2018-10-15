/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TProductRentType;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class TProductRentTypeRecord extends UpdatableRecordImpl<TProductRentTypeRecord> implements Record10<UInteger, Integer, Short, BigDecimal, String, Boolean, Byte, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -629645491;

    /**
     * Setter for <code>db_mall.t_product_rent_type.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type.product_id</code>. 商品id
     */
    public void setProductId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type.product_id</code>. 商品id
     */
    public Integer getProductId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type.total_month</code>. 总期数
     */
    public void setTotalMonth(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type.total_month</code>. 总期数
     */
    public Short getTotalMonth() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type.first_rent</code>. 首期租金
     */
    public void setFirstRent(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type.first_rent</code>. 首期租金
     */
    public BigDecimal getFirstRent() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type.rent_type_desc</code>.
     */
    public void setRentTypeDesc(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type.rent_type_desc</code>.
     */
    public String getRentTypeDesc() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type.is_recommend</code>. 是否推荐
     */
    public void setIsRecommend(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type.is_recommend</code>. 是否推荐
     */
    public Boolean getIsRecommend() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type.status</code>.
     */
    public void setStatus(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type.risk</code>. 风险系数
     */
    public void setRisk(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type.risk</code>. 风险系数
     */
    public Byte getRisk() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type.cdate</code>. 创建时间
     */
    public void setCdate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type.cdate</code>. 创建时间
     */
    public Timestamp getCdate() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>db_mall.t_product_rent_type.mdate</code>. 修改时间
     */
    public void setMdate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>db_mall.t_product_rent_type.mdate</code>. 修改时间
     */
    public Timestamp getMdate() {
        return (Timestamp) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<UInteger, Integer, Short, BigDecimal, String, Boolean, Byte, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<UInteger, Integer, Short, BigDecimal, String, Boolean, Byte, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TProductRentType.T_PRODUCT_RENT_TYPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TProductRentType.T_PRODUCT_RENT_TYPE.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TProductRentType.T_PRODUCT_RENT_TYPE.TOTAL_MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TProductRentType.T_PRODUCT_RENT_TYPE.FIRST_RENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TProductRentType.T_PRODUCT_RENT_TYPE.RENT_TYPE_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return TProductRentType.T_PRODUCT_RENT_TYPE.IS_RECOMMEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return TProductRentType.T_PRODUCT_RENT_TYPE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return TProductRentType.T_PRODUCT_RENT_TYPE.RISK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TProductRentType.T_PRODUCT_RENT_TYPE.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return TProductRentType.T_PRODUCT_RENT_TYPE.MDATE;
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
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getTotalMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getFirstRent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getRentTypeDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getIsRecommend();
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
    public Byte component8() {
        return getRisk();
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
    public UInteger value1() {
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
    public Short value3() {
        return getTotalMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getFirstRent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRentTypeDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getIsRecommend();
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
    public Byte value8() {
        return getRisk();
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
    public TProductRentTypeRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeRecord value2(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeRecord value3(Short value) {
        setTotalMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeRecord value4(BigDecimal value) {
        setFirstRent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeRecord value5(String value) {
        setRentTypeDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeRecord value6(Boolean value) {
        setIsRecommend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeRecord value7(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeRecord value8(Byte value) {
        setRisk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeRecord value9(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeRecord value10(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductRentTypeRecord values(UInteger value1, Integer value2, Short value3, BigDecimal value4, String value5, Boolean value6, Byte value7, Byte value8, Timestamp value9, Timestamp value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TProductRentTypeRecord
     */
    public TProductRentTypeRecord() {
        super(TProductRentType.T_PRODUCT_RENT_TYPE);
    }

    /**
     * Create a detached, initialised TProductRentTypeRecord
     */
    public TProductRentTypeRecord(UInteger id, Integer productId, Short totalMonth, BigDecimal firstRent, String rentTypeDesc, Boolean isRecommend, Byte status, Byte risk, Timestamp cdate, Timestamp mdate) {
        super(TProductRentType.T_PRODUCT_RENT_TYPE);

        set(0, id);
        set(1, productId);
        set(2, totalMonth);
        set(3, firstRent);
        set(4, rentTypeDesc);
        set(5, isRecommend);
        set(6, status);
        set(7, risk);
        set(8, cdate);
        set(9, mdate);
    }
}
