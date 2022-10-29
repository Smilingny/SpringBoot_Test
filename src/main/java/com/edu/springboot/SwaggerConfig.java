package com.edu.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

// 配置swagger信息
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.OAS_30).apiInfo(
                new ApiInfoBuilder()
                        // 设置Swagger页面联系方式
                        .contact(new Contact("Kirit", "", "230502771@qq.com"))
                        // 设置Swagger页面标题
                        .title("学生信息管理系统Api")
                        .build()
        );
    }
}
