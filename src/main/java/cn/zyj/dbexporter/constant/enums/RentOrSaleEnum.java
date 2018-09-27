package cn.zyj.dbexporter.constant.enums;

import lombok.Getter;
import org.jooq.types.UByte;

public enum RentOrSaleEnum {

    RENT(UByte.valueOf(1)),
    SALE(UByte.valueOf(2)),
    ALL(UByte.valueOf(3));

    @Getter
    private final UByte value;

    RentOrSaleEnum(UByte value) {
        this.value = value;
    }
}
