/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_calculator;


import cn.zyj.dbexporter.jooq.db_calculator.tables.TCalculator;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TDepreciation;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TEnums;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TResource;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TResourceLog;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TSequence;
import cn.zyj.dbexporter.jooq.db_calculator.tables.TSkuRelation;
import cn.zyj.dbexporter.jooq.db_calculator.tables.records.TCalculatorRecord;
import cn.zyj.dbexporter.jooq.db_calculator.tables.records.TCalculatorRecordRecord;
import cn.zyj.dbexporter.jooq.db_calculator.tables.records.TDepreciationRecord;
import cn.zyj.dbexporter.jooq.db_calculator.tables.records.TEnumsRecord;
import cn.zyj.dbexporter.jooq.db_calculator.tables.records.TResourceLogRecord;
import cn.zyj.dbexporter.jooq.db_calculator.tables.records.TResourceRecord;
import cn.zyj.dbexporter.jooq.db_calculator.tables.records.TSequenceRecord;
import cn.zyj.dbexporter.jooq.db_calculator.tables.records.TSkuRelationRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>db_calculator</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TCalculatorRecord, Integer> IDENTITY_T_CALCULATOR = Identities0.IDENTITY_T_CALCULATOR;
    public static final Identity<TCalculatorRecordRecord, Integer> IDENTITY_T_CALCULATOR_RECORD = Identities0.IDENTITY_T_CALCULATOR_RECORD;
    public static final Identity<TDepreciationRecord, Integer> IDENTITY_T_DEPRECIATION = Identities0.IDENTITY_T_DEPRECIATION;
    public static final Identity<TEnumsRecord, Integer> IDENTITY_T_ENUMS = Identities0.IDENTITY_T_ENUMS;
    public static final Identity<TResourceRecord, Integer> IDENTITY_T_RESOURCE = Identities0.IDENTITY_T_RESOURCE;
    public static final Identity<TResourceLogRecord, Integer> IDENTITY_T_RESOURCE_LOG = Identities0.IDENTITY_T_RESOURCE_LOG;
    public static final Identity<TSequenceRecord, Integer> IDENTITY_T_SEQUENCE = Identities0.IDENTITY_T_SEQUENCE;
    public static final Identity<TSkuRelationRecord, Integer> IDENTITY_T_SKU_RELATION = Identities0.IDENTITY_T_SKU_RELATION;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TCalculatorRecord> KEY_T_CALCULATOR_PRIMARY = UniqueKeys0.KEY_T_CALCULATOR_PRIMARY;
    public static final UniqueKey<TCalculatorRecordRecord> KEY_T_CALCULATOR_RECORD_PRIMARY = UniqueKeys0.KEY_T_CALCULATOR_RECORD_PRIMARY;
    public static final UniqueKey<TDepreciationRecord> KEY_T_DEPRECIATION_PRIMARY = UniqueKeys0.KEY_T_DEPRECIATION_PRIMARY;
    public static final UniqueKey<TEnumsRecord> KEY_T_ENUMS_PRIMARY = UniqueKeys0.KEY_T_ENUMS_PRIMARY;
    public static final UniqueKey<TResourceRecord> KEY_T_RESOURCE_PRIMARY = UniqueKeys0.KEY_T_RESOURCE_PRIMARY;
    public static final UniqueKey<TResourceLogRecord> KEY_T_RESOURCE_LOG_PRIMARY = UniqueKeys0.KEY_T_RESOURCE_LOG_PRIMARY;
    public static final UniqueKey<TSequenceRecord> KEY_T_SEQUENCE_PRIMARY = UniqueKeys0.KEY_T_SEQUENCE_PRIMARY;
    public static final UniqueKey<TSkuRelationRecord> KEY_T_SKU_RELATION_PRIMARY = UniqueKeys0.KEY_T_SKU_RELATION_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<TCalculatorRecord, Integer> IDENTITY_T_CALCULATOR = Internal.createIdentity(TCalculator.T_CALCULATOR, TCalculator.T_CALCULATOR.ID);
        public static Identity<TCalculatorRecordRecord, Integer> IDENTITY_T_CALCULATOR_RECORD = Internal.createIdentity(cn.zyj.dbexporter.jooq.db_calculator.tables.TCalculatorRecord.T_CALCULATOR_RECORD, cn.zyj.dbexporter.jooq.db_calculator.tables.TCalculatorRecord.T_CALCULATOR_RECORD.ID);
        public static Identity<TDepreciationRecord, Integer> IDENTITY_T_DEPRECIATION = Internal.createIdentity(TDepreciation.T_DEPRECIATION, TDepreciation.T_DEPRECIATION.ID);
        public static Identity<TEnumsRecord, Integer> IDENTITY_T_ENUMS = Internal.createIdentity(TEnums.T_ENUMS, TEnums.T_ENUMS.ID);
        public static Identity<TResourceRecord, Integer> IDENTITY_T_RESOURCE = Internal.createIdentity(TResource.T_RESOURCE, TResource.T_RESOURCE.ID);
        public static Identity<TResourceLogRecord, Integer> IDENTITY_T_RESOURCE_LOG = Internal.createIdentity(TResourceLog.T_RESOURCE_LOG, TResourceLog.T_RESOURCE_LOG.ID);
        public static Identity<TSequenceRecord, Integer> IDENTITY_T_SEQUENCE = Internal.createIdentity(TSequence.T_SEQUENCE, TSequence.T_SEQUENCE.ID);
        public static Identity<TSkuRelationRecord, Integer> IDENTITY_T_SKU_RELATION = Internal.createIdentity(TSkuRelation.T_SKU_RELATION, TSkuRelation.T_SKU_RELATION.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<TCalculatorRecord> KEY_T_CALCULATOR_PRIMARY = Internal.createUniqueKey(TCalculator.T_CALCULATOR, "KEY_t_calculator_PRIMARY", TCalculator.T_CALCULATOR.ID);
        public static final UniqueKey<TCalculatorRecordRecord> KEY_T_CALCULATOR_RECORD_PRIMARY = Internal.createUniqueKey(cn.zyj.dbexporter.jooq.db_calculator.tables.TCalculatorRecord.T_CALCULATOR_RECORD, "KEY_t_calculator_record_PRIMARY", cn.zyj.dbexporter.jooq.db_calculator.tables.TCalculatorRecord.T_CALCULATOR_RECORD.ID);
        public static final UniqueKey<TDepreciationRecord> KEY_T_DEPRECIATION_PRIMARY = Internal.createUniqueKey(TDepreciation.T_DEPRECIATION, "KEY_t_depreciation_PRIMARY", TDepreciation.T_DEPRECIATION.ID);
        public static final UniqueKey<TEnumsRecord> KEY_T_ENUMS_PRIMARY = Internal.createUniqueKey(TEnums.T_ENUMS, "KEY_t_enums_PRIMARY", TEnums.T_ENUMS.ID);
        public static final UniqueKey<TResourceRecord> KEY_T_RESOURCE_PRIMARY = Internal.createUniqueKey(TResource.T_RESOURCE, "KEY_t_resource_PRIMARY", TResource.T_RESOURCE.ID);
        public static final UniqueKey<TResourceLogRecord> KEY_T_RESOURCE_LOG_PRIMARY = Internal.createUniqueKey(TResourceLog.T_RESOURCE_LOG, "KEY_t_resource_log_PRIMARY", TResourceLog.T_RESOURCE_LOG.ID);
        public static final UniqueKey<TSequenceRecord> KEY_T_SEQUENCE_PRIMARY = Internal.createUniqueKey(TSequence.T_SEQUENCE, "KEY_t_sequence_PRIMARY", TSequence.T_SEQUENCE.ID);
        public static final UniqueKey<TSkuRelationRecord> KEY_T_SKU_RELATION_PRIMARY = Internal.createUniqueKey(TSkuRelation.T_SKU_RELATION, "KEY_t_sku_relation_PRIMARY", TSkuRelation.T_SKU_RELATION.ID);
    }
}
