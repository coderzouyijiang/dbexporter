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
public class TCustomerActionLogs implements Serializable {

    private static final long serialVersionUID = 1478365274;

    private Integer   id;
    private String    className;
    private String    methodName;
    private String    actionParameter;
    private String    returnResult;
    private Integer   userId;
    private Timestamp cdate;
    private Timestamp mdate;

    public TCustomerActionLogs() {}

    public TCustomerActionLogs(TCustomerActionLogs value) {
        this.id = value.id;
        this.className = value.className;
        this.methodName = value.methodName;
        this.actionParameter = value.actionParameter;
        this.returnResult = value.returnResult;
        this.userId = value.userId;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TCustomerActionLogs(
        Integer   id,
        String    className,
        String    methodName,
        String    actionParameter,
        String    returnResult,
        Integer   userId,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.className = className;
        this.methodName = methodName;
        this.actionParameter = actionParameter;
        this.returnResult = returnResult;
        this.userId = userId;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TCustomerActionLogs setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    @Size(max = 150)
    public String getClassName() {
        return this.className;
    }

    public TCustomerActionLogs setClassName(String className) {
        this.className = className;
        return this;
    }

    @NotNull
    @Size(max = 50)
    public String getMethodName() {
        return this.methodName;
    }

    public TCustomerActionLogs setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }

    @Size(max = 65535)
    public String getActionParameter() {
        return this.actionParameter;
    }

    public TCustomerActionLogs setActionParameter(String actionParameter) {
        this.actionParameter = actionParameter;
        return this;
    }

    @Size(max = 65535)
    public String getReturnResult() {
        return this.returnResult;
    }

    public TCustomerActionLogs setReturnResult(String returnResult) {
        this.returnResult = returnResult;
        return this;
    }

    @NotNull
    public Integer getUserId() {
        return this.userId;
    }

    public TCustomerActionLogs setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCustomerActionLogs setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCustomerActionLogs setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCustomerActionLogs (");

        sb.append(id);
        sb.append(", ").append(className);
        sb.append(", ").append(methodName);
        sb.append(", ").append(actionParameter);
        sb.append(", ").append(returnResult);
        sb.append(", ").append(userId);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}