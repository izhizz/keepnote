package com.personal.keepnote.persistence.entity;

public class RefUserTypeInfo {
    private String id;

    private Integer userId;

    private Integer typeId;

    private Integer moneyFlag;

    private Integer typeFlag;

    private Double price;

    private Long dataTime;

    private Long dayTime;

    private Long dateTime;

    private String remark;

    public RefUserTypeInfo(String id, Integer userId, Integer typeId, Integer moneyFlag, Integer typeFlag, Double price, Long dataTime, Long dayTime, Long dateTime, String remark) {
        this.id = id;
        this.userId = userId;
        this.typeId = typeId;
        this.moneyFlag = moneyFlag;
        this.typeFlag = typeFlag;
        this.price = price;
        this.dataTime = dataTime;
        this.dayTime = dayTime;
        this.dateTime = dateTime;
        this.remark = remark;
    }

    public RefUserTypeInfo() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getMoneyFlag() {
        return moneyFlag;
    }

    public void setMoneyFlag(Integer moneyFlag) {
        this.moneyFlag = moneyFlag;
    }

    public Integer getTypeFlag() {
        return typeFlag;
    }

    public void setTypeFlag(Integer typeFlag) {
        this.typeFlag = typeFlag;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getDataTime() {
        return dataTime;
    }

    public void setDataTime(Long dataTime) {
        this.dataTime = dataTime;
    }

    public Long getDayTime() {
        return dayTime;
    }

    public void setDayTime(Long dayTime) {
        this.dayTime = dayTime;
    }

    public Long getDateTime() {
        return dateTime;
    }

    public void setDateTime(Long dateTime) {
        this.dateTime = dateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}