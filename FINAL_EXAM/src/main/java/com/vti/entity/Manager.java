package com.vti.entity;

public class Manager extends User {
	private int ExpInYear;

	public Manager(int id, String fullName, String email,  int ExpInYear) {
		super(id, fullName, email, Role.EMPLOYEE);
		this.ExpInYear = ExpInYear;
	}

	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	@Override
	public String toString() {
		return "Manager [ExpInYear=" + ExpInYear + ",  ID=" + getId() + ", FullName=" + getFullName() + ", Email ="
				+ getEmail() + ", Chức vụ=" + getRole() + ",  Project =" + getProject() + "]";
	}

}
