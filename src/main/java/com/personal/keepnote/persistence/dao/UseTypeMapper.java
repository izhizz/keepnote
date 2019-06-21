package com.personal.keepnote.persistence.dao;

import com.personal.keepnote.persistence.entity.UseType;
import com.personal.keepnote.persistence.entity.UseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UseTypeMapper {
    int deleteByExample(UseTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UseType record);

    int insertSelective(UseType record);

    List<UseType> selectByExample(UseTypeExample example);

    UseType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UseType record, @Param("example") UseTypeExample example);

    int updateByExample(@Param("record") UseType record, @Param("example") UseTypeExample example);

    int updateByPrimaryKeySelective(UseType record);

    int updateByPrimaryKey(UseType record);
}