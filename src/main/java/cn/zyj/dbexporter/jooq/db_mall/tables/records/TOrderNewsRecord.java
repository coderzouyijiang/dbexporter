/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.records;


import cn.zyj.dbexporter.jooq.db_mall.tables.TOrderNews;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
public class TOrderNewsRecord extends UpdatableRecordImpl<TOrderNewsRecord> implements Record6<Integer, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1794812322;

    /**
     * Setter for <code>db_mall.t_order_news.id</code>.
     */
    public TOrderNewsRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_news.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_order_news.title</code>.
     */
    public TOrderNewsRecord setTitle(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_news.title</code>.
     */
    @NotNull
    @Size(max = 200)
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_order_news.content</code>.
     */
    public TOrderNewsRecord setContent(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_news.content</code>.
     */
    @NotNull
    @Size(max = 65535)
    public String getContent() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_order_news.order_id</code>.
     */
    public TOrderNewsRecord setOrderId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_news.order_id</code>.
     */
    @NotNull
    @Size(max = 20)
    public String getOrderId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>db_mall.t_order_news.cdate</code>.
     */
    public TOrderNewsRecord setCdate(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_news.cdate</code>.
     */
    public Timestamp getCdate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>db_mall.t_order_news.mdate</code>.
     */
    public TOrderNewsRecord setMdate(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>db_mall.t_order_news.mdate</code>.
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
    public Row6<Integer, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TOrderNews.T_ORDER_NEWS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TOrderNews.T_ORDER_NEWS.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TOrderNews.T_ORDER_NEWS.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TOrderNews.T_ORDER_NEWS.ORDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TOrderNews.T_ORDER_NEWS.CDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TOrderNews.T_ORDER_NEWS.MDATE;
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
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getOrderId();
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
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getOrderId();
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
    public TOrderNewsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderNewsRecord value2(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderNewsRecord value3(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderNewsRecord value4(String value) {
        setOrderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderNewsRecord value5(Timestamp value) {
        setCdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderNewsRecord value6(Timestamp value) {
        setMdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrderNewsRecord values(Integer value1, String value2, String value3, String value4, Timestamp value5, Timestamp value6) {
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
     * Create a detached TOrderNewsRecord
     */
    public TOrderNewsRecord() {
        super(TOrderNews.T_ORDER_NEWS);
    }

    /**
     * Create a detached, initialised TOrderNewsRecord
     */
    public TOrderNewsRecord(Integer id, String title, String content, String orderId, Timestamp cdate, Timestamp mdate) {
        super(TOrderNews.T_ORDER_NEWS);

        set(0, id);
        set(1, title);
        set(2, content);
        set(3, orderId);
        set(4, cdate);
        set(5, mdate);
    }
}
