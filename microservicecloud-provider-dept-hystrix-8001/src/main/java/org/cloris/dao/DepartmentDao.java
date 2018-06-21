package org.cloris.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.cloris.domain.Department;

@Mapper
public interface DepartmentDao {
	
	public boolean add(Department department);
	
	public Department findById(Long id);
	
	public List<Department> findAll();
}
