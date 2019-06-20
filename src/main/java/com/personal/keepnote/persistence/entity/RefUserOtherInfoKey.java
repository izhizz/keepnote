package com.personal.keepnote.persistence.entity;

public class RefUserOtherInfoKey {
    private Integer sUserId;

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