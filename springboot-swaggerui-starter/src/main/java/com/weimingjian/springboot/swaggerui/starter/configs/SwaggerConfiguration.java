package com.weimingjian.springboot.swaggerui.starter.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author weimingjian
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket configRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.weimingjian.springboot.swaggerui.starter.controller"))
                .paths(PathSelectors.any())
                .build()
                .enable(true);

    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger UI 集成")
                .description("Spring Boot & Swagger UI")
                .termsOfServiceUrl("http://localhost:8888/swagger-ui.html ")
                .version("1.0")
                .license("Apache 2.0")
                .contact(new Contact("weimingjian","www.baidu.com", "158154126@qq.com"))
                .build();
    }
}
