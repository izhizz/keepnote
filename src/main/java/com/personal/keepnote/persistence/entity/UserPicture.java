package com.personal.keepnote.persistence.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.personal.keepnote.persistence.entity.UserPicture")
public class UserPicture {
    @ApiModelProperty(value="id主键")
    private Integer id;

    @ApiModelProperty(value="userId用户id")
    private Integer userId;

    @ApiModelProperty(value="picturePath图片路径")
    private String picturePath;

    @ApiModelProperty(value="flag0未使用1使用")
    private Integer flag;

    public UserPicture(Integer id, Integer userId, String picturePath, Integer flag) {
        this.id = id;
        this.userId = userId;
        this.picturePath = picturePath;
        this.flag = flag;
    }

    public UserPicture() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath == null ? null : picturePath.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}