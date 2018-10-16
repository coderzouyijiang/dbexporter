/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_calculator.tables.records;


import cn.zyj.dbexporter.jooq.db_calculator.tables.TSkuRelation;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * sku组合关系表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TSkuRelationRecord extends UpdatableRecordImpl<TSkuRelationRecord> implements Record6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 911596504;

    /**
     * Setter for <code>db_calculator.t_sku_relation.id</code>.
     */
    public TSkuRelationRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_calculator.t_sku_relation.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_calculator.t_sku_relation.group_resource_id</code>. 组合sku ID
     */
    public TSkuRelationRecord setGroupResourceId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_calculator.t_sku_relation.group_resource_id</code>. 组合sku ID
     */
    public Integer getGroupResourceId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_calculator.t_sku_relation.part_resource_id</code>. 子sku ID
     */
    public TSkuRelationRecord setPartResourceId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_calculator.t_sku_relation.part_resource_id</code>. 子sku ID
     */
    public Integer getPartResourceId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_calculator.t_sku_relation.product_type</code>. 产品类型
     */
    public TSkuRelationRecord setProductType(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_calculator.t_sku_relation.product_type</code>. 产品类型
     */
    public Integer getProductType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_calculator.t_sku_relation.cdate</code>.
     */
    public TSkuRelationRecord setCdate(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_calculator.t_sku_relation.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>db_calculator.t_sku_relation.mdate</code>.
     */
    public TSkuRelationRecord setMdate(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_calculator.t_sku_relation.mdate</code>.
     */
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
    public Row6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TSkuRelation.T_SKU_RELATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TSkuRelation.T_SKU_RELATION.GROUP_RESOURCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TSkuRelation.T_SKU_RELATION.PART_RESOURCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TSkuRelation.T_SKU_RELATION.PRODUCT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TSkuRelation.T_SKU_RELATION.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TSkuRelation.T_SKU_RELATION.MDATE;
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
        return getGroupResourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getPartResourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getProductType();
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
        return getGroupResourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPartResourceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getProductType();
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
    public TSkuRelationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSkuRelationRecord value2(Integer value) {
        setGroupResourceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSkuRelationRecord value3(Integer value) {
        setPartResourceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSkuRelationRecord value4(Integer value) {
        setProductType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSkuRelationRecord value5(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSkuRelationRecord value6(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSkuRelationRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached TSkuRelationRecord
     */
    public TSkuRelationRecord() {
        super(TSkuRelation.T_SKU_RELATION);
    }

    /**
     * Create a detached, initialised TSkuRelationRecord
     */
    public TSkuRelationRecord(Integer id, Integer groupResourceId, Integer partResourceId, Integer productType, Timestamp cdate, Timestamp mdate) {
        super(TSkuRelation.T_SKU_RELATION);

        set(0, id);
        set(1, groupResourceId);
        set(2, partResourceId);
        set(3, productType);
        set(4, cdate);
        set(5, mdate);
    }
}
