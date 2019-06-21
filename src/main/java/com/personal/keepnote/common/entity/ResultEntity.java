package com.personal.keepnote.common.entity;


import com.personal.keepnote.common.utils.GsonUtil;
import org.apache.commons.lang3.StringUtils;


public class ResultEntity {

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

    private int code;
    private String msg;
    private Object data;

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResultEntity() {
        this.code = OK_CODE;
        this.msg = OK_MSG;
        this.data = null;
    }

    public ResultEntity(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultEntity{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public static ResultEntity resultEntity(String resultString) {
        if (StringUtils.isEmpty(resultString)) {
            return null;
            //throw new ParamException("参数不能为空");
        }
        return GsonUtil.fromJson(resultString, ResultEntity.class);
    }

    public static ResultEntity newResultEntity() {
        return newResultEntity(OK_MSG, null);
    }

    public static ResultEntity newResultEntity(Object obj) {
        return newResultEntity(OK_MSG, obj);
    }

    public static ResultEntity newResultEntity(String msg, Object data) {
        return new ResultEntity(OK_CODE, msg, data);
    }

    public static ResultEntity newErrEntity() {
        return newErrEntity(ERR_MSG, null);
    }

    public static ResultEntity newErrEntity(int code, String msg) {
        return new ResultEntity(code, msg, null);
    }

    public static ResultEntity newErrEntity(String msg) {
        return newErrEntity(msg, null);
    }

    public static ResultEntity newErrEntity(String msg, Object data) {
        return new ResultEntity(ERR_CODE, msg, data);
    }

}
