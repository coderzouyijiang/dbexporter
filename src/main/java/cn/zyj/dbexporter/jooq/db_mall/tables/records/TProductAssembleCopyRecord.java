/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TProductAssembleCopy;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class TProductAssembleCopyRecord extends UpdatableRecordImpl<TProductAssembleCopyRecord> implements Record8<Long, String, Integer, Integer, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 918900267;

    /**
     * Setter for <code>db_mall.t_product_assemble_copy.id</code>.
     */
    public TProductAssembleCopyRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_assemble_copy.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_product_assemble_copy.title</code>.
     */
    public TProductAssembleCopyRecord setTitle(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_assemble_copy.title</code>.
     */
    @NotNull
    @Size(max = 300)
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_product_assemble_copy.category_id</code>.
     */
    public TProductAssembleCopyRecord setCategoryId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_assemble_copy.category_id</code>.
     */
    public Integer getCategoryId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_product_assemble_copy.brand_id</code>.
     */
    public TProductAssembleCopyRecord setBrandId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_assemble_copy.brand_id</code>.
     */
    public Integer getBrandId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_mall.t_product_assemble_copy.product_ids</code>.
     */
    public TProductAssembleCopyRecord setProductIds(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_assemble_copy.product_ids</code>.
     */
    @NotNull
    @Size(max = 1000)
    public String getProductIds() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_product_assemble_copy.status</code>.
     */
    public TProductAssembleCopyRecord setStatus(Byte value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_assemble_copy.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>db_mall.t_product_assemble_copy.cdate</code>.
     */
    public TProductAssembleCopyRecord setCdate(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_assemble_copy.cdate</code>.
     */
    @NotNull
    public Timestamp getCdate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>db_mall.t_product_assemble_copy.mdate</code>.
     */
    public TProductAssembleCopyRecord setMdate(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_product_assemble_copy.mdate</code>.
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
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Integer, Integer, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Integer, Integer, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TProductAssembleCopy.T_PRODUCT_ASSEMBLE_COPY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TProductAssembleCopy.T_PRODUCT_ASSEMBLE_COPY.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TProductAssembleCopy.T_PRODUCT_ASSEMBLE_COPY.CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TProductAssembleCopy.T_PRODUCT_ASSEMBLE_COPY.BRAND_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TProductAssembleCopy.T_PRODUCT_ASSEMBLE_COPY.PRODUCT_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TProductAssembleCopy.T_PRODUCT_ASSEMBLE_COPY.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TProductAssembleCopy.T_PRODUCT_ASSEMBLE_COPY.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TProductAssembleCopy.T_PRODUCT_ASSEMBLE_COPY.MDATE;
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
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getBrandId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getProductIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getStatus();
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
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getBrandId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getProductIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getStatus();
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
    public TProductAssembleCopyRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductAssembleCopyRecord value2(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductAssembleCopyRecord value3(Integer value) {
        setCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductAssembleCopyRecord value4(Integer value) {
        setBrandId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductAssembleCopyRecord value5(String value) {
        setProductIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductAssembleCopyRecord value6(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductAssembleCopyRecord value7(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductAssembleCopyRecord value8(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductAssembleCopyRecord values(Long value1, String value2, Integer value3, Integer value4, String value5, Byte value6, Timestamp value7, Timestamp value8) {
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
     * Create a detached TProductAssembleCopyRecord
     */
    public TProductAssembleCopyRecord() {
        super(TProductAssembleCopy.T_PRODUCT_ASSEMBLE_COPY);
    }

    /**
     * Create a detached, initialised TProductAssembleCopyRecord
     */
    public TProductAssembleCopyRecord(Long id, String title, Integer categoryId, Integer brandId, String productIds, Byte status, Timestamp cdate, Timestamp mdate) {
        super(TProductAssembleCopy.T_PRODUCT_ASSEMBLE_COPY);

        set(0, id);
        set(1, title);
        set(2, categoryId);
        set(3, brandId);
        set(4, productIds);
        set(5, status);
        set(6, cdate);
        set(7, mdate);
    }
}