package com.personal.keepnote.controller;

import com.personal.keepnote.persistence.dao.SysUserMapper;
import com.personal.keepnote.persistence.entity.SysUserExample;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Test {
    @Autowired
    SysUserMapper sysUserMapper;

    @RequestMapping("/")
    public String test() {
        return "hello,word!";
    }

    @RequestMapping("/aa")
    public String aa() {
        SysUserExample sysUserExample = new SysUserExample();
        sysUserMapper.selectByExample(sysUserExample);
        return "hello,word!";
    }
}
