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

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	@PutMapping("/department")
	public boolean add(@RequestBody Department department) {
		return departmentService.add(department);
	}

	@GetMapping("/department/{id}")
	@HystrixCommand(fallbackMethod = "fallback")
	public Department get(@PathVariable("id") Long id) {
		Department department = this.departmentService.get(id);
		if(null == department) {
			throw new RuntimeException("===========");
		}
		return department;
	}

	@GetMapping("/departments")
	public List<Department> list() {
		return departmentService.list();
	}

	public Department fallback(@PathVariable("id") Long id) {
		return new Department().setDeptno(id).setDname("该ID：" + id + "没有对应的信息");
	}
}
