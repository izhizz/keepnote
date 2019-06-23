package com.personal.keepnote.service;

import com.personal.keepnote.persistence.entity.RefUserInformation;

import java.util.List;

public interface UserInformationService {
    /**
     * 发送收款信息
     *
     * @param sendUserId
     * @param replyIds
     * @param sendRemark
     * @return
     */
    Integer sendAcceptanceInfo(Integer sendUserId, Integer[] replyIds, String sendRemark,Double sendPrice);

    /**
     * 收取确认
     *
     * @param id
     * @return
     */
    Integer acceptanceInfoConfirmation(Integer id);

    /**
     * 缴清
     *
     * @param id
     * @return
     */
    Integer payOffInfo(Integer id, String replyRemark);

    /**
     * 缴清确认
     *
     * @param id
     * @return
     */
    Integer confirmationOfPaymentInfo(Integer id);


}
