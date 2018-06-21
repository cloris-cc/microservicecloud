package org.cloris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@MapperScan(basePackages =" org.cloris.dao")

//@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class HystrixApplication {
	

	
	
	public static void main(String[] args) {
		SpringApplication.run(HystrixApplication.class, args);
	}
	
	
}
