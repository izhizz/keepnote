package com.personal.keepnote.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Parameter;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@EnableSwagger2
@Configuration
@ComponentScan(basePackages = "com.personal.keepnote.controller")
public class SwaggerConfiguration {
    @Bean
    public Docket buildDocket() {
//        如果token在body中可做全局
        List<SecurityScheme> list = new ArrayList<>();
        list.add(new ApiKey("access_token", "token", "query"));

//        token在head做单个接口参数
        ParameterBuilder param = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        param.name("token").description("登陆token")
                .modelRef(new ModelRef("string")).parameterType("header")
                //header中的token参数非必填
                .required(false).build();
        pars.add(param.build());

        return new Docket(DocumentationType.SWAGGER_2)
                .enable(true)
                .apiInfo(buildApiInfo()).forCodeGeneration(true)
                .select()
                //要扫描的API(Controller)基础包
                .apis(RequestHandlerSelectors.basePackage("com.personal.keepnote.controller"))
                .paths(PathSelectors.any())
                .build()
//               全部方法添加head参数
                .globalOperationParameters(pars)
//                全局变量添加token参数
                .securitySchemes(list);
    }

    /**
     * @param
     * @return springfox.documentation.service.ApiInfo
     * @Title: 构建API基本信息
     * @methodName: buildApiInfo
     * @Description:
     * @author: ff
     * @date: 2019
     */
    private ApiInfo buildApiInfo() {

        return new ApiInfoBuilder()
                .title("小队伍研发第一个项目")
                .description("记账本")
                .version("1.0.1")
                .build();

    }



}