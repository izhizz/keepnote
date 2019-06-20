package com.personal.keepnote.persistence.dao;

import com.personal.keepnote.persistence.entity.RefUserOtherInfo;
import com.personal.keepnote.persistence.entity.RefUserOtherInfoExample;
import com.personal.keepnote.persistence.entity.RefUserOtherInfoKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RefUserOtherInfoMapper {
    int deleteByExample(RefUserOtherInfoExample example);

    int deleteByPrimaryKey(RefUserOtherInfoKey key);

    int insert(RefUserOtherInfo record);

    int insertSelective(RefUserOtherInfo record);

    List<RefUserOtherInfo> selectByExample(RefUserOtherInfoExample example);

    RefUserOtherInfo selectByPrimaryKey(RefUserOtherInfoKey key);

    int updateByExampleSelective(@Param("record") RefUserOtherInfo record, @Param("example") RefUserOtherInfoExample example);

    int updateByExample(@Param("record") RefUserOtherInfo record, @Param("example") RefUserOtherInfoExample example);

    int updateByPrimaryKeySelective(RefUserOtherInfo record);

    int updateByPrimaryKey(RefUserOtherInfo record);
}