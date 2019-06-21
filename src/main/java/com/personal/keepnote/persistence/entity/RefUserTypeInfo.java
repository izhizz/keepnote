package com.personal.keepnote.persistence.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.personal.keepnote.persistence.entity.RefUserTypeInfo")
public class RefUserTypeInfo {
    @ApiModelProperty(value="主键id")
    private String id;

    @ApiModelProperty(value="用户id")
    private Integer userId;

    @ApiModelProperty(value="类别id")
    private Integer typeId;

    @ApiModelProperty(value="支出/收入[0,1]")
    private Integer moneyFlag;

    @ApiModelProperty(value="个人/公共[0,1]")
    private Integer typeFlag;

    @ApiModelProperty(value="价格")
    private Double price;

    @ApiModelProperty(value="操作时间")
    private Long dataTime;

    @ApiModelProperty(value="当天0晨时间戳")
    private Long dayTime;

    @ApiModelProperty(value="记账选择时间")
    private Long dateTime;

    @ApiModelProperty(value="备注")
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