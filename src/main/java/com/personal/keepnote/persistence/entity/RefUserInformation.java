package com.personal.keepnote.persistence.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.personal.keepnote.persistence.entity.RefUserInformation")
public class RefUserInformation {
    @ApiModelProperty(value="id主键id")
    private Integer id;

    @ApiModelProperty(value="sendUserId发起用户id")
    private Integer sendUserId;

    @ApiModelProperty(value="reciveUserId收到用户id")
    private Integer reciveUserId;

    @ApiModelProperty(value="price金额")
    private Double price;

    @ApiModelProperty(value="flag1收取2收取确认3缴清4缴清确认")
    private Integer flag;

    @ApiModelProperty(value="sendTime发起时间")
    private Long sendTime;

    @ApiModelProperty(value="replyTime回复时间")
    private Long replyTime;

    @ApiModelProperty(value="sendRemark发送备注")
    private String sendRemark;

    @ApiModelProperty(value="replyMark回复备注")
    private String replyMark;

    public RefUserInformation(Integer id, Integer sendUserId, Integer reciveUserId, Double price, Integer flag, Long sendTime, Long replyTime, String sendRemark, String replyMark) {
        this.id = id;
        this.sendUserId = sendUserId;
        this.reciveUserId = reciveUserId;
        this.price = price;
        this.flag = flag;
        this.sendTime = sendTime;
        this.replyTime = replyTime;
        this.sendRemark = sendRemark;
        this.replyMark = replyMark;
    }

    public RefUserInformation() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(Integer sendUserId) {
        this.sendUserId = sendUserId;
    }

    public Integer getReciveUserId() {
        return reciveUserId;
    }

    public void setReciveUserId(Integer reciveUserId) {
        this.reciveUserId = reciveUserId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Long getSendTime() {
        return sendTime;
    }

    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }

    public Long getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Long replyTime) {
        this.replyTime = replyTime;
    }

    public String getSendRemark() {
        return sendRemark;
    }

    public void setSendRemark(String sendRemark) {
        this.sendRemark = sendRemark == null ? null : sendRemark.trim();
    }

    public String getReplyMark() {
        return replyMark;
    }

    public void setReplyMark(String replyMark) {
        this.replyMark = replyMark == null ? null : replyMark.trim();
    }
}