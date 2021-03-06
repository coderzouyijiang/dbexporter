/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.TCustomerMemberInviteRecord;

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
public class TCustomerMemberInvite extends TableImpl<TCustomerMemberInviteRecord> {

    private static final long serialVersionUID = -811987524;

    /**
     * The reference instance of <code>db_mall.t_customer_member_invite</code>
     */
    public static final TCustomerMemberInvite T_CUSTOMER_MEMBER_INVITE = new TCustomerMemberInvite();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TCustomerMemberInviteRecord> getRecordType() {
        return TCustomerMemberInviteRecord.class;
    }

    /**
     * The column <code>db_mall.t_customer_member_invite.id</code>.
     */
    public final TableField<TCustomerMemberInviteRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_customer_member_invite.customer_id</code>. 子账号customer_id
     */
    public final TableField<TCustomerMemberInviteRecord, Long> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "子账号customer_id");

    /**
     * The column <code>db_mall.t_customer_member_invite.group_customer_id</code>. 母账号customer_id
     */
    public final TableField<TCustomerMemberInviteRecord, Long> GROUP_CUSTOMER_ID = createField("group_customer_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "母账号customer_id");

    /**
     * The column <code>db_mall.t_customer_member_invite.type</code>. 类型。0-母账号邀请,1-子账号主动申请
     */
    public final TableField<TCustomerMemberInviteRecord, Byte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "类型。0-母账号邀请,1-子账号主动申请");

    /**
     * The column <code>db_mall.t_customer_member_invite.status</code>. 状态。0-邀请中，1-邀请成功，2-邀请失败
     */
    public final TableField<TCustomerMemberInviteRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "状态。0-邀请中，1-邀请成功，2-邀请失败");

    /**
     * The column <code>db_mall.t_customer_member_invite.data_status</code>. 软删除。0-注册，1-已删除
     */
    public final TableField<TCustomerMemberInviteRecord, Byte> DATA_STATUS = createField("data_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "软删除。0-注册，1-已删除");

    /**
     * The column <code>db_mall.t_customer_member_invite.fail_code</code>. 加入失败原因。0-子账号拒绝，其他-db_mall中的错误码
     */
    public final TableField<TCustomerMemberInviteRecord, Long> FAIL_CODE = createField("fail_code", org.jooq.impl.SQLDataType.BIGINT, this, "加入失败原因。0-子账号拒绝，其他-db_mall中的错误码");

    /**
     * The column <code>db_mall.t_customer_member_invite.remark_name</code>. 备注名
     */
    public final TableField<TCustomerMemberInviteRecord, String> REMARK_NAME = createField("remark_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "备注名");

    /**
     * The column <code>db_mall.t_customer_member_invite.handle_time</code>. 子账号处理时间
     */
    public final TableField<TCustomerMemberInviteRecord, Timestamp> HANDLE_TIME = createField("handle_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "子账号处理时间");

    /**
     * The column <code>db_mall.t_customer_member_invite.cdate</code>. 创建时间
     */
    public final TableField<TCustomerMemberInviteRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>db_mall.t_customer_member_invite.mdate</code>. 修改时间
     */
    public final TableField<TCustomerMemberInviteRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "修改时间");

    /**
     * Create a <code>db_mall.t_customer_member_invite</code> table reference
     */
    public TCustomerMemberInvite() {
        this(DSL.name("t_customer_member_invite"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_customer_member_invite</code> table reference
     */
    public TCustomerMemberInvite(String alias) {
        this(DSL.name(alias), T_CUSTOMER_MEMBER_INVITE);
    }

    /**
     * Create an aliased <code>db_mall.t_customer_member_invite</code> table reference
     */
    public TCustomerMemberInvite(Name alias) {
        this(alias, T_CUSTOMER_MEMBER_INVITE);
    }

    private TCustomerMemberInvite(Name alias, Table<TCustomerMemberInviteRecord> aliased) {
        this(alias, aliased, null);
    }

    private TCustomerMemberInvite(Name alias, Table<TCustomerMemberInviteRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TCustomerMemberInvite(Table<O> child, ForeignKey<O, TCustomerMemberInviteRecord> key) {
        super(child, key, T_CUSTOMER_MEMBER_INVITE);
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
        return Arrays.<Index>asList(Indexes.T_CUSTOMER_MEMBER_INVITE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TCustomerMemberInviteRecord, Long> getIdentity() {
        return Keys.IDENTITY_T_CUSTOMER_MEMBER_INVITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TCustomerMemberInviteRecord> getPrimaryKey() {
        return Keys.KEY_T_CUSTOMER_MEMBER_INVITE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TCustomerMemberInviteRecord>> getKeys() {
        return Arrays.<UniqueKey<TCustomerMemberInviteRecord>>asList(Keys.KEY_T_CUSTOMER_MEMBER_INVITE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerMemberInvite as(String alias) {
        return new TCustomerMemberInvite(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCustomerMemberInvite as(Name alias) {
        return new TCustomerMemberInvite(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TCustomerMemberInvite rename(String name) {
        return new TCustomerMemberInvite(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TCustomerMemberInvite rename(Name name) {
        return new TCustomerMemberInvite(name, null);
    }
}
