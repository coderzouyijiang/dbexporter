/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TOrderExchange;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class TOrderExchangeRecord extends UpdatableRecordImpl<TOrderExchangeRecord> implements Record12<Long, String, Long, Long, Integer, Integer, String, String, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1930870337;

    /**
     * Setter for <code>db_mall.t_order_exchange.id</code>.
     */
    public TOrderExchangeRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_exchange.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_order_exchange.order_id</code>.
     */
    public TOrderExchangeRecord setOrderId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_exchange.order_id</code>.
     */
    @NotNull
    @Size(max = 20)
    public String getOrderId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_order_exchange.item_id</code>.
     */
    public TOrderExchangeRecord setItemId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_exchange.item_id</code>.
     */
    @NotNull
    public Long getItemId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>db_mall.t_order_exchange.item_detail_id</code>.
     */
    public TOrderExchangeRecord setItemDetailId(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_exchange.item_detail_id</code>.
     */
    @NotNull
    public Long getItemDetailId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>db_mall.t_order_exchange.old_sku_id</code>.
     */
    public TOrderExchangeRecord setOldSkuId(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_exchange.old_sku_id</code>.
     */
    @NotNull
    public Integer getOldSkuId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>db_mall.t_order_exchange.new_sku_id</code>.
     */
    public TOrderExchangeRecord setNewSkuId(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_exchange.new_sku_id</code>.
     */
    @NotNull
    public Integer getNewSkuId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>db_mall.t_order_exchange.old_sn</code>.
     */
    public TOrderExchangeRecord setOldSn(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_exchange.old_sn</code>.
     */
    @Size(max = 50)
    public String getOldSn() {
        return (String) get(6);
    }

    /**
     * Setter for <code>db_mall.t_order_exchange.new_sn</code>.
     */
    public TOrderExchangeRecord setNewSn(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_exchange.new_sn</code>.
     */
    @Size(max = 50)
    public String getNewSn() {
        return (String) get(7);
    }

    /**
     * Setter for <code>db_mall.t_order_exchange.express_info</code>.
     */
    public TOrderExchangeRecord setExpressInfo(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_exchange.express_info</code>.
     */
    @Size(max = 1000)
    public String getExpressInfo() {
        return (String) get(8);
    }

    /**
     * Setter for <code>db_mall.t_order_exchange.status</code>.
     */
    public TOrderExchangeRecord setStatus(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_exchange.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>db_mall.t_order_exchange.cdate</code>.
     */
    public TOrderExchangeRecord setCdate(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_exchange.cdate</code>.
     */
    @NotNull
    public Timestamp getCdate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>db_mall.t_order_exchange.mdate</code>.
     */
    public TOrderExchangeRecord setMdate(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_exchange.mdate</code>.
     */
    @NotNull
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
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, Long, Long, Integer, Integer, String, String, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, String, Long, Long, Integer, Integer, String, String, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TOrderExchange.T_ORDER_EXCHANGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TOrderExchange.T_ORDER_EXCHANGE.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return TOrderExchange.T_ORDER_EXCHANGE.ITEM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return TOrderExchange.T_ORDER_EXCHANGE.ITEM_DETAIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TOrderExchange.T_ORDER_EXCHANGE.OLD_SKU_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TOrderExchange.T_ORDER_EXCHANGE.NEW_SKU_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TOrderExchange.T_ORDER_EXCHANGE.OLD_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TOrderExchange.T_ORDER_EXCHANGE.NEW_SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TOrderExchange.T_ORDER_EXCHANGE.EXPRESS_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return TOrderExchange.T_ORDER_EXCHANGE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return TOrderExchange.T_ORDER_EXCHANGE.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return TOrderExchange.T_ORDER_EXCHANGE.MDATE;
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
    public String component2() {
        return getOrderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getItemDetailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getOldSkuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getNewSkuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getOldSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getNewSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getExpressInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getStatus();
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
    public Long value1() {
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
    public Long value3() {
        return getItemId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getItemDetailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getOldSkuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getNewSkuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOldSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getNewSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getExpressInfo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getStatus();
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
    public TOrderExchangeRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderExchangeRecord value2(String value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderExchangeRecord value3(Long value) {
        setItemId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderExchangeRecord value4(Long value) {
        setItemDetailId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderExchangeRecord value5(Integer value) {
        setOldSkuId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderExchangeRecord value6(Integer value) {
        setNewSkuId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderExchangeRecord value7(String value) {
        setOldSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderExchangeRecord value8(String value) {
        setNewSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderExchangeRecord value9(String value) {
        setExpressInfo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderExchangeRecord value10(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderExchangeRecord value11(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderExchangeRecord value12(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderExchangeRecord values(Long value1, String value2, Long value3, Long value4, Integer value5, Integer value6, String value7, String value8, String value9, Integer value10, Timestamp value11, Timestamp value12) {
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
     * Create a detached TOrderExchangeRecord
     */
    public TOrderExchangeRecord() {
        super(TOrderExchange.T_ORDER_EXCHANGE);
    }

    /**
     * Create a detached, initialised TOrderExchangeRecord
     */
    public TOrderExchangeRecord(Long id, String orderId, Long itemId, Long itemDetailId, Integer oldSkuId, Integer newSkuId, String oldSn, String newSn, String expressInfo, Integer status, Timestamp cdate, Timestamp mdate) {
        super(TOrderExchange.T_ORDER_EXCHANGE);

        set(0, id);
        set(1, orderId);
        set(2, itemId);
        set(3, itemDetailId);
        set(4, oldSkuId);
        set(5, newSkuId);
        set(6, oldSn);
        set(7, newSn);
        set(8, expressInfo);
        set(9, status);
        set(10, cdate);
        set(11, mdate);
    }
}
