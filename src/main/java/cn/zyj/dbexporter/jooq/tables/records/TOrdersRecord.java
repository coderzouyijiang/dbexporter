/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TOrders;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record2;
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
public class TOrdersRecord extends UpdatableRecordImpl<TOrdersRecord> {

    private static final long serialVersionUID = -331850995;

    /**
     * Setter for <code>db_mall.t_orders.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_orders.order_id</code>.
     */
    public void setOrderId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.order_id</code>.
     */
    public String getOrderId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_orders.main_order_id</code>. 主订单号
     */
    public void setMainOrderId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.main_order_id</code>. 主订单号
     */
    public String getMainOrderId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_orders.customer_id</code>.
     */
    public void setCustomerId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.customer_id</code>.
     */
    public Integer getCustomerId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_mall.t_orders.receiver_name</code>. 收件人姓名
     */
    public void setReceiverName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.receiver_name</code>. 收件人姓名
     */
    public String getReceiverName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>db_mall.t_orders.receiver_phone</code>. 收件人手机
     */
    public void setReceiverPhone(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.receiver_phone</code>. 收件人手机
     */
    public String getReceiverPhone() {
        return (String) get(5);
    }

    /**
     * Setter for <code>db_mall.t_orders.receiver_address</code>. 收件人地址
     */
    public void setReceiverAddress(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.receiver_address</code>. 收件人地址
     */
    public String getReceiverAddress() {
        return (String) get(6);
    }

    /**
     * Setter for <code>db_mall.t_orders.province_id</code>.
     */
    public void setProvinceId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.province_id</code>.
     */
    public Integer getProvinceId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>db_mall.t_orders.bcity_id</code>.
     */
    public void setBcityId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.bcity_id</code>.
     */
    public Integer getBcityId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>db_mall.t_orders.scity_id</code>.
     */
    public void setScityId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.scity_id</code>.
     */
    public Integer getScityId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>db_mall.t_orders.company_name</code>.
     */
    public void setCompanyName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.company_name</code>.
     */
    public String getCompanyName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>db_mall.t_orders.payment_type</code>. 订单支付类型, 1:在线支付 2:银行转账 3:货到付款
     */
    public void setPaymentType(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.payment_type</code>. 订单支付类型, 1:在线支付 2:银行转账 3:货到付款
     */
    public Byte getPaymentType() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>db_mall.t_orders.pay_type</code>. 商品支付方式 0:销售,1:月付, 2:季付,  3:半年付, 4:年付
     */
    public void setPayType(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.pay_type</code>. 商品支付方式 0:销售,1:月付, 2:季付,  3:半年付, 4:年付
     */
    public Byte getPayType() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>db_mall.t_orders.is_show</code>. 是否展示
     */
    public void setIsShow(Byte value) {
        set(13, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.is_show</code>. 是否展示
     */
    public Byte getIsShow() {
        return (Byte) get(13);
    }

    /**
     * Setter for <code>db_mall.t_orders.source</code>. 0微信；1PC；2移动；3cms批量下单
     */
    public void setSource(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.source</code>. 0微信；1PC；2移动；3cms批量下单
     */
    public Byte getSource() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>db_mall.t_orders.rent_type</code>. （1随租随还2固定租期3租完即送4无限期随租随还5短期租赁）
     */
    public void setRentType(Byte value) {
        set(15, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.rent_type</code>. （1随租随还2固定租期3租完即送4无限期随租随还5短期租赁）
     */
    public Byte getRentType() {
        return (Byte) get(15);
    }

    /**
     * Setter for <code>db_mall.t_orders.start_date</code>.
     */
    public void setStartDate(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.start_date</code>.
     */
    public Integer getStartDate() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>db_mall.t_orders.real_start_date</code>.
     */
    public void setRealStartDate(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.real_start_date</code>.
     */
    public Integer getRealStartDate() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>db_mall.t_orders.user_remark</code>.
     */
    public void setUserRemark(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.user_remark</code>.
     */
    public String getUserRemark() {
        return (String) get(18);
    }

    /**
     * Setter for <code>db_mall.t_orders.system_remark</code>.
     */
    public void setSystemRemark(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.system_remark</code>.
     */
    public String getSystemRemark() {
        return (String) get(19);
    }

    /**
     * Setter for <code>db_mall.t_orders.credit_new_r</code>.
     */
    public void setCreditNewR(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.credit_new_r</code>.
     */
    public Integer getCreditNewR() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>db_mall.t_orders.credit_old_r</code>.
     */
    public void setCreditOldR(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.credit_old_r</code>.
     */
    public Integer getCreditOldR() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>db_mall.t_orders.credit_new_discount_percent</code>.
     */
    public void setCreditNewDiscountPercent(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.credit_new_discount_percent</code>.
     */
    public Integer getCreditNewDiscountPercent() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>db_mall.t_orders.credit_old_discount_percent</code>.
     */
    public void setCreditOldDiscountPercent(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.credit_old_discount_percent</code>.
     */
    public Integer getCreditOldDiscountPercent() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>db_mall.t_orders.goods_new_discount_percent</code>.
     */
    public void setGoodsNewDiscountPercent(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.goods_new_discount_percent</code>.
     */
    public Integer getGoodsNewDiscountPercent() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>db_mall.t_orders.goods_old_discount_percent</code>.
     */
    public void setGoodsOldDiscountPercent(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.goods_old_discount_percent</code>.
     */
    public Integer getGoodsOldDiscountPercent() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>db_mall.t_orders.month</code>. 订单租期
     */
    public void setMonth(Integer value) {
        set(26, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.month</code>. 订单租期
     */
    public Integer getMonth() {
        return (Integer) get(26);
    }

    /**
     * Setter for <code>db_mall.t_orders.pay_status</code>. （0未支付1已支付）
     */
    public void setPayStatus(Byte value) {
        set(27, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.pay_status</code>. （0未支付1已支付）
     */
    public Byte getPayStatus() {
        return (Byte) get(27);
    }

    /**
     * Setter for <code>db_mall.t_orders.status</code>. 订单状态（-1续租;0已下单等待确认;1已确认等待配货2已取消;3开始配货;4配货完成;5已发货;6租赁中;7已完成;）
     */
    public void setStatus(Integer value) {
        set(28, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.status</code>. 订单状态（-1续租;0已下单等待确认;1已确认等待配货2已取消;3开始配货;4配货完成;5已发货;6租赁中;7已完成;）
     */
    public Integer getStatus() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>db_mall.t_orders.sync_erp_status</code>.
     */
    public void setSyncErpStatus(Byte value) {
        set(29, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.sync_erp_status</code>.
     */
    public Byte getSyncErpStatus() {
        return (Byte) get(29);
    }

    /**
     * Setter for <code>db_mall.t_orders.sync_erp_fail_reason</code>.
     */
    public void setSyncErpFailReason(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.sync_erp_fail_reason</code>.
     */
    public String getSyncErpFailReason() {
        return (String) get(30);
    }

    /**
     * Setter for <code>db_mall.t_orders.sync_erp_date</code>.
     */
    public void setSyncErpDate(Timestamp value) {
        set(31, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.sync_erp_date</code>.
     */
    public Timestamp getSyncErpDate() {
        return (Timestamp) get(31);
    }

    /**
     * Setter for <code>db_mall.t_orders.sync_status</code>.
     */
    public void setSyncStatus(Byte value) {
        set(32, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.sync_status</code>.
     */
    public Byte getSyncStatus() {
        return (Byte) get(32);
    }

    /**
     * Setter for <code>db_mall.t_orders.is_sale</code>. 0,租赁；1,销售
     */
    public void setIsSale(Byte value) {
        set(33, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.is_sale</code>. 0,租赁；1,销售
     */
    public Byte getIsSale() {
        return (Byte) get(33);
    }

    /**
     * Setter for <code>db_mall.t_orders.oid</code>. 订单优先级
     */
    public void setOid(Integer value) {
        set(34, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.oid</code>. 订单优先级
     */
    public Integer getOid() {
        return (Integer) get(34);
    }

    /**
     * Setter for <code>db_mall.t_orders.is_need_bill</code>.
     */
    public void setIsNeedBill(Byte value) {
        set(35, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.is_need_bill</code>.
     */
    public Byte getIsNeedBill() {
        return (Byte) get(35);
    }

    /**
     * Setter for <code>db_mall.t_orders.pay_date</code>.
     */
    public void setPayDate(Timestamp value) {
        set(36, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.pay_date</code>.
     */
    public Timestamp getPayDate() {
        return (Timestamp) get(36);
    }

    /**
     * Setter for <code>db_mall.t_orders.coupon_id</code>.
     */
    public void setCouponId(Integer value) {
        set(37, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.coupon_id</code>.
     */
    public Integer getCouponId() {
        return (Integer) get(37);
    }

    /**
     * Setter for <code>db_mall.t_orders.coupon_amount</code>.
     */
    public void setCouponAmount(BigDecimal value) {
        set(38, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.coupon_amount</code>.
     */
    public BigDecimal getCouponAmount() {
        return (BigDecimal) get(38);
    }

    /**
     * Setter for <code>db_mall.t_orders.delivery_time</code>.
     */
    public void setDeliveryTime(Timestamp value) {
        set(39, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.delivery_time</code>.
     */
    public Timestamp getDeliveryTime() {
        return (Timestamp) get(39);
    }

    /**
     * Setter for <code>db_mall.t_orders.deposit</code>. 订单押金
     */
    public void setDeposit(BigDecimal value) {
        set(40, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.deposit</code>. 订单押金
     */
    public BigDecimal getDeposit() {
        return (BigDecimal) get(40);
    }

    /**
     * Setter for <code>db_mall.t_orders.old_deposit</code>. 原订单押金
     */
    public void setOldDeposit(BigDecimal value) {
        set(41, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.old_deposit</code>. 原订单押金
     */
    public BigDecimal getOldDeposit() {
        return (BigDecimal) get(41);
    }

    /**
     * Setter for <code>db_mall.t_orders.rent</code>. 订单租金
     */
    public void setRent(BigDecimal value) {
        set(42, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.rent</code>. 订单租金
     */
    public BigDecimal getRent() {
        return (BigDecimal) get(42);
    }

    /**
     * Setter for <code>db_mall.t_orders.old_rent</code>. 原订单租金
     */
    public void setOldRent(BigDecimal value) {
        set(43, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.old_rent</code>. 原订单租金
     */
    public BigDecimal getOldRent() {
        return (BigDecimal) get(43);
    }

    /**
     * Setter for <code>db_mall.t_orders.insurance_amount</code>. 订单保险 
     */
    public void setInsuranceAmount(BigDecimal value) {
        set(44, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.insurance_amount</code>. 订单保险 
     */
    public BigDecimal getInsuranceAmount() {
        return (BigDecimal) get(44);
    }

    /**
     * Setter for <code>db_mall.t_orders.old_insurance_amount</code>. 原订单保险
     */
    public void setOldInsuranceAmount(BigDecimal value) {
        set(45, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.old_insurance_amount</code>. 原订单保险
     */
    public BigDecimal getOldInsuranceAmount() {
        return (BigDecimal) get(45);
    }

    /**
     * Setter for <code>db_mall.t_orders.added_service_amount</code>. 增值服务总金额
     */
    public void setAddedServiceAmount(BigDecimal value) {
        set(46, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.added_service_amount</code>. 增值服务总金额
     */
    public BigDecimal getAddedServiceAmount() {
        return (BigDecimal) get(46);
    }

    /**
     * Setter for <code>db_mall.t_orders.soft_service_amount</code>. 软件服务总金额
     */
    public void setSoftServiceAmount(BigDecimal value) {
        set(47, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.soft_service_amount</code>. 软件服务总金额
     */
    public BigDecimal getSoftServiceAmount() {
        return (BigDecimal) get(47);
    }

    /**
     * Setter for <code>db_mall.t_orders.onsite_service_amount</code>. 上门服务总金额
     */
    public void setOnsiteServiceAmount(BigDecimal value) {
        set(48, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.onsite_service_amount</code>. 上门服务总金额
     */
    public BigDecimal getOnsiteServiceAmount() {
        return (BigDecimal) get(48);
    }

    /**
     * Setter for <code>db_mall.t_orders.suits_type</code>. 优惠套装商品
     */
    public void setSuitsType(Integer value) {
        set(49, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.suits_type</code>. 优惠套装商品
     */
    public Integer getSuitsType() {
        return (Integer) get(49);
    }

    /**
     * Setter for <code>db_mall.t_orders.sale_amount</code>. 订单销售金额
     */
    public void setSaleAmount(BigDecimal value) {
        set(50, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.sale_amount</code>. 订单销售金额
     */
    public BigDecimal getSaleAmount() {
        return (BigDecimal) get(50);
    }

    /**
     * Setter for <code>db_mall.t_orders.old_sale_amount</code>. 原订单销售金额
     */
    public void setOldSaleAmount(BigDecimal value) {
        set(51, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.old_sale_amount</code>. 原订单销售金额
     */
    public BigDecimal getOldSaleAmount() {
        return (BigDecimal) get(51);
    }

    /**
     * Setter for <code>db_mall.t_orders.payed_amount</code>. 分摊余额
     */
    public void setPayedAmount(BigDecimal value) {
        set(52, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.payed_amount</code>. 分摊余额
     */
    public BigDecimal getPayedAmount() {
        return (BigDecimal) get(52);
    }

    /**
     * Setter for <code>db_mall.t_orders.e_currency_virtual</code>.
     */
    public void setECurrencyVirtual(BigDecimal value) {
        set(53, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.e_currency_virtual</code>.
     */
    public BigDecimal getECurrencyVirtual() {
        return (BigDecimal) get(53);
    }

    /**
     * Setter for <code>db_mall.t_orders.credit_deposit</code>. 授信押金
     */
    public void setCreditDeposit(BigDecimal value) {
        set(54, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.credit_deposit</code>. 授信押金
     */
    public BigDecimal getCreditDeposit() {
        return (BigDecimal) get(54);
    }

    /**
     * Setter for <code>db_mall.t_orders.pay_deposit</code>. 应付押金
     */
    public void setPayDeposit(BigDecimal value) {
        set(55, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.pay_deposit</code>. 应付押金
     */
    public BigDecimal getPayDeposit() {
        return (BigDecimal) get(55);
    }

    /**
     * Setter for <code>db_mall.t_orders.need_amount</code>. 应付金额
     */
    public void setNeedAmount(BigDecimal value) {
        set(56, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.need_amount</code>. 应付金额
     */
    public BigDecimal getNeedAmount() {
        return (BigDecimal) get(56);
    }

    /**
     * Setter for <code>db_mall.t_orders.bill_date</code>.
     */
    public void setBillDate(Integer value) {
        set(57, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.bill_date</code>.
     */
    public Integer getBillDate() {
        return (Integer) get(57);
    }

    /**
     * Setter for <code>db_mall.t_orders.now_balance_num</code>. 当前账单期数
     */
    public void setNowBalanceNum(Integer value) {
        set(58, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.now_balance_num</code>. 当前账单期数
     */
    public Integer getNowBalanceNum() {
        return (Integer) get(58);
    }

    /**
     * Setter for <code>db_mall.t_orders.is_expire</code>. 是否逾期（0否1是）
     */
    public void setIsExpire(Byte value) {
        set(59, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.is_expire</code>. 是否逾期（0否1是）
     */
    public Byte getIsExpire() {
        return (Byte) get(59);
    }

    /**
     * Setter for <code>db_mall.t_orders.is_exchange</code>.
     */
    public void setIsExchange(Byte value) {
        set(60, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.is_exchange</code>.
     */
    public Byte getIsExchange() {
        return (Byte) get(60);
    }

    /**
     * Setter for <code>db_mall.t_orders.source_order_id</code>. 原订单id
     */
    public void setSourceOrderId(String value) {
        set(61, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.source_order_id</code>. 原订单id
     */
    public String getSourceOrderId() {
        return (String) get(61);
    }

    /**
     * Setter for <code>db_mall.t_orders.cdate</code>. 创建时间
     */
    public void setCdate(Timestamp value) {
        set(62, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.cdate</code>. 创建时间
     */
    public Timestamp getCdate() {
        return (Timestamp) get(62);
    }

    /**
     * Setter for <code>db_mall.t_orders.mdate</code>. 修改时间
     */
    public void setMdate(Timestamp value) {
        set(63, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.mdate</code>. 修改时间
     */
    public Timestamp getMdate() {
        return (Timestamp) get(63);
    }

    /**
     * Setter for <code>db_mall.t_orders.real_pay_deposit</code>. 真实冻结押金
     */
    public void setRealPayDeposit(BigDecimal value) {
        set(64, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.real_pay_deposit</code>. 真实冻结押金
     */
    public BigDecimal getRealPayDeposit() {
        return (BigDecimal) get(64);
    }

    /**
     * Setter for <code>db_mall.t_orders.rent_type_id</code>. 租赁周期id
     */
    public void setRentTypeId(Integer value) {
        set(65, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.rent_type_id</code>. 租赁周期id
     */
    public Integer getRentTypeId() {
        return (Integer) get(65);
    }

    /**
     * Setter for <code>db_mall.t_orders.renewal_status</code>. 续租状态（0未续租1已续租2取消续租）
     */
    public void setRenewalStatus(Byte value) {
        set(66, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.renewal_status</code>. 续租状态（0未续租1已续租2取消续租）
     */
    public Byte getRenewalStatus() {
        return (Byte) get(66);
    }

    /**
     * Setter for <code>db_mall.t_orders.order_type</code>. 订单类型 0:客户下单 1：续租订单 2：资产调拨
     */
    public void setOrderType(Byte value) {
        set(67, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.order_type</code>. 订单类型 0:客户下单 1：续租订单 2：资产调拨
     */
    public Byte getOrderType() {
        return (Byte) get(67);
    }

    /**
     * Setter for <code>db_mall.t_orders.warehouse_id</code>. 仓库id
     */
    public void setWarehouseId(Integer value) {
        set(68, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.warehouse_id</code>. 仓库id
     */
    public Integer getWarehouseId() {
        return (Integer) get(68);
    }

    /**
     * Setter for <code>db_mall.t_orders.warehouse_name</code>. 仓库名称
     */
    public void setWarehouseName(String value) {
        set(69, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.warehouse_name</code>. 仓库名称
     */
    public String getWarehouseName() {
        return (String) get(69);
    }

    /**
     * Setter for <code>db_mall.t_orders.interview_status</code>. 面签状态；0无须面签；1待面签；2面签通过；3面签不通过
     */
    public void setInterviewStatus(Byte value) {
        set(70, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.interview_status</code>. 面签状态；0无须面签；1待面签；2面签通过；3面签不通过
     */
    public Byte getInterviewStatus() {
        return (Byte) get(70);
    }

    /**
     * Setter for <code>db_mall.t_orders.is_ali_app</code>. 是否是支付宝app端内下单 0否；1是
     */
    public void setIsAliApp(Byte value) {
        set(71, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.is_ali_app</code>. 是否是支付宝app端内下单 0否；1是
     */
    public Byte getIsAliApp() {
        return (Byte) get(71);
    }

    /**
     * Setter for <code>db_mall.t_orders.is_zhima_credit</code>. 是否是芝麻信用流程 0否；1是
     */
    public void setIsZhimaCredit(Byte value) {
        set(72, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.is_zhima_credit</code>. 是否是芝麻信用流程 0否；1是
     */
    public Byte getIsZhimaCredit() {
        return (Byte) get(72);
    }

    /**
     * Setter for <code>db_mall.t_orders.sync_erp_fail_type</code>. 同步ERP失败类型 0无效，默认值 1未支付,2客户已逾期,3客户授信未通过,4ECM调用异常,5ERP调用异常,6客户授信可用余额小于0,7客户集团母公司授信可用余额小于0或授信未通过,8订单数据非法
     */
    public void setSyncErpFailType(Byte value) {
        set(73, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.sync_erp_fail_type</code>. 同步ERP失败类型 0无效，默认值 1未支付,2客户已逾期,3客户授信未通过,4ECM调用异常,5ERP调用异常,6客户授信可用余额小于0,7客户集团母公司授信可用余额小于0或授信未通过,8订单数据非法
     */
    public Byte getSyncErpFailType() {
        return (Byte) get(73);
    }

    /**
     * Setter for <code>db_mall.t_orders.zhima_order_no</code>. 芝麻信用业务号
     */
    public void setZhimaOrderNo(String value) {
        set(74, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.zhima_order_no</code>. 芝麻信用业务号
     */
    public String getZhimaOrderNo() {
        return (String) get(74);
    }

    /**
     * Setter for <code>db_mall.t_orders.zhima_credit_order_no</code>. 芝麻信用额度申请业务号
     */
    public void setZhimaCreditOrderNo(String value) {
        set(75, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.zhima_credit_order_no</code>. 芝麻信用额度申请业务号
     */
    public String getZhimaCreditOrderNo() {
        return (String) get(75);
    }

    /**
     * Setter for <code>db_mall.t_orders.zhima_lease_order_no</code>. 芝麻信用业务订单号
     */
    public void setZhimaLeaseOrderNo(String value) {
        set(76, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.zhima_lease_order_no</code>. 芝麻信用业务订单号
     */
    public String getZhimaLeaseOrderNo() {
        return (String) get(76);
    }

    /**
     * Setter for <code>db_mall.t_orders.interview_date</code>. 经过面签流程的时间
     */
    public void setInterviewDate(Timestamp value) {
        set(77, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.interview_date</code>. 经过面签流程的时间
     */
    public Timestamp getInterviewDate() {
        return (Timestamp) get(77);
    }

    /**
     * Setter for <code>db_mall.t_orders.is_virtual</code>. 是否虚拟订单 0否；1是
     */
    public void setIsVirtual(Byte value) {
        set(78, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.is_virtual</code>. 是否虚拟订单 0否；1是
     */
    public Byte getIsVirtual() {
        return (Byte) get(78);
    }

    /**
     * Setter for <code>db_mall.t_orders.virtual_reason</code>. 虚拟原因 0设备调拨；1更改租赁方式；2更改付款方式；3更改设备sku 4更改设备SN；5换货设备未退回；6QUICKPC 部分换机
     */
    public void setVirtualReason(Byte value) {
        set(79, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.virtual_reason</code>. 虚拟原因 0设备调拨；1更改租赁方式；2更改付款方式；3更改设备sku 4更改设备SN；5换货设备未退回；6QUICKPC 部分换机
     */
    public Byte getVirtualReason() {
        return (Byte) get(79);
    }

    /**
     * Setter for <code>db_mall.t_orders.original_order_id</code>. 虚拟原订单号
     */
    public void setOriginalOrderId(String value) {
        set(80, value);
    }

    /**
     * Getter for <code>db_mall.t_orders.original_order_id</code>. 虚拟原订单号
     */
    public String getOriginalOrderId() {
        return (String) get(80);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TOrdersRecord
     */
    public TOrdersRecord() {
        super(TOrders.T_ORDERS);
    }

    /**
     * Create a detached, initialised TOrdersRecord
     */
    public TOrdersRecord(Integer id, String orderId, String mainOrderId, Integer customerId, String receiverName, String receiverPhone, String receiverAddress, Integer provinceId, Integer bcityId, Integer scityId, String companyName, Byte paymentType, Byte payType, Byte isShow, Byte source, Byte rentType, Integer startDate, Integer realStartDate, String userRemark, String systemRemark, Integer creditNewR, Integer creditOldR, Integer creditNewDiscountPercent, Integer creditOldDiscountPercent, Integer goodsNewDiscountPercent, Integer goodsOldDiscountPercent, Integer month, Byte payStatus, Integer status, Byte syncErpStatus, String syncErpFailReason, Timestamp syncErpDate, Byte syncStatus, Byte isSale, Integer oid, Byte isNeedBill, Timestamp payDate, Integer couponId, BigDecimal couponAmount, Timestamp deliveryTime, BigDecimal deposit, BigDecimal oldDeposit, BigDecimal rent, BigDecimal oldRent, BigDecimal insuranceAmount, BigDecimal oldInsuranceAmount, BigDecimal addedServiceAmount, BigDecimal softServiceAmount, BigDecimal onsiteServiceAmount, Integer suitsType, BigDecimal saleAmount, BigDecimal oldSaleAmount, BigDecimal payedAmount, BigDecimal eCurrencyVirtual, BigDecimal creditDeposit, BigDecimal payDeposit, BigDecimal needAmount, Integer billDate, Integer nowBalanceNum, Byte isExpire, Byte isExchange, String sourceOrderId, Timestamp cdate, Timestamp mdate, BigDecimal realPayDeposit, Integer rentTypeId, Byte renewalStatus, Byte orderType, Integer warehouseId, String warehouseName, Byte interviewStatus, Byte isAliApp, Byte isZhimaCredit, Byte syncErpFailType, String zhimaOrderNo, String zhimaCreditOrderNo, String zhimaLeaseOrderNo, Timestamp interviewDate, Byte isVirtual, Byte virtualReason, String originalOrderId) {
        super(TOrders.T_ORDERS);

        set(0, id);
        set(1, orderId);
        set(2, mainOrderId);
        set(3, customerId);
        set(4, receiverName);
        set(5, receiverPhone);
        set(6, receiverAddress);
        set(7, provinceId);
        set(8, bcityId);
        set(9, scityId);
        set(10, companyName);
        set(11, paymentType);
        set(12, payType);
        set(13, isShow);
        set(14, source);
        set(15, rentType);
        set(16, startDate);
        set(17, realStartDate);
        set(18, userRemark);
        set(19, systemRemark);
        set(20, creditNewR);
        set(21, creditOldR);
        set(22, creditNewDiscountPercent);
        set(23, creditOldDiscountPercent);
        set(24, goodsNewDiscountPercent);
        set(25, goodsOldDiscountPercent);
        set(26, month);
        set(27, payStatus);
        set(28, status);
        set(29, syncErpStatus);
        set(30, syncErpFailReason);
        set(31, syncErpDate);
        set(32, syncStatus);
        set(33, isSale);
        set(34, oid);
        set(35, isNeedBill);
        set(36, payDate);
        set(37, couponId);
        set(38, couponAmount);
        set(39, deliveryTime);
        set(40, deposit);
        set(41, oldDeposit);
        set(42, rent);
        set(43, oldRent);
        set(44, insuranceAmount);
        set(45, oldInsuranceAmount);
        set(46, addedServiceAmount);
        set(47, softServiceAmount);
        set(48, onsiteServiceAmount);
        set(49, suitsType);
        set(50, saleAmount);
        set(51, oldSaleAmount);
        set(52, payedAmount);
        set(53, eCurrencyVirtual);
        set(54, creditDeposit);
        set(55, payDeposit);
        set(56, needAmount);
        set(57, billDate);
        set(58, nowBalanceNum);
        set(59, isExpire);
        set(60, isExchange);
        set(61, sourceOrderId);
        set(62, cdate);
        set(63, mdate);
        set(64, realPayDeposit);
        set(65, rentTypeId);
        set(66, renewalStatus);
        set(67, orderType);
        set(68, warehouseId);
        set(69, warehouseName);
        set(70, interviewStatus);
        set(71, isAliApp);
        set(72, isZhimaCredit);
        set(73, syncErpFailType);
        set(74, zhimaOrderNo);
        set(75, zhimaCreditOrderNo);
        set(76, zhimaLeaseOrderNo);
        set(77, interviewDate);
        set(78, isVirtual);
        set(79, virtualReason);
        set(80, originalOrderId);
    }
}