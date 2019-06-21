package com.personal.keepnote.service;

import com.personal.keepnote.persistence.entity.RefUserTypeInfo;

public interface UserTypeInfoService {
    /**
     * 根据id 删除用户记账信息
     *
     * @param id
     * @return
     */
    int deleteUserTypeInfoById(String id);

    /**
     * 按天清楚记账信息
     *
     * @param time
     * @return
     */
    int deleteUserTypeInfoBytime(Long time);

    /**
     * 清楚多少天以前的记账信息，不包括今天
     *
     * @param time
     * @return
     */
    int deleteUserTypeInfoByTimeRange(Long time);

    /**
     * 记录账单
     *
     * @param userTypeInfo
     * @return
     */
    int insertUserTypeInfo(RefUserTypeInfo userTypeInfo);


}
