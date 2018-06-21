package org.cloris.service;

import java.util.List;

import org.cloris.domain.Department;
import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class DepartmentClientServiceFallback implements FallbackFactory<DepartmentClientService> {

	@Override
	public DepartmentClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new DepartmentClientService() {
			
			@Override
			public List<Department> list() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Department get(Long id) {
				// TODO Auto-generated method stub
				return new Department().setDeptno(id).setDname("查无此人");
			}
			
			@Override
			public boolean add(Department department) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
