package org.demo.upload;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan
@EnableAutoConfiguration
@RestController
@EnableSwagger2
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("FileMgmtAPI")
                .apiInfo(apiInfo())
                .select()
                .build();
    }

 private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("File upload using Spring Boot")
                .description("File upload using Spring Boot based REST services")
                .termsOfServiceUrl("http://www.apache.com")
                .contact("Developer")
                .license("Apache License Version 2.0")
                .licenseUrl("http://www.apache.com")
                .version("2.0")
                .build();
    }
}