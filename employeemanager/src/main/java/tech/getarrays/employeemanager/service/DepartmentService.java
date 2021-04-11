package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.getarrays.employeemanager.model.Department;
import tech.getarrays.employeemanager.repo.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepo departmentRepo;

	
	public Department addDepartment(Department department)
	{
		return departmentRepo.save(department);
	}
	
	public Department findDepartmentByDeptId(Long deptId)
	{
		return departmentRepo.findDepartmentByDeptId(deptId);
	}
}
