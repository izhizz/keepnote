package com.personal.keepnote.controller;

import com.personal.keepnote.common.entity.ResultEntity;
import com.personal.keepnote.common.utils.MD5Util;
import com.personal.keepnote.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
@EnableAutoConfiguration
@Api(value = "User接口信息类", description = "用户接口")
public class UserController {
    @Resource
    UserService userService;

    @ApiOperation(value = "登陆", notes = "登陆")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultEntity login(@ApiParam(name = "username", value = "用户名", required = true) @RequestParam(value = "username") String username,
                              @ApiParam(name = "password", value = "密码", required = true) @RequestParam(value = "password") String password, HttpServletRequest request) {
        SysUser sysUser = userService.loginUser(username, MD5Util.go(password));
        if (sysUser != null) {
            request.getSession().setAttribute("user", sysUser);
            return ResultEntity.newResultEntity("登陆成功");
        } else {
            return ResultEntity.newErrEntity("用户名和密码有误");
        }

    }

}
