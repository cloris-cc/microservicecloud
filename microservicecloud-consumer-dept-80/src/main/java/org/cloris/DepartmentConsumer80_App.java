package org.cloris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DepartmentConsumer80_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DepartmentConsumer80_App.class, args);
	}
}
