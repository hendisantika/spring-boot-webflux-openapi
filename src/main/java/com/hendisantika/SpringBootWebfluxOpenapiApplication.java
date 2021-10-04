package com.hendisantika;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
        title = "Spring WebFlux CRUD Example",
        version = "1.0",
        description = "Spring WebFlux CRUD Example Sample documents"
))
public class SpringBootWebfluxOpenapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebfluxOpenapiApplication.class, args);
    }

}
