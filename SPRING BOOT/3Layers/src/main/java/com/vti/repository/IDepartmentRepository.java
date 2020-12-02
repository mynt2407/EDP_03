package com.vti.repository;

import java.util.List;

import com.vti.entity.Department;

public interface IDepartmentRepository {
	List<Department> getAllDepartment();

	Department getDepartmentById(short id);

	Department getDepartmentByName(String name);

	void createDepartment(Department department);

	void updateDepartment(Department department);

	void deleteDepartment(short id);

	boolean isDepartmentExistById(short id);

	boolean isDepartmentExistByName(String name);

}
