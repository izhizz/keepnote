package com.personal.keepnote.persistence.dao;

import com.personal.keepnote.persistence.entity.RefUserTypeInfo;
import com.personal.keepnote.persistence.entity.RefUserTypeInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RefUserTypeInfoMapper {
    int deleteByExample(RefUserTypeInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(RefUserTypeInfo record);

    int insertSelective(RefUserTypeInfo record);

    List<RefUserTypeInfo> selectByExample(RefUserTypeInfoExample example);

    RefUserTypeInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RefUserTypeInfo record, @Param("example") RefUserTypeInfoExample example);

    int updateByExample(@Param("record") RefUserTypeInfo record, @Param("example") RefUserTypeInfoExample example);

    int updateByPrimaryKeySelective(RefUserTypeInfo record);

    int updateByPrimaryKey(RefUserTypeInfo record);
}