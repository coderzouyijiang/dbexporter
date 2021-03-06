/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq;


import cn.zyj.dbexporter.jooq.db_calculator.DbCalculator;
import cn.zyj.dbexporter.jooq.db_mall.DbMall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;


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
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = -970633196;

    /**
     * The reference instance of <code></code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>db_calculator</code>.
     */
    public final DbCalculator DB_CALCULATOR = cn.zyj.dbexporter.jooq.db_calculator.DbCalculator.DB_CALCULATOR;

    /**
     * The schema <code>db_mall</code>.
     */
    public final DbMall DB_MALL = cn.zyj.dbexporter.jooq.db_mall.DbMall.DB_MALL;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        List result = new ArrayList();
        result.addAll(getSchemas0());
        return result;
    }

    private final List<Schema> getSchemas0() {
        return Arrays.<Schema>asList(
            DbCalculator.DB_CALCULATOR,
            DbMall.DB_MALL);
    }
}
