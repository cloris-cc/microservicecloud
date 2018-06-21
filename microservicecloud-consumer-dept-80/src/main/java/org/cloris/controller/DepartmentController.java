package org.cloris.controller;

import java.util.List;

import org.cloris.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DepartmentController {
	// "http://microservice-dept/department"
	// private static final String REST_URL_PREFIX = "http://localhost:8001";
	private static final String REST_URL_PREFIX = "http://MICROSERVICE-DEPT";

	@Autowired
	private RestTemplate restTemplate;

	@PutMapping("/consumer/department")
	public boolean add(@RequestBody Department department) {
		restTemplate.put(REST_URL_PREFIX + "/department", department);
		return true;
	}

	@GetMapping("/consumer/department/{id}")
	public Department get(@PathVariable("id") Long id) {
		return restTemplate.getForObject(REST_URL_PREFIX + "/department/" + id, Department.class);
	}

	@SuppressWarnings("unchecked")
	@GetMapping("/consumer/departments")
	public List<Department> list() {
		return restTemplate.getForObject(REST_URL_PREFIX + "/departments", List.class);

	}

}
