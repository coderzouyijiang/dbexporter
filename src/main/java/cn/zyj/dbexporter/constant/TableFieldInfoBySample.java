package cn.zyj.dbexporter.constant;

import cn.zyj.dbexporter.jooq.DbCalculator;
import com.google.common.collect.ImmutableSet;
import org.jooq.Field;

import java.util.Set;
import java.util.stream.Collectors;

import static cn.zyj.dbexporter.jooq.Tables.T_RESOURCE;

/**
 * 字段信息
 */
public class TableFieldInfoBySample<T> implements TableFieldInfo<T> {

    public TableFieldInfoBySample(Field sampleField) {
        Set<Field<?>> tableFields = DbCalculator.DB_CALCULATOR.getTables().stream()
                .flatMap(table -> table.fieldStream())
                .filter(field -> field.getName().equals(sampleField.getName()))
                .collect(Collectors.toSet());
        this.tableFields = ImmutableSet.copyOf(tableFields);
    }

    private final ImmutableSet<Field> tableFields;

    @Override
    public ImmutableSet<Field> getTableFields(){
        return tableFields;
    }
}
