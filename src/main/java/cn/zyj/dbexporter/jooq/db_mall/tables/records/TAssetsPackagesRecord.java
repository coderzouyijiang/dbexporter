/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TAssetsPackages;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
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
public class TAssetsPackagesRecord extends UpdatableRecordImpl<TAssetsPackagesRecord> implements Record21<Integer, String, Integer, Integer, String, BigDecimal, BigDecimal, Integer, Date, BigDecimal, Integer, Date, BigDecimal, Integer, Integer, BigDecimal, Integer, Byte, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1603168938;

    /**
     * Setter for <code>db_mall.t_assets_packages.id</code>.
     */
    public TAssetsPackagesRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.name</code>.
     */
    public TAssetsPackagesRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.name</code>.
     */
    @Size(max = 255)
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.platform_id</code>.
     */
    public TAssetsPackagesRecord setPlatformId(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.platform_id</code>.
     */
    public Integer getPlatformId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.type_id</code>.
     */
    public TAssetsPackagesRecord setTypeId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.type_id</code>.
     */
    public Integer getTypeId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.sell_money</code>.
     */
    public TAssetsPackagesRecord setSellMoney(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.sell_money</code>.
     */
    @Size(max = 500)
    public String getSellMoney() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.fee</code>.
     */
    public TAssetsPackagesRecord setFee(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.fee</code>.
     */
    public BigDecimal getFee() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.interest</code>.
     */
    public TAssetsPackagesRecord setInterest(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.interest</code>.
     */
    public BigDecimal getInterest() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.repayment_date</code>.
     */
    public TAssetsPackagesRecord setRepaymentDate(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.repayment_date</code>.
     */
    public Integer getRepaymentDate() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.self_repayment_date</code>.
     */
    public TAssetsPackagesRecord setSelfRepaymentDate(Date value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.self_repayment_date</code>.
     */
    public Date getSelfRepaymentDate() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.repayment_amount</code>.
     */
    public TAssetsPackagesRecord setRepaymentAmount(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.repayment_amount</code>.
     */
    public BigDecimal getRepaymentAmount() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.month</code>.
     */
    public TAssetsPackagesRecord setMonth(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.month</code>.
     */
    public Integer getMonth() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.give_money_date</code>.
     */
    public TAssetsPackagesRecord setGiveMoneyDate(Date value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.give_money_date</code>.
     */
    public Date getGiveMoneyDate() {
        return (Date) get(11);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.hand_money</code>.
     */
    public TAssetsPackagesRecord setHandMoney(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.hand_money</code>.
     */
    @NotNull
    public BigDecimal getHandMoney() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.company_num</code>.
     */
    public TAssetsPackagesRecord setCompanyNum(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.company_num</code>.
     */
    public Integer getCompanyNum() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.device_num</code>.
     */
    public TAssetsPackagesRecord setDeviceNum(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.device_num</code>.
     */
    public Integer getDeviceNum() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.deposit</code>.
     */
    public TAssetsPackagesRecord setDeposit(BigDecimal value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.deposit</code>.
     */
    public BigDecimal getDeposit() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.manager_id</code>.
     */
    public TAssetsPackagesRecord setManagerId(Integer value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.manager_id</code>.
     */
    public Integer getManagerId() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.status</code>.
     */
    public TAssetsPackagesRecord setStatus(Byte value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(17);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.buy_num</code>.
     */
    public TAssetsPackagesRecord setBuyNum(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.buy_num</code>.
     */
    @Size(max = 64)
    public String getBuyNum() {
        return (String) get(18);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.cdate</code>.
     */
    public TAssetsPackagesRecord setCdate(Timestamp value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.cdate</code>.
     */
    @NotNull
    public Timestamp getCdate() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>db_mall.t_assets_packages.mdate</code>.
     */
    public TAssetsPackagesRecord setMdate(Timestamp value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_assets_packages.mdate</code>.
     */
    @NotNull
    public Timestamp getMdate() {
        return (Timestamp) get(20);
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
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, String, Integer, Integer, String, BigDecimal, BigDecimal, Integer, Date, BigDecimal, Integer, Date, BigDecimal, Integer, Integer, BigDecimal, Integer, Byte, String, Timestamp, Timestamp> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Integer, String, Integer, Integer, String, BigDecimal, BigDecimal, Integer, Date, BigDecimal, Integer, Date, BigDecimal, Integer, Integer, BigDecimal, Integer, Byte, String, Timestamp, Timestamp> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TAssetsPackages.T_ASSETS_PACKAGES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TAssetsPackages.T_ASSETS_PACKAGES.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TAssetsPackages.T_ASSETS_PACKAGES.PLATFORM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TAssetsPackages.T_ASSETS_PACKAGES.TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TAssetsPackages.T_ASSETS_PACKAGES.SELL_MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return TAssetsPackages.T_ASSETS_PACKAGES.FEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return TAssetsPackages.T_ASSETS_PACKAGES.INTEREST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return TAssetsPackages.T_ASSETS_PACKAGES.REPAYMENT_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return TAssetsPackages.T_ASSETS_PACKAGES.SELF_REPAYMENT_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return TAssetsPackages.T_ASSETS_PACKAGES.REPAYMENT_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return TAssetsPackages.T_ASSETS_PACKAGES.MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field12() {
        return TAssetsPackages.T_ASSETS_PACKAGES.GIVE_MONEY_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field13() {
        return TAssetsPackages.T_ASSETS_PACKAGES.HAND_MONEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return TAssetsPackages.T_ASSETS_PACKAGES.COMPANY_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return TAssetsPackages.T_ASSETS_PACKAGES.DEVICE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field16() {
        return TAssetsPackages.T_ASSETS_PACKAGES.DEPOSIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return TAssetsPackages.T_ASSETS_PACKAGES.MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field18() {
        return TAssetsPackages.T_ASSETS_PACKAGES.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return TAssetsPackages.T_ASSETS_PACKAGES.BUY_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field20() {
        return TAssetsPackages.T_ASSETS_PACKAGES.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field21() {
        return TAssetsPackages.T_ASSETS_PACKAGES.MDATE;
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
    public Integer component3() {
        return getPlatformId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getSellMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getInterest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getRepaymentDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component9() {
        return getSelfRepaymentDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getRepaymentAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component12() {
        return getGiveMoneyDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component13() {
        return getHandMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getCompanyNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getDeviceNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component16() {
        return getDeposit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component17() {
        return getManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component18() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component19() {
        return getBuyNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component20() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component21() {
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
    public Integer value3() {
        return getPlatformId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getSellMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getInterest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getRepaymentDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value9() {
        return getSelfRepaymentDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getRepaymentAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value12() {
        return getGiveMoneyDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value13() {
        return getHandMoney();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getCompanyNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getDeviceNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value16() {
        return getDeposit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value18() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getBuyNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value20() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value21() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value3(Integer value) {
        setPlatformId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value4(Integer value) {
        setTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value5(String value) {
        setSellMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value6(BigDecimal value) {
        setFee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value7(BigDecimal value) {
        setInterest(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value8(Integer value) {
        setRepaymentDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value9(Date value) {
        setSelfRepaymentDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value10(BigDecimal value) {
        setRepaymentAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value11(Integer value) {
        setMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value12(Date value) {
        setGiveMoneyDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value13(BigDecimal value) {
        setHandMoney(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value14(Integer value) {
        setCompanyNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value15(Integer value) {
        setDeviceNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value16(BigDecimal value) {
        setDeposit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value17(Integer value) {
        setManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value18(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value19(String value) {
        setBuyNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value20(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord value21(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAssetsPackagesRecord values(Integer value1, String value2, Integer value3, Integer value4, String value5, BigDecimal value6, BigDecimal value7, Integer value8, Date value9, BigDecimal value10, Integer value11, Date value12, BigDecimal value13, Integer value14, Integer value15, BigDecimal value16, Integer value17, Byte value18, String value19, Timestamp value20, Timestamp value21) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TAssetsPackagesRecord
     */
    public TAssetsPackagesRecord() {
        super(TAssetsPackages.T_ASSETS_PACKAGES);
    }

    /**
     * Create a detached, initialised TAssetsPackagesRecord
     */
    public TAssetsPackagesRecord(Integer id, String name, Integer platformId, Integer typeId, String sellMoney, BigDecimal fee, BigDecimal interest, Integer repaymentDate, Date selfRepaymentDate, BigDecimal repaymentAmount, Integer month, Date giveMoneyDate, BigDecimal handMoney, Integer companyNum, Integer deviceNum, BigDecimal deposit, Integer managerId, Byte status, String buyNum, Timestamp cdate, Timestamp mdate) {
        super(TAssetsPackages.T_ASSETS_PACKAGES);

        set(0, id);
        set(1, name);
        set(2, platformId);
        set(3, typeId);
        set(4, sellMoney);
        set(5, fee);
        set(6, interest);
        set(7, repaymentDate);
        set(8, selfRepaymentDate);
        set(9, repaymentAmount);
        set(10, month);
        set(11, giveMoneyDate);
        set(12, handMoney);
        set(13, companyNum);
        set(14, deviceNum);
        set(15, deposit);
        set(16, managerId);
        set(17, status);
        set(18, buyNum);
        set(19, cdate);
        set(20, mdate);
    }
}