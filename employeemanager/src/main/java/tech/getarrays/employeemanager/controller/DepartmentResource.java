package tech.getarrays.employeemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.getarrays.employeemanager.model.Department;
import tech.getarrays.employeemanager.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentResource {

	@Autowired
	private DepartmentService departmentService;
	
	
	@PostMapping("/add")
	public ResponseEntity<Department> addDepartment(@RequestBody Department department)
	{
		Department newDepartment=departmentService.addDepartment(department);
		return  new ResponseEntity<>(newDepartment,HttpStatus.CREATED);
	}
	
	@GetMapping("find/{deptId}")
	public ResponseEntity<Department> getDepartmentByDeptId(@PathVariable("deptId") Long deptId)
	{
		Department deptObj=departmentService.findDepartmentByDeptId(deptId);
		return  new ResponseEntity<>(deptObj,HttpStatus.OK);
	}
	
}
