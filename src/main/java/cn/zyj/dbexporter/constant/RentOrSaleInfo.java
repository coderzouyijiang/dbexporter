package cn.zyj.dbexporter.constant;

import com.google.common.collect.ImmutableSet;
import org.jooq.Record;
import org.jooq.TableField;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static cn.zyj.dbexporter.constant.ToTextPurpose.*;
import static cn.zyj.dbexporter.constant.RentOrSaleEnum.*;
import static cn.zyj.dbexporter.jooq.Tables.*;

public class RentOrSaleInfo implements TableFieldInfo<Short> {

    @Override
    public ImmutableSet<TableField> getTableFields() {
        Set<TableField> tableFields = new HashSet<>();
        tableFields.add(T_RESOURCE.RENT_OR_SALE);
        tableFields.add(T_CALCULATOR.RENT_OR_SALE);
        return ImmutableSet.copyOf(tableFields);
    }

    @Override
    public String getValueText(Short value, ToTextPurpose purpose) {
        if (value == RENT.getValue()) {
            return "租赁";
        } else if (value == SALE.getValue()) {
            return "销售";
        } else if (value == ALL.getValue()) {
            if (purpose == OPTION) {
                return "租售均可";
            } else {
                return "租售";
            }
        }
        return value + "";
    }


}
