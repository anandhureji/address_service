package com.addressmicroservice.addressmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.addressmicroservice.addressmicroservice.entity")
public class AddressmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressmicroserviceApplication.class, args);
	}

}
