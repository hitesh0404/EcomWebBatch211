package com.batch211.ecomweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.batch211.ecomweb.controllers",
		"com.batch211.ecomweb.services",
		"com.batch211.ecomweb.entities",
		"com.batch211.ecomweb.repositories",
		})
public class EcomwebApplication {
	public static void main(String[] args) {
		SpringApplication.run(EcomwebApplication.class, args);
	}
}