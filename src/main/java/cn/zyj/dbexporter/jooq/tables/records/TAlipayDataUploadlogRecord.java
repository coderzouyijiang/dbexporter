/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables.records;


import cn.zyj.dbexporter.jooq.tables.TAlipayDataUploadlog;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 支付宝回传数据日志记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAlipayDataUploadlogRecord extends UpdatableRecordImpl<TAlipayDataUploadlogRecord> {

    private static final long serialVersionUID = -351349601;

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.id</code>. 主键id
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.id</code>. 主键id
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.main_order_id</code>. 所属主订单号
     */
    public void setMainOrderId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.main_order_id</code>. 所属主订单号
     */
    public String getMainOrderId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.order_id</code>. 所属订单号
     */
    public void setOrderId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.order_id</code>. 所属订单号
     */
    public String getOrderId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.customer_id</code>. 客户id
     */
    public void setCustomerId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.customer_id</code>. 客户id
     */
    public Integer getCustomerId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.biz_date</code>. 统计日期
     */
    public void setBizDate(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.biz_date</code>. 统计日期
     */
    public Date getBizDate() {
        return (Date) get(4);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.upload_status</code>. 日志当前状态 0准备 1未发送，待发送 2已发送且发送失败 3已发送但发送成功
     */
    public void setUploadStatus(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.upload_status</code>. 日志当前状态 0准备 1未发送，待发送 2已发送且发送失败 3已发送但发送成功
     */
    public Byte getUploadStatus() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.upload_situation</code>. 上传场景 0用户张三申请订单被拒绝(未面签) 1用户张三申请订单被拒绝(已面签) 2用户张三申请订单通过 3用户张三申请订单通过后取消订单 4出账 5账单逾期 6账单完成 7租赁完成，订单结束
     */
    public void setUploadSituation(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.upload_situation</code>. 上传场景 0用户张三申请订单被拒绝(未面签) 1用户张三申请订单被拒绝(已面签) 2用户张三申请订单通过 3用户张三申请订单通过后取消订单 4出账 5账单逾期 6账单完成 7租赁完成，订单结束
     */
    public Byte getUploadSituation() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.bill_no</code>. 账单号，存储的t_order_bill表的主键id
     */
    public void setBillNo(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.bill_no</code>. 账单号，存储的t_order_bill表的主键id
     */
    public Integer getBillNo() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.user_credentials_type</code>. 法人证件类型0-身份证；1-户口簿； 2-护照； 3-军官证； 4-士兵证； 5-港澳居民来往内地通行证； 6-台湾同胞来往内地通行证； 7-临时身份证； 8-外国人居留证； 9-警官证； A-香港身份证； B-澳门身份证； C-台湾身份证； Z-支付宝用户ID+身份证后4位； X-其他证件； W-支付宝用户ID
     */
    public void setUserCredentialsType(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.user_credentials_type</code>. 法人证件类型0-身份证；1-户口簿； 2-护照； 3-军官证； 4-士兵证； 5-港澳居民来往内地通行证； 6-台湾同胞来往内地通行证； 7-临时身份证； 8-外国人居留证； 9-警官证； A-香港身份证； B-澳门身份证； C-台湾身份证； Z-支付宝用户ID+身份证后4位； X-其他证件； W-支付宝用户ID
     */
    public String getUserCredentialsType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.user_credentials_no</code>. 法人证件号码
     */
    public void setUserCredentialsNo(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.user_credentials_no</code>. 法人证件号码
     */
    public String getUserCredentialsNo() {
        return (String) get(9);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.user_name</code>. 法人姓名
     */
    public void setUserName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.user_name</code>. 法人姓名
     */
    public String getUserName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.ent_credentials_type</code>. 企业证件类型10-工商注册号； 11-组织机构代码证； 12-税务登记证； 13-统一社会信用代码； 99-其他企业证件;
     */
    public void setEntCredentialsType(Byte value) {
        set(11, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.ent_credentials_type</code>. 企业证件类型10-工商注册号； 11-组织机构代码证； 12-税务登记证； 13-统一社会信用代码； 99-其他企业证件;
     */
    public Byte getEntCredentialsType() {
        return (Byte) get(11);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.ent_credentials_no</code>. 企业证件号码
     */
    public void setEntCredentialsNo(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.ent_credentials_no</code>. 企业证件号码
     */
    public String getEntCredentialsNo() {
        return (String) get(12);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.ent_name</code>. 企业名称
     */
    public void setEntName(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.ent_name</code>. 企业名称
     */
    public String getEntName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.guarantee_flag</code>. 无限连带责任（法人连带担保责任）0-是;1-否;
     */
    public void setGuaranteeFlag(Byte value) {
        set(14, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.guarantee_flag</code>. 无限连带责任（法人连带担保责任）0-是;1-否;
     */
    public Byte getGuaranteeFlag() {
        return (Byte) get(14);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.order_no</code>. 业务订单号
     */
    public void setOrderNo(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.order_no</code>. 业务订单号
     */
    public String getOrderNo() {
        return (String) get(15);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.credit_no</code>. 额度编号
     */
    public void setCreditNo(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.credit_no</code>. 额度编号
     */
    public String getCreditNo() {
        return (String) get(16);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.business_type</code>. 业务种类21-信用贷款； 22-抵押贷款； 23-供应链金融 ; 24-交易赊销 ; 25-免押租赁;
     */
    public void setBusinessType(Byte value) {
        set(17, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.business_type</code>. 业务种类21-信用贷款； 22-抵押贷款； 23-供应链金融 ; 24-交易赊销 ; 25-免押租赁;
     */
    public Byte getBusinessType() {
        return (Byte) get(17);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.order_status</code>. 当前业务状态0-正常；1-逾期； 2-结清； 3-业务开始; 4-取消订单; 21-授信审批通过; 22-业务拒绝;
     */
    public void setOrderStatus(Byte value) {
        set(18, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.order_status</code>. 当前业务状态0-正常；1-逾期； 2-结清； 3-业务开始; 4-取消订单; 21-授信审批通过; 22-业务拒绝;
     */
    public Byte getOrderStatus() {
        return (Byte) get(18);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.order_start_date</code>. 订单开始日期
     */
    public void setOrderStartDate(Date value) {
        set(19, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.order_start_date</code>. 订单开始日期
     */
    public Date getOrderStartDate() {
        return (Date) get(19);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.order_due_date</code>. 订单结束日期
     */
    public void setOrderDueDate(Date value) {
        set(20, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.order_due_date</code>. 订单结束日期
     */
    public Date getOrderDueDate() {
        return (Date) get(20);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.order_end_date</code>. 订单实际结束日期/审批拒绝日期
     */
    public void setOrderEndDate(Date value) {
        set(21, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.order_end_date</code>. 订单实际结束日期/审批拒绝日期
     */
    public Date getOrderEndDate() {
        return (Date) get(21);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.reject_type</code>. 拒绝类型 201-经营规模与订单不匹配;202-企业经营风险; 203-企业欺诈风险; 204-其他风险;999-非面签拒绝;
     */
    public void setRejectType(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.reject_type</code>. 拒绝类型 201-经营规模与订单不匹配;202-企业经营风险; 203-企业欺诈风险; 204-其他风险;999-非面签拒绝;
     */
    public Integer getRejectType() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.create_amt</code>. 放款金额，单位为元，最多保留两位小数
     */
    public void setCreateAmt(BigDecimal value) {
        set(23, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.create_amt</code>. 放款金额，单位为元，最多保留两位小数
     */
    public BigDecimal getCreateAmt() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.review_flag</code>. 面签标识0-未面签;1-已面签;
     */
    public void setReviewFlag(Byte value) {
        set(24, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.review_flag</code>. 面签标识0-未面签;1-已面签;
     */
    public Byte getReviewFlag() {
        return (Byte) get(24);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.review_address</code>. 面签地址
     */
    public void setReviewAddress(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.review_address</code>. 面签地址
     */
    public String getReviewAddress() {
        return (String) get(25);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.bill_type</code>. 账单类型100-分期租金(还款金额);401-企业失联;402-拒还设备;403-设备被查封;404-设备转租售;499-其他风险;
     */
    public void setBillType(Short value) {
        set(26, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.bill_type</code>. 账单类型100-分期租金(还款金额);401-企业失联;402-拒还设备;403-设备被查封;404-设备转租售;499-其他风险;
     */
    public Short getBillType() {
        return (Short) get(26);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.bill_installment</code>. 账单月份，格式为: YYYYMM
     */
    public void setBillInstallment(Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.bill_installment</code>. 账单月份，格式为: YYYYMM
     */
    public Integer getBillInstallment() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.bill_amt</code>. 本期账单金额，单位为元，最多保留两位小数
     */
    public void setBillAmt(BigDecimal value) {
        set(28, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.bill_amt</code>. 本期账单金额，单位为元，最多保留两位小数
     */
    public BigDecimal getBillAmt() {
        return (BigDecimal) get(28);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.bill_last_date</code>. 本期应还款日
     */
    public void setBillLastDate(Date value) {
        set(29, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.bill_last_date</code>. 本期应还款日
     */
    public Date getBillLastDate() {
        return (Date) get(29);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.bill_payoff_date</code>. 本期实际结清日期
     */
    public void setBillPayoffDate(Date value) {
        set(30, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.bill_payoff_date</code>. 本期实际结清日期
     */
    public Date getBillPayoffDate() {
        return (Date) get(30);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.bill_status</code>. 账单状态;0-正常;1-逾期;2-账单结清;
     */
    public void setBillStatus(Byte value) {
        set(31, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.bill_status</code>. 账单状态;0-正常;1-逾期;2-账单结清;
     */
    public Byte getBillStatus() {
        return (Byte) get(31);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.bill_type_ovd_amt</code>. 当前逾期金额，单位为元，最多保留两位小数
     */
    public void setBillTypeOvdAmt(BigDecimal value) {
        set(32, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.bill_type_ovd_amt</code>. 当前逾期金额，单位为元，最多保留两位小数
     */
    public BigDecimal getBillTypeOvdAmt() {
        return (BigDecimal) get(32);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.bill_type_ovd_date</code>. 当前违约开始日期
     */
    public void setBillTypeOvdDate(Date value) {
        set(33, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.bill_type_ovd_date</code>. 当前违约开始日期
     */
    public Date getBillTypeOvdDate() {
        return (Date) get(33);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.memo</code>. 备用字段
     */
    public void setMemo(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.memo</code>. 备用字段
     */
    public String getMemo() {
        return (String) get(34);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.create_time</code>. 创建时间
     */
    public void setCreateTime(Timestamp value) {
        set(35, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(35);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.update_time</code>. 修改时间
     */
    public void setUpdateTime(Timestamp value) {
        set(36, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.update_time</code>. 修改时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(36);
    }

    /**
     * Setter for <code>db_mall.t_alipay_data_uploadlog.task_id</code>. 传入芝麻信用，回传的taskid
     */
    public void setTaskId(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>db_mall.t_alipay_data_uploadlog.task_id</code>. 传入芝麻信用，回传的taskid
     */
    public String getTaskId() {
        return (String) get(37);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TAlipayDataUploadlogRecord
     */
    public TAlipayDataUploadlogRecord() {
        super(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG);
    }

    /**
     * Create a detached, initialised TAlipayDataUploadlogRecord
     */
    public TAlipayDataUploadlogRecord(Integer id, String mainOrderId, String orderId, Integer customerId, Date bizDate, Byte uploadStatus, Byte uploadSituation, Integer billNo, String userCredentialsType, String userCredentialsNo, String userName, Byte entCredentialsType, String entCredentialsNo, String entName, Byte guaranteeFlag, String orderNo, String creditNo, Byte businessType, Byte orderStatus, Date orderStartDate, Date orderDueDate, Date orderEndDate, Integer rejectType, BigDecimal createAmt, Byte reviewFlag, String reviewAddress, Short billType, Integer billInstallment, BigDecimal billAmt, Date billLastDate, Date billPayoffDate, Byte billStatus, BigDecimal billTypeOvdAmt, Date billTypeOvdDate, String memo, Timestamp createTime, Timestamp updateTime, String taskId) {
        super(TAlipayDataUploadlog.T_ALIPAY_DATA_UPLOADLOG);

        set(0, id);
        set(1, mainOrderId);
        set(2, orderId);
        set(3, customerId);
        set(4, bizDate);
        set(5, uploadStatus);
        set(6, uploadSituation);
        set(7, billNo);
        set(8, userCredentialsType);
        set(9, userCredentialsNo);
        set(10, userName);
        set(11, entCredentialsType);
        set(12, entCredentialsNo);
        set(13, entName);
        set(14, guaranteeFlag);
        set(15, orderNo);
        set(16, creditNo);
        set(17, businessType);
        set(18, orderStatus);
        set(19, orderStartDate);
        set(20, orderDueDate);
        set(21, orderEndDate);
        set(22, rejectType);
        set(23, createAmt);
        set(24, reviewFlag);
        set(25, reviewAddress);
        set(26, billType);
        set(27, billInstallment);
        set(28, billAmt);
        set(29, billLastDate);
        set(30, billPayoffDate);
        set(31, billStatus);
        set(32, billTypeOvdAmt);
        set(33, billTypeOvdDate);
        set(34, memo);
        set(35, createTime);
        set(36, updateTime);
        set(37, taskId);
    }
}
