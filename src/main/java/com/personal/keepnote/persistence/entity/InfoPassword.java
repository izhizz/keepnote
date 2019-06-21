package com.personal.keepnote.persistence.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.personal.keepnote.persistence.entity.InfoPassword")
public class InfoPassword {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="keyInfo")
    private String keyInfo;

    public InfoPassword(Integer id, String keyInfo) {
        this.id = id;
        this.keyInfo = keyInfo;
    }

    public InfoPassword() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeyInfo() {
        return keyInfo;
    }

    public void setKeyInfo(String keyInfo) {
        this.keyInfo = keyInfo == null ? null : keyInfo.trim();
    }
}