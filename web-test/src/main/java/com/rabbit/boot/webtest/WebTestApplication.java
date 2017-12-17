package com.rabbit.boot.webtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class WebTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebTestApplication.class, args);
	}

	/**
	 * swagger start
	 */
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.rabbit.boot.webtest.controller"))
				.paths(PathSelectors.any())
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("web test RESTful APIs")
				.description("spring boot web 项目示例")
				.termsOfServiceUrl("https://github.com/rabbitgyk")
				.contact(new Contact("rabbitGYK", "https://github.com/rabbitgyk", "yankuiguo@gmail.com"))
				.version("1.0")
				.build();
	}
	/** swagger end */

	/**
	 * 参数校验 start
	 */
	@Bean
	public MethodValidationPostProcessor methodValidationPostProcessor() {
		return new MethodValidationPostProcessor();
	}
	/** 参数校验 end */
}
