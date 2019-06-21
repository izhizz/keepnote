package com.personal.keepnote.persistence.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.personal.keepnote.persistence.entity.RefUserOtherInfoKey")
public class RefUserOtherInfoKey {
    @ApiModelProperty(value="用户id")
    private Integer sUserId;

    @ApiModelProperty(value="查看用户id")
    private Integer rUserId;

    public RefUserOtherInfoKey(Integer sUserId, Integer rUserId) {
        this.sUserId = sUserId;
        this.rUserId = rUserId;
    }

    public RefUserOtherInfoKey() {
        super();
    }

    public Integer getsUserId() {
        return sUserId;
    }

    public void setsUserId(Integer sUserId) {
        this.sUserId = sUserId;
    }

    public Integer getrUserId() {
        return rUserId;
    }

    public void setrUserId(Integer rUserId) {
        this.rUserId = rUserId;
    }
}