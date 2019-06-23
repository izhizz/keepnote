package com.personal.keepnote.persistence.dao;

import com.personal.keepnote.persistence.entity.RefUserInformation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface A_ExtraRefUserInfomationMapper {
    /**
     * 批量插入收款信息
     *
     * @param refUserInformationList
     * @return
     */
    int insertBatchRefUserInfomation(@Param("list") List<RefUserInformation> refUserInformationList);
}
