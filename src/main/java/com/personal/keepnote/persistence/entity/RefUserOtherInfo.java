package com.personal.keepnote.persistence.entity;

public class RefUserOtherInfo extends RefUserOtherInfoKey {
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