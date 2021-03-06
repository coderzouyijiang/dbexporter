/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TRiskTelId;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class TRiskTelIdRecord extends UpdatableRecordImpl<TRiskTelIdRecord> implements Record3<Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 865761154;

    /**
     * Setter for <code>db_mall.t_risk_tel_id.num</code>. 当前同步到的id
     */
    public TRiskTelIdRecord setNum(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_risk_tel_id.num</code>. 当前同步到的id
     */
    @NotNull
    public Integer getNum() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_risk_tel_id.cdate</code>.
     */
    public TRiskTelIdRecord setCdate(Timestamp value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_risk_tel_id.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>db_mall.t_risk_tel_id.mdate</code>.
     */
    public TRiskTelIdRecord setMdate(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_risk_tel_id.mdate</code>.
     */
    public Timestamp getMdate() {
        return (Timestamp) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Timestamp, Timestamp> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TRiskTelId.T_RISK_TEL_ID.NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return TRiskTelId.T_RISK_TEL_ID.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TRiskTelId.T_RISK_TEL_ID.MDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskTelIdRecord value1(Integer value) {
        setNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskTelIdRecord value2(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskTelIdRecord value3(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskTelIdRecord values(Integer value1, Timestamp value2, Timestamp value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TRiskTelIdRecord
     */
    public TRiskTelIdRecord() {
        super(TRiskTelId.T_RISK_TEL_ID);
    }

    /**
     * Create a detached, initialised TRiskTelIdRecord
     */
    public TRiskTelIdRecord(Integer num, Timestamp cdate, Timestamp mdate) {
        super(TRiskTelId.T_RISK_TEL_ID);

        set(0, num);
        set(1, cdate);
        set(2, mdate);
    }
}
