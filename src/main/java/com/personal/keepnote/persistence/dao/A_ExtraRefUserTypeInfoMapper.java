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
    List<Map<String, Object>> personalPriceCount(@Param("userId") Integer userId, @Param("typeId") Integer typeId, @Param("typeFlag") Integer typeFlag,@Param("moneyFlag") Integer moneyFlag);


    /**
     * 个人信息支持详情单个/全部
     * @param userId
     * @param typeId
     * @param typeFlag
     * @return
     */
    List<Map<String, Object>> personalInOutInfo(@Param("userId") Integer userId, @Param("typeId") Integer typeId, @Param("typeFlag") Integer typeFlag,@Param("moneyFlag") Integer moneyFlag);


}
