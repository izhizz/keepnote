package com.personal.keepnote.service;

import com.personal.keepnote.persistence.entity.RefUserTypeInfo;

import java.util.List;
import java.util.Map;

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

    /**
     * 个人单个/全部 总支出/收入
     *
     * @param userId
     * @param typeId
     * @param tyepFlag
     * @return
     */
    List<Map<String, Object>> personalPriceCount(Integer userId, Integer typeId, Integer tyepFlag);

    /**
     * 个人信息查看详情单个/全部 支出收入
     *
     * @param userId
     * @param typeId
     * @param tyepFlag
     * @return
     */
    List<Map<String, Object>> personalInOutInfo(Integer userId, Integer typeId, Integer tyepFlag);
}
