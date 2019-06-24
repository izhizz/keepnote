package com.personal.keepnote.service;

import com.personal.keepnote.persistence.entity.SysUser;

import java.util.List;

/**
 * @author MR FENG
 */
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

    /**
     * 查看同组的用户
     *
     * @param groupKey
     * @return
     */
    List<SysUser> getAllSysUser(String groupKey);
}
