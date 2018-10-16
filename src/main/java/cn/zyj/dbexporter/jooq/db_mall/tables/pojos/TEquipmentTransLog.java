/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * 设备事件变化历史记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TEquipmentTransLog implements Serializable {

    private static final long serialVersionUID = -1000898904;

    private Long      id;
    private Long      customerId;
    private String    orderId;
    private String    sn;
    private Byte      currentStatus;
    private String    source;
    private Timestamp operateTime;
    private Timestamp updateTime;

    public TEquipmentTransLog() {}

    public TEquipmentTransLog(TEquipmentTransLog value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.orderId = value.orderId;
        this.sn = value.sn;
        this.currentStatus = value.currentStatus;
        this.source = value.source;
        this.operateTime = value.operateTime;
        this.updateTime = value.updateTime;
    }

    public TEquipmentTransLog(
        Long      id,
        Long      customerId,
        String    orderId,
        String    sn,
        Byte      currentStatus,
        String    source,
        Timestamp operateTime,
        Timestamp updateTime
    ) {
        this.id = id;
        this.customerId = customerId;
        this.orderId = orderId;
        this.sn = sn;
        this.currentStatus = currentStatus;
        this.source = source;
        this.operateTime = operateTime;
        this.updateTime = updateTime;
    }

    public Long getId() {
        return this.id;
    }

    public TEquipmentTransLog setId(Long id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Long getCustomerId() {
        return this.customerId;
    }

    public TEquipmentTransLog setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    @NotNull
    @Size(max = 20)
    public String getOrderId() {
        return this.orderId;
    }

    public TEquipmentTransLog setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Size(max = 50)
    public String getSn() {
        return this.sn;
    }

    public TEquipmentTransLog setSn(String sn) {
        this.sn = sn;
        return this;
    }

    @NotNull
    public Byte getCurrentStatus() {
        return this.currentStatus;
    }

    public TEquipmentTransLog setCurrentStatus(Byte currentStatus) {
        this.currentStatus = currentStatus;
        return this;
    }

    @NotNull
    @Size(max = 200)
    public String getSource() {
        return this.source;
    }

    public TEquipmentTransLog setSource(String source) {
        this.source = source;
        return this;
    }

    @NotNull
    public Timestamp getOperateTime() {
        return this.operateTime;
    }

    public TEquipmentTransLog setOperateTime(Timestamp operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public TEquipmentTransLog setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TEquipmentTransLog (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(orderId);
        sb.append(", ").append(sn);
        sb.append(", ").append(currentStatus);
        sb.append(", ").append(source);
        sb.append(", ").append(operateTime);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}