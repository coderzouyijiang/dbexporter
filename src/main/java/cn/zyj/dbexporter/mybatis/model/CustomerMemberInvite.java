package cn.zyj.dbexporter.mybatis.model;

import lombok.Data;

import java.util.Date;

@Data
public class CustomerMemberInvite {

    public static final int TYPE_INVITE = 0;
    public static final int TYPE_APPLY = 1;

    public static final int STATUS_DOING = 0;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_FAIL = 2;

    public static final int DATA_NORMAL = 0;
    public static final int DATA_DELETE = 1;

    private Long id;
    private Long customerId;
    private Long groupCustomerId;

    private Integer type;
    private Integer status;
    private Integer dataStatus;

    private Integer failCode;
    private String remarkName;
    private Date handleTime;

    private Date cdate;
    private Date mdate;

}
