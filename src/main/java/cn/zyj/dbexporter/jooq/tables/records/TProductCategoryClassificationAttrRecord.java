/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TProductCategoryClassificationAttr;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


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
public class TProductCategoryClassificationAttrRecord extends UpdatableRecordImpl<TProductCategoryClassificationAttrRecord> implements Record7<ULong, Integer, Long, Byte, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -629779222;

    /**
     * Setter for <code>db_mall.t_product_category_classification_attr.id</code>. 自增主键
     */
    public void setId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_product_category_classification_attr.id</code>. 自增主键
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>db_mall.t_product_category_classification_attr.attr_type</code>. 1 cpu, 2 屏幕尺寸
     */
    public void setAttrType(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_product_category_classification_attr.attr_type</code>. 1 cpu, 2 屏幕尺寸
     */
    public Integer getAttrType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_product_category_classification_attr.cate_id</code>. 对应category_id
     */
    public void setCateId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_product_category_classification_attr.cate_id</code>. 对应category_id
     */
    public Long getCateId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>db_mall.t_product_category_classification_attr.status</code>. 0无效， 1启用
     */
    public void setStatus(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_product_category_classification_attr.status</code>. 0无效， 1启用
     */
    public Byte getStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>db_mall.t_product_category_classification_attr.name</code>. 分类属性名
     */
    public void setName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_product_category_classification_attr.name</code>. 分类属性名
     */
    public String getName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_product_category_classification_attr.cdate</code>. 创建时间
     */
    public void setCdate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_product_category_classification_attr.cdate</code>. 创建时间
     */
    public Timestamp getCdate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>db_mall.t_product_category_classification_attr.mdate</code>. 修改时间
     */
    public void setMdate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_product_category_classification_attr.mdate</code>. 修改时间
     */
    public Timestamp getMdate() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<ULong, Integer, Long, Byte, String, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<ULong, Integer, Long, Byte, String, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<ULong> field1() {
        return TProductCategoryClassificationAttr.T_PRODUCT_CATEGORY_CLASSIFICATION_ATTR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TProductCategoryClassificationAttr.T_PRODUCT_CATEGORY_CLASSIFICATION_ATTR.ATTR_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return TProductCategoryClassificationAttr.T_PRODUCT_CATEGORY_CLASSIFICATION_ATTR.CATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TProductCategoryClassificationAttr.T_PRODUCT_CATEGORY_CLASSIFICATION_ATTR.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TProductCategoryClassificationAttr.T_PRODUCT_CATEGORY_CLASSIFICATION_ATTR.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TProductCategoryClassificationAttr.T_PRODUCT_CATEGORY_CLASSIFICATION_ATTR.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TProductCategoryClassificationAttr.T_PRODUCT_CATEGORY_CLASSIFICATION_ATTR.MDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getAttrType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getCateId();
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
    public String component5() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ULong value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAttrType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getCateId();
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
    public String value5() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductCategoryClassificationAttrRecord value1(ULong value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductCategoryClassificationAttrRecord value2(Integer value) {
        setAttrType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductCategoryClassificationAttrRecord value3(Long value) {
        setCateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductCategoryClassificationAttrRecord value4(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductCategoryClassificationAttrRecord value5(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductCategoryClassificationAttrRecord value6(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductCategoryClassificationAttrRecord value7(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductCategoryClassificationAttrRecord values(ULong value1, Integer value2, Long value3, Byte value4, String value5, Timestamp value6, Timestamp value7) {
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
     * Create a detached TProductCategoryClassificationAttrRecord
     */
    public TProductCategoryClassificationAttrRecord() {
        super(TProductCategoryClassificationAttr.T_PRODUCT_CATEGORY_CLASSIFICATION_ATTR);
    }

    /**
     * Create a detached, initialised TProductCategoryClassificationAttrRecord
     */
    public TProductCategoryClassificationAttrRecord(ULong id, Integer attrType, Long cateId, Byte status, String name, Timestamp cdate, Timestamp mdate) {
        super(TProductCategoryClassificationAttr.T_PRODUCT_CATEGORY_CLASSIFICATION_ATTR);

        set(0, id);
        set(1, attrType);
        set(2, cateId);
        set(3, status);
        set(4, name);
        set(5, cdate);
        set(6, mdate);
    }
}
