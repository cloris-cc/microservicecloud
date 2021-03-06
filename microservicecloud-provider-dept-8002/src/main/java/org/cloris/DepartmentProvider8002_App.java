package org.cloris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@MapperScan(basePackages =" org.cloris.dao")

//@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class DepartmentProvider8002_App {
	

	
	
	public static void main(String[] args) {
		SpringApplication.run(DepartmentProvider8002_App.class, args);
	}
	
	
}
