/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;


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
public class TCutMoneyDay implements Serializable {

    private static final long serialVersionUID = -1563382146;

    private Integer id;
    private Date    date;

    public TCutMoneyDay() {}

    public TCutMoneyDay(TCutMoneyDay value) {
        this.id = value.id;
        this.date = value.date;
    }

    public TCutMoneyDay(
        Integer id,
        Date    date
    ) {
        this.id = id;
        this.date = date;
    }

    public Integer getId() {
        return this.id;
    }

    public TCutMoneyDay setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    public Date getDate() {
        return this.date;
    }

    public TCutMoneyDay setDate(Date date) {
        this.date = date;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TCutMoneyDay (");

        sb.append(id);
        sb.append(", ").append(date);

        sb.append(")");
        return sb.toString();
    }
}
