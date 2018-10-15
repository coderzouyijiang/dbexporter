/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TOrderItemsDetailReturnLog;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class TOrderItemsDetailReturnLogRecord extends UpdatableRecordImpl<TOrderItemsDetailReturnLogRecord> implements Record6<Integer, String, Integer, String, String, Timestamp> {

    private static final long serialVersionUID = -250173420;

    /**
     * Setter for <code>db_mall.t_order_items_detail_return_log.id</code>. id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_order_items_detail_return_log.id</code>. id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_order_items_detail_return_log.order_id</code>. 订单号
     */
    public void setOrderId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_order_items_detail_return_log.order_id</code>. 订单号
     */
    public String getOrderId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_order_items_detail_return_log.item_detail_id</code>. 设备id
     */
    public void setItemDetailId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_order_items_detail_return_log.item_detail_id</code>. 设备id
     */
    public Integer getItemDetailId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_order_items_detail_return_log.sn</code>. 设备id
     */
    public void setSn(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_order_items_detail_return_log.sn</code>. 设备id
     */
    public String getSn() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.t_order_items_detail_return_log.return_reason</code>. 退回原因
     */
    public void setReturnReason(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_order_items_detail_return_log.return_reason</code>. 退回原因
     */
    public String getReturnReason() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_order_items_detail_return_log.op_time</code>.
     */
    public void setOpTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_order_items_detail_return_log.op_time</code>.
     */
    public Timestamp getOpTime() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Integer, String, String, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Integer, String, String, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TOrderItemsDetailReturnLog.T_ORDER_ITEMS_DETAIL_RETURN_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TOrderItemsDetailReturnLog.T_ORDER_ITEMS_DETAIL_RETURN_LOG.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TOrderItemsDetailReturnLog.T_ORDER_ITEMS_DETAIL_RETURN_LOG.ITEM_DETAIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TOrderItemsDetailReturnLog.T_ORDER_ITEMS_DETAIL_RETURN_LOG.SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TOrderItemsDetailReturnLog.T_ORDER_ITEMS_DETAIL_RETURN_LOG.RETURN_REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TOrderItemsDetailReturnLog.T_ORDER_ITEMS_DETAIL_RETURN_LOG.OP_TIME;
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
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getItemDetailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getReturnReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getOpTime();
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
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getItemDetailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getReturnReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getOpTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderItemsDetailReturnLogRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderItemsDetailReturnLogRecord value2(String value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderItemsDetailReturnLogRecord value3(Integer value) {
        setItemDetailId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderItemsDetailReturnLogRecord value4(String value) {
        setSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderItemsDetailReturnLogRecord value5(String value) {
        setReturnReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderItemsDetailReturnLogRecord value6(Timestamp value) {
        setOpTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderItemsDetailReturnLogRecord values(Integer value1, String value2, Integer value3, String value4, String value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TOrderItemsDetailReturnLogRecord
     */
    public TOrderItemsDetailReturnLogRecord() {
        super(TOrderItemsDetailReturnLog.T_ORDER_ITEMS_DETAIL_RETURN_LOG);
    }

    /**
     * Create a detached, initialised TOrderItemsDetailReturnLogRecord
     */
    public TOrderItemsDetailReturnLogRecord(Integer id, String orderId, Integer itemDetailId, String sn, String returnReason, Timestamp opTime) {
        super(TOrderItemsDetailReturnLog.T_ORDER_ITEMS_DETAIL_RETURN_LOG);

        set(0, id);
        set(1, orderId);
        set(2, itemDetailId);
        set(3, sn);
        set(4, returnReason);
        set(5, opTime);
    }
}
