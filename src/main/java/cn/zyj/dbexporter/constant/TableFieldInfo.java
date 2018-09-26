package cn.zyj.dbexporter.constant;

import com.google.common.collect.ImmutableSet;
import lombok.Getter;
import org.jooq.Record;
import org.jooq.TableField;

import java.util.Collections;
import java.util.Optional;

/**
 * 字段信息
 */
public interface  TableFieldInfo<T> {

    ImmutableSet<TableField> getTableFields();

    default String getNameText() {
        return getTableFields().stream().findAny()
                .orElseThrow(() -> new RuntimeException("tableFiles不能为空"))
                .getComment();
    }

    default String getValueText(T value, ToTextPurpose purpose) {
        return value + "";
    }

    default String getValueText(T value) {
        return getValueText(value, ToTextPurpose.DEFAULT);
    }
}
