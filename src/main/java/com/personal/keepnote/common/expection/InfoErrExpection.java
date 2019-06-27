package com.personal.keepnote.common.expection;

import com.personal.keepnote.common.entity.ResultEntity;

/**
 * @author MR feng
 */
public class InfoErrExpection extends RuntimeException {
    public ResultEntity resultEntity = new ResultEntity();

    public InfoErrExpection(String msg) {
        super(msg);
        resultEntity.setCode(-1);
        resultEntity.setMsg("msg");
    }
}
