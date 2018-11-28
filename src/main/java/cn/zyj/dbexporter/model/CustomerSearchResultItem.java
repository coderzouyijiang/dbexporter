package cn.zyj.dbexporter.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

@ToString
@Data
public class CustomerSearchResultItem implements Serializable {
    /**
     * "newSource": "tg_wap",
     * "registerTime": 1542869552000,
     * "billType": "0",
     * "source": "tg_wap",
     * "rentNum": 0,
     * "availableBalance": 0.0,
     * "customerStatus": 1,
     * "payType": 2,
     * "bandId": 13,
     * "phone": "18611595526",
     * "expireStatus": 0,
     * "id": 10057472,
     * "account": "edz595526"
     */
    private String newSource;
    private Long registerTime;
    private String billType;
    private String source;
    private Integer rentNum;
    private BigDecimal availableBalance;
    private Integer customerStatus;
    private Integer payType;
    private Integer bandId;
    private String phone;
    private Integer expireStatus;
    private Long id;
    private String account;
}
