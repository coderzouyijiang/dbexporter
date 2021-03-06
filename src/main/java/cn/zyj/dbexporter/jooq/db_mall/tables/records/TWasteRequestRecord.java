/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TWasteRequest;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class TWasteRequestRecord extends UpdatableRecordImpl<TWasteRequestRecord> implements Record7<Integer, Integer, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -261740154;

    /**
     * Setter for <code>db_mall.t_waste_request.id</code>.
     */
    public TWasteRequestRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_waste_request.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_waste_request.customer_id</code>.
     */
    public TWasteRequestRecord setCustomerId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_waste_request.customer_id</code>.
     */
    public Integer getCustomerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_waste_request.name</code>.
     */
    public TWasteRequestRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_waste_request.name</code>.
     */
    @NotNull
    @Size(max = 20)
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_waste_request.company_name</code>.
     */
    public TWasteRequestRecord setCompanyName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_waste_request.company_name</code>.
     */
    @NotNull
    @Size(max = 300)
    public String getCompanyName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.t_waste_request.tel</code>.
     */
    public TWasteRequestRecord setTel(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_waste_request.tel</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getTel() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_waste_request.cdate</code>.
     */
    public TWasteRequestRecord setCdate(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_waste_request.cdate</code>.
     */
    @NotNull
    public Timestamp getCdate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>db_mall.t_waste_request.mdate</code>.
     */
    public TWasteRequestRecord setMdate(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_waste_request.mdate</code>.
     */
    @NotNull
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
    public Row7<Integer, Integer, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TWasteRequest.T_WASTE_REQUEST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TWasteRequest.T_WASTE_REQUEST.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TWasteRequest.T_WASTE_REQUEST.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TWasteRequest.T_WASTE_REQUEST.COMPANY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TWasteRequest.T_WASTE_REQUEST.TEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TWasteRequest.T_WASTE_REQUEST.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TWasteRequest.T_WASTE_REQUEST.MDATE;
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
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTel();
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
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTel();
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
    public TWasteRequestRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TWasteRequestRecord value2(Integer value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TWasteRequestRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TWasteRequestRecord value4(String value) {
        setCompanyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TWasteRequestRecord value5(String value) {
        setTel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TWasteRequestRecord value6(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TWasteRequestRecord value7(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TWasteRequestRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Timestamp value6, Timestamp value7) {
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
     * Create a detached TWasteRequestRecord
     */
    public TWasteRequestRecord() {
        super(TWasteRequest.T_WASTE_REQUEST);
    }

    /**
     * Create a detached, initialised TWasteRequestRecord
     */
    public TWasteRequestRecord(Integer id, Integer customerId, String name, String companyName, String tel, Timestamp cdate, Timestamp mdate) {
        super(TWasteRequest.T_WASTE_REQUEST);

        set(0, id);
        set(1, customerId);
        set(2, name);
        set(3, companyName);
        set(4, tel);
        set(5, cdate);
        set(6, mdate);
    }
}
