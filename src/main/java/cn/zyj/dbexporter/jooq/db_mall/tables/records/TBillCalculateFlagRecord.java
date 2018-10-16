/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TBillCalculateFlag;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class TBillCalculateFlagRecord extends TableRecordImpl<TBillCalculateFlagRecord> implements Record2<String, Long> {

    private static final long serialVersionUID = -1303011405;

    /**
     * Setter for <code>db_mall.t_bill_calculate_flag.type</code>.
     */
    public TBillCalculateFlagRecord setType(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_bill_calculate_flag.type</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getType() {
        return (String) get(0);
    }

    /**
     * Setter for <code>db_mall.t_bill_calculate_flag.num</code>.
     */
    public TBillCalculateFlagRecord setNum(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_bill_calculate_flag.num</code>.
     */
    @NotNull
    public Long getNum() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TBillCalculateFlag.T_BILL_CALCULATE_FLAG.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TBillCalculateFlag.T_BILL_CALCULATE_FLAG.NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBillCalculateFlagRecord value1(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBillCalculateFlagRecord value2(Long value) {
        setNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBillCalculateFlagRecord values(String value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TBillCalculateFlagRecord
     */
    public TBillCalculateFlagRecord() {
        super(TBillCalculateFlag.T_BILL_CALCULATE_FLAG);
    }

    /**
     * Create a detached, initialised TBillCalculateFlagRecord
     */
    public TBillCalculateFlagRecord(String type, Long num) {
        super(TBillCalculateFlag.T_BILL_CALCULATE_FLAG);

        set(0, type);
        set(1, num);
    }
}