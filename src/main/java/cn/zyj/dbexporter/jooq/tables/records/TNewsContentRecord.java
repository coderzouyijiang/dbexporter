/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TNewsContent;

import java.sql.Timestamp;

import javax.annotation.Generated;

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
public class TNewsContentRecord extends UpdatableRecordImpl<TNewsContentRecord> implements Record8<Integer, Integer, String, String, Integer, Byte, Timestamp, Timestamp> {

    private static final long serialVersionUID = -76237804;

    /**
     * Setter for <code>db_mall.t_news_content.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_news_content.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_news_content.category_id</code>.
     */
    public void setCategoryId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_news_content.category_id</code>.
     */
    public Integer getCategoryId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>db_mall.t_news_content.title</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_news_content.title</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_news_content.content</code>.
     */
    public void setContent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_news_content.content</code>.
     */
    public String getContent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.t_news_content.oid</code>.
     */
    public void setOid(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_news_content.oid</code>.
     */
    public Integer getOid() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>db_mall.t_news_content.status</code>.
     */
    public void setStatus(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_news_content.status</code>.
     */
    public Byte getStatus() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>db_mall.t_news_content.cdate</code>.
     */
    public void setCdate(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_news_content.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>db_mall.t_news_content.mdate</code>.
     */
    public void setMdate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_news_content.mdate</code>.
     */
    public Timestamp getMdate() {
        return (Timestamp) get(7);
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
    public Row8<Integer, Integer, String, String, Integer, Byte, Timestamp, Timestamp> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, String, Integer, Byte, Timestamp, Timestamp> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TNewsContent.T_NEWS_CONTENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TNewsContent.T_NEWS_CONTENT.CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TNewsContent.T_NEWS_CONTENT.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TNewsContent.T_NEWS_CONTENT.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TNewsContent.T_NEWS_CONTENT.OID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field6() {
        return TNewsContent.T_NEWS_CONTENT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TNewsContent.T_NEWS_CONTENT.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TNewsContent.T_NEWS_CONTENT.MDATE;
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
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component6() {
        return getStatus();
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
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getOid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value6() {
        return getStatus();
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
    public TNewsContentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNewsContentRecord value2(Integer value) {
        setCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNewsContentRecord value3(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNewsContentRecord value4(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNewsContentRecord value5(Integer value) {
        setOid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNewsContentRecord value6(Byte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNewsContentRecord value7(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNewsContentRecord value8(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNewsContentRecord values(Integer value1, Integer value2, String value3, String value4, Integer value5, Byte value6, Timestamp value7, Timestamp value8) {
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
     * Create a detached TNewsContentRecord
     */
    public TNewsContentRecord() {
        super(TNewsContent.T_NEWS_CONTENT);
    }

    /**
     * Create a detached, initialised TNewsContentRecord
     */
    public TNewsContentRecord(Integer id, Integer categoryId, String title, String content, Integer oid, Byte status, Timestamp cdate, Timestamp mdate) {
        super(TNewsContent.T_NEWS_CONTENT);

        set(0, id);
        set(1, categoryId);
        set(2, title);
        set(3, content);
        set(4, oid);
        set(5, status);
        set(6, cdate);
        set(7, mdate);
    }
}