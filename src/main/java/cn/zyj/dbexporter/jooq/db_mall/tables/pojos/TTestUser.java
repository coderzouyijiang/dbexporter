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
public class TTestUser implements Serializable {

    private static final long serialVersionUID = 1991694986;

    private Integer id;
    private String  phone;
    private String  name;
    private String  company;

    public TTestUser() {}

    public TTestUser(TTestUser value) {
        this.id = value.id;
        this.phone = value.phone;
        this.name = value.name;
        this.company = value.company;
    }

    public TTestUser(
        Integer id,
        String  phone,
        String  name,
        String  company
    ) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.company = company;
    }

    public Integer getId() {
        return this.id;
    }

    public TTestUser setId(Integer id) {
        this.id = id;
        return this;
    }

    @NotNull
    @Size(max = 20)
    public String getPhone() {
        return this.phone;
    }

    public TTestUser setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Size(max = 20)
    public String getName() {
        return this.name;
    }

    public TTestUser setName(String name) {
        this.name = name;
        return this;
    }

    @Size(max = 100)
    public String getCompany() {
        return this.company;
    }

    public TTestUser setCompany(String company) {
        this.company = company;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TTestUser (");

        sb.append(id);
        sb.append(", ").append(phone);
        sb.append(", ").append(name);
        sb.append(", ").append(company);

        sb.append(")");
        return sb.toString();
    }
}