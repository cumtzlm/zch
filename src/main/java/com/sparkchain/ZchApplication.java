package com.sparkchain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sparkchain.controller","com.sparkchain.service","com.sparkchain.dao","com.sparkchain.pojo"})
public class ZchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZchApplication.class, args);
	}

}
