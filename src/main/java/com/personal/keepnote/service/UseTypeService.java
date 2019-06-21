package com.personal.keepnote.service;

import com.personal.keepnote.persistence.entity.UseType;

import java.util.List;

public interface UseTypeService {
    /**
     * 获得所有1级标题
     *
     * @return
     */
    List<UseType> getAllTopicUseType();

    /**
     * 查询所有子标题
     *
     * @return
     */
    List<UseType> getAllChildUseType(Integer pid);

    /**
     * 添加标题
     *
     * @param useType
     * @return
     */
    int addUseType(UseType useType);

    /**
     *    删除标题
     * @param id
     * @return
     */
    int deleteUseType(Integer id);



}
