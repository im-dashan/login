package com.dashan.login.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.dashan.login.constants.SwaggerConstants.*;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title(SWAGGER_TITLE)
                        .version(SWAGGER_VERSION)
                        .description(SWAGGER_DESCRIPTION));
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group(SWAGGER_GROUP)
                .packagesToScan(SWAGGER_PACKAGES)
                .build();
    }
}
