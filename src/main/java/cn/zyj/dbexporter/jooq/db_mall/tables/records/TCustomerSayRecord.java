/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TCustomerSay;

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
public class TCustomerSayRecord extends UpdatableRecordImpl<TCustomerSayRecord> implements Record9<Integer, String, String, String, String, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1618753609;

    /**
     * Setter for <code>db_mall.t_customer_say.id</code>.
     */
    public TCustomerSayRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_say.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_customer_say.name</code>.
     */
    public TCustomerSayRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_say.name</code>.
     */
    @NotNull
    @Size(max = 300)
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_customer_say.logo</code>.
     */
    public TCustomerSayRecord setLogo(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_say.logo</code>.
     */
    @NotNull
    @Size(max = 255)
    public String getLogo() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_customer_say.description</code>.
     */
    public TCustomerSayRecord setDescription(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_say.description</code>.
     */
    @NotNull
    @Size(max = 1000)
    public String getDescription() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.t_customer_say.products</code>.
     */
    public TCustomerSayRecord setProducts(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_say.products</code>.
     */
    @NotNull
    @Size(max = 500)
    public String getProducts() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_customer_say.content</code>.
     */
    public TCustomerSayRecord setContent(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_say.content</code>.
     */
    @NotNull
    @Size(max = 65535)
    public String getContent() {
        return (String) get(5);
    }

    /**
     * Setter for <code>db_mall.t_customer_say.oid</code>.
     */
    public TCustomerSayRecord setOid(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_say.oid</code>.
     */
    public Integer getOid() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>db_mall.t_customer_say.cdate</code>.
     */
    public TCustomerSayRecord setCdate(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_say.cdate</code>.
     */
    @NotNull
    public Timestamp getCdate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>db_mall.t_customer_say.mdate</code>.
     */
    public TCustomerSayRecord setMdate(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_customer_say.mdate</code>.
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
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, String, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TCustomerSay.T_CUSTOMER_SAY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TCustomerSay.T_CUSTOMER_SAY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TCustomerSay.T_CUSTOMER_SAY.LOGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TCustomerSay.T_CUSTOMER_SAY.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TCustomerSay.T_CUSTOMER_SAY.PRODUCTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TCustomerSay.T_CUSTOMER_SAY.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TCustomerSay.T_CUSTOMER_SAY.OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TCustomerSay.T_CUSTOMER_SAY.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TCustomerSay.T_CUSTOMER_SAY.MDATE;
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
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getProducts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getOid();
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
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getProducts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getOid();
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
    public TCustomerSayRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSayRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSayRecord value3(String value) {
        setLogo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSayRecord value4(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSayRecord value5(String value) {
        setProducts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSayRecord value6(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSayRecord value7(Integer value) {
        setOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSayRecord value8(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSayRecord value9(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerSayRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Integer value7, Timestamp value8, Timestamp value9) {
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
     * Create a detached TCustomerSayRecord
     */
    public TCustomerSayRecord() {
        super(TCustomerSay.T_CUSTOMER_SAY);
    }

    /**
     * Create a detached, initialised TCustomerSayRecord
     */
    public TCustomerSayRecord(Integer id, String name, String logo, String description, String products, String content, Integer oid, Timestamp cdate, Timestamp mdate) {
        super(TCustomerSay.T_CUSTOMER_SAY);

        set(0, id);
        set(1, name);
        set(2, logo);
        set(3, description);
        set(4, products);
        set(5, content);
        set(6, oid);
        set(7, cdate);
        set(8, mdate);
    }
}
