package org.cloris.service;

import java.util.List;

import org.cloris.domain.Department;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "MICROSERVICE-DEPT", fallbackFactory = DepartmentClientServiceFallback.class)
public interface DepartmentClientService {

	@GetMapping("/department/{id}")
	public Department get(@PathVariable("id") Long id);

	@GetMapping("/departments")
	public List<Department> list();

	@PutMapping("/department")
	public boolean add(@RequestBody Department department);
}
