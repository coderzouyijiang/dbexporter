/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TProductMajorParam;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class TProductMajorParamRecord extends UpdatableRecordImpl<TProductMajorParamRecord> implements Record12<UInteger, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -60284334;

    /**
     * Setter for <code>db_mall.t_product_major_param.product_id</code>. 商品ID
     */
    public void setProductId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_param.product_id</code>. 商品ID
     */
    public UInteger getProductId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>db_mall.t_product_major_param.cpu_model</code>. CPU型号
     */
    public void setCpuModel(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_param.cpu_model</code>. CPU型号
     */
    public String getCpuModel() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_product_major_param.cpu_model_standard</code>. CPU筛选值
     */
    public void setCpuModelStandard(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_param.cpu_model_standard</code>. CPU筛选值
     */
    public String getCpuModelStandard() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_product_major_param.screen_size</code>. 屏幕尺寸
     */
    public void setScreenSize(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_param.screen_size</code>. 屏幕尺寸
     */
    public String getScreenSize() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.t_product_major_param.memory_capacity</code>. 内存容量
     */
    public void setMemoryCapacity(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_param.memory_capacity</code>. 内存容量
     */
    public String getMemoryCapacity() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_product_major_param.disk_capacity</code>. 硬盘容量
     */
    public void setDiskCapacity(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_param.disk_capacity</code>. 硬盘容量
     */
    public String getDiskCapacity() {
        return (String) get(5);
    }

    /**
     * Setter for <code>db_mall.t_product_major_param.disk_type</code>. 硬盘类型
     */
    public void setDiskType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_param.disk_type</code>. 硬盘类型
     */
    public String getDiskType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>db_mall.t_product_major_param.graphics_card_model</code>. 显卡型号
     */
    public void setGraphicsCardModel(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_param.graphics_card_model</code>. 显卡型号
     */
    public String getGraphicsCardModel() {
        return (String) get(7);
    }

    /**
     * Setter for <code>db_mall.t_product_major_param.graphics_card_type</code>. 显卡类型
     */
    public void setGraphicsCardType(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_param.graphics_card_type</code>. 显卡类型
     */
    public String getGraphicsCardType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>db_mall.t_product_major_param.graphics_card_capacity</code>. 显存容量
     */
    public void setGraphicsCardCapacity(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_param.graphics_card_capacity</code>. 显存容量
     */
    public String getGraphicsCardCapacity() {
        return (String) get(9);
    }

    /**
     * Setter for <code>db_mall.t_product_major_param.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_param.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>db_mall.t_product_major_param.modify_time</code>. 修改时间
     */
    public void setModifyTime(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>db_mall.t_product_major_param.modify_time</code>. 修改时间
     */
    public Timestamp getModifyTime() {
        return (Timestamp) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<UInteger, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<UInteger, String, String, String, String, String, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TProductMajorParam.T_PRODUCT_MAJOR_PARAM.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TProductMajorParam.T_PRODUCT_MAJOR_PARAM.CPU_MODEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TProductMajorParam.T_PRODUCT_MAJOR_PARAM.CPU_MODEL_STANDARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TProductMajorParam.T_PRODUCT_MAJOR_PARAM.SCREEN_SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TProductMajorParam.T_PRODUCT_MAJOR_PARAM.MEMORY_CAPACITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TProductMajorParam.T_PRODUCT_MAJOR_PARAM.DISK_CAPACITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TProductMajorParam.T_PRODUCT_MAJOR_PARAM.DISK_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TProductMajorParam.T_PRODUCT_MAJOR_PARAM.GRAPHICS_CARD_MODEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TProductMajorParam.T_PRODUCT_MAJOR_PARAM.GRAPHICS_CARD_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TProductMajorParam.T_PRODUCT_MAJOR_PARAM.GRAPHICS_CARD_CAPACITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return TProductMajorParam.T_PRODUCT_MAJOR_PARAM.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return TProductMajorParam.T_PRODUCT_MAJOR_PARAM.MODIFY_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getCpuModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCpuModelStandard();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getScreenSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getMemoryCapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDiskCapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDiskType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getGraphicsCardModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getGraphicsCardType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getGraphicsCardCapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getModifyTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getCpuModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCpuModelStandard();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getScreenSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMemoryCapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDiskCapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDiskType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getGraphicsCardModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getGraphicsCardType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getGraphicsCardCapacity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getModifyTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorParamRecord value1(UInteger value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorParamRecord value2(String value) {
        setCpuModel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorParamRecord value3(String value) {
        setCpuModelStandard(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorParamRecord value4(String value) {
        setScreenSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorParamRecord value5(String value) {
        setMemoryCapacity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorParamRecord value6(String value) {
        setDiskCapacity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorParamRecord value7(String value) {
        setDiskType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorParamRecord value8(String value) {
        setGraphicsCardModel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorParamRecord value9(String value) {
        setGraphicsCardType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorParamRecord value10(String value) {
        setGraphicsCardCapacity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorParamRecord value11(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorParamRecord value12(Timestamp value) {
        setModifyTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductMajorParamRecord values(UInteger value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, Timestamp value11, Timestamp value12) {
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
     * Create a detached TProductMajorParamRecord
     */
    public TProductMajorParamRecord() {
        super(TProductMajorParam.T_PRODUCT_MAJOR_PARAM);
    }

    /**
     * Create a detached, initialised TProductMajorParamRecord
     */
    public TProductMajorParamRecord(UInteger productId, String cpuModel, String cpuModelStandard, String screenSize, String memoryCapacity, String diskCapacity, String diskType, String graphicsCardModel, String graphicsCardType, String graphicsCardCapacity, Timestamp createTime, Timestamp modifyTime) {
        super(TProductMajorParam.T_PRODUCT_MAJOR_PARAM);

        set(0, productId);
        set(1, cpuModel);
        set(2, cpuModelStandard);
        set(3, screenSize);
        set(4, memoryCapacity);
        set(5, diskCapacity);
        set(6, diskType);
        set(7, graphicsCardModel);
        set(8, graphicsCardType);
        set(9, graphicsCardCapacity);
        set(10, createTime);
        set(11, modifyTime);
    }
}