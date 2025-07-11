package com.cognizant.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:country.xml")

public class RestGetCountryBasedOnCountryCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestGetCountryBasedOnCountryCodeApplication.class, args);
	}

}
