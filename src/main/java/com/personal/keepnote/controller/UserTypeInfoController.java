package com.personal.keepnote.controller;

import com.personal.keepnote.common.entity.ResultEntity;
import com.personal.keepnote.persistence.entity.RefUserTypeInfo;
import com.personal.keepnote.service.UserTypeInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author MR FENG
 */
@Api(value = "UserType接口信息类", description = "记账信息类")
@RestController
@EnableAutoConfiguration
@RequestMapping("/bookkeeping")
public class UserTypeInfoController {
    @Resource
    UserTypeInfoService userTypeInfoService;

    @ApiOperation(value = "按时间删除（单天删除）", notes = "按时间删除（单天删除）")
    @RequestMapping(value = "/one/time", method = RequestMethod.DELETE)
    public ResultEntity deleteUseTypeByTime(@ApiParam(name = "time", value = "时间戳", required = true) @RequestParam(value = "time") Long time) {
        userTypeInfoService.deleteUserTypeInfoBytime(time);
        return ResultEntity.newResultEntity("删除成功");
    }

    @ApiOperation(value = "按时间区间删除（小于该天删除）", notes = "按时间区间删除（小于该天删除）")
    @RequestMapping(value = "/range/time", method = RequestMethod.DELETE)
    public ResultEntity deleteUseTypeByRangTime(@ApiParam(name = "time", value = "时间戳", required = true) @RequestParam(value = "time") Long time) {
        userTypeInfoService.deleteUserTypeInfoByTimeRange(time);
        return ResultEntity.newResultEntity("删除成功");
    }

    @ApiOperation(value = "按照id删除记录", notes = "查询子类型")
    @RequestMapping(value = "/info/id", method = RequestMethod.DELETE)
    public ResultEntity deleteUseTypeById(@ApiParam(name = "time", value = "时间戳", required = true) @RequestParam(value = "time") String id) {
        userTypeInfoService.deleteUserTypeInfoById(id);
        return ResultEntity.newResultEntity("删除成功");
    }

    @ApiOperation(value = "插入记账信息", notes = "插入记账信息")
    @RequestMapping(value = "/info", method = RequestMethod.POST)
    public ResultEntity deleteUseTypeById(@ApiParam(name = "refUserTypeInfo", value = "时间戳", required = true) @RequestBody RefUserTypeInfo refUserTypeInfo) {
        userTypeInfoService.insertUserTypeInfo(refUserTypeInfo);
        return ResultEntity.newResultEntity("添加成功");
    }

    @ApiOperation(value = "个人单个/全部 总支出/收入", notes = "个人单个/全部 总支出/收入")
    @RequestMapping(value = "/info/count", method = RequestMethod.POST)
    public ResultEntity getUseType(@ApiParam(name = "userId", value = "用户id", required = true) Integer userId,
                                   @ApiParam(name = "typeId", value = "类别id") Integer typeId,
                                   @ApiParam(name = "money_flag", value = "支出/收入[0,1]", required = true) Integer moneyFlag,
                                   @ApiParam(name = "typeFlag", value = "个人/公共[0,1]") Integer typeFlag,
                                   @ApiParam(name = "dayTime", value = "当天") Long dayTime

    ) {
        List<Map<String, Object>> dataList = userTypeInfoService.personalPriceCount(userId, typeId, typeFlag, moneyFlag,dayTime);
        return ResultEntity.newResultEntity(dataList);
    }

    @ApiOperation(value = "个人单个/全部 支出/收入明细", notes = "个人单个/全部 总支出/收入")
    @RequestMapping(value = "/info/detailed", method = RequestMethod.POST)
    public ResultEntity getUseTypeInfo(@ApiParam(name = "userId", value = "用户id", required = true) Integer userId,
                                       @ApiParam(name = "typeId", value = "类别id") Integer typeId,
                                       @ApiParam(name = "money_flag", value = "支出/收入[0,1]", required = true) Integer moneyFlag,
                                       @ApiParam(name = "typeFlag", value = "个人/公共[0,1]") Integer typeFlag,
                                       @ApiParam(name = "dayTime", value = "当天") Long dayTime) {
        List<Map<String, Object>> dataList = userTypeInfoService.personalInOutInfo(userId, typeId, typeFlag, moneyFlag,dayTime);
        return ResultEntity.newResultEntity(dataList);
    }

    @ApiOperation(value = "按天查询支出/收入总和", notes = "按天查询支出/收入总和")
    @RequestMapping(value = "/info/time", method = RequestMethod.POST)
    public ResultEntity getUseTypeCountByTime(@ApiParam(name = "userId", value = "用户id", required = true) Integer userId,
                                              @ApiParam(name = "typeId", value = "类别id") Integer typeId,
                                              @ApiParam(name = "money_flag", value = "支出/收入[0,1]", required = true) Integer moneyFlag,
                                              @ApiParam(name = "typeFlag", value = "个人/公共[0,1]") Integer typeFlag,
                                              @ApiParam(name = "beginTime", value = "开始时间") Long beginTime,
                                              @ApiParam(name = "beginTime", value = "开始时间") Long endTime
    ) {
        List<Map<String, Object>> dataList = userTypeInfoService.personalTimePriceCount(userId, typeId, typeFlag, moneyFlag, beginTime, endTime);
        return ResultEntity.newResultEntity(dataList);
    }

    @ApiOperation(value = "查询总支出/收入月日年", notes = "查询总支出/收入月日年")
    @RequestMapping(value = "/info/YMD", method = RequestMethod.POST)
    public ResultEntity getUseTypeCountByMDY(@ApiParam(name = "userId", value = "用户id", required = true) Integer userId,
                                             @ApiParam(name = "typeId", value = "类别id") Integer typeId,
                                             @ApiParam(name = "money_flag", value = "支出/收入[0,1]", required = true) Integer moneyFlag,
                                             @ApiParam(name = "typeFlag", value = "个人/公共[0,1]") Integer typeFlag,
                                             @ApiParam(name = "beginTime", value = "开始时间") Long beginTime,
                                             @ApiParam(name = "beginTime", value = "开始时间") Long endTime,
                                             @ApiParam(name = "flag", value = "标识 3年2月1日",required = true)Integer flag,
                                             @ApiParam(name = "time", value = "时间/月用201809 /年用2018",required = true)String time
    ) {
        List<Map<String, Object>> dataList = userTypeInfoService.personalPriceCountByYMD(userId, typeId, typeFlag, moneyFlag, beginTime, endTime, flag, time);
        return ResultEntity.newResultEntity(dataList);
    }
}
