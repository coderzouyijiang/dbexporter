package cn.zyj.dbexporter.constant;

import cn.zyj.dbexporter.jooq.DbCalculator;
import com.google.common.collect.ImmutableSet;
import org.jooq.Field;
import org.jooq.TableField;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TableFieldInfos {

    private static ImmutableSet<TableFieldInfo> tableFieldInfos;

    static {
        Set<TableFieldInfo> tableFieldInfoSet = new HashSet<>();
        tableFieldInfoSet.add(new RentOrSaleInfo());
        tableFieldInfos = ImmutableSet.copyOf(tableFieldInfoSet);
    }

    public static TableFieldInfo getTableFieldInfo(Field field){
        tableFieldInfos.stream()
                .filter(info->info.getTableFields().contains(field))
                .findAny().orElse()
    }

    private static class DefaultTableFieldInfo implements TableFieldInfo{

        @Override
        public ImmutableSet<TableField> getTableFields() {
            return null;
        }

    }

}
