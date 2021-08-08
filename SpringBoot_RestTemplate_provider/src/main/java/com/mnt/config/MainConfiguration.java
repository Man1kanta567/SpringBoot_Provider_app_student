package com.mnt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class MainConfiguration {
	
	
	@Bean
	public Docket getSwaggerUI()
	{
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.mnt.controller"))
				.build()
				.apiInfo(apiInfo());
		
	}

	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
		return new ApiInfo("Student_Data Provider Application", "this service provides the student details", "1.0", "#termsAndServices","Manikanta,9948550219,manikantamukkapati567@gmail.com" , null, null);
	}

}
