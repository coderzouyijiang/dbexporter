/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TProductStatus;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

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
public class TProductStatusRecord extends UpdatableRecordImpl<TProductStatusRecord> implements Record6<Long, Integer, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1672987798;

    /**
     * Setter for <code>db_mall.t_product_status.id</code>.
     */
    public TProductStatusRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_status.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_product_status.product_id</code>.
     */
    public TProductStatusRecord setProductId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_status.product_id</code>.
     */
    @NotNull
    public Integer getProductId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_product_status.manager_id</code>.
     */
    public TProductStatusRecord setManagerId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_status.manager_id</code>.
     */
    @NotNull
    public Integer getManagerId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_product_status.status</code>.
     */
    public TProductStatusRecord setStatus(Byte value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_status.status</code>.
     */
    @NotNull
    public Byte getStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>db_mall.t_product_status.cdate</code>.
     */
    public TProductStatusRecord setCdate(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_status.cdate</code>.
     */
    @NotNull
    public Timestamp getCdate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>db_mall.t_product_status.mdate</code>.
     */
    public TProductStatusRecord setMdate(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_status.mdate</code>.
     */
    @NotNull
    public Timestamp getMdate() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Integer, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Integer, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TProductStatus.T_PRODUCT_STATUS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TProductStatus.T_PRODUCT_STATUS.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TProductStatus.T_PRODUCT_STATUS.MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TProductStatus.T_PRODUCT_STATUS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TProductStatus.T_PRODUCT_STATUS.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TProductStatus.T_PRODUCT_STATUS.MDATE;
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
        return getManagerId();
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
    public Timestamp component5() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
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
    public Integer value2() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getManagerId();
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
    public Timestamp value5() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStatusRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStatusRecord value2(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStatusRecord value3(Integer value) {
        setManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStatusRecord value4(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStatusRecord value5(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStatusRecord value6(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductStatusRecord values(Long value1, Integer value2, Integer value3, Byte value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached TProductStatusRecord
     */
    public TProductStatusRecord() {
        super(TProductStatus.T_PRODUCT_STATUS);
    }

    /**
     * Create a detached, initialised TProductStatusRecord
     */
    public TProductStatusRecord(Long id, Integer productId, Integer managerId, Byte status, Timestamp cdate, Timestamp mdate) {
        super(TProductStatus.T_PRODUCT_STATUS);

        set(0, id);
        set(1, productId);
        set(2, managerId);
        set(3, status);
        set(4, cdate);
        set(5, mdate);
    }
}
