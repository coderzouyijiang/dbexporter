/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TSequence;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


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
public class TSequenceRecord extends UpdatableRecordImpl<TSequenceRecord> implements Record5<UInteger, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1428146320;

    /**
     * Setter for <code>db_calculator.t_sequence.id</code>.
     */
    public void setId(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_calculator.t_sequence.id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>db_calculator.t_sequence.type_name</code>. 类别名称
     */
    public void setTypeName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_calculator.t_sequence.type_name</code>. 类别名称
     */
    public String getTypeName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_calculator.t_sequence.current_no</code>. 当前序号
     */
    public void setCurrentNo(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_calculator.t_sequence.current_no</code>. 当前序号
     */
    public Integer getCurrentNo() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_calculator.t_sequence.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_calculator.t_sequence.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>db_calculator.t_sequence.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_calculator.t_sequence.mdate</code>.
     */
    public Timestamp getMdate() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UInteger, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UInteger, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return TSequence.T_SEQUENCE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TSequence.T_SEQUENCE.TYPE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TSequence.T_SEQUENCE.CURRENT_NO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TSequence.T_SEQUENCE.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TSequence.T_SEQUENCE.MDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCurrentNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCurrentNo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSequenceRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSequenceRecord value2(String value) {
        setTypeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSequenceRecord value3(Integer value) {
        setCurrentNo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSequenceRecord value4(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSequenceRecord value5(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSequenceRecord values(UInteger value1, String value2, Integer value3, Timestamp value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TSequenceRecord
     */
    public TSequenceRecord() {
        super(TSequence.T_SEQUENCE);
    }

    /**
     * Create a detached, initialised TSequenceRecord
     */
    public TSequenceRecord(UInteger id, String typeName, Integer currentNo, Timestamp cdate, Timestamp mdate) {
        super(TSequence.T_SEQUENCE);

        set(0, id);
        set(1, typeName);
        set(2, currentNo);
        set(3, cdate);
        set(4, mdate);
    }
}
