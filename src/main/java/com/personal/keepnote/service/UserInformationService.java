package com.personal.keepnote.service;

import com.personal.keepnote.persistence.entity.RefUserInformation;

import java.util.List;
import java.util.Map;
/**
 * @author MR FENG
 */
public interface UserInformationService {
    /**
     * 发送收款信息
     *
     * @param sendUserId
     * @param replyIds
     * @param sendRemark
     * @return
     */
    Integer sendAcceptanceInfo(Integer sendUserId, Integer[] replyIds, String sendRemark, Double sendPrice);

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

    /**
     * 发送的消息
     *
     * @param userId
     * @return
     */
    List<RefUserInformation> getSendInfomationByUserId(Integer userId);

    /**
     * 收到的消息
     *
     * @param userId
     * @return
     */
    List<RefUserInformation> getReplyInfomationByUserId(Integer userId);

    /**
     * 发送的消息
     *
     * @param userId
     * @return
     */
    List<Map<String,Object>> getSendInfoByUserId(Integer userId);

    /**
     * 收到的消息
     *
     * @param userId
     * @return
     */
    List<Map<String,Object>> getReplyInfoByUserId(Integer userId);
}
