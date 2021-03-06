/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TProductStockQueue;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class TProductStockQueueRecord extends UpdatableRecordImpl<TProductStockQueueRecord> implements Record8<Integer, Integer, Integer, Integer, Byte, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -998012060;

    /**
     * Setter for <code>db_mall.t_product_stock_queue.id</code>.
     */
    public TProductStockQueueRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_stock_queue.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_product_stock_queue.sku_id</code>.
     */
    public TProductStockQueueRecord setSkuId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_stock_queue.sku_id</code>.
     */
    @NotNull
    public Integer getSkuId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_product_stock_queue.stock</code>. 小于0时表示商城主动获取可用库存
     */
    public TProductStockQueueRecord setStock(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_stock_queue.stock</code>. 小于0时表示商城主动获取可用库存
     */
    public Integer getStock() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_product_stock_queue.real_stock</code>.
     */
    public TProductStockQueueRecord setRealStock(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_stock_queue.real_stock</code>.
     */
    public Integer getRealStock() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_mall.t_product_stock_queue.is_presale</code>.
     */
    public TProductStockQueueRecord setIsPresale(Byte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_stock_queue.is_presale</code>.
     */
    public Byte getIsPresale() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>db_mall.t_product_stock_queue.sync_status</code>. 0:未处理 1：已处理 
     */
    public TProductStockQueueRecord setSyncStatus(Byte value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_stock_queue.sync_status</code>. 0:未处理 1：已处理 
     */
    public Byte getSyncStatus() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>db_mall.t_product_stock_queue.cdate</code>.
     */
    public TProductStockQueueRecord setCdate(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_stock_queue.cdate</code>.
     */
    @NotNull
    public Timestamp getCdate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>db_mall.t_product_stock_queue.mdate</code>.
     */
    public TProductStockQueueRecord setMdate(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_stock_queue.mdate</code>.
     */
    @NotNull
    public Timestamp getMdate() {
        return (Timestamp) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, Byte, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, Integer, Integer, Byte, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TProductStockQueue.T_PRODUCT_STOCK_QUEUE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TProductStockQueue.T_PRODUCT_STOCK_QUEUE.SKU_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TProductStockQueue.T_PRODUCT_STOCK_QUEUE.STOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TProductStockQueue.T_PRODUCT_STOCK_QUEUE.REAL_STOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TProductStockQueue.T_PRODUCT_STOCK_QUEUE.IS_PRESALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TProductStockQueue.T_PRODUCT_STOCK_QUEUE.SYNC_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TProductStockQueue.T_PRODUCT_STOCK_QUEUE.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TProductStockQueue.T_PRODUCT_STOCK_QUEUE.MDATE;
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
        return getSkuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getStock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getRealStock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getIsPresale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getSyncStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
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
        return getSkuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getStock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getRealStock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getIsPresale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getSyncStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStockQueueRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStockQueueRecord value2(Integer value) {
        setSkuId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStockQueueRecord value3(Integer value) {
        setStock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStockQueueRecord value4(Integer value) {
        setRealStock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStockQueueRecord value5(Byte value) {
        setIsPresale(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStockQueueRecord value6(Byte value) {
        setSyncStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStockQueueRecord value7(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStockQueueRecord value8(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStockQueueRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Byte value5, Byte value6, Timestamp value7, Timestamp value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TProductStockQueueRecord
     */
    public TProductStockQueueRecord() {
        super(TProductStockQueue.T_PRODUCT_STOCK_QUEUE);
    }

    /**
     * Create a detached, initialised TProductStockQueueRecord
     */
    public TProductStockQueueRecord(Integer id, Integer skuId, Integer stock, Integer realStock, Byte isPresale, Byte syncStatus, Timestamp cdate, Timestamp mdate) {
        super(TProductStockQueue.T_PRODUCT_STOCK_QUEUE);

        set(0, id);
        set(1, skuId);
        set(2, stock);
        set(3, realStock);
        set(4, isPresale);
        set(5, syncStatus);
        set(6, cdate);
        set(7, mdate);
    }
}
