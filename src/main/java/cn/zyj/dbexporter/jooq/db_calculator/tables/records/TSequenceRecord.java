/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_calculator.tables.records;


import cn.zyj.dbexporter.jooq.db_calculator.tables.TSequence;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class TSequenceRecord extends UpdatableRecordImpl<TSequenceRecord> implements Record5<Integer, String, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1143171115;

    /**
     * Setter for <code>db_calculator.t_sequence.id</code>.
     */
    public TSequenceRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_calculator.t_sequence.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_calculator.t_sequence.type_name</code>. 类别名称
     */
    public TSequenceRecord setTypeName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_calculator.t_sequence.type_name</code>. 类别名称
     */
    @Size(max = 100)
    public String getTypeName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_calculator.t_sequence.current_no</code>. 当前序号
     */
    public TSequenceRecord setCurrentNo(Integer value) {
        set(2, value);
        return this;
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
    public TSequenceRecord setCdate(Timestamp value) {
        set(3, value);
        return this;
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
    public TSequenceRecord setMdate(Timestamp value) {
        set(4, value);
        return this;
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
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
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
    public Integer component1() {
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
    public Integer value1() {
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
    public TSequenceRecord value1(Integer value) {
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
    public TSequenceRecord values(Integer value1, String value2, Integer value3, Timestamp value4, Timestamp value5) {
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
    public TSequenceRecord(Integer id, String typeName, Integer currentNo, Timestamp cdate, Timestamp mdate) {
        super(TSequence.T_SEQUENCE);

        set(0, id);
        set(1, typeName);
        set(2, currentNo);
        set(3, cdate);
        set(4, mdate);
    }
}