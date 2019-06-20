package com.personal.keepnote.persistence.dao;

import com.personal.keepnote.persistence.entity.RefUserInformation;
import com.personal.keepnote.persistence.entity.RefUserInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefUserInformationMapper {
    int deleteByExample(RefUserInformationExample example);

    int insert(RefUserInformation record);

    int insertSelective(RefUserInformation record);

    List<RefUserInformation> selectByExample(RefUserInformationExample example);

    int updateByExampleSelective(@Param("record") RefUserInformation record, @Param("example") RefUserInformationExample example);

    int updateByExample(@Param("record") RefUserInformation record, @Param("example") RefUserInformationExample example);
}