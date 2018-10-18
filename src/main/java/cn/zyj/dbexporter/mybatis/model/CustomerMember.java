package cn.zyj.dbexporter.mybatis.model;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class CustomerMember {
    // 邀请id。可能是子账号主动申请加入的
    private Long id;
    // 账号id
    private Long accountId;
    // 手机号
    private String phone;
    // 备注名
    private String remarkName;
    // 加入时间,时间格式 yyyy-MM-dd HH:mm:ss
    private String joinTime;
    //      0-邀请中
    //      1-邀请成功
    //      2-邀请失败
    private Integer status;
    // true-启用
    //false-禁用
    private Integer enable;
    // 失败原因码 0-拒绝，其他-mall中定义
    private Integer failCode;

    // 【再次邀请】功能可用时间,13位毫秒值
    private Long inviteAvailableTime;
    // 【启用】是否可用
    private boolean enableAvailable;
    // 【禁用】是否可用
    private boolean disableAvailable;
}
