/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TInvoiceRequestRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class TInvoiceRequest extends TableImpl<TInvoiceRequestRecord> {

    private static final long serialVersionUID = 845524595;

    /**
     * The reference instance of <code>db_mall.t_invoice_request</code>
     */
    public static final TInvoiceRequest T_INVOICE_REQUEST = new TInvoiceRequest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TInvoiceRequestRecord> getRecordType() {
        return TInvoiceRequestRecord.class;
    }

    /**
     * The column <code>db_mall.t_invoice_request.id</code>.
     */
    public final TableField<TInvoiceRequestRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.customer_id</code>.
     */
    public final TableField<TInvoiceRequestRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.amount</code>.
     */
    public final TableField<TInvoiceRequestRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.type_id</code>.
     */
    public final TableField<TInvoiceRequestRecord, Byte> TYPE_ID = createField("type_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.title</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.company_name</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> COMPANY_NAME = createField("company_name", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.post_type</code>.
     */
    public final TableField<TInvoiceRequestRecord, Byte> POST_TYPE = createField("post_type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.apply_remark</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> APPLY_REMARK = createField("apply_remark", org.jooq.impl.SQLDataType.VARCHAR(600), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.proof_file</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> PROOF_FILE = createField("proof_file", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.file</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> FILE = createField("file", org.jooq.impl.SQLDataType.VARCHAR(300).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.taxer_id</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> TAXER_ID = createField("taxer_id", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.company_address</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> COMPANY_ADDRESS = createField("company_address", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.company_tel</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> COMPANY_TEL = createField("company_tel", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.company_bank</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> COMPANY_BANK = createField("company_bank", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.company_account</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> COMPANY_ACCOUNT = createField("company_account", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.receiver_name</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> RECEIVER_NAME = createField("receiver_name", org.jooq.impl.SQLDataType.VARCHAR(32).defaultValue(org.jooq.impl.DSL.inline("11", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.receiver_phone</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> RECEIVER_PHONE = createField("receiver_phone", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.receiver_address</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> RECEIVER_ADDRESS = createField("receiver_address", org.jooq.impl.SQLDataType.VARCHAR(400).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.invoice_number</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> INVOICE_NUMBER = createField("invoice_number", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.yet_invoice_amount</code>.
     */
    public final TableField<TInvoiceRequestRecord, BigDecimal> YET_INVOICE_AMOUNT = createField("yet_invoice_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.express_ids</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> EXPRESS_IDS = createField("express_ids", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.express_id</code>. 0未发货
     */
    public final TableField<TInvoiceRequestRecord, Integer> EXPRESS_ID = createField("express_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "0未发货");

    /**
     * The column <code>db_mall.t_invoice_request.express_number</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> EXPRESS_NUMBER = createField("express_number", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.invoice_time</code>.
     */
    public final TableField<TInvoiceRequestRecord, Timestamp> INVOICE_TIME = createField("invoice_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>db_mall.t_invoice_request.invoice_manager_id</code>.
     */
    public final TableField<TInvoiceRequestRecord, Integer> INVOICE_MANAGER_ID = createField("invoice_manager_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_mall.t_invoice_request.posted_time</code>.
     */
    public final TableField<TInvoiceRequestRecord, Timestamp> POSTED_TIME = createField("posted_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>db_mall.t_invoice_request.posted_manager_id</code>.
     */
    public final TableField<TInvoiceRequestRecord, Integer> POSTED_MANAGER_ID = createField("posted_manager_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_mall.t_invoice_request.cancel_time</code>.
     */
    public final TableField<TInvoiceRequestRecord, Timestamp> CANCEL_TIME = createField("cancel_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>db_mall.t_invoice_request.cancel_manager_id</code>.
     */
    public final TableField<TInvoiceRequestRecord, Integer> CANCEL_MANAGER_ID = createField("cancel_manager_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_mall.t_invoice_request.cancel_cause</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> CANCEL_CAUSE = createField("cancel_cause", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.invoice_content_id</code>.
     */
    public final TableField<TInvoiceRequestRecord, Byte> INVOICE_CONTENT_ID = createField("invoice_content_id", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.status</code>.
     */
    public final TableField<TInvoiceRequestRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.check_remark</code>.
     */
    public final TableField<TInvoiceRequestRecord, String> CHECK_REMARK = createField("check_remark", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.check_manager_id</code>.
     */
    public final TableField<TInvoiceRequestRecord, Integer> CHECK_MANAGER_ID = createField("check_manager_id", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.check_time</code>.
     */
    public final TableField<TInvoiceRequestRecord, Timestamp> CHECK_TIME = createField("check_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>db_mall.t_invoice_request.cdate</code>.
     */
    public final TableField<TInvoiceRequestRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.mdate</code>.
     */
    public final TableField<TInvoiceRequestRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_invoice_request.receiver_address_id</code>.
     */
    public final TableField<TInvoiceRequestRecord, Integer> RECEIVER_ADDRESS_ID = createField("receiver_address_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_mall.t_invoice_request.is_payed_postage</code>. 0默认值，1用户支付邮费，2用户无需支付邮费
     */
    public final TableField<TInvoiceRequestRecord, Byte> IS_PAYED_POSTAGE = createField("is_payed_postage", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0默认值，1用户支付邮费，2用户无需支付邮费");

    /**
     * The column <code>db_mall.t_invoice_request.belong_month</code>. 0默认值，发票归属哪个月份
     */
    public final TableField<TInvoiceRequestRecord, String> BELONG_MONTH = createField("belong_month", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "0默认值，发票归属哪个月份");

    /**
     * The column <code>db_mall.t_invoice_request.source_type</code>. 0:“未知” , 1:先票后款 , 2:商城开票
     */
    public final TableField<TInvoiceRequestRecord, Byte> SOURCE_TYPE = createField("source_type", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0:“未知” , 1:先票后款 , 2:商城开票");

    /**
     * The column <code>db_mall.t_invoice_request.billId</code>. 基于账单发票id
     */
    public final TableField<TInvoiceRequestRecord, String> BILLID = createField("billId", org.jooq.impl.SQLDataType.VARCHAR(100).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "基于账单发票id");

    /**
     * The column <code>db_mall.t_invoice_request.titleType</code>. 发票抬头类型，0默认，1企业，2个人
     */
    public final TableField<TInvoiceRequestRecord, Byte> TITLETYPE = createField("titleType", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "发票抬头类型，0默认，1企业，2个人");

    /**
     * The column <code>db_mall.t_invoice_request.invoice_remark</code>. 发票备注
     */
    public final TableField<TInvoiceRequestRecord, String> INVOICE_REMARK = createField("invoice_remark", org.jooq.impl.SQLDataType.VARCHAR(400).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "发票备注");

    /**
     * The column <code>db_mall.t_invoice_request.sms_status</code>. 短信发送状态 0未发送 1已发送
     */
    public final TableField<TInvoiceRequestRecord, Byte> SMS_STATUS = createField("sms_status", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "短信发送状态 0未发送 1已发送");

    /**
     * Create a <code>db_mall.t_invoice_request</code> table reference
     */
    public TInvoiceRequest() {
        this(DSL.name("t_invoice_request"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_invoice_request</code> table reference
     */
    public TInvoiceRequest(String alias) {
        this(DSL.name(alias), T_INVOICE_REQUEST);
    }

    /**
     * Create an aliased <code>db_mall.t_invoice_request</code> table reference
     */
    public TInvoiceRequest(Name alias) {
        this(alias, T_INVOICE_REQUEST);
    }

    private TInvoiceRequest(Name alias, Table<TInvoiceRequestRecord> aliased) {
        this(alias, aliased, null);
    }

    private TInvoiceRequest(Name alias, Table<TInvoiceRequestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TInvoiceRequest(Table<O> child, ForeignKey<O, TInvoiceRequestRecord> key) {
        super(child, key, T_INVOICE_REQUEST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DbMall.DB_MALL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.T_INVOICE_REQUEST_CUSTOMER_ID_STATUS, Indexes.T_INVOICE_REQUEST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TInvoiceRequestRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_INVOICE_REQUEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TInvoiceRequestRecord> getPrimaryKey() {
        return Keys.KEY_T_INVOICE_REQUEST_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TInvoiceRequestRecord>> getKeys() {
        return Arrays.<UniqueKey<TInvoiceRequestRecord>>asList(Keys.KEY_T_INVOICE_REQUEST_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInvoiceRequest as(String alias) {
        return new TInvoiceRequest(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TInvoiceRequest as(Name alias) {
        return new TInvoiceRequest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TInvoiceRequest rename(String name) {
        return new TInvoiceRequest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TInvoiceRequest rename(Name name) {
        return new TInvoiceRequest(name, null);
    }
}
