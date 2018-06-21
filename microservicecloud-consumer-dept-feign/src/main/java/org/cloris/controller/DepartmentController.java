package org.cloris.controller;

import java.util.List;

import org.cloris.domain.Department;
import org.cloris.service.DepartmentClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentClientService clientService;

	@GetMapping("/consumer/department/{id}")
	public Department get(@PathVariable("id") Long id) {
		return this.clientService.get(id);
	}

	@GetMapping("/consumer/departments")
	public List<Department> list() {
		return this.clientService.list();
	}

	@PutMapping("/consumer/department")
	public boolean add(@RequestBody Department department) {
		return this.clientService.add(department);
	}

}
