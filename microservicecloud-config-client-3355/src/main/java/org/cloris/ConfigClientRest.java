package org.cloris;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRest {

	@Value("${spring.application.name}")
	private String applicatinoName;

	@Value("${eureka.client.service-url.defaultZone}")
	private String eurekaServers;

	@Value("${server.port}")
	private String port;

	@GetMapping("/config")
	public String getConfigProperties() {
		return "ConfigClientRest [applicatinoName=" + applicatinoName + ", eurekaServers=" + eurekaServers + ", port="
				+ port + "]";
	}

}
