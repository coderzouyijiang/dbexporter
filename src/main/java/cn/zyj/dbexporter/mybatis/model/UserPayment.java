package cn.zyj.dbexporter.mybatis.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

@EqualsAndHashCode
@ToString
@Data
public class UserPayment implements Serializable {
    //    ecmId 商城id
    private Long ecmId;
    //    payments 已付款额
    private BigDecimal payments;
    //    payTime 已付款时间
    private Long payTime;
}
