/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.AssetsReceiver;

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
public class AssetsReceiverRecord extends UpdatableRecordImpl<AssetsReceiverRecord> implements Record9<Long, Long, String, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 363310993;

    /**
     * Setter for <code>db_mall.assets_receiver.id</code>.
     */
    public AssetsReceiverRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.assets_receiver.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.assets_receiver.customer_id</code>. 用户id/登录客户id
     */
    public AssetsReceiverRecord setCustomerId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.assets_receiver.customer_id</code>. 用户id/登录客户id
     */
    @NotNull
    public Long getCustomerId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>db_mall.assets_receiver.name</code>. 姓名
     */
    public AssetsReceiverRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.assets_receiver.name</code>. 姓名
     */
    @Size(max = 30)
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.assets_receiver.primary_sector</code>. 一级部门
     */
    public AssetsReceiverRecord setPrimarySector(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.assets_receiver.primary_sector</code>. 一级部门
     */
    @Size(max = 50)
    public String getPrimarySector() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.assets_receiver.secondary_sector</code>. 二级部门
     */
    public AssetsReceiverRecord setSecondarySector(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.assets_receiver.secondary_sector</code>. 二级部门
     */
    @Size(max = 50)
    public String getSecondarySector() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.assets_receiver.company_name</code>. 所属公司
     */
    public AssetsReceiverRecord setCompanyName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.assets_receiver.company_name</code>. 所属公司
     */
    @Size(max = 50)
    public String getCompanyName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>db_mall.assets_receiver.office_address</code>. 办公地点
     */
    public AssetsReceiverRecord setOfficeAddress(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.assets_receiver.office_address</code>. 办公地点
     */
    @Size(max = 100)
    public String getOfficeAddress() {
        return (String) get(6);
    }

    /**
     * Setter for <code>db_mall.assets_receiver.cdate</code>.
     */
    public AssetsReceiverRecord setCdate(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.assets_receiver.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>db_mall.assets_receiver.mdate</code>.
     */
    public AssetsReceiverRecord setMdate(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.assets_receiver.mdate</code>.
     */
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
    public Row9<Long, Long, String, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, Long, String, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return AssetsReceiver.ASSETS_RECEIVER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return AssetsReceiver.ASSETS_RECEIVER.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return AssetsReceiver.ASSETS_RECEIVER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return AssetsReceiver.ASSETS_RECEIVER.PRIMARY_SECTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return AssetsReceiver.ASSETS_RECEIVER.SECONDARY_SECTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return AssetsReceiver.ASSETS_RECEIVER.COMPANY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return AssetsReceiver.ASSETS_RECEIVER.OFFICE_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return AssetsReceiver.ASSETS_RECEIVER.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return AssetsReceiver.ASSETS_RECEIVER.MDATE;
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
    public Long component2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPrimarySector();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSecondarySector();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getOfficeAddress();
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
    public Long value2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPrimarySector();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSecondarySector();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getOfficeAddress();
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
    public AssetsReceiverRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssetsReceiverRecord value2(Long value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssetsReceiverRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssetsReceiverRecord value4(String value) {
        setPrimarySector(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssetsReceiverRecord value5(String value) {
        setSecondarySector(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssetsReceiverRecord value6(String value) {
        setCompanyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssetsReceiverRecord value7(String value) {
        setOfficeAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssetsReceiverRecord value8(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssetsReceiverRecord value9(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AssetsReceiverRecord values(Long value1, Long value2, String value3, String value4, String value5, String value6, String value7, Timestamp value8, Timestamp value9) {
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
     * Create a detached AssetsReceiverRecord
     */
    public AssetsReceiverRecord() {
        super(AssetsReceiver.ASSETS_RECEIVER);
    }

    /**
     * Create a detached, initialised AssetsReceiverRecord
     */
    public AssetsReceiverRecord(Long id, Long customerId, String name, String primarySector, String secondarySector, String companyName, String officeAddress, Timestamp cdate, Timestamp mdate) {
        super(AssetsReceiver.ASSETS_RECEIVER);

        set(0, id);
        set(1, customerId);
        set(2, name);
        set(3, primarySector);
        set(4, secondarySector);
        set(5, companyName);
        set(6, officeAddress);
        set(7, cdate);
        set(8, mdate);
    }
}
