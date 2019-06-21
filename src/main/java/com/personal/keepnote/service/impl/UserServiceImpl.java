package com.personal.keepnote.service.impl;

import com.personal.keepnote.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser loginUser(String username, String password) {
        SysUserExample sysUserExample = new SysUserExample();
        sysUserExample.createCriteria().andUserNameEqualTo(username).equals(password);
        SysUser sysUser = null;
        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
        if (sysUsers!=null && sysUsers.size()!=0){
            sysUser = sysUsers.get(0);
        }
        return sysUser;
    }

    @Override
    public Integer registerUser(SysUser user) {
        return sysUserMapper.insert(user);
    }
}
