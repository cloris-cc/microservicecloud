package org.cloris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(CloudConfigApplication.class, args);
	}

}
