/***
 *                    _ooOoo_
 *                   o8888888o
 *                   88" . "88
 *                   (| -_- |)
 *                    O\ = /O
 *                ____/`---'\____
 *              .   ' \\| |// `.
 *               / \\||| : |||// \
 *             / _||||| -:- |||||- \
 *               | | \\\ - /// | |
 *             | \_| ''\---/'' | |
 *              \ .-\__ `-` ___/-. /
 *           ___`. .' /--.--\ `. . __
 *        ."" '< `.___\_<|>_/___.' >'"".
 *       | | : `- \`.;`\ _ /`;.`/ - ` : | |
 *         \ \ `-. \_ __\ /__ _/ .-` / /
 * ======`-.____`-.___\_____/___.-`____.-'======
 *                    `=---='
 *
 * .............................................
 *          佛祖保佑             永无BUG
 */

package com.personal.keepnote.controller;

import com.personal.keepnote.common.entity.ResultEntity;
import com.personal.keepnote.common.utils.MD5Util;
import com.personal.keepnote.persistence.entity.SysUser;
import com.personal.keepnote.service.InfoPasswordService;
import com.personal.keepnote.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
@EnableAutoConfiguration
@Api(value = "User接口信息类", description = "用户接口")
public class UserController {
    @Resource
    UserService userService;
    @Resource
    InfoPasswordService infoPasswordService;
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

    @ApiOperation(value = "注册", notes = "注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResultEntity register(@ApiParam(name = "sysUser", value = "用户对象参数", required = true) @RequestBody SysUser sysUser) {
        if (StringUtils.isEmpty(sysUser.getGroupWord())) {
            return ResultEntity.newErrEntity("秘钥为空");
        }
        if (!infoPasswordService.checkValidResgister(sysUser.getGroupWord())){
            return ResultEntity.newErrEntity("秘钥无效");
        }
        Integer integer = userService.registerUser(sysUser);
        if (integer != 0) {
            return ResultEntity.newResultEntity("注册成功");
        } else {
            return ResultEntity.newErrEntity("注册参数有误");
        }
    }

}
