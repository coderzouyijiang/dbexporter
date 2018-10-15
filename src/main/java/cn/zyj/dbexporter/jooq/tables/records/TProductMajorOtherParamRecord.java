/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TProductMajorOtherParam;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class TProductMajorOtherParamRecord extends UpdatableRecordImpl<TProductMajorOtherParamRecord> implements Record7<Integer, String, String, String, String, String, String> {

    private static final long serialVersionUID = 482585716;

    /**
     * Setter for <code>db_mall.t_product_major_other_param.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_other_param.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_product_major_other_param.memory_capacity</code>.
     */
    public void setMemoryCapacity(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_other_param.memory_capacity</code>.
     */
    public String getMemoryCapacity() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_product_major_other_param.disk_capacity</code>.
     */
    public void setDiskCapacity(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_other_param.disk_capacity</code>.
     */
    public String getDiskCapacity() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_product_major_other_param.disk_type</code>.
     */
    public void setDiskType(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_other_param.disk_type</code>.
     */
    public String getDiskType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.t_product_major_other_param.graphics_card_model</code>.
     */
    public void setGraphicsCardModel(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_other_param.graphics_card_model</code>.
     */
    public String getGraphicsCardModel() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_product_major_other_param.graphics_card_type</code>.
     */
    public void setGraphicsCardType(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_other_param.graphics_card_type</code>.
     */
    public String getGraphicsCardType() {
        return (String) get(5);
    }

    /**
     * Setter for <code>db_mall.t_product_major_other_param.graphics_card_capacity</code>.
     */
    public void setGraphicsCardCapacity(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_other_param.graphics_card_capacity</code>.
     */
    public String getGraphicsCardCapacity() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TProductMajorOtherParam.T_PRODUCT_MAJOR_OTHER_PARAM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TProductMajorOtherParam.T_PRODUCT_MAJOR_OTHER_PARAM.MEMORY_CAPACITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TProductMajorOtherParam.T_PRODUCT_MAJOR_OTHER_PARAM.DISK_CAPACITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TProductMajorOtherParam.T_PRODUCT_MAJOR_OTHER_PARAM.DISK_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TProductMajorOtherParam.T_PRODUCT_MAJOR_OTHER_PARAM.GRAPHICS_CARD_MODEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TProductMajorOtherParam.T_PRODUCT_MAJOR_OTHER_PARAM.GRAPHICS_CARD_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TProductMajorOtherParam.T_PRODUCT_MAJOR_OTHER_PARAM.GRAPHICS_CARD_CAPACITY;
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
        return getMemoryCapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDiskCapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDiskType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getGraphicsCardModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getGraphicsCardType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getGraphicsCardCapacity();
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
        return getMemoryCapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDiskCapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDiskType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getGraphicsCardModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getGraphicsCardType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getGraphicsCardCapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorOtherParamRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorOtherParamRecord value2(String value) {
        setMemoryCapacity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorOtherParamRecord value3(String value) {
        setDiskCapacity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorOtherParamRecord value4(String value) {
        setDiskType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorOtherParamRecord value5(String value) {
        setGraphicsCardModel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorOtherParamRecord value6(String value) {
        setGraphicsCardType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorOtherParamRecord value7(String value) {
        setGraphicsCardCapacity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorOtherParamRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TProductMajorOtherParamRecord
     */
    public TProductMajorOtherParamRecord() {
        super(TProductMajorOtherParam.T_PRODUCT_MAJOR_OTHER_PARAM);
    }

    /**
     * Create a detached, initialised TProductMajorOtherParamRecord
     */
    public TProductMajorOtherParamRecord(Integer id, String memoryCapacity, String diskCapacity, String diskType, String graphicsCardModel, String graphicsCardType, String graphicsCardCapacity) {
        super(TProductMajorOtherParam.T_PRODUCT_MAJOR_OTHER_PARAM);

        set(0, id);
        set(1, memoryCapacity);
        set(2, diskCapacity);
        set(3, diskType);
        set(4, graphicsCardModel);
        set(5, graphicsCardType);
        set(6, graphicsCardCapacity);
    }
}
