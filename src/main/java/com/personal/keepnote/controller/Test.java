package com.personal.keepnote.controller;

import com.personal.keepnote.persistence.dao.SysUserMapper;
import com.personal.keepnote.persistence.entity.SysUserExample;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@Api(value = "ApiV2Controller", description = "体育课接口aaaaaaaapi")
public class Test {
    @Autowired
    SysUserMapper sysUserMapper;

    @RequestMapping("/")
    public String test() {
        return "hello,word!";
    }


    @ApiOperation(value = "添加体育测试周期", notes = "客户端添加体育项目测试的周期，周期名称不能与已有周期名称重复，周期名字1-50个字符，例如：2019年第一学期第一次测试。如果id不为空修改周期，如果id为空新增周期")
    @RequestMapping("/aa")
    public String aa() {
        SysUserExample sysUserExample = new SysUserExample();
        sysUserMapper.selectByExample(sysUserExample);
        return "hello,word!";
    }
}
