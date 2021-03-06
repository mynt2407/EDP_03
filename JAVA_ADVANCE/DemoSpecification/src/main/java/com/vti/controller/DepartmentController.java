package com.vti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vti.entity.Department;
import com.vti.filter.DepartmentFilter;
import com.vti.service.IDepartmentService;

@RestController
@RequestMapping(value = "api/v1/departments")

public class DepartmentController {
	
	@Autowired
	private IDepartmentService service;

	@GetMapping()
	public ResponseEntity<?> getAllDepartments(DepartmentFilter filter,@RequestParam(required = false) String search){
		List<Department> entities = service.getAllDepartments(filter, search);
		return new ResponseEntity<List<Department>>(entities, HttpStatus.OK);
	}


}
