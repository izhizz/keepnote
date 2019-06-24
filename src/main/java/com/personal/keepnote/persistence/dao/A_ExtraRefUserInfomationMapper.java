package com.personal.keepnote.persistence.dao;

import com.personal.keepnote.persistence.entity.RefUserInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface A_ExtraRefUserInfomationMapper {
    /**
     * 批量插入收款信息
     *
     * @param refUserInformationList
     * @return
     */
    int insertBatchRefUserInfomation(@Param("list") List<RefUserInformation> refUserInformationList);

    /**
     * 发出的消息
     *
     * @param userId
     * @return
     */
    List<Map<String, Object>> sendInfomationByUserId(@Param("userId") Integer userId);

    /**
     * 收到的消息
     *
     * @param userId
     * @return
     */
    List<Map<String, Object>> replyInfomationByUserId(@Param("userId") Integer userId);
}
