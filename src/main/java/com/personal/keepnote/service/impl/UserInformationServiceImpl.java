package com.personal.keepnote.service.impl;

import com.personal.keepnote.common.utils.FingerUtils;
import com.personal.keepnote.persistence.dao.A_ExtraRefUserInfomationMapper;
import com.personal.keepnote.persistence.dao.RefUserInformationMapper;
import com.personal.keepnote.persistence.dao.RefUserTypeInfoMapper;
import com.personal.keepnote.persistence.entity.RefUserInformation;
import com.personal.keepnote.persistence.entity.RefUserTypeInfo;
import com.personal.keepnote.persistence.entity.RefUserTypeInfoExample;
import com.personal.keepnote.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

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
}
