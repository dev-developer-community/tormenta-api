package com.github.devcommunity.tormentaapi.config;

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

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String BASE_PACKAGE = "com.github.devcommunity.tormentaapi";
    private static final String TITLE_API = "Api online form Storm 20";
    private static final String DESCRIPTION_API = "Api to manage multiple sheets of RPG Tormenta 20";
    private static final String VERSION_API = "1.0.0";
    private static final String CONTACT_NAME = "Cleiton Estefenon | Clediano Estefenon";
    private static final String CONTACT_GITHUB = "https://github.com/dev-developer-community";
    private static final String CONTACT_EMAIL = "dev.developer.community@gmail.com";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(buildApiInfo());
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title(TITLE_API)
                .description(DESCRIPTION_API)
                .version(VERSION_API)
                .contact(new Contact(CONTACT_NAME, CONTACT_GITHUB, CONTACT_EMAIL))
                .build();
    }
}
