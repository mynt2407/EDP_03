package com.vti.entity;

public class Employee extends User {
	private int projectId;
	private String ProSkill;

	
	public Employee(int id, String fullName, String email, String password, String ProSkill) {
		super(id, fullName, email, password, Role.EMPLOYEE);
		
		this.projectId = projectId;
		this.ProSkill = ProSkill;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProSkill() {
		return ProSkill;
	}

	public void setProSkill(String proSkill) {
		ProSkill = proSkill;
	}

	@Override
	public String toString() {
		return "Employee [projectId=" + projectId + ", ProSkill=" + ProSkill + ", getId()=" + getId()
				+ ", getFullName()=" + getFullName() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword()
				+ ", getRole()=" + getRole() + ", getProject()=" + getProject() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
