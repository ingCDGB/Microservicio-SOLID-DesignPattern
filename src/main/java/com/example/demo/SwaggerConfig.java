package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import springfox.documentation.spring.web.plugins.Docket;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.PathSelectors;

import springfox.documentation.spi.DocumentationType;


@Configuration
@EnableSwagger2
public class SwaggerConfig{

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
                .paths(PathSelectors.any())
                .build();
    }
}