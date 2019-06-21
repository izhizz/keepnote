package com.personal.keepnote.service.impl;


import com.personal.keepnote.persistence.dao.UseTypeMapper;
import com.personal.keepnote.persistence.entity.UseType;
import com.personal.keepnote.persistence.entity.UseTypeExample;
import com.personal.keepnote.service.UseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UseTypeServiceImpl implements UseTypeService {
    @Autowired
    UseTypeMapper useTypeMapper;

    @Override
    public List<UseType> getAllTopicUseType() {
        UseTypeExample useTypeExample = new UseTypeExample();
        useTypeExample.createCriteria().andPidEqualTo(0);
        return useTypeMapper.selectByExample(useTypeExample);
    }

    @Override
    public List<UseType> getAllChildUseType(Integer pid) {
        UseTypeExample useTypeExample = new UseTypeExample();
        useTypeExample.createCriteria().andPidEqualTo(pid);
        return useTypeMapper.selectByExample(useTypeExample);
    }

    @Override
    public int addUseType(UseType useType) {
        return useTypeMapper.insert(useType);
    }

    @Override
    public int deleteUseType(Integer id) {
        return useTypeMapper.deleteByPrimaryKey(id);
    }
}
