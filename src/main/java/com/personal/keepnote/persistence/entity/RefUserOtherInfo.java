package com.personal.keepnote.persistence.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.personal.keepnote.persistence.entity.RefUserOtherInfo")
public class RefUserOtherInfo extends RefUserOtherInfoKey {
    @ApiModelProperty(value="0申请查看1已同意2不同意")
    private Integer flag;

    public RefUserOtherInfo(Integer sUserId, Integer rUserId, Integer flag) {
        super(sUserId, rUserId);
        this.flag = flag;
    }

    public RefUserOtherInfo() {
        super();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}