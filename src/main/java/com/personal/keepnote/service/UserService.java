package com.personal.keepnote.service;

import com.personal.keepnote.persistence.entity.SysUser;

public interface UserService {
    /**
     * 登陆用户
     *
     * @param username
     * @param password
     * @return
     */
    SysUser loginUser(String username, String password);

    /**
     * 注册用户
     *
     * @param user
     * @return
     */
    Integer registerUser(SysUser user);
}
