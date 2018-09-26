package cn.zyj.dbexporter.constant;

import lombok.Getter;

public enum RentOrSaleEnum{

    RENT(1),
    SALE(2),
    ALL(3);

    @Getter
    private final int value;

    RentOrSaleEnum(int value) {
        this.value=value;
    }
}
