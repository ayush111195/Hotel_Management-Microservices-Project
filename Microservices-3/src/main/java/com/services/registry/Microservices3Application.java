package com.services.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Microservices3Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservices3Application.class, args);
	}

}
