/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.tables;


import cn.zyj.dbexporter.jooq.DbCalculator;
import cn.zyj.dbexporter.jooq.Indexes;
import cn.zyj.dbexporter.jooq.Keys;
import cn.zyj.dbexporter.jooq.tables.records.TSequenceRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


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
public class TSequence extends TableImpl<TSequenceRecord> {

    private static final long serialVersionUID = 171295249;

    /**
     * The reference instance of <code>db_calculator.t_sequence</code>
     */
    public static final TSequence T_SEQUENCE = new TSequence();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TSequenceRecord> getRecordType() {
        return TSequenceRecord.class;
    }

    /**
     * The column <code>db_calculator.t_sequence.id</code>.
     */
    public final TableField<TSequenceRecord, UInteger> ID = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_calculator.t_sequence.type_name</code>. 类别名称
     */
    public final TableField<TSequenceRecord, String> TYPE_NAME = createField("type_name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "类别名称");

    /**
     * The column <code>db_calculator.t_sequence.current_no</code>. 当前序号
     */
    public final TableField<TSequenceRecord, Integer> CURRENT_NO = createField("current_no", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "当前序号");

    /**
     * The column <code>db_calculator.t_sequence.cdate</code>.
     */
    public final TableField<TSequenceRecord, Timestamp> CDATE = createField("cdate", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>db_calculator.t_sequence.mdate</code>.
     */
    public final TableField<TSequenceRecord, Timestamp> MDATE = createField("mdate", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>db_calculator.t_sequence</code> table reference
     */
    public TSequence() {
        this(DSL.name("t_sequence"), null);
    }

    /**
     * Create an aliased <code>db_calculator.t_sequence</code> table reference
     */
    public TSequence(String alias) {
        this(DSL.name(alias), T_SEQUENCE);
    }

    /**
     * Create an aliased <code>db_calculator.t_sequence</code> table reference
     */
    public TSequence(Name alias) {
        this(alias, T_SEQUENCE);
    }

    private TSequence(Name alias, Table<TSequenceRecord> aliased) {
        this(alias, aliased, null);
    }

    private TSequence(Name alias, Table<TSequenceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> TSequence(Table<O> child, ForeignKey<O, TSequenceRecord> key) {
        super(child, key, T_SEQUENCE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DbCalculator.DB_CALCULATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.T_SEQUENCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TSequenceRecord, UInteger> getIdentity() {
        return Keys.IDENTITY_T_SEQUENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TSequenceRecord> getPrimaryKey() {
        return Keys.KEY_T_SEQUENCE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TSequenceRecord>> getKeys() {
        return Arrays.<UniqueKey<TSequenceRecord>>asList(Keys.KEY_T_SEQUENCE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSequence as(String alias) {
        return new TSequence(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSequence as(Name alias) {
        return new TSequence(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TSequence rename(String name) {
        return new TSequence(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TSequence rename(Name name) {
        return new TSequence(name, null);
    }
}
