package org.cloris.service;

import java.util.List;

import org.cloris.dao.DepartmentDao;
import org.cloris.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentDao departmentDao;

	@Override
	public boolean add(Department department) {
		return departmentDao.add(department);
	}

	@Override
	public Department get(Long id) {
		return departmentDao.findById(id);
	}

	@Override
	public List<Department> list() {
		return departmentDao.findAll();
	}

}
