/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TQuery;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
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
public class TQueryRecord extends UpdatableRecordImpl<TQueryRecord> implements Record10<Integer, String, String, Integer, Byte, Integer, Timestamp, Timestamp, Integer, Integer> {

    private static final long serialVersionUID = -754065299;

    /**
     * Setter for <code>db_mall.t_query.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_query.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_query.query</code>.
     */
    public void setQuery(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_query.query</code>.
     */
    public String getQuery() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_query.url</code>.
     */
    public void setUrl(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_query.url</code>.
     */
    public String getUrl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_query.oid</code>.
     */
    public void setOid(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_query.oid</code>.
     */
    public Integer getOid() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_mall.t_query.status</code>.
     */
    public void setStatus(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_query.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>db_mall.t_query.manager_id</code>.
     */
    public void setManagerId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_query.manager_id</code>.
     */
    public Integer getManagerId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>db_mall.t_query.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_query.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>db_mall.t_query.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_query.mdate</code>.
     */
    public Timestamp getMdate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>db_mall.t_query.type</code>. 1:搜索热词 2：导航词
     */
    public void setType(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_mall.t_query.type</code>. 1:搜索热词 2：导航词
     */
    public Integer getType() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>db_mall.t_query.target</code>. 1:新窗口打开 0：本页打开
     */
    public void setTarget(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>db_mall.t_query.target</code>. 1:新窗口打开 0：本页打开
     */
    public Integer getTarget() {
        return (Integer) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, Integer, Byte, Integer, Timestamp, Timestamp, Integer, Integer> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, Integer, Byte, Integer, Timestamp, Timestamp, Integer, Integer> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TQuery.T_QUERY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TQuery.T_QUERY.QUERY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TQuery.T_QUERY.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TQuery.T_QUERY.OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return TQuery.T_QUERY.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TQuery.T_QUERY.MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TQuery.T_QUERY.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TQuery.T_QUERY.MDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return TQuery.T_QUERY.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return TQuery.T_QUERY.TARGET;
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
        return getQuery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getTarget();
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
        return getQuery();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getCdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getMdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getTarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQueryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQueryRecord value2(String value) {
        setQuery(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQueryRecord value3(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQueryRecord value4(Integer value) {
        setOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQueryRecord value5(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQueryRecord value6(Integer value) {
        setManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQueryRecord value7(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQueryRecord value8(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQueryRecord value9(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQueryRecord value10(Integer value) {
        setTarget(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQueryRecord values(Integer value1, String value2, String value3, Integer value4, Byte value5, Integer value6, Timestamp value7, Timestamp value8, Integer value9, Integer value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TQueryRecord
     */
    public TQueryRecord() {
        super(TQuery.T_QUERY);
    }

    /**
     * Create a detached, initialised TQueryRecord
     */
    public TQueryRecord(Integer id, String query, String url, Integer oid, Byte status, Integer managerId, Timestamp cdate, Timestamp mdate, Integer type, Integer target) {
        super(TQuery.T_QUERY);

        set(0, id);
        set(1, query);
        set(2, url);
        set(3, oid);
        set(4, status);
        set(5, managerId);
        set(6, cdate);
        set(7, mdate);
        set(8, type);
        set(9, target);
    }
}
