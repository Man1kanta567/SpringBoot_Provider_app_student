package com.mnt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.mnt.config.MainConfiguration;

@SpringBootApplication
@Import(MainConfiguration.class)
public class SpringBootRestTemplateProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestTemplateProviderApplication.class, args);
	}

}
