package com.personal.keepnote.persistence.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Mapper
public interface A_ExtraRefUserTypeInfoMapper {
    /**
     * 个人总价钱
     *
     * @param userId
     * @param typeId
     * @param typeFlag
     * @return
     */
    List<Map<String, Object>> personalPriceCount(@Param("userId") Integer userId, @Param("typeId") Integer typeId, @Param("typeFlag") Integer typeFlag, @Param("moneyFlag") Integer moneyFlag,@Param("dayTime")Long dayTime);


    /**
     * 个人信息支持详情单个/全部
     *
     * @param userId
     * @param typeId
     * @param typeFlag
     * @return
     */
    List<Map<String, Object>> personalInOutInfo(@Param("userId") Integer userId, @Param("typeId") Integer typeId, @Param("typeFlag") Integer typeFlag, @Param("moneyFlag") Integer moneyFlag,@Param("dayTime")Long dayTime);

    /**
     * 按天查询支出/收入总和
     *
     * @param userId
     * @param typeId
     * @param typeFlag
     * @param moneyFlag
     * @param beginTime
     * @param endTime
     * @return
     */
    List<Map<String, Object>> personalTimePriceCount(@Param("userId") Integer userId, @Param("typeId") Integer typeId,
                                                     @Param("typeFlag") Integer typeFlag, @Param("moneyFlag") Integer moneyFlag, @Param("beginTime") Long beginTime, @Param("endTime") Long endTime);

    List<Map<String, Object>> personalPriceCountByYMD(@Param("userId") Integer userId, @Param("typeId") Integer typeId,
                                                     @Param("typeFlag") Integer typeFlag, @Param("moneyFlag") Integer moneyFlag,
                                                      @Param("beginTime") Long beginTime, @Param("endTime") Long endTime,
                                                        @Param("flag") Integer flag,@Param("time")String time
    );


}
