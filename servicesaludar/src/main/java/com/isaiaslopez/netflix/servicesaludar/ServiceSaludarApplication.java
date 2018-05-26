package com.isaiaslopez.netflix.servicesaludar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
public class ServiceSaludarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceSaludarApplication.class, args);
	}
}
