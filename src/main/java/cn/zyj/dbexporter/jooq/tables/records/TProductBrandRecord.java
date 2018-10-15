/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TProductBrand;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 商品品牌表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TProductBrandRecord extends UpdatableRecordImpl<TProductBrandRecord> implements Record10<Integer, Byte, Byte, String, String, Integer, String, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1547383234;

    /**
     * Setter for <code>db_mall.t_product_brand.id</code>. 品牌标识
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_product_brand.id</code>. 品牌标识
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_product_brand.status</code>. 品牌状态(0:禁用;1:启用)
     */
    public void setStatus(Byte value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_product_brand.status</code>. 品牌状态(0:禁用;1:启用)
     */
    public Byte getStatus() {
        return (Byte) get(1);
    }

    /**
     * Setter for <code>db_mall.t_product_brand.is_delete</code>. 是否删除
     */
    public void setIsDelete(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_product_brand.is_delete</code>. 是否删除
     */
    public Byte getIsDelete() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>db_mall.t_product_brand.name</code>. 品牌名称 商城个性化名字
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_product_brand.name</code>. 品牌名称 商城个性化名字
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.t_product_brand.show_name</code>. 显示名称 和erp一致
     */
    public void setShowName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_product_brand.show_name</code>. 显示名称 和erp一致
     */
    public String getShowName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_product_brand.oid</code>. 排序：越小越靠前
     */
    public void setOid(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_product_brand.oid</code>. 排序：越小越靠前
     */
    public Integer getOid() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>db_mall.t_product_brand.logo</code>. logo路径
     */
    public void setLogo(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_product_brand.logo</code>. logo路径
     */
    public String getLogo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>db_mall.t_product_brand.sync_status</code>. 0:未处理 1：已处理【进搜索】
     */
    public void setSyncStatus(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_product_brand.sync_status</code>. 0:未处理 1：已处理【进搜索】
     */
    public Byte getSyncStatus() {
        return (Byte) get(7);
    }

    /**
     * Setter for <code>db_mall.t_product_brand.cdate</code>. 创建时间
     */
    public void setCdate(Timestamp value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_mall.t_product_brand.cdate</code>. 创建时间
     */
    public Timestamp getCdate() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>db_mall.t_product_brand.mdate</code>. 修改时间
     */
    public void setMdate(Timestamp value) {
        set(9, value);
    }

    /**
     * Getter for <code>db_mall.t_product_brand.mdate</code>. 修改时间
     */
    public Timestamp getMdate() {
        return (Timestamp) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Byte, Byte, String, String, Integer, String, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Byte, Byte, String, String, Integer, String, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TProductBrand.T_PRODUCT_BRAND.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field2() {
        return TProductBrand.T_PRODUCT_BRAND.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return TProductBrand.T_PRODUCT_BRAND.IS_DELETE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TProductBrand.T_PRODUCT_BRAND.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TProductBrand.T_PRODUCT_BRAND.SHOW_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TProductBrand.T_PRODUCT_BRAND.OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TProductBrand.T_PRODUCT_BRAND.LOGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return TProductBrand.T_PRODUCT_BRAND.SYNC_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TProductBrand.T_PRODUCT_BRAND.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return TProductBrand.T_PRODUCT_BRAND.MDATE;
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
    public Byte component2() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getShowName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component8() {
        return getSyncStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
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
    public Byte value2() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getIsDelete();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getShowName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getSyncStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductBrandRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductBrandRecord value2(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductBrandRecord value3(Byte value) {
        setIsDelete(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductBrandRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductBrandRecord value5(String value) {
        setShowName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductBrandRecord value6(Integer value) {
        setOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductBrandRecord value7(String value) {
        setLogo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductBrandRecord value8(Byte value) {
        setSyncStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductBrandRecord value9(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductBrandRecord value10(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TProductBrandRecord values(Integer value1, Byte value2, Byte value3, String value4, String value5, Integer value6, String value7, Byte value8, Timestamp value9, Timestamp value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TProductBrandRecord
     */
    public TProductBrandRecord() {
        super(TProductBrand.T_PRODUCT_BRAND);
    }

    /**
     * Create a detached, initialised TProductBrandRecord
     */
    public TProductBrandRecord(Integer id, Byte status, Byte isDelete, String name, String showName, Integer oid, String logo, Byte syncStatus, Timestamp cdate, Timestamp mdate) {
        super(TProductBrand.T_PRODUCT_BRAND);

        set(0, id);
        set(1, status);
        set(2, isDelete);
        set(3, name);
        set(4, showName);
        set(5, oid);
        set(6, logo);
        set(7, syncStatus);
        set(8, cdate);
        set(9, mdate);
    }
}
