package cn.zyj.dbexporter.mybatis.dao;

import cn.zyj.dbexporter.mybatis.model.CustomerMember;
import cn.zyj.dbexporter.mybatis.model.CustomerMemberDTO;
import cn.zyj.dbexporter.mybatis.model.CustomerMemberInvite;
import cn.zyj.dbexporter.mybatis.model.CustomerMemberInviteMsg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DCustomerMemberDao {

    List<CustomerMember> getCustomerMembers(@Param("groupCustomerId") Long groupCustomerId);

    CustomerMember getCustomerMember(@Param("groupCustomerId") Long groupCustomerId,
                                     @Param("customerId") Long customerId);

    CustomerMember getCustomerMemberByAccountId(@Param("accountId") Long accountId);

    Integer getCustomerMemberTotalCount(CustomerMemberDTO dto);

    List<CustomerMember> getCustomerMemberPage(CustomerMemberDTO dto);

    CustomerMember getCustomerMemberByInviteId(@Param("inviteId") Long inviteId);

    CustomerMemberInviteMsg getInviteMsgById(@Param("inviteId") Long inviteId);

    CustomerMemberInviteMsg getInviteMsg(@Param("groupCustomerId") Long groupCustomerId,
                                         @Param("customerId") Long customerId);

    Integer saveInvite(CustomerMemberInvite invite);

    Integer updateInvite(CustomerMemberInvite invite);

    CustomerMemberInvite getInviteById(@Param("id") Long id);

    List<CustomerMemberInvite> getInvites(CustomerMemberInvite invite);

    Integer deleteInviteById(@Param("id") Long id);
}
