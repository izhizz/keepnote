package com.personal.keepnote.persistence.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.personal.keepnote.persistence.entity.SysUser")
public class SysUser {
    @ApiModelProperty(value="主键")
    private Integer id;

    @ApiModelProperty(value="登录名")
    private String userName;

    @ApiModelProperty(value="密码")
    private String passWord;

    @ApiModelProperty(value="用户名")
    private String name;

    @ApiModelProperty(value="昵称")
    private String nickName;

    @ApiModelProperty(value="组密码/验证码")
    private String groupWord;

    @ApiModelProperty(value="身份[0使用用户，1管理用户，2拉黑用户]")
    private Integer flag;

    public SysUser(Integer id, String userName, String passWord, String name, String nickName, String groupWord, Integer flag) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.name = name;
        this.nickName = nickName;
        this.groupWord = groupWord;
        this.flag = flag;
    }

    public SysUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getGroupWord() {
        return groupWord;
    }

    public void setGroupWord(String groupWord) {
        this.groupWord = groupWord == null ? null : groupWord.trim();
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}