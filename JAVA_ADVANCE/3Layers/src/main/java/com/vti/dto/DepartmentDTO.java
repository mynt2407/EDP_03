package com.vti.dto;

import java.io.Serializable;

import com.vti.entity.Department;

public class DepartmentDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;

	public DepartmentDTO() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DepartmentDTO [name=" + name + "]";
	}

	public Department toEntity() {
		return new Department(name);
	}

}
