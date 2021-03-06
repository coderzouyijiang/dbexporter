/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class TOrderShare implements Serializable {

    private static final long serialVersionUID = -849028569;

    private Timestamp lastDate;

    public TOrderShare() {}

    public TOrderShare(TOrderShare value) {
        this.lastDate = value.lastDate;
    }

    public TOrderShare(
        Timestamp lastDate
    ) {
        this.lastDate = lastDate;
    }

    @NotNull
    public Timestamp getLastDate() {
        return this.lastDate;
    }

    public TOrderShare setLastDate(Timestamp lastDate) {
        this.lastDate = lastDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TOrderShare (");

        sb.append(lastDate);

        sb.append(")");
        return sb.toString();
    }
}
