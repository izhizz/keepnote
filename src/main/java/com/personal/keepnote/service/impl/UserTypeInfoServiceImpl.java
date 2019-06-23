package com.personal.keepnote.service.impl;

import com.personal.keepnote.persistence.dao.A_ExtraRefUserTypeInfoMapper;
import com.personal.keepnote.persistence.dao.RefUserTypeInfoMapper;
import com.personal.keepnote.persistence.entity.RefUserTypeInfo;
import com.personal.keepnote.persistence.entity.RefUserTypeInfoExample;
import com.personal.keepnote.service.UserTypeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserTypeInfoServiceImpl implements UserTypeInfoService {
    @Autowired
    A_ExtraRefUserTypeInfoMapper a_extraRefUserTypeInfoMapper;
    @Autowired
    RefUserTypeInfoMapper refUserTypeInfoMapper;

    @Override
    public int deleteUserTypeInfoById(String id) {
        return refUserTypeInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int deleteUserTypeInfoBytime(Long time) {
        RefUserTypeInfoExample refUserTypeInfoExample = new RefUserTypeInfoExample();
        refUserTypeInfoExample.createCriteria().andDayTimeEqualTo(time);
        return refUserTypeInfoMapper.deleteByExample(refUserTypeInfoExample);
    }

    @Override
    public int deleteUserTypeInfoByTimeRange(Long time) {
        RefUserTypeInfoExample refUserTypeInfoExample = new RefUserTypeInfoExample();
        refUserTypeInfoExample.createCriteria().andDayTimeLessThan(time);
        return refUserTypeInfoMapper.deleteByExample(refUserTypeInfoExample);
    }

    @Override
    public int insertUserTypeInfo(RefUserTypeInfo userTypeInfo) {
        return refUserTypeInfoMapper.insert(userTypeInfo);
    }

    @Override
    public List<Map<String, Object>> personalPriceCount(Integer userId, Integer typeId, Integer tyepFlag,Integer moneyFlag) {
        return a_extraRefUserTypeInfoMapper.personalPriceCount(userId, typeId, tyepFlag,moneyFlag);
    }

    @Override
    public List<Map<String, Object>> personalInOutInfo(Integer userId, Integer typeId, Integer tyepFlag,Integer moneyFlag) {
        return a_extraRefUserTypeInfoMapper.personalInOutInfo(userId, typeId, tyepFlag,moneyFlag);
    }

    @Override
    public List<Map<String, Object>> personalTimePriceCount(Integer userId, Integer typeId, Integer tyepFlag, Integer moneyFlag, Long beginTime, Long endTime) {
        return a_extraRefUserTypeInfoMapper.personalTimePriceCount(userId, typeId, tyepFlag, moneyFlag, beginTime, endTime);
    }
}
