package com.dailycodebuffer.department.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.department.controller.DepartmentController;
import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	Logger logger = LoggerFactory.getLogger(DepartmentService.class);
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	public Department saveDepartment(Department department) {
		
		logger.info("Inside  saveDepartment DepartmentService");
		return departmentRepository.save(department);
	}

	public Department findByDepartmentId(Long departmentId)
	{
		logger.info("Inside findDepartmentById DepartmentController");
		
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
