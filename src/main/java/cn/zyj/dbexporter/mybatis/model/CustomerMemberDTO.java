package cn.zyj.dbexporter.mybatis.model;

import lombok.Data;

@Data
public class CustomerMemberDTO {

    private Long groupCustomerId;

    private String phone;

    private String remarkName;

    private String minJoinTime;

    private String maxJoinTime;

    private String orderBy;

    private String order;

    private Integer pageIndex;

    private Integer pageSize;

}
