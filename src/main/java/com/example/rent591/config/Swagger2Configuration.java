package com.example.rent591.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Created with IntelliJ IDEA.
 * User: ChiYuan
 * Date: 2021/03/25 上午 11:04
 * To change this template use File | Settings | File Templates.
 */
@EnableSwagger2
@Configuration
public class Swagger2Configuration {
    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.rent591"))
                .paths(regex("/rent591.*"))
                .build();
    }
}