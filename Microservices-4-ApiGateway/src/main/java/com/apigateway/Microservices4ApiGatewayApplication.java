package com.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Microservices4ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Microservices4ApiGatewayApplication.class, args);
	}

}
