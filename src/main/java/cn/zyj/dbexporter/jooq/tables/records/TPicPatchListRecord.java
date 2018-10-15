/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TPicPatchList;

import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class TPicPatchListRecord extends UpdatableRecordImpl<TPicPatchListRecord> implements Record12<Long, Integer, Byte, Byte, String, Long, String, String, Byte, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 959574810;

    /**
     * Setter for <code>db_mall.t_pic_patch_list.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_pic_patch_list.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>db_mall.t_pic_patch_list.manager_id</code>.
     */
    public void setManagerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_pic_patch_list.manager_id</code>.
     */
    public Integer getManagerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_pic_patch_list.status</code>.
     */
    public void setStatus(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_pic_patch_list.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>db_mall.t_pic_patch_list.do_status</code>.
     */
    public void setDoStatus(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_pic_patch_list.do_status</code>.
     */
    public Byte getDoStatus() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>db_mall.t_pic_patch_list.url</code>.
     */
    public void setUrl(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_pic_patch_list.url</code>.
     */
    public String getUrl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_pic_patch_list.size</code>.
     */
    public void setSize(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_pic_patch_list.size</code>.
     */
    public Long getSize() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>db_mall.t_pic_patch_list.dealed_list</code>.
     */
    public void setDealedList(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_pic_patch_list.dealed_list</code>.
     */
    public String getDealedList() {
        return (String) get(6);
    }

    /**
     * Setter for <code>db_mall.t_pic_patch_list.path</code>.
     */
    public void setPath(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_pic_patch_list.path</code>.
     */
    public String getPath() {
        return (String) get(7);
    }

    /**
     * Setter for <code>db_mall.t_pic_patch_list.sync_status</code>.
     */
    public void setSyncStatus(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_mall.t_pic_patch_list.sync_status</code>.
     */
    public Byte getSyncStatus() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>db_mall.t_pic_patch_list.hash</code>.
     */
    public void setHash(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>db_mall.t_pic_patch_list.hash</code>.
     */
    public String getHash() {
        return (String) get(9);
    }

    /**
     * Setter for <code>db_mall.t_pic_patch_list.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>db_mall.t_pic_patch_list.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>db_mall.t_pic_patch_list.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>db_mall.t_pic_patch_list.mdate</code>.
     */
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
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Integer, Byte, Byte, String, Long, String, String, Byte, String, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Integer, Byte, Byte, String, Long, String, String, Byte, String, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TPicPatchList.T_PIC_PATCH_LIST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TPicPatchList.T_PIC_PATCH_LIST.MANAGER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field3() {
        return TPicPatchList.T_PIC_PATCH_LIST.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field4() {
        return TPicPatchList.T_PIC_PATCH_LIST.DO_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TPicPatchList.T_PIC_PATCH_LIST.URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return TPicPatchList.T_PIC_PATCH_LIST.SIZE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TPicPatchList.T_PIC_PATCH_LIST.DEALED_LIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TPicPatchList.T_PIC_PATCH_LIST.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return TPicPatchList.T_PIC_PATCH_LIST.SYNC_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TPicPatchList.T_PIC_PATCH_LIST.HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return TPicPatchList.T_PIC_PATCH_LIST.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return TPicPatchList.T_PIC_PATCH_LIST.MDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component4() {
        return getDoStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDealedList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component9() {
        return getSyncStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getHash();
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
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getManagerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value4() {
        return getDoStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDealedList();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getSyncStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getHash();
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
    public TPicPatchListRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPicPatchListRecord value2(Integer value) {
        setManagerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPicPatchListRecord value3(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPicPatchListRecord value4(Byte value) {
        setDoStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPicPatchListRecord value5(String value) {
        setUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPicPatchListRecord value6(Long value) {
        setSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPicPatchListRecord value7(String value) {
        setDealedList(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPicPatchListRecord value8(String value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPicPatchListRecord value9(Byte value) {
        setSyncStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPicPatchListRecord value10(String value) {
        setHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPicPatchListRecord value11(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPicPatchListRecord value12(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPicPatchListRecord values(Long value1, Integer value2, Byte value3, Byte value4, String value5, Long value6, String value7, String value8, Byte value9, String value10, Timestamp value11, Timestamp value12) {
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
     * Create a detached TPicPatchListRecord
     */
    public TPicPatchListRecord() {
        super(TPicPatchList.T_PIC_PATCH_LIST);
    }

    /**
     * Create a detached, initialised TPicPatchListRecord
     */
    public TPicPatchListRecord(Long id, Integer managerId, Byte status, Byte doStatus, String url, Long size, String dealedList, String path, Byte syncStatus, String hash, Timestamp cdate, Timestamp mdate) {
        super(TPicPatchList.T_PIC_PATCH_LIST);

        set(0, id);
        set(1, managerId);
        set(2, status);
        set(3, doStatus);
        set(4, url);
        set(5, size);
        set(6, dealedList);
        set(7, path);
        set(8, syncStatus);
        set(9, hash);
        set(10, cdate);
        set(11, mdate);
    }
}
