package cn.zyj.dbexporter.constant;

import cn.zyj.dbexporter.constant.fieldInfo.CDateInfo;
import cn.zyj.dbexporter.constant.fieldInfo.MDateInfo;
import cn.zyj.dbexporter.constant.fieldInfo.RentOrSaleInfo;
import com.google.common.collect.ImmutableSet;
import org.jooq.Field;

import java.util.HashSet;
import java.util.Set;

public class TableFieldInfos {

    private static ImmutableSet<TableFieldInfo> tableFieldInfos;

    static {
        Set<TableFieldInfo> tableFieldInfoSet = new HashSet<>();
        tableFieldInfoSet.add(new RentOrSaleInfo());
        tableFieldInfoSet.add(new CDateInfo());
        tableFieldInfoSet.add(new MDateInfo());
        tableFieldInfos = ImmutableSet.copyOf(tableFieldInfoSet);
    }

    public static TableFieldInfo getTableFieldInfo(Field field) {
        return tableFieldInfos.stream()
                .filter(info -> info.getTableFields().contains(field))
                .findAny().orElseGet(() -> new DefaultTableFieldInfo(field));
    }

    private static class DefaultTableFieldInfo implements TableFieldInfo {

        private final ImmutableSet<Field> tableFields;

        DefaultTableFieldInfo(Field field) {
            Set<Field> set = new HashSet<>();
            set.add(field);
            this.tableFields = ImmutableSet.copyOf(set);
        }

        @Override
        public ImmutableSet<Field> getTableFields() {
            return tableFields;
        }

    }

}
