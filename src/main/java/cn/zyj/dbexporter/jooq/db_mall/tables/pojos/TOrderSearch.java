/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;

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
public class TOrderSearch implements Serializable {

    private static final long serialVersionUID = 1764720430;

    private Integer id;
    private String  orderId;

    public TOrderSearch() {}

    public TOrderSearch(TOrderSearch value) {
        this.id = value.id;
        this.orderId = value.orderId;
    }

    public TOrderSearch(
        Integer id,
        String  orderId
    ) {
        this.id = id;
        this.orderId = orderId;
    }

    public Integer getId() {
        return this.id;
    }

    public TOrderSearch setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    @Size(max = 20)
    public String getOrderId() {
        return this.orderId;
    }

    public TOrderSearch setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TOrderSearch (");

        sb.append(id);
        sb.append(", ").append(orderId);

        sb.append(")");
        return sb.toString();
    }
}