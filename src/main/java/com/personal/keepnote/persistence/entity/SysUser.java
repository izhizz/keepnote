package com.personal.keepnote.persistence.entity;

public class SysUser {
    private Integer id;

    private String userName;

    private String passWord;

    private String name;

    private String nickName;

    private String groupWord;

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