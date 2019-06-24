package com.personal.keepnote.service.impl;

import com.personal.keepnote.common.utils.FingerUtils;
import com.personal.keepnote.persistence.dao.A_ExtraRefUserInfomationMapper;
import com.personal.keepnote.persistence.dao.RefUserInformationMapper;
import com.personal.keepnote.persistence.entity.RefUserInformation;
import com.personal.keepnote.persistence.entity.RefUserInformationExample;
import com.personal.keepnote.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class UserInformationServiceImpl implements UserInformationService {
    @Autowired
    RefUserInformationMapper refUserInformationMapper;
    @Autowired
    A_ExtraRefUserInfomationMapper a_extraRefUserInfomationMapper;

    @Override
    public Integer sendAcceptanceInfo(Integer sendUserId, Integer[] replyIds, String sendRemark, Double sendPrice) {
        RefUserInformation refUserInformation = null;
        List<RefUserInformation> refUserInformationList = new ArrayList<>();
        for (Integer id : replyIds) {
            refUserInformation = new RefUserInformation();
            refUserInformation.setSendUserId(sendUserId);
            refUserInformation.setReciveUserId(id);
            refUserInformation.setSendRemark(sendRemark);
            refUserInformation.setSendTime(System.currentTimeMillis());
            refUserInformation.setFlag(1);
            refUserInformation.setPrice(FingerUtils.keepTheDecimalPoint((sendPrice / replyIds.length), 2));
            refUserInformationList.add(refUserInformation);
            refUserInformationList.add(refUserInformation);
        }
        return a_extraRefUserInfomationMapper.insertBatchRefUserInfomation(refUserInformationList);
    }

    @Override
    public Integer acceptanceInfoConfirmation(Integer id) {
        RefUserInformation refUserInformation = new RefUserInformation();
        refUserInformation.setId(id);
        refUserInformation.setFlag(2);
        return refUserInformationMapper.updateByPrimaryKeySelective(refUserInformation);
    }

    @Override
    public Integer payOffInfo(Integer id, String replyRemark) {
        RefUserInformation refUserInformation = new RefUserInformation();
        refUserInformation.setId(id);
        refUserInformation.setFlag(3);
        refUserInformation.setReplyTime(System.currentTimeMillis());
        refUserInformation.setReplyMark(replyRemark);
        return refUserInformationMapper.updateByPrimaryKeySelective(refUserInformation);
    }

    @Override
    public Integer confirmationOfPaymentInfo(Integer id) {
        RefUserInformation refUserInformation = new RefUserInformation();
        refUserInformation.setId(id);
        refUserInformation.setFlag(4);
        return refUserInformationMapper.updateByPrimaryKeySelective(refUserInformation);
    }

    @Override
    public List<RefUserInformation> getSendInfomationByUserId(Integer userId) {
        RefUserInformationExample refUserInformationExample = new RefUserInformationExample();
        refUserInformationExample.createCriteria().andSendUserIdEqualTo(userId);
        refUserInformationExample.setOrderByClause("send_time ASC");
        List<RefUserInformation> refUserInformations = refUserInformationMapper.selectByExample(refUserInformationExample);
        return refUserInformations;
    }

    @Override
    public List<RefUserInformation> getReplyInfomationByUserId(Integer userId) {
        RefUserInformationExample refUserInformationExample = new RefUserInformationExample();
        refUserInformationExample.createCriteria().andReciveUserIdEqualTo(userId);
        refUserInformationExample.setOrderByClause("reply_time ASC");
        List<RefUserInformation> refUserInformations = refUserInformationMapper.selectByExample(refUserInformationExample);
        return refUserInformations;
    }

    @Override
    public List<Map<String, Object>> getSendInfoByUserId(Integer userId) {
        return a_extraRefUserInfomationMapper.sendInfomationByUserId(userId);
    }

    @Override
    public List<Map<String, Object>> getReplyInfoByUserId(Integer userId) {
        return a_extraRefUserInfomationMapper.replyInfomationByUserId(userId);
    }
}
