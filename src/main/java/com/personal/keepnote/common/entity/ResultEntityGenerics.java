package com.personal.keepnote.common.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * @author MR FENG
 */
@ApiModel(description = "返回值信息")
public class ResultEntityGenerics<T> {
    public static final String OK_MSG = "ok";
    public static final int OK_CODE = 0;

    public static final String ERR_MSG = "err";
    public static final int ERR_CODE = -1;

    // http code
    // 非法请求
    public static final int ILLEGAL_CODE = 403;
    // 未登陆
    public static final int NOT_LOGIN_CODE = 401;
    // 不存在
    public static final int NOT_FOUND_CODE = 404;
    @ApiModelProperty(value = "结果代码")
    private int code;
    @ApiModelProperty(value = "信息")
    private String msg;
    @ApiModelProperty(value = "结果数据")
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResultEntityGenerics<T> newResultEntity() {
        return newResultEntity(OK_CODE, OK_MSG, null);
    }

    public ResultEntityGenerics<T> newResultEntity(T obj) {
        return newResultEntity(OK_CODE, OK_MSG, obj);
    }

    public ResultEntityGenerics<T> newResultEntity(String msg, T obj) {
        return newResultEntity(OK_CODE, msg, obj);
    }

    public ResultEntityGenerics<T> newResultEntity(int code, String msg, T data) {
        ResultEntityGenerics<T> resultEntity = new ResultEntityGenerics<T>();
        resultEntity.setCode(code);
        resultEntity.setMsg(msg);
        resultEntity.setData(data);
        return resultEntity;
    }

    public static ResultEntityGenerics newErrEntity() {
        return newErrEntity(ERR_CODE, ERR_MSG);
    }

    public static ResultEntityGenerics newErrEntity(String msg) {
        return newErrEntity(ERR_CODE, msg);
    }

    public static ResultEntityGenerics newErrEntity(int code, String msg) {
        ResultEntityGenerics errEntity = new ResultEntityGenerics();
        errEntity.setCode(code);
        errEntity.setMsg(msg);
        return errEntity;
    }
}
