package com.batch211.ecomweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.batch211.controllers",
		"com.batch211.services",
		"com.batch211.entities",
		"com.batch211.repositories",
		})
public class EcomwebApplication {
	public static void main(String[] args) {
		SpringApplication.run(EcomwebApplication.class, args);
	}
}