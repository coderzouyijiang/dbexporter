/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_calculator;


import cn.zyj.dbexporter.jooq.DefaultCatalog;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TCalculator;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TCalculatorRecord;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TDepreciation;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TEnums;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TResource;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TResourceLog;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TSequence;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TSkuRelation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class DbCalculator extends SchemaImpl {

    private static final long serialVersionUID = 171661675;

    /**
     * The reference instance of <code>db_calculator</code>
     */
    public static final DbCalculator DB_CALCULATOR = new DbCalculator();

    /**
     * 计算器报价单
     */
    public final TCalculator T_CALCULATOR = cn.zyj.dbexporter.jooq.db_calculator.tables.TCalculator.T_CALCULATOR;

    /**
     * 报价单操作记录
     */
    public final TCalculatorRecord T_CALCULATOR_RECORD = cn.zyj.dbexporter.jooq.db_calculator.tables.TCalculatorRecord.T_CALCULATOR_RECORD;

    /**
     * 残值
     */
    public final TDepreciation T_DEPRECIATION = cn.zyj.dbexporter.jooq.db_calculator.tables.TDepreciation.T_DEPRECIATION;

    /**
     * The table <code>db_calculator.t_enums</code>.
     */
    public final TEnums T_ENUMS = cn.zyj.dbexporter.jooq.db_calculator.tables.TEnums.T_ENUMS;

    /**
     * 资源池
     */
    public final TResource T_RESOURCE = cn.zyj.dbexporter.jooq.db_calculator.tables.TResource.T_RESOURCE;

    /**
     * 资源池日志
     */
    public final TResourceLog T_RESOURCE_LOG = cn.zyj.dbexporter.jooq.db_calculator.tables.TResourceLog.T_RESOURCE_LOG;

    /**
     * The table <code>db_calculator.t_sequence</code>.
     */
    public final TSequence T_SEQUENCE = cn.zyj.dbexporter.jooq.db_calculator.tables.TSequence.T_SEQUENCE;

    /**
     * sku组合关系表
     */
    public final TSkuRelation T_SKU_RELATION = cn.zyj.dbexporter.jooq.db_calculator.tables.TSkuRelation.T_SKU_RELATION;

    /**
     * No further instances allowed
     */
    private DbCalculator() {
        super("db_calculator", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            TCalculator.T_CALCULATOR,
            TCalculatorRecord.T_CALCULATOR_RECORD,
            TDepreciation.T_DEPRECIATION,
            TEnums.T_ENUMS,
            TResource.T_RESOURCE,
            TResourceLog.T_RESOURCE_LOG,
            TSequence.T_SEQUENCE,
            TSkuRelation.T_SKU_RELATION);
    }
}
