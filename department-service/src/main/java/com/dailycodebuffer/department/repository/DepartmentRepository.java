package com.dailycodebuffer.department.repository;

import org.springframework.stereotype.Repository;

import com.dailycodebuffer.department.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{

	public Department findByDepartmentId(Long departmentId);
}
