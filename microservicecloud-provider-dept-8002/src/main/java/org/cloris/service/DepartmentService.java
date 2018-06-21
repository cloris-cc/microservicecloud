package org.cloris.service;

import java.util.List;

import org.cloris.domain.Department;

public interface DepartmentService {
	public boolean add(Department department);

	public Department get(Long id);

	public List<Department> list();

}
