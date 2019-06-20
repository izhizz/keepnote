package com.personal.keepnote.persistence.dao;

import com.personal.keepnote.persistence.entity.RefUserSeeHistory;
import com.personal.keepnote.persistence.entity.RefUserSeeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefUserSeeHistoryMapper {
    int deleteByExample(RefUserSeeHistoryExample example);

    int insert(RefUserSeeHistory record);

    int insertSelective(RefUserSeeHistory record);

    List<RefUserSeeHistory> selectByExample(RefUserSeeHistoryExample example);

    int updateByExampleSelective(@Param("record") RefUserSeeHistory record, @Param("example") RefUserSeeHistoryExample example);

    int updateByExample(@Param("record") RefUserSeeHistory record, @Param("example") RefUserSeeHistoryExample example);
}