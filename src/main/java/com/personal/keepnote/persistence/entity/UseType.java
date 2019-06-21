package com.personal.keepnote.persistence.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.personal.keepnote.persistence.entity.UseType")
public class UseType {
    @ApiModelProperty(value="id主键id")
    private Integer id;

    @ApiModelProperty(value="pid父id")
    private Integer pid;

    @ApiModelProperty(value="typeName类别名称")
    private String typeName;

    public UseType(Integer id, Integer pid, String typeName) {
        this.id = id;
        this.pid = pid;
        this.typeName = typeName;
    }

    public UseType() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }
}