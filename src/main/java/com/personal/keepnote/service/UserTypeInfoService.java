package com.personal.keepnote.service;

import com.personal.keepnote.persistence.entity.RefUserTypeInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author MR FENG
 */
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
    List<Map<String, Object>> personalPriceCount(Integer userId, Integer typeId, Integer tyepFlag, Integer moneyFlag,Long dayTime);

    /**
     * 个人信息查看详情单个/全部 支出收入
     *
     * @param userId
     * @param typeId
     * @param tyepFlag
     * @return
     */
    List<Map<String, Object>> personalInOutInfo(Integer userId, Integer typeId, Integer tyepFlag, Integer moneyFlag,Long dayTime);

    /**
     * 按天查询支出/收入总和
     *
     * @param userId
     * @param typeId
     * @param tyepFlag
     * @param moneyFlag
     * @param beginTime
     * @param endTime
     * @return
     */
    List<Map<String, Object>> personalTimePriceCount(Integer userId, Integer typeId, Integer tyepFlag, Integer moneyFlag, Long beginTime, Long endTime);

    /**
     * 按年月日查询支出/收入总和
     *
     * @param userId
     * @param typeId
     * @param tyepFlag
     * @param moneyFlag
     * @param beginTime
     * @param endTime
     * @param flag
     * @param time
     * @return
     */
    List<Map<String, Object>> personalPriceCountByYMD(Integer userId, Integer typeId, Integer tyepFlag, Integer moneyFlag, Long beginTime, Long endTime, Integer flag, String time);
}
