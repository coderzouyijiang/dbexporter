/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


/**
 * 代客下单日志记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class THelpCustomerOrderLog implements Serializable {

    private static final long serialVersionUID = 807047747;

    private Integer   id;
    private Integer   managerId;
    private Integer   customerId;
    private Integer   orderNum;
    private Timestamp createTime;
    private Timestamp updateTime;

    public THelpCustomerOrderLog() {}

    public THelpCustomerOrderLog(THelpCustomerOrderLog value) {
        this.id = value.id;
        this.managerId = value.managerId;
        this.customerId = value.customerId;
        this.orderNum = value.orderNum;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
    }

    public THelpCustomerOrderLog(
        Integer   id,
        Integer   managerId,
        Integer   customerId,
        Integer   orderNum,
        Timestamp createTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.managerId = managerId;
        this.customerId = customerId;
        this.orderNum = orderNum;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return this.id;
    }

    public THelpCustomerOrderLog setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Integer getManagerId() {
        return this.managerId;
    }

    public THelpCustomerOrderLog setManagerId(Integer managerId) {
        this.managerId = managerId;
        return this;
    }

    @NotNull
    public Integer getCustomerId() {
        return this.customerId;
    }

    public THelpCustomerOrderLog setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    @NotNull
    public Integer getOrderNum() {
        return this.orderNum;
    }

    public THelpCustomerOrderLog setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public THelpCustomerOrderLog setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public THelpCustomerOrderLog setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("THelpCustomerOrderLog (");

        sb.append(id);
        sb.append(", ").append(managerId);
        sb.append(", ").append(customerId);
        sb.append(", ").append(orderNum);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
