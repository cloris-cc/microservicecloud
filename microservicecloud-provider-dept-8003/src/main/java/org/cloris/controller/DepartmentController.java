package org.cloris.controller;

import java.util.List;

import org.cloris.domain.Department;
import org.cloris.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PutMapping("/department")
	public boolean add(@RequestBody Department department) {
		return departmentService.add(department);
	}
	
	@GetMapping("/department/{id}")
	public Department get(@PathVariable("id") Long id) {
		return departmentService.get(id);
	}
	
	@GetMapping("/departments")
	public List<Department> list() {
		return departmentService.list();
	}
	
}
