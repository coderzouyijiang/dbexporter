package cn.zyj.dbexporter.mybatis.dao;

import cn.zyj.dbexporter.mybatis.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DCustomerMemberDao {

    List<CustomerMember> getCustomerMembers(@Param("groupCustomerId") Long groupCustomerId);

    CustomerMember getCustomerMember(@Param("groupCustomerId") Long groupCustomerId,
                                     @Param("customerId") Long customerId);

    CustomerMember getCustomerMemberByAccountId(@Param("accountId") Long accountId);

    long getCustomerMemberTotalCount(CustomerMemberDTO dto);

    List<CustomerMember> getCustomerMemberPage(CustomerMemberDTO dto);

    CustomerMember getCustomerMemberByInviteId(@Param("inviteId") Long inviteId);

    CustomerMemberInviteMsg getInviteMsgById(@Param("inviteId") Long inviteId);

    CustomerMemberInviteMsg getInviteMsg(@Param("groupCustomerId") Long groupCustomerId,
                                         @Param("customerId") Long customerId);

    long saveInvite(CustomerMemberInvite invite);

    long updateInvite(CustomerMemberInvite invite);

    CustomerMemberInvite getInviteById(@Param("id") Long id);

    List<CustomerMemberInvite> getInvites(CustomerMemberInvite invite);

    long deleteInviteById(@Param("id") Long id);

    public List<UserPayment> getUserPayAmount(@Param("customerIds") List<Long> customerIds, @Param("startDate") String startDate, @Param("endDate") String endDate);

}
