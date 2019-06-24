package com.personal.keepnote.controller;

import com.personal.keepnote.common.entity.ResultEntity;
import com.personal.keepnote.persistence.entity.SysUser;
import com.personal.keepnote.service.UserInformationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
/**
 * @author MR FENG
 */
@Api(value = "UserType接口信息类", description = "记账信息类")
@RestController
@EnableAutoConfiguration
@RequestMapping("/information")
public class UserInformationController {
    @Resource
    UserInformationService userInformationService;

    @ApiOperation(value = "发送收款信息", notes = "发送收款信息")
    @RequestMapping(value = "/send/acceptance/info", method = RequestMethod.POST)
    public ResultEntity sendAcceptanceInfo(@ApiParam(name = "replyIds", value = "收信息人集合", required = true) @RequestParam(value = "replyIds") Integer[] replyIds,
                                           @ApiParam(name = "sendRemark", value = "发送备注") @RequestParam("sendRemark") String sendRemark,
                                           @ApiParam(name = "countPrice", value = "总价格") @RequestParam("countPrice") Double countPrice, HttpServletRequest request) {
        SysUser user = (SysUser) request.getSession().getAttribute("user");
        userInformationService.sendAcceptanceInfo(user.getId(), replyIds, sendRemark, countPrice);
        return ResultEntity.newResultEntity("操作成功");
    }

    @ApiOperation(value = "发送收款信息确认", notes = "发送收款信息确认")
    @RequestMapping(value = "/send/acceptance/confirmation", method = RequestMethod.POST)
    public ResultEntity deleteUseTypeByTime(@ApiParam(name = "userId", value = "用户id", required = true) @RequestParam(value = "userId") Integer id) {
        userInformationService.acceptanceInfoConfirmation(id);
        return ResultEntity.newResultEntity("操作成功");
    }

    @ApiOperation(value = "收款信息", notes = "收款信息")
    @RequestMapping(value = "/reply/acceptance", method = RequestMethod.POST)
    public ResultEntity payOffInfo(@ApiParam(name = "userId", value = "用户id", required = true) @RequestParam(value = "userId") Integer id,
                                   @ApiParam(name = "replyRemark", value = "收信息人集合", required = true) @RequestParam(value = "replyRemark") String replyRemark) {
        userInformationService.payOffInfo(id, replyRemark);
        return ResultEntity.newResultEntity("操作成功");
    }


    @ApiOperation(value = "收款信息确认", notes = "收款信息确认")
    @RequestMapping(value = "/reply/acceptance/confirmation", method = RequestMethod.POST)
    public ResultEntity confirmationOfPaymentInfo(@ApiParam(name = "userId", value = "用户id", required = true) @RequestParam(value = "userId") Integer id) {
        userInformationService.confirmationOfPaymentInfo(id);
        return ResultEntity.newResultEntity("操作成功");
    }


    @ApiOperation(value = "发送消息查看", notes = "发送消息查看")
    @RequestMapping(value = "/send/info", method = RequestMethod.POST)
    public ResultEntity sendInfo(@ApiParam(name = "userId", value = "用户id", required = true) @RequestParam(value = "userId") Integer id) {
        List<Map<String, Object>> sendInfoByUserId = userInformationService.getSendInfoByUserId(id);
        return ResultEntity.newResultEntity(sendInfoByUserId);
    }

    @ApiOperation(value = "收到消息查看", notes = "收到消息查看")
    @RequestMapping(value = "/reply/info", method = RequestMethod.POST)
    public ResultEntity replyInfo(@ApiParam(name = "userId", value = "用户id", required = true) @RequestParam(value = "userId") Integer id) {
        List<Map<String, Object>> replyInfoByUserId = userInformationService.getReplyInfoByUserId(id);
        return ResultEntity.newResultEntity(replyInfoByUserId);
    }


}
