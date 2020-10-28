package com.vti.entity;

public class User {

	private int id;
	private String fullName;
	private String Email;
	private String password;
	private Role role;
	private Project project;

	public User() {
	}

	public User(int id, String fullName, String email) {
		this.id = id;
		this.fullName = fullName;
		this.Email = email;
		this.role = role;
	}
	
	public User(int id, String fullName, String email, Role role) {
		this.id = id;
		this.fullName = fullName;
		this.Email = email;
		this.role = role;
	}

	public User(int id, String fullName, String email, String password, Role role) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.Email = email;
		this.password = password;
		this.role = role;
	}

	public User(int id, String fullName, String email, String password, Role role, Project project) {

		this.id = id;
		this.fullName = fullName;
		this.Email = email;
		this.password = password;
		this.role = role;
		this.project = project;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "User [id = " + id + ", fullName = " + fullName + ", Email = " + Email + ", role = " + role + "]";
	}

}
