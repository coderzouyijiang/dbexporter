/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TStatDailyUsers;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class TStatDailyUsersRecord extends UpdatableRecordImpl<TStatDailyUsersRecord> implements Record6<Integer, Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 470223348;

    /**
     * Setter for <code>db_mall.t_stat_daily_users.id</code>.
     */
    public TStatDailyUsersRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_stat_daily_users.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_stat_daily_users.stat_date</code>.
     */
    public TStatDailyUsersRecord setStatDate(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_stat_daily_users.stat_date</code>.
     */
    public Integer getStatDate() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_stat_daily_users.customer_num</code>.
     */
    public TStatDailyUsersRecord setCustomerNum(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_stat_daily_users.customer_num</code>.
     */
    public Integer getCustomerNum() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_stat_daily_users.diff_customer_num</code>.
     */
    public TStatDailyUsersRecord setDiffCustomerNum(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_stat_daily_users.diff_customer_num</code>.
     */
    public Integer getDiffCustomerNum() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_mall.t_stat_daily_users.cdate</code>.
     */
    public TStatDailyUsersRecord setCdate(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_stat_daily_users.cdate</code>.
     */
    @NotNull
    public Timestamp getCdate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>db_mall.t_stat_daily_users.mdate</code>.
     */
    public TStatDailyUsersRecord setMdate(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_stat_daily_users.mdate</code>.
     */
    @NotNull
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
        return TStatDailyUsers.T_STAT_DAILY_USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TStatDailyUsers.T_STAT_DAILY_USERS.STAT_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TStatDailyUsers.T_STAT_DAILY_USERS.CUSTOMER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TStatDailyUsers.T_STAT_DAILY_USERS.DIFF_CUSTOMER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TStatDailyUsers.T_STAT_DAILY_USERS.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TStatDailyUsers.T_STAT_DAILY_USERS.MDATE;
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
        return getStatDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCustomerNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getDiffCustomerNum();
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
        return getStatDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCustomerNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDiffCustomerNum();
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
    public TStatDailyUsersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStatDailyUsersRecord value2(Integer value) {
        setStatDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStatDailyUsersRecord value3(Integer value) {
        setCustomerNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStatDailyUsersRecord value4(Integer value) {
        setDiffCustomerNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStatDailyUsersRecord value5(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStatDailyUsersRecord value6(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TStatDailyUsersRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached TStatDailyUsersRecord
     */
    public TStatDailyUsersRecord() {
        super(TStatDailyUsers.T_STAT_DAILY_USERS);
    }

    /**
     * Create a detached, initialised TStatDailyUsersRecord
     */
    public TStatDailyUsersRecord(Integer id, Integer statDate, Integer customerNum, Integer diffCustomerNum, Timestamp cdate, Timestamp mdate) {
        super(TStatDailyUsers.T_STAT_DAILY_USERS);

        set(0, id);
        set(1, statDate);
        set(2, customerNum);
        set(3, diffCustomerNum);
        set(4, cdate);
        set(5, mdate);
    }
}
