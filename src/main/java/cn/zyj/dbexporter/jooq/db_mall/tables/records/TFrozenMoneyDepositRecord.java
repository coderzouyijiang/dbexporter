/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TFrozenMoneyDeposit;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class TFrozenMoneyDepositRecord extends UpdatableRecordImpl<TFrozenMoneyDepositRecord> implements Record8<Integer, Integer, String, Integer, BigDecimal, Timestamp, Timestamp, BigDecimal> {

    private static final long serialVersionUID = 1825032450;

    /**
     * Setter for <code>db_mall.t_frozen_money_deposit.id</code>.
     */
    public TFrozenMoneyDepositRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_frozen_money_deposit.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_frozen_money_deposit.customer_id</code>.
     */
    public TFrozenMoneyDepositRecord setCustomerId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_frozen_money_deposit.customer_id</code>.
     */
    @NotNull
    public Integer getCustomerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_frozen_money_deposit.op_name</code>.
     */
    public TFrozenMoneyDepositRecord setOpName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_frozen_money_deposit.op_name</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getOpName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_frozen_money_deposit.op_user_id</code>.
     */
    public TFrozenMoneyDepositRecord setOpUserId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_frozen_money_deposit.op_user_id</code>.
     */
    @NotNull
    public Integer getOpUserId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_mall.t_frozen_money_deposit.amount</code>.
     */
    public TFrozenMoneyDepositRecord setAmount(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_frozen_money_deposit.amount</code>.
     */
    @NotNull
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>db_mall.t_frozen_money_deposit.cdate</code>.
     */
    public TFrozenMoneyDepositRecord setCdate(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_frozen_money_deposit.cdate</code>.
     */
    @NotNull
    public Timestamp getCdate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>db_mall.t_frozen_money_deposit.mdate</code>.
     */
    public TFrozenMoneyDepositRecord setMdate(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_frozen_money_deposit.mdate</code>.
     */
    @NotNull
    public Timestamp getMdate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>db_mall.t_frozen_money_deposit.act_amount</code>.
     */
    public TFrozenMoneyDepositRecord setActAmount(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_frozen_money_deposit.act_amount</code>.
     */
    public BigDecimal getActAmount() {
        return (BigDecimal) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, Integer, BigDecimal, Timestamp, Timestamp, BigDecimal> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, Integer, BigDecimal, Timestamp, Timestamp, BigDecimal> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TFrozenMoneyDeposit.T_FROZEN_MONEY_DEPOSIT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TFrozenMoneyDeposit.T_FROZEN_MONEY_DEPOSIT.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TFrozenMoneyDeposit.T_FROZEN_MONEY_DEPOSIT.OP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TFrozenMoneyDeposit.T_FROZEN_MONEY_DEPOSIT.OP_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return TFrozenMoneyDeposit.T_FROZEN_MONEY_DEPOSIT.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TFrozenMoneyDeposit.T_FROZEN_MONEY_DEPOSIT.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TFrozenMoneyDeposit.T_FROZEN_MONEY_DEPOSIT.MDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TFrozenMoneyDeposit.T_FROZEN_MONEY_DEPOSIT.ACT_AMOUNT;
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
        return getOpName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getOpUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getAmount();
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
    public BigDecimal component8() {
        return getActAmount();
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
        return getOpName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getOpUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getAmount();
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
    public BigDecimal value8() {
        return getActAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFrozenMoneyDepositRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFrozenMoneyDepositRecord value2(Integer value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFrozenMoneyDepositRecord value3(String value) {
        setOpName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFrozenMoneyDepositRecord value4(Integer value) {
        setOpUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFrozenMoneyDepositRecord value5(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFrozenMoneyDepositRecord value6(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFrozenMoneyDepositRecord value7(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFrozenMoneyDepositRecord value8(BigDecimal value) {
        setActAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TFrozenMoneyDepositRecord values(Integer value1, Integer value2, String value3, Integer value4, BigDecimal value5, Timestamp value6, Timestamp value7, BigDecimal value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TFrozenMoneyDepositRecord
     */
    public TFrozenMoneyDepositRecord() {
        super(TFrozenMoneyDeposit.T_FROZEN_MONEY_DEPOSIT);
    }

    /**
     * Create a detached, initialised TFrozenMoneyDepositRecord
     */
    public TFrozenMoneyDepositRecord(Integer id, Integer customerId, String opName, Integer opUserId, BigDecimal amount, Timestamp cdate, Timestamp mdate, BigDecimal actAmount) {
        super(TFrozenMoneyDeposit.T_FROZEN_MONEY_DEPOSIT);

        set(0, id);
        set(1, customerId);
        set(2, opName);
        set(3, opUserId);
        set(4, amount);
        set(5, cdate);
        set(6, mdate);
        set(7, actAmount);
    }
}
