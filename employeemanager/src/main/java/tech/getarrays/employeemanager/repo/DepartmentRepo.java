package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.employeemanager.model.Department;


public interface DepartmentRepo extends JpaRepository<Department,Long>{

	public Department findDepartmentByDeptId(Long deptId);
}
