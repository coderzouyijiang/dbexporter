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
public class TCustomerCrmPaytypeBandLog implements Serializable {

    private static final long serialVersionUID = -1500054643;

    private Integer   id;
    private Integer   customerId;
    private String    requestStr;
    private Timestamp cdate;
    private Timestamp mdate;

    public TCustomerCrmPaytypeBandLog() {}

    public TCustomerCrmPaytypeBandLog(TCustomerCrmPaytypeBandLog value) {
        this.id = value.id;
        this.customerId = value.customerId;
        this.requestStr = value.requestStr;
        this.cdate = value.cdate;
        this.mdate = value.mdate;
    }

    public TCustomerCrmPaytypeBandLog(
        Integer   id,
        Integer   customerId,
        String    requestStr,
        Timestamp cdate,
        Timestamp mdate
    ) {
        this.id = id;
        this.customerId = customerId;
        this.requestStr = requestStr;
        this.cdate = cdate;
        this.mdate = mdate;
    }

    public Integer getId() {
        return this.id;
    }

    public TCustomerCrmPaytypeBandLog setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Integer getCustomerId() {
        return this.customerId;
    }

    public TCustomerCrmPaytypeBandLog setCustomerId(Integer customerId) {
        this.customerId = customerId;
        return this;
    }

    @Size(max = 500)
    public String getRequestStr() {
        return this.requestStr;
    }

    public TCustomerCrmPaytypeBandLog setRequestStr(String requestStr) {
        this.requestStr = requestStr;
        return this;
    }

    @NotNull
    public Timestamp getCdate() {
        return this.cdate;
    }

    public TCustomerCrmPaytypeBandLog setCdate(Timestamp cdate) {
        this.cdate = cdate;
        return this;
    }

    @NotNull
    public Timestamp getMdate() {
        return this.mdate;
    }

    public TCustomerCrmPaytypeBandLog setMdate(Timestamp mdate) {
        this.mdate = mdate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCustomerCrmPaytypeBandLog (");

        sb.append(id);
        sb.append(", ").append(customerId);
        sb.append(", ").append(requestStr);
        sb.append(", ").append(cdate);
        sb.append(", ").append(mdate);

        sb.append(")");
        return sb.toString();
    }
}
