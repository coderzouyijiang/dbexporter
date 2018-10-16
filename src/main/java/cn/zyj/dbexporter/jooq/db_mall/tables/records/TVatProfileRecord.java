/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TVatProfile;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class TVatProfileRecord extends UpdatableRecordImpl<TVatProfileRecord> implements Record12<Integer, Integer, String, String, String, String, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1092093499;

    /**
     * Setter for <code>db_mall.t_vat_profile.id</code>.
     */
    public TVatProfileRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_vat_profile.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_vat_profile.customer_id</code>.
     */
    public TVatProfileRecord setCustomerId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_vat_profile.customer_id</code>.
     */
    public Integer getCustomerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_vat_profile.company_name</code>.
     */
    public TVatProfileRecord setCompanyName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_vat_profile.company_name</code>.
     */
    @NotNull
    @Size(max = 300)
    public String getCompanyName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_vat_profile.proof_file</code>.
     */
    public TVatProfileRecord setProofFile(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_vat_profile.proof_file</code>.
     */
    @Size(max = 300)
    public String getProofFile() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.t_vat_profile.file</code>.
     */
    public TVatProfileRecord setFile(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_vat_profile.file</code>.
     */
    @Size(max = 300)
    public String getFile() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_vat_profile.taxer_id</code>.
     */
    public TVatProfileRecord setTaxerId(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_vat_profile.taxer_id</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getTaxerId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>db_mall.t_vat_profile.company_address</code>.
     */
    public TVatProfileRecord setCompanyAddress(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_vat_profile.company_address</code>.
     */
    @NotNull
    @Size(max = 300)
    public String getCompanyAddress() {
        return (String) get(6);
    }

    /**
     * Setter for <code>db_mall.t_vat_profile.company_tel</code>.
     */
    public TVatProfileRecord setCompanyTel(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_vat_profile.company_tel</code>.
     */
    @NotNull
    @Size(max = 300)
    public String getCompanyTel() {
        return (String) get(7);
    }

    /**
     * Setter for <code>db_mall.t_vat_profile.company_bank</code>.
     */
    public TVatProfileRecord setCompanyBank(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_vat_profile.company_bank</code>.
     */
    @NotNull
    @Size(max = 300)
    public String getCompanyBank() {
        return (String) get(8);
    }

    /**
     * Setter for <code>db_mall.t_vat_profile.company_account</code>.
     */
    public TVatProfileRecord setCompanyAccount(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_vat_profile.company_account</code>.
     */
    @NotNull
    @Size(max = 300)
    public String getCompanyAccount() {
        return (String) get(9);
    }

    /**
     * Setter for <code>db_mall.t_vat_profile.cdate</code>.
     */
    public TVatProfileRecord setCdate(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_vat_profile.cdate</code>.
     */
    @NotNull
    public Timestamp getCdate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>db_mall.t_vat_profile.mdate</code>.
     */
    public TVatProfileRecord setMdate(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_vat_profile.mdate</code>.
     */
    @NotNull
    public Timestamp getMdate() {
        return (Timestamp) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, String, String, String, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, String, String, String, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TVatProfile.T_VAT_PROFILE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TVatProfile.T_VAT_PROFILE.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TVatProfile.T_VAT_PROFILE.COMPANY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TVatProfile.T_VAT_PROFILE.PROOF_FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TVatProfile.T_VAT_PROFILE.FILE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TVatProfile.T_VAT_PROFILE.TAXER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TVatProfile.T_VAT_PROFILE.COMPANY_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TVatProfile.T_VAT_PROFILE.COMPANY_TEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TVatProfile.T_VAT_PROFILE.COMPANY_BANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TVatProfile.T_VAT_PROFILE.COMPANY_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return TVatProfile.T_VAT_PROFILE.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return TVatProfile.T_VAT_PROFILE.MDATE;
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
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getProofFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTaxerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getCompanyAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCompanyTel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCompanyBank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCompanyAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
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
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProofFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFile();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTaxerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCompanyAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCompanyTel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCompanyBank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCompanyAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVatProfileRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVatProfileRecord value2(Integer value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVatProfileRecord value3(String value) {
        setCompanyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVatProfileRecord value4(String value) {
        setProofFile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVatProfileRecord value5(String value) {
        setFile(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVatProfileRecord value6(String value) {
        setTaxerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVatProfileRecord value7(String value) {
        setCompanyAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVatProfileRecord value8(String value) {
        setCompanyTel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVatProfileRecord value9(String value) {
        setCompanyBank(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVatProfileRecord value10(String value) {
        setCompanyAccount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVatProfileRecord value11(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVatProfileRecord value12(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVatProfileRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, Timestamp value11, Timestamp value12) {
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
     * Create a detached TVatProfileRecord
     */
    public TVatProfileRecord() {
        super(TVatProfile.T_VAT_PROFILE);
    }

    /**
     * Create a detached, initialised TVatProfileRecord
     */
    public TVatProfileRecord(Integer id, Integer customerId, String companyName, String proofFile, String file, String taxerId, String companyAddress, String companyTel, String companyBank, String companyAccount, Timestamp cdate, Timestamp mdate) {
        super(TVatProfile.T_VAT_PROFILE);

        set(0, id);
        set(1, customerId);
        set(2, companyName);
        set(3, proofFile);
        set(4, file);
        set(5, taxerId);
        set(6, companyAddress);
        set(7, companyTel);
        set(8, companyBank);
        set(9, companyAccount);
        set(10, cdate);
        set(11, mdate);
    }
}