package com.personal.keepnote.persistence.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.personal.keepnote.persistence.entity.InfoPassword")
public class InfoPassword {
    @ApiModelProperty(value="id")
    private Integer id;

    @ApiModelProperty(value="key")
    private String key;

    public InfoPassword(Integer id, String key) {
        this.id = id;
        this.key = key;
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }
}