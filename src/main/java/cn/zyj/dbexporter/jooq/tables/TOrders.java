/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbMall;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TOrdersRecord;

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
public class TOrders extends TableImpl<TOrdersRecord> {

    private static final long serialVersionUID = -799508904;

    /**
     * The reference instance of <code>db_mall.t_orders</code>
     */
    public static final TOrders T_ORDERS = new TOrders();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TOrdersRecord> getRecordType() {
        return TOrdersRecord.class;
    }

    /**
     * The column <code>db_mall.t_orders.id</code>.
     */
    public final TableField<TOrdersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.t_orders.order_id</code>.
     */
    public final TableField<TOrdersRecord, String> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>db_mall.t_orders.main_order_id</code>. 主订单号
     */
    public final TableField<TOrdersRecord, String> MAIN_ORDER_ID = createField("main_order_id", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.VARCHAR)), this, "主订单号");

    /**
     * The column <code>db_mall.t_orders.customer_id</code>.
     */
    public final TableField<TOrdersRecord, Integer> CUSTOMER_ID = createField("customer_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_orders.receiver_name</code>. 收件人姓名
     */
    public final TableField<TOrdersRecord, String> RECEIVER_NAME = createField("receiver_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "收件人姓名");

    /**
     * The column <code>db_mall.t_orders.receiver_phone</code>. 收件人手机
     */
    public final TableField<TOrdersRecord, String> RECEIVER_PHONE = createField("receiver_phone", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "收件人手机");

    /**
     * The column <code>db_mall.t_orders.receiver_address</code>. 收件人地址
     */
    public final TableField<TOrdersRecord, String> RECEIVER_ADDRESS = createField("receiver_address", org.jooq.impl.SQLDataType.VARCHAR(500).nullable(false), this, "收件人地址");

    /**
     * The column <code>db_mall.t_orders.province_id</code>.
     */
    public final TableField<TOrdersRecord, Integer> PROVINCE_ID = createField("province_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_orders.bcity_id</code>.
     */
    public final TableField<TOrdersRecord, Integer> BCITY_ID = createField("bcity_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_orders.scity_id</code>.
     */
    public final TableField<TOrdersRecord, Integer> SCITY_ID = createField("scity_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_orders.company_name</code>.
     */
    public final TableField<TOrdersRecord, String> COMPANY_NAME = createField("company_name", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>db_mall.t_orders.payment_type</code>. 订单支付类型, 1:在线支付 2:银行转账 3:货到付款
     */
    public final TableField<TOrdersRecord, Byte> PAYMENT_TYPE = createField("payment_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "订单支付类型, 1:在线支付 2:银行转账 3:货到付款");

    /**
     * The column <code>db_mall.t_orders.pay_type</code>. 商品支付方式 0:销售,1:月付, 2:季付,  3:半年付, 4:年付
     */
    public final TableField<TOrdersRecord, Byte> PAY_TYPE = createField("pay_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "商品支付方式 0:销售,1:月付, 2:季付,  3:半年付, 4:年付");

    /**
     * The column <code>db_mall.t_orders.is_show</code>. 是否展示
     */
    public final TableField<TOrdersRecord, Byte> IS_SHOW = createField("is_show", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.TINYINT)), this, "是否展示");

    /**
     * The column <code>db_mall.t_orders.source</code>. 0微信；1PC；2移动；3cms批量下单
     */
    public final TableField<TOrdersRecord, Byte> SOURCE = createField("source", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0微信；1PC；2移动；3cms批量下单");

    /**
     * The column <code>db_mall.t_orders.rent_type</code>. （1随租随还2固定租期3租完即送4无限期随租随还5短期租赁）
     */
    public final TableField<TOrdersRecord, Byte> RENT_TYPE = createField("rent_type", org.jooq.impl.SQLDataType.TINYINT, this, "（1随租随还2固定租期3租完即送4无限期随租随还5短期租赁）");

    /**
     * The column <code>db_mall.t_orders.start_date</code>.
     */
    public final TableField<TOrdersRecord, Integer> START_DATE = createField("start_date", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_orders.real_start_date</code>.
     */
    public final TableField<TOrdersRecord, Integer> REAL_START_DATE = createField("real_start_date", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_orders.user_remark</code>.
     */
    public final TableField<TOrdersRecord, String> USER_REMARK = createField("user_remark", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>db_mall.t_orders.system_remark</code>.
     */
    public final TableField<TOrdersRecord, String> SYSTEM_REMARK = createField("system_remark", org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>db_mall.t_orders.credit_new_r</code>.
     */
    public final TableField<TOrdersRecord, Integer> CREDIT_NEW_R = createField("credit_new_r", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_orders.credit_old_r</code>.
     */
    public final TableField<TOrdersRecord, Integer> CREDIT_OLD_R = createField("credit_old_r", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_orders.credit_new_discount_percent</code>.
     */
    public final TableField<TOrdersRecord, Integer> CREDIT_NEW_DISCOUNT_PERCENT = createField("credit_new_discount_percent", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_orders.credit_old_discount_percent</code>.
     */
    public final TableField<TOrdersRecord, Integer> CREDIT_OLD_DISCOUNT_PERCENT = createField("credit_old_discount_percent", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_orders.goods_new_discount_percent</code>.
     */
    public final TableField<TOrdersRecord, Integer> GOODS_NEW_DISCOUNT_PERCENT = createField("goods_new_discount_percent", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_orders.goods_old_discount_percent</code>.
     */
    public final TableField<TOrdersRecord, Integer> GOODS_OLD_DISCOUNT_PERCENT = createField("goods_old_discount_percent", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_mall.t_orders.month</code>. 订单租期
     */
    public final TableField<TOrdersRecord, Integer> MONTH = createField("month", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "订单租期");

    /**
     * The column <code>db_mall.t_orders.pay_status</code>. （0未支付1已支付）
     */
    public final TableField<TOrdersRecord, Byte> PAY_STATUS = createField("pay_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "（0未支付1已支付）");

    /**
     * The column <code>db_mall.t_orders.status</code>. 订单状态（-1续租;0已下单等待确认;1已确认等待配货2已取消;3开始配货;4配货完成;5已发货;6租赁中;7已完成;）
     */
    public final TableField<TOrdersRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "订单状态（-1续租;0已下单等待确认;1已确认等待配货2已取消;3开始配货;4配货完成;5已发货;6租赁中;7已完成;）");

    /**
     * The column <code>db_mall.t_orders.sync_erp_status</code>.
     */
    public final TableField<TOrdersRecord, Byte> SYNC_ERP_STATUS = createField("sync_erp_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_orders.sync_erp_fail_reason</code>.
     */
    public final TableField<TOrdersRecord, String> SYNC_ERP_FAIL_REASON = createField("sync_erp_fail_reason", org.jooq.impl.SQLDataType.VARCHAR(300), this, "");

    /**
     * The column <code>db_mall.t_orders.sync_erp_date</code>.
     */
    public final TableField<TOrdersRecord, Timestamp> SYNC_ERP_DATE = createField("sync_erp_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>db_mall.t_orders.sync_status</code>.
     */
    public final TableField<TOrdersRecord, Byte> SYNC_STATUS = createField("sync_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this, "");

    /**
     * The column <code>db_mall.t_orders.is_sale</code>. 0,租赁；1,销售
     */
    public final TableField<TOrdersRecord, Byte> IS_SALE = createField("is_sale", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "0,租赁；1,销售");

    /**
     * The column <code>db_mall.t_orders.oid</code>. 订单优先级
     */
    public final TableField<TOrdersRecord, Integer> OID = createField("oid", org.jooq.impl.SQLDataType.INTEGER, this, "订单优先级");

    /**
     * The column <code>db_mall.t_orders.is_need_bill</code>.
     */
    public final TableField<TOrdersRecord, Byte> IS_NEED_BILL = createField("is_need_bill", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_orders.pay_date</code>.
     */
    public final TableField<TOrdersRecord, Timestamp> PAY_DATE = createField("pay_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>db_mall.t_orders.coupon_id</code>.
     */
    public final TableField<TOrdersRecord, Integer> COUPON_ID = createField("coupon_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>db_mall.t_orders.coupon_amount</code>.
     */
    public final TableField<TOrdersRecord, BigDecimal> COUPON_AMOUNT = createField("coupon_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_orders.delivery_time</code>.
     */
    public final TableField<TOrdersRecord, Timestamp> DELIVERY_TIME = createField("delivery_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>db_mall.t_orders.deposit</code>. 订单押金
     */
    public final TableField<TOrdersRecord, BigDecimal> DEPOSIT = createField("deposit", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "订单押金");

    /**
     * The column <code>db_mall.t_orders.old_deposit</code>. 原订单押金
     */
    public final TableField<TOrdersRecord, BigDecimal> OLD_DEPOSIT = createField("old_deposit", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "原订单押金");

    /**
     * The column <code>db_mall.t_orders.rent</code>. 订单租金
     */
    public final TableField<TOrdersRecord, BigDecimal> RENT = createField("rent", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "订单租金");

    /**
     * The column <code>db_mall.t_orders.old_rent</code>. 原订单租金
     */
    public final TableField<TOrdersRecord, BigDecimal> OLD_RENT = createField("old_rent", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "原订单租金");

    /**
     * The column <code>db_mall.t_orders.insurance_amount</code>. 订单保险 
     */
    public final TableField<TOrdersRecord, BigDecimal> INSURANCE_AMOUNT = createField("insurance_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "订单保险 ");

    /**
     * The column <code>db_mall.t_orders.old_insurance_amount</code>. 原订单保险
     */
    public final TableField<TOrdersRecord, BigDecimal> OLD_INSURANCE_AMOUNT = createField("old_insurance_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "原订单保险");

    /**
     * The column <code>db_mall.t_orders.added_service_amount</code>. 增值服务总金额
     */
    public final TableField<TOrdersRecord, BigDecimal> ADDED_SERVICE_AMOUNT = createField("added_service_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "增值服务总金额");

    /**
     * The column <code>db_mall.t_orders.soft_service_amount</code>. 软件服务总金额
     */
    public final TableField<TOrdersRecord, BigDecimal> SOFT_SERVICE_AMOUNT = createField("soft_service_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "软件服务总金额");

    /**
     * The column <code>db_mall.t_orders.onsite_service_amount</code>. 上门服务总金额
     */
    public final TableField<TOrdersRecord, BigDecimal> ONSITE_SERVICE_AMOUNT = createField("onsite_service_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "上门服务总金额");

    /**
     * The column <code>db_mall.t_orders.suits_type</code>. 优惠套装商品
     */
    public final TableField<TOrdersRecord, Integer> SUITS_TYPE = createField("suits_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "优惠套装商品");

    /**
     * The column <code>db_mall.t_orders.sale_amount</code>. 订单销售金额
     */
    public final TableField<TOrdersRecord, BigDecimal> SALE_AMOUNT = createField("sale_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "订单销售金额");

    /**
     * The column <code>db_mall.t_orders.old_sale_amount</code>. 原订单销售金额
     */
    public final TableField<TOrdersRecord, BigDecimal> OLD_SALE_AMOUNT = createField("old_sale_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "原订单销售金额");

    /**
     * The column <code>db_mall.t_orders.payed_amount</code>. 分摊余额
     */
    public final TableField<TOrdersRecord, BigDecimal> PAYED_AMOUNT = createField("payed_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "分摊余额");

    /**
     * The column <code>db_mall.t_orders.e_currency_virtual</code>.
     */
    public final TableField<TOrdersRecord, BigDecimal> E_CURRENCY_VIRTUAL = createField("e_currency_virtual", org.jooq.impl.SQLDataType.DECIMAL(10, 2).nullable(false).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "");

    /**
     * The column <code>db_mall.t_orders.credit_deposit</code>. 授信押金
     */
    public final TableField<TOrdersRecord, BigDecimal> CREDIT_DEPOSIT = createField("credit_deposit", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "授信押金");

    /**
     * The column <code>db_mall.t_orders.pay_deposit</code>. 应付押金
     */
    public final TableField<TOrdersRecord, BigDecimal> PAY_DEPOSIT = createField("pay_deposit", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "应付押金");

    /**
     * The column <code>db_mall.t_orders.need_amount</code>. 应付金额
     */
    public final TableField<TOrdersRecord, BigDecimal> NEED_AMOUNT = createField("need_amount", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "应付金额");

    /**
     * The column <code>db_mall.t_orders.bill_date</code>.
     */
    public final TableField<TOrdersRecord, Integer> BILL_DATE = createField("bill_date", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>db_mall.t_orders.now_balance_num</code>. 当前账单期数
     */
    public final TableField<TOrdersRecord, Integer> NOW_BALANCE_NUM = createField("now_balance_num", org.jooq.impl.SQLDataType.INTEGER, this, "当前账单期数");

    /**
     * The column <code>db_mall.t_orders.is_expire</code>. 是否逾期（0否1是）
     */
    public final TableField<TOrdersRecord, Byte> IS_EXPIRE = createField("is_expire", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否逾期（0否1是）");

    /**
     * The column <code>db_mall.t_orders.is_exchange</code>.
     */
    public final TableField<TOrdersRecord, Byte> IS_EXCHANGE = createField("is_exchange", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>db_mall.t_orders.source_order_id</code>. 原订单id
     */
    public final TableField<TOrdersRecord, String> SOURCE_ORDER_ID = createField("source_order_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "原订单id");

    /**
     * The column <code>db_mall.t_orders.cdate</code>. 创建时间
     */
    public final TableField<TOrdersRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "创建时间");

    /**
     * The column <code>db_mall.t_orders.mdate</code>. 修改时间
     */
    public final TableField<TOrdersRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "修改时间");

    /**
     * The column <code>db_mall.t_orders.real_pay_deposit</code>. 真实冻结押金
     */
    public final TableField<TOrdersRecord, BigDecimal> REAL_PAY_DEPOSIT = createField("real_pay_deposit", org.jooq.impl.SQLDataType.DECIMAL(10, 2).defaultValue(org.jooq.impl.DSL.inline("0.00", org.jooq.impl.SQLDataType.DECIMAL)), this, "真实冻结押金");

    /**
     * The column <code>db_mall.t_orders.rent_type_id</code>. 租赁周期id
     */
    public final TableField<TOrdersRecord, Integer> RENT_TYPE_ID = createField("rent_type_id", org.jooq.impl.SQLDataType.INTEGER, this, "租赁周期id");

    /**
     * The column <code>db_mall.t_orders.renewal_status</code>. 续租状态（0未续租1已续租2取消续租）
     */
    public final TableField<TOrdersRecord, Byte> RENEWAL_STATUS = createField("renewal_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "续租状态（0未续租1已续租2取消续租）");

    /**
     * The column <code>db_mall.t_orders.order_type</code>. 订单类型 0:客户下单 1：续租订单 2：资产调拨
     */
    public final TableField<TOrdersRecord, Byte> ORDER_TYPE = createField("order_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "订单类型 0:客户下单 1：续租订单 2：资产调拨");

    /**
     * The column <code>db_mall.t_orders.warehouse_id</code>. 仓库id
     */
    public final TableField<TOrdersRecord, Integer> WAREHOUSE_ID = createField("warehouse_id", org.jooq.impl.SQLDataType.INTEGER, this, "仓库id");

    /**
     * The column <code>db_mall.t_orders.warehouse_name</code>. 仓库名称
     */
    public final TableField<TOrdersRecord, String> WAREHOUSE_NAME = createField("warehouse_name", org.jooq.impl.SQLDataType.VARCHAR(11), this, "仓库名称");

    /**
     * The column <code>db_mall.t_orders.interview_status</code>. 面签状态；0无须面签；1待面签；2面签通过；3面签不通过
     */
    public final TableField<TOrdersRecord, Byte> INTERVIEW_STATUS = createField("interview_status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "面签状态；0无须面签；1待面签；2面签通过；3面签不通过");

    /**
     * The column <code>db_mall.t_orders.is_ali_app</code>. 是否是支付宝app端内下单 0否；1是
     */
    public final TableField<TOrdersRecord, Byte> IS_ALI_APP = createField("is_ali_app", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否是支付宝app端内下单 0否；1是");

    /**
     * The column <code>db_mall.t_orders.is_zhima_credit</code>. 是否是芝麻信用流程 0否；1是
     */
    public final TableField<TOrdersRecord, Byte> IS_ZHIMA_CREDIT = createField("is_zhima_credit", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否是芝麻信用流程 0否；1是");

    /**
     * The column <code>db_mall.t_orders.sync_erp_fail_type</code>. 同步ERP失败类型 0无效，默认值 1未支付,2客户已逾期,3客户授信未通过,4ECM调用异常,5ERP调用异常,6客户授信可用余额小于0,7客户集团母公司授信可用余额小于0或授信未通过,8订单数据非法
     */
    public final TableField<TOrdersRecord, Byte> SYNC_ERP_FAIL_TYPE = createField("sync_erp_fail_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "同步ERP失败类型 0无效，默认值 1未支付,2客户已逾期,3客户授信未通过,4ECM调用异常,5ERP调用异常,6客户授信可用余额小于0,7客户集团母公司授信可用余额小于0或授信未通过,8订单数据非法");

    /**
     * The column <code>db_mall.t_orders.zhima_order_no</code>. 芝麻信用业务号
     */
    public final TableField<TOrdersRecord, String> ZHIMA_ORDER_NO = createField("zhima_order_no", org.jooq.impl.SQLDataType.VARCHAR(255), this, "芝麻信用业务号");

    /**
     * The column <code>db_mall.t_orders.zhima_credit_order_no</code>. 芝麻信用额度申请业务号
     */
    public final TableField<TOrdersRecord, String> ZHIMA_CREDIT_ORDER_NO = createField("zhima_credit_order_no", org.jooq.impl.SQLDataType.VARCHAR(255), this, "芝麻信用额度申请业务号");

    /**
     * The column <code>db_mall.t_orders.zhima_lease_order_no</code>. 芝麻信用业务订单号
     */
    public final TableField<TOrdersRecord, String> ZHIMA_LEASE_ORDER_NO = createField("zhima_lease_order_no", org.jooq.impl.SQLDataType.VARCHAR(255), this, "芝麻信用业务订单号");

    /**
     * The column <code>db_mall.t_orders.interview_date</code>. 经过面签流程的时间
     */
    public final TableField<TOrdersRecord, Timestamp> INTERVIEW_DATE = createField("interview_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "经过面签流程的时间");

    /**
     * The column <code>db_mall.t_orders.is_virtual</code>. 是否虚拟订单 0否；1是
     */
    public final TableField<TOrdersRecord, Byte> IS_VIRTUAL = createField("is_virtual", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "是否虚拟订单 0否；1是");

    /**
     * The column <code>db_mall.t_orders.virtual_reason</code>. 虚拟原因 0设备调拨；1更改租赁方式；2更改付款方式；3更改设备sku 4更改设备SN；5换货设备未退回；6QUICKPC 部分换机
     */
    public final TableField<TOrdersRecord, Byte> VIRTUAL_REASON = createField("virtual_reason", org.jooq.impl.SQLDataType.TINYINT, this, "虚拟原因 0设备调拨；1更改租赁方式；2更改付款方式；3更改设备sku 4更改设备SN；5换货设备未退回；6QUICKPC 部分换机");

    /**
     * The column <code>db_mall.t_orders.original_order_id</code>. 虚拟原订单号
     */
    public final TableField<TOrdersRecord, String> ORIGINAL_ORDER_ID = createField("original_order_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "虚拟原订单号");

    /**
     * Create a <code>db_mall.t_orders</code> table reference
     */
    public TOrders() {
        this(DSL.name("t_orders"), null);
    }

    /**
     * Create an aliased <code>db_mall.t_orders</code> table reference
     */
    public TOrders(String alias) {
        this(DSL.name(alias), T_ORDERS);
    }

    /**
     * Create an aliased <code>db_mall.t_orders</code> table reference
     */
    public TOrders(Name alias) {
        this(alias, T_ORDERS);
    }

    private TOrders(Name alias, Table<TOrdersRecord> aliased) {
        this(alias, aliased, null);
    }

    private TOrders(Name alias, Table<TOrdersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TOrders(Table<O> child, ForeignKey<O, TOrdersRecord> key) {
        super(child, key, T_ORDERS);
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
        return Arrays.<Index>asList(Indexes.T_ORDERS_CUSTOMER_ID_BILL, Indexes.T_ORDERS_IND_STATUS, Indexes.T_ORDERS_MAIN_ORDER_ID, Indexes.T_ORDERS_ORDER_ID, Indexes.T_ORDERS_PRIMARY, Indexes.T_ORDERS_SOURCE_ORDER_ID, Indexes.T_ORDERS_SYNC_ERP_STATUS, Indexes.T_ORDERS_SYNC_STATUS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TOrdersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_ORDERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TOrdersRecord> getPrimaryKey() {
        return Keys.KEY_T_ORDERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TOrdersRecord>> getKeys() {
        return Arrays.<UniqueKey<TOrdersRecord>>asList(Keys.KEY_T_ORDERS_PRIMARY, Keys.KEY_T_ORDERS_ORDER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrders as(String alias) {
        return new TOrders(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TOrders as(Name alias) {
        return new TOrders(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrders rename(String name) {
        return new TOrders(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TOrders rename(Name name) {
        return new TOrders(name, null);
    }
}