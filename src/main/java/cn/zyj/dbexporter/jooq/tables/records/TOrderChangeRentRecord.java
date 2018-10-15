/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TOrderChangeRent;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class TOrderChangeRentRecord extends UpdatableRecordImpl<TOrderChangeRentRecord> implements Record9<Integer, Long, Long, String, Integer, BigDecimal, BigDecimal, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1356325300;

    /**
     * Setter for <code>db_mall.t_order_change_rent.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_order_change_rent.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_order_change_rent.item_id</code>.
     */
    public void setItemId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_order_change_rent.item_id</code>.
     */
    public Long getItemId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>db_mall.t_order_change_rent.item_detail_id</code>.
     */
    public void setItemDetailId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_order_change_rent.item_detail_id</code>.
     */
    public Long getItemDetailId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>db_mall.t_order_change_rent.order_id</code>.
     */
    public void setOrderId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_order_change_rent.order_id</code>.
     */
    public String getOrderId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.t_order_change_rent.sku_id</code>.
     */
    public void setSkuId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_order_change_rent.sku_id</code>.
     */
    public Integer getSkuId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>db_mall.t_order_change_rent.old_amount</code>.
     */
    public void setOldAmount(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_order_change_rent.old_amount</code>.
     */
    public BigDecimal getOldAmount() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>db_mall.t_order_change_rent.new_amount</code>.
     */
    public void setNewAmount(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_order_change_rent.new_amount</code>.
     */
    public BigDecimal getNewAmount() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>db_mall.t_order_change_rent.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_order_change_rent.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>db_mall.t_order_change_rent.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_mall.t_order_change_rent.mdate</code>.
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
    public Row9<Integer, Long, Long, String, Integer, BigDecimal, BigDecimal, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, Long, Long, String, Integer, BigDecimal, BigDecimal, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TOrderChangeRent.T_ORDER_CHANGE_RENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TOrderChangeRent.T_ORDER_CHANGE_RENT.ITEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return TOrderChangeRent.T_ORDER_CHANGE_RENT.ITEM_DETAIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TOrderChangeRent.T_ORDER_CHANGE_RENT.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TOrderChangeRent.T_ORDER_CHANGE_RENT.SKU_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return TOrderChangeRent.T_ORDER_CHANGE_RENT.OLD_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return TOrderChangeRent.T_ORDER_CHANGE_RENT.NEW_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TOrderChangeRent.T_ORDER_CHANGE_RENT.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TOrderChangeRent.T_ORDER_CHANGE_RENT.MDATE;
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
        return getItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getItemDetailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getSkuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getOldAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getNewAmount();
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
        return getItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getItemDetailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSkuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getOldAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getNewAmount();
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
    public TOrderChangeRentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeRentRecord value2(Long value) {
        setItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeRentRecord value3(Long value) {
        setItemDetailId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeRentRecord value4(String value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeRentRecord value5(Integer value) {
        setSkuId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeRentRecord value6(BigDecimal value) {
        setOldAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeRentRecord value7(BigDecimal value) {
        setNewAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeRentRecord value8(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeRentRecord value9(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderChangeRentRecord values(Integer value1, Long value2, Long value3, String value4, Integer value5, BigDecimal value6, BigDecimal value7, Timestamp value8, Timestamp value9) {
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
     * Create a detached TOrderChangeRentRecord
     */
    public TOrderChangeRentRecord() {
        super(TOrderChangeRent.T_ORDER_CHANGE_RENT);
    }

    /**
     * Create a detached, initialised TOrderChangeRentRecord
     */
    public TOrderChangeRentRecord(Integer id, Long itemId, Long itemDetailId, String orderId, Integer skuId, BigDecimal oldAmount, BigDecimal newAmount, Timestamp cdate, Timestamp mdate) {
        super(TOrderChangeRent.T_ORDER_CHANGE_RENT);

        set(0, id);
        set(1, itemId);
        set(2, itemDetailId);
        set(3, orderId);
        set(4, skuId);
        set(5, oldAmount);
        set(6, newAmount);
        set(7, cdate);
        set(8, mdate);
    }
}
