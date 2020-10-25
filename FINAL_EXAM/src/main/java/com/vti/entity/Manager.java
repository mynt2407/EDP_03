package com.vti.entity;

public class Manager extends User {
	private int ExpInYear;

	public Manager(int id, String fullName, String email, String password, int ExpInYear) {
		super(id, fullName, email, password, Role.MANAGER);
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
		return "Manager [ExpInYear=" + ExpInYear + ", getId()=" + getId() + ", getFullName()=" + getFullName()
				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getRole()=" + getRole()
				+ ", getProject()=" + getProject() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
