/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TIndexFloorCopy;

import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class TIndexFloorCopyRecord extends UpdatableRecordImpl<TIndexFloorCopyRecord> implements Record6<Integer, String, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -1340603121;

    /**
     * Setter for <code>db_mall.t_index_floor_copy.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_index_floor_copy.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_index_floor_copy.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_index_floor_copy.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_index_floor_copy.oid</code>.
     */
    public void setOid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_index_floor_copy.oid</code>.
     */
    public Integer getOid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>db_mall.t_index_floor_copy.status</code>.
     */
    public void setStatus(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_index_floor_copy.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>db_mall.t_index_floor_copy.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_index_floor_copy.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>db_mall.t_index_floor_copy.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_index_floor_copy.mdate</code>.
     */
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
    public Row6<Integer, String, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TIndexFloorCopy.T_INDEX_FLOOR_COPY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TIndexFloorCopy.T_INDEX_FLOOR_COPY.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TIndexFloorCopy.T_INDEX_FLOOR_COPY.OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TIndexFloorCopy.T_INDEX_FLOOR_COPY.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TIndexFloorCopy.T_INDEX_FLOOR_COPY.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TIndexFloorCopy.T_INDEX_FLOOR_COPY.MDATE;
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
        return getOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getStatus();
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
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getStatus();
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
    public TIndexFloorCopyRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TIndexFloorCopyRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TIndexFloorCopyRecord value3(Integer value) {
        setOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TIndexFloorCopyRecord value4(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TIndexFloorCopyRecord value5(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TIndexFloorCopyRecord value6(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TIndexFloorCopyRecord values(Integer value1, String value2, Integer value3, Byte value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached TIndexFloorCopyRecord
     */
    public TIndexFloorCopyRecord() {
        super(TIndexFloorCopy.T_INDEX_FLOOR_COPY);
    }

    /**
     * Create a detached, initialised TIndexFloorCopyRecord
     */
    public TIndexFloorCopyRecord(Integer id, String name, Integer oid, Byte status, Timestamp cdate, Timestamp mdate) {
        super(TIndexFloorCopy.T_INDEX_FLOOR_COPY);

        set(0, id);
        set(1, name);
        set(2, oid);
        set(3, status);
        set(4, cdate);
        set(5, mdate);
    }
}
