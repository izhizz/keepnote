package com.personal.keepnote.controller;

import com.personal.keepnote.common.entity.ResultEntity;
import com.personal.keepnote.common.entity.ResultEntityGenerics;
import com.personal.keepnote.persistence.entity.UseType;
import com.personal.keepnote.service.UseTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/type")
@EnableAutoConfiguration
@Api(value = "类别类", description = "类别接口")
public class UseTypeController {
    @Resource
    UseTypeService useTypeService;

    @ApiOperation(value = "查询主类型", notes = "查询主类型")
    @RequestMapping(value = "/topic/type", method = RequestMethod.GET)
    public ResultEntityGenerics<List<UseType>> topicType() {
        List<UseType> allTopicUseType = useTypeService.getAllTopicUseType();
        return new ResultEntityGenerics().newResultEntity(allTopicUseType);
    }

    @ApiOperation(value = "查询子类型", notes = "查询子类型")
    @RequestMapping(value = "/topic/type", method = RequestMethod.GET)
    public ResultEntityGenerics<List<UseType>> childType(@ApiParam(name = "pid", value = "父id", required = true) @RequestParam(value = "pid") String pid) {
        if (StringUtils.isEmpty(pid)) {
            return new ResultEntityGenerics().newResultEntity(-1, "err", "数据类型有误");
        }
        List<UseType> allTopicUseType = useTypeService.getAllChildUseType(Integer.parseInt(pid));
        return new ResultEntityGenerics().newResultEntity(allTopicUseType);
    }

    @ApiOperation(value = "查询子类型", notes = "查询子类型")
    @RequestMapping(value = "/topic/type", method = RequestMethod.GET)
    public ResultEntity topicType(@ApiParam(name = "useType", value = "类别对象", required = true) @RequestBody UseType useType) {
        useTypeService.addUseType(useType);
        return ResultEntity.newResultEntity("添加成功");
    }
}
