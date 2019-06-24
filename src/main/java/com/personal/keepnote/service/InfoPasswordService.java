package com.personal.keepnote.service;

import com.personal.keepnote.persistence.entity.InfoPassword;

import java.util.List;

/**
 * @author MR FENG
 */
public interface InfoPasswordService {
    /**
     * 查看所有的信息组
     *
     * @return
     */
    List<InfoPassword> getAllInfoPassword();

    /**
     * 检查是否是有效用户注册
     *
     * @param key
     * @return
     */
    boolean checkValidResgister(String key);
}
