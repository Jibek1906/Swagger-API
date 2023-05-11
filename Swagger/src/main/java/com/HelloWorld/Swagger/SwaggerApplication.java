package com.HelloWorld.Swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info (
				title = "Hello World",
				version = "1.0.0",
				description = "hi",
				termsOfService = "zhibek",
				contact = @Contact(
						name = "Zibek",
						email = "potato@gmail.com"
				),
				license = @License(
						name = "licence",
						url =  "potato"
				)
		)
)
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

}
