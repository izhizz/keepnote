package com.personal.keepnote.persistence.entity;

public class RefUserSeeHistory {
    private Integer masterUserId;

    private Integer seeUserId;

    private Long datetime;

    public RefUserSeeHistory(Integer masterUserId, Integer seeUserId, Long datetime) {
        this.masterUserId = masterUserId;
        this.seeUserId = seeUserId;
        this.datetime = datetime;
    }

    public RefUserSeeHistory() {
        super();
    }

    public Integer getMasterUserId() {
        return masterUserId;
    }

    public void setMasterUserId(Integer masterUserId) {
        this.masterUserId = masterUserId;
    }

    public Integer getSeeUserId() {
        return seeUserId;
    }

    public void setSeeUserId(Integer seeUserId) {
        this.seeUserId = seeUserId;
    }

    public Long getDatetime() {
        return datetime;
    }

    public void setDatetime(Long datetime) {
        this.datetime = datetime;
    }
}