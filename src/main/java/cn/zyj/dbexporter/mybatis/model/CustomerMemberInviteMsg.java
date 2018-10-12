package cn.zyj.dbexporter.mybatis.model;

import lombok.Data;

@Data
public class CustomerMemberInviteMsg {
    private Long id;
    private String remarkName;
    private String inviteTime;
    private String companyName;
    private String inviterName;
}
