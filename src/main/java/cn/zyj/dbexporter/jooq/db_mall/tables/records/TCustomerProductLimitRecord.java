/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCustomerProductLimit;

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
public class TCustomerProductLimitRecord extends UpdatableRecordImpl<TCustomerProductLimitRecord> implements Record6<Integer, Integer, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 892781966;

    /**
     * Setter for <code>db_mall.t_customer_product_limit.id</code>.
     */
    public TCustomerProductLimitRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_product_limit.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_customer_product_limit.customer_id</code>.
     */
    public TCustomerProductLimitRecord setCustomerId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_product_limit.customer_id</code>.
     */
    @NotNull
    public Integer getCustomerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_customer_product_limit.product_id</code>.
     */
    public TCustomerProductLimitRecord setProductId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_product_limit.product_id</code>.
     */
    @NotNull
    public Integer getProductId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_customer_product_limit.status</code>.
     */
    public TCustomerProductLimitRecord setStatus(Byte value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_product_limit.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>db_mall.t_customer_product_limit.cdate</code>.
     */
    public TCustomerProductLimitRecord setCdate(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_product_limit.cdate</code>.
     */
    @NotNull
    public Timestamp getCdate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>db_mall.t_customer_product_limit.mdate</code>.
     */
    public TCustomerProductLimitRecord setMdate(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_product_limit.mdate</code>.
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
    public Row6<Integer, Integer, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TCustomerProductLimit.T_CUSTOMER_PRODUCT_LIMIT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TCustomerProductLimit.T_CUSTOMER_PRODUCT_LIMIT.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TCustomerProductLimit.T_CUSTOMER_PRODUCT_LIMIT.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TCustomerProductLimit.T_CUSTOMER_PRODUCT_LIMIT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TCustomerProductLimit.T_CUSTOMER_PRODUCT_LIMIT.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TCustomerProductLimit.T_CUSTOMER_PRODUCT_LIMIT.MDATE;
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
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getProductId();
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
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getProductId();
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
    public TCustomerProductLimitRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerProductLimitRecord value2(Integer value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerProductLimitRecord value3(Integer value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerProductLimitRecord value4(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerProductLimitRecord value5(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerProductLimitRecord value6(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerProductLimitRecord values(Integer value1, Integer value2, Integer value3, Byte value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached TCustomerProductLimitRecord
     */
    public TCustomerProductLimitRecord() {
        super(TCustomerProductLimit.T_CUSTOMER_PRODUCT_LIMIT);
    }

    /**
     * Create a detached, initialised TCustomerProductLimitRecord
     */
    public TCustomerProductLimitRecord(Integer id, Integer customerId, Integer productId, Byte status, Timestamp cdate, Timestamp mdate) {
        super(TCustomerProductLimit.T_CUSTOMER_PRODUCT_LIMIT);

        set(0, id);
        set(1, customerId);
        set(2, productId);
        set(3, status);
        set(4, cdate);
        set(5, mdate);
    }
}