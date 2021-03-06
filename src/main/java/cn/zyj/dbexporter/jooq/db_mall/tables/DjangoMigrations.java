/*
 * This file is generated by jOOQ.
 */
package cn.zyj.dbexporter.jooq.db_mall.tables;


import cn.zyj.dbexporter.jooq.db_mall.DbMall;
import cn.zyj.dbexporter.jooq.db_mall.Indexes;
import cn.zyj.dbexporter.jooq.db_mall.Keys;
import cn.zyj.dbexporter.jooq.db_mall.tables.records.DjangoMigrationsRecord;

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
public class DjangoMigrations extends TableImpl<DjangoMigrationsRecord> {

    private static final long serialVersionUID = -1751169123;

    /**
     * The reference instance of <code>db_mall.django_migrations</code>
     */
    public static final DjangoMigrations DJANGO_MIGRATIONS = new DjangoMigrations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DjangoMigrationsRecord> getRecordType() {
        return DjangoMigrationsRecord.class;
    }

    /**
     * The column <code>db_mall.django_migrations.id</code>.
     */
    public final TableField<DjangoMigrationsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>db_mall.django_migrations.app</code>.
     */
    public final TableField<DjangoMigrationsRecord, String> APP = createField("app", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>db_mall.django_migrations.name</code>.
     */
    public final TableField<DjangoMigrationsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>db_mall.django_migrations.applied</code>.
     */
    public final TableField<DjangoMigrationsRecord, Timestamp> APPLIED = createField("applied", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>db_mall.django_migrations</code> table reference
     */
    public DjangoMigrations() {
        this(DSL.name("django_migrations"), null);
    }

    /**
     * Create an aliased <code>db_mall.django_migrations</code> table reference
     */
    public DjangoMigrations(String alias) {
        this(DSL.name(alias), DJANGO_MIGRATIONS);
    }

    /**
     * Create an aliased <code>db_mall.django_migrations</code> table reference
     */
    public DjangoMigrations(Name alias) {
        this(alias, DJANGO_MIGRATIONS);
    }

    private DjangoMigrations(Name alias, Table<DjangoMigrationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private DjangoMigrations(Name alias, Table<DjangoMigrationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DjangoMigrations(Table<O> child, ForeignKey<O, DjangoMigrationsRecord> key) {
        super(child, key, DJANGO_MIGRATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DbMall.DB_MALL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DJANGO_MIGRATIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DjangoMigrationsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DJANGO_MIGRATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DjangoMigrationsRecord> getPrimaryKey() {
        return Keys.KEY_DJANGO_MIGRATIONS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DjangoMigrationsRecord>> getKeys() {
        return Arrays.<UniqueKey<DjangoMigrationsRecord>>asList(Keys.KEY_DJANGO_MIGRATIONS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoMigrations as(String alias) {
        return new DjangoMigrations(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DjangoMigrations as(Name alias) {
        return new DjangoMigrations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DjangoMigrations rename(String name) {
        return new DjangoMigrations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DjangoMigrations rename(Name name) {
        return new DjangoMigrations(name, null);
    }
}
