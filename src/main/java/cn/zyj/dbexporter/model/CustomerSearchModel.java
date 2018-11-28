package cn.zyj.dbexporter.model;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * 数据环 客户搜索接口参数
 */
@ToString
@Slf4j
@Data
public class CustomerSearchModel implements Serializable {

    private String realName;
    private String companyName;
    private String source; // 注册来源
    private Integer bandId; // 分为A、B、C、D、S 等级别,CCustomerBandType
    private Integer payType; // 1，先款后票、2，商城开票,InvoiceSourceType

    private Long beginTime;
    private Long endTime;

    private Integer page; // 页码。page>=1,size>0
    private Integer size;

    private String code; // 必传。当前时间戳与字符串"&#EFKFddKKA*#@H$awc" 加密后的值。防爬处理
    private Long time; // 必传。当前请求时间戳
    private String callback; // 跨域使用
    /**
     * CallerPlatform
     */
    private Integer plat; // 必传。1:商城pc，2，商城wap，3，商城小程序，4，cms
}
