package com.personal.keepnote.persistence.dao;

import com.personal.keepnote.persistence.entity.InfoPassword;
import com.personal.keepnote.persistence.entity.InfoPasswordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InfoPasswordMapper {
    int deleteByExample(InfoPasswordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InfoPassword record);

    int insertSelective(InfoPassword record);

    List<InfoPassword> selectByExample(InfoPasswordExample example);

    InfoPassword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InfoPassword record, @Param("example") InfoPasswordExample example);

    int updateByExample(@Param("record") InfoPassword record, @Param("example") InfoPasswordExample example);

    int updateByPrimaryKeySelective(InfoPassword record);

    int updateByPrimaryKey(InfoPassword record);
}