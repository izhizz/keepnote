package com.personal.keepnote.persistence.dao;

import com.personal.keepnote.persistence.entity.UserPicture;
import com.personal.keepnote.persistence.entity.UserPictureExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserPictureMapper {
    int deleteByExample(UserPictureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserPicture record);

    int insertSelective(UserPicture record);

    List<UserPicture> selectByExample(UserPictureExample example);

    UserPicture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserPicture record, @Param("example") UserPictureExample example);

    int updateByExample(@Param("record") UserPicture record, @Param("example") UserPictureExample example);

    int updateByPrimaryKeySelective(UserPicture record);

    int updateByPrimaryKey(UserPicture record);
}