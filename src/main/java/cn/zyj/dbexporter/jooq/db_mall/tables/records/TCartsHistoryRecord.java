/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCartsHistory;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
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
public class TCartsHistoryRecord extends UpdatableRecordImpl<TCartsHistoryRecord> implements Record15<Long, Integer, Integer, Byte, Integer, Integer, Integer, Integer, Byte, Byte, Byte, Byte, Timestamp, Timestamp, Integer> {

    private static final long serialVersionUID = 1433035739;

    /**
     * Setter for <code>db_mall.t_carts_history.id</code>.
     */
    public TCartsHistoryRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_carts_history.id</code>.
     */
    @NotNull
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_carts_history.product_id</code>.
     */
    public TCartsHistoryRecord setProductId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_carts_history.product_id</code>.
     */
    @NotNull
    public Integer getProductId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_carts_history.num</code>.
     */
    public TCartsHistoryRecord setNum(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_carts_history.num</code>.
     */
    @NotNull
    public Integer getNum() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_carts_history.status</code>.
     */
    public TCartsHistoryRecord setStatus(Byte value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_carts_history.status</code>.
     */
    @NotNull
    public Byte getStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>db_mall.t_carts_history.customer_id</code>.
     */
    public TCartsHistoryRecord setCustomerId(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_carts_history.customer_id</code>.
     */
    @NotNull
    public Integer getCustomerId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>db_mall.t_carts_history.rent_type</code>.
     */
    public TCartsHistoryRecord setRentType(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_carts_history.rent_type</code>.
     */
    public Integer getRentType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>db_mall.t_carts_history.start_date</code>.
     */
    public TCartsHistoryRecord setStartDate(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_carts_history.start_date</code>.
     */
    public Integer getStartDate() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>db_mall.t_carts_history.month</code>.
     */
    public TCartsHistoryRecord setMonth(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_carts_history.month</code>.
     */
    public Integer getMonth() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>db_mall.t_carts_history.is_sale</code>.
     */
    public TCartsHistoryRecord setIsSale(Byte value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_carts_history.is_sale</code>.
     */
    public Byte getIsSale() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>db_mall.t_carts_history.insurance_type_id</code>.
     */
    public TCartsHistoryRecord setInsuranceTypeId(Byte value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_carts_history.insurance_type_id</code>.
     */
    public Byte getInsuranceTypeId() {
        return (Byte) get(9);
    }

    /**
     * Setter for <code>db_mall.t_carts_history.service_id</code>.
     */
    public TCartsHistoryRecord setServiceId(Byte value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_carts_history.service_id</code>.
     */
    public Byte getServiceId() {
        return (Byte) get(10);
    }

    /**
     * Setter for <code>db_mall.t_carts_history.is_checked</code>.
     */
    public TCartsHistoryRecord setIsChecked(Byte value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_carts_history.is_checked</code>.
     */
    public Byte getIsChecked() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>db_mall.t_carts_history.cdate</code>.
     */
    public TCartsHistoryRecord setCdate(Timestamp value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_carts_history.cdate</code>.
     */
    @NotNull
    public Timestamp getCdate() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>db_mall.t_carts_history.mdate</code>.
     */
    public TCartsHistoryRecord setMdate(Timestamp value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_carts_history.mdate</code>.
     */
    @NotNull
    public Timestamp getMdate() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>db_mall.t_carts_history.rent_type_id</code>.
     */
    public TCartsHistoryRecord setRentTypeId(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_carts_history.rent_type_id</code>.
     */
    public Integer getRentTypeId() {
        return (Integer) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, Integer, Integer, Byte, Integer, Integer, Integer, Integer, Byte, Byte, Byte, Byte, Timestamp, Timestamp, Integer> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, Integer, Integer, Byte, Integer, Integer, Integer, Integer, Byte, Byte, Byte, Byte, Timestamp, Timestamp, Integer> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TCartsHistory.T_CARTS_HISTORY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TCartsHistory.T_CARTS_HISTORY.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TCartsHistory.T_CARTS_HISTORY.NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TCartsHistory.T_CARTS_HISTORY.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TCartsHistory.T_CARTS_HISTORY.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TCartsHistory.T_CARTS_HISTORY.RENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TCartsHistory.T_CARTS_HISTORY.START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return TCartsHistory.T_CARTS_HISTORY.MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return TCartsHistory.T_CARTS_HISTORY.IS_SALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return TCartsHistory.T_CARTS_HISTORY.INSURANCE_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field11() {
        return TCartsHistory.T_CARTS_HISTORY.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field12() {
        return TCartsHistory.T_CARTS_HISTORY.IS_CHECKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return TCartsHistory.T_CARTS_HISTORY.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return TCartsHistory.T_CARTS_HISTORY.MDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return TCartsHistory.T_CARTS_HISTORY.RENT_TYPE_ID;
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
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component12() {
        return getIsChecked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getRentTypeId();
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
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value12() {
        return getIsChecked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getRentTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord value2(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord value3(Integer value) {
        setNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord value4(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord value5(Integer value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord value6(Integer value) {
        setRentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord value7(Integer value) {
        setStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord value8(Integer value) {
        setMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord value9(Byte value) {
        setIsSale(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord value10(Byte value) {
        setInsuranceTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord value11(Byte value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord value12(Byte value) {
        setIsChecked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord value13(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord value14(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord value15(Integer value) {
        setRentTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCartsHistoryRecord values(Long value1, Integer value2, Integer value3, Byte value4, Integer value5, Integer value6, Integer value7, Integer value8, Byte value9, Byte value10, Byte value11, Byte value12, Timestamp value13, Timestamp value14, Integer value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TCartsHistoryRecord
     */
    public TCartsHistoryRecord() {
        super(TCartsHistory.T_CARTS_HISTORY);
    }

    /**
     * Create a detached, initialised TCartsHistoryRecord
     */
    public TCartsHistoryRecord(Long id, Integer productId, Integer num, Byte status, Integer customerId, Integer rentType, Integer startDate, Integer month, Byte isSale, Byte insuranceTypeId, Byte serviceId, Byte isChecked, Timestamp cdate, Timestamp mdate, Integer rentTypeId) {
        super(TCartsHistory.T_CARTS_HISTORY);

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
        set(10, serviceId);
        set(11, isChecked);
        set(12, cdate);
        set(13, mdate);
        set(14, rentTypeId);
    }
}
