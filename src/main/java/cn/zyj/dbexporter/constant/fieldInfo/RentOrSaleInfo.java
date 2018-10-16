package cn.zyj.dbexporter.constant.fieldInfo;

import cn.zyj.dbexporter.constant.TableFieldInfo;
import cn.zyj.dbexporter.constant.ToTextPurpose;
import com.google.common.collect.ImmutableSet;
import org.jooq.Field;
import org.jooq.TableField;
import org.jooq.types.UByte;

import java.rmi.server.ExportException;
import java.util.HashSet;
import java.util.Set;

import static cn.zyj.dbexporter.constant.ToTextPurpose.*;
import static cn.zyj.dbexporter.constant.enums.RentOrSaleEnum.*;
import static cn.zyj.dbexporter.jooq.db_calculator.Tables.*;

public class RentOrSaleInfo implements TableFieldInfo<UByte> {

    @Override
    public ImmutableSet<Field> getTableFields() {
        Set<TableField> tableFields = new HashSet<>();
        tableFields.add(T_RESOURCE.RENT_OR_SALE);
        tableFields.add(T_CALCULATOR.RENT_OR_SALE);
        return ImmutableSet.copyOf(tableFields);
    }

    @Override
    public String getValueText(UByte value, ToTextPurpose purpose) {
        if (value == null) {
            return "";
        }
        if (purpose == EXPORT) {
            return value + "";
        }
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
