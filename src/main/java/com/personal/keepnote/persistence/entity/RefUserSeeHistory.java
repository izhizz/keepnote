package com.personal.keepnote.persistence.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.personal.keepnote.persistence.entity.RefUserSeeHistory")
public class RefUserSeeHistory {
    @ApiModelProperty(value="用户id")
    private Integer masterUserId;

    @ApiModelProperty(value="查看id")
    private Integer seeUserId;

    @ApiModelProperty(value="时间")
    private Long datetime;

    public RefUserSeeHistory(Integer masterUserId, Integer seeUserId, Long datetime) {
        this.masterUserId = masterUserId;
        this.seeUserId = seeUserId;
        this.datetime = datetime;
    }

    public RefUserSeeHistory() {
        super();
    }

    public Integer getMasterUserId() {
        return masterUserId;
    }

    public void setMasterUserId(Integer masterUserId) {
        this.masterUserId = masterUserId;
    }

    public Integer getSeeUserId() {
        return seeUserId;
    }

    public void setSeeUserId(Integer seeUserId) {
        this.seeUserId = seeUserId;
    }

    public Long getDatetime() {
        return datetime;
    }

    public void setDatetime(Long datetime) {
        this.datetime = datetime;
    }
}