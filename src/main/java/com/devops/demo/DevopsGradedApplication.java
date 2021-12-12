package com.devops.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevopsGradedApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsGradedApplication.class, args);
		System.out.println("Hello Dev-Ops");
	}

}
