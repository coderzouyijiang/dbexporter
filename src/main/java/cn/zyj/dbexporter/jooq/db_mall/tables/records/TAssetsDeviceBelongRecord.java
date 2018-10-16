/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TAssetsDeviceBelong;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class TAssetsDeviceBelongRecord extends UpdatableRecordImpl<TAssetsDeviceBelongRecord> implements Record9<Long, String, Integer, Integer, String, BigDecimal, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 232381798;

    /**
     * Setter for <code>db_mall.t_assets_device_belong.id</code>.
     */
    public TAssetsDeviceBelongRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_device_belong.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_assets_device_belong.sn</code>.
     */
    public TAssetsDeviceBelongRecord setSn(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_device_belong.sn</code>.
     */
    @Size(max = 50)
    public String getSn() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_assets_device_belong.sku_id</code>.
     */
    public TAssetsDeviceBelongRecord setSkuId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_device_belong.sku_id</code>.
     */
    @NotNull
    public Integer getSkuId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_assets_device_belong.platform_id</code>.
     */
    public TAssetsDeviceBelongRecord setPlatformId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_device_belong.platform_id</code>.
     */
    @NotNull
    public Integer getPlatformId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_mall.t_assets_device_belong.buy_num</code>.
     */
    public TAssetsDeviceBelongRecord setBuyNum(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_device_belong.buy_num</code>.
     */
    @Size(max = 64)
    public String getBuyNum() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_assets_device_belong.market_price</code>.
     */
    public TAssetsDeviceBelongRecord setMarketPrice(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_device_belong.market_price</code>.
     */
    public BigDecimal getMarketPrice() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>db_mall.t_assets_device_belong.status</code>.
     */
    public TAssetsDeviceBelongRecord setStatus(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_device_belong.status</code>.
     */
    public Integer getStatus() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>db_mall.t_assets_device_belong.cdate</code>.
     */
    public TAssetsDeviceBelongRecord setCdate(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_device_belong.cdate</code>.
     */
    @NotNull
    public Timestamp getCdate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>db_mall.t_assets_device_belong.mdate</code>.
     */
    public TAssetsDeviceBelongRecord setMdate(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_device_belong.mdate</code>.
     */
    @NotNull
    public Timestamp getMdate() {
        return (Timestamp) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, Integer, Integer, String, BigDecimal, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, Integer, Integer, String, BigDecimal, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.SN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.SKU_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.PLATFORM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.BUY_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.MARKET_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG.MDATE;
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
        return getSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSkuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getPlatformId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getBuyNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getMarketPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
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
        return getSn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSkuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getPlatformId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBuyNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getMarketPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsDeviceBelongRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsDeviceBelongRecord value2(String value) {
        setSn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsDeviceBelongRecord value3(Integer value) {
        setSkuId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsDeviceBelongRecord value4(Integer value) {
        setPlatformId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsDeviceBelongRecord value5(String value) {
        setBuyNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsDeviceBelongRecord value6(BigDecimal value) {
        setMarketPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsDeviceBelongRecord value7(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsDeviceBelongRecord value8(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsDeviceBelongRecord value9(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsDeviceBelongRecord values(Long value1, String value2, Integer value3, Integer value4, String value5, BigDecimal value6, Integer value7, Timestamp value8, Timestamp value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TAssetsDeviceBelongRecord
     */
    public TAssetsDeviceBelongRecord() {
        super(TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG);
    }

    /**
     * Create a detached, initialised TAssetsDeviceBelongRecord
     */
    public TAssetsDeviceBelongRecord(Long id, String sn, Integer skuId, Integer platformId, String buyNum, BigDecimal marketPrice, Integer status, Timestamp cdate, Timestamp mdate) {
        super(TAssetsDeviceBelong.T_ASSETS_DEVICE_BELONG);

        set(0, id);
        set(1, sn);
        set(2, skuId);
        set(3, platformId);
        set(4, buyNum);
        set(5, marketPrice);
        set(6, status);
        set(7, cdate);
        set(8, mdate);
    }
}