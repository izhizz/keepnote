package com.personal.keepnote.controller;

import com.personal.keepnote.common.entity.ResultEntityGenerics;
import com.personal.keepnote.persistence.entity.UseType;
import com.personal.keepnote.service.UseTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}
