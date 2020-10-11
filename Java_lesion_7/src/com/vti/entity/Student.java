package com.vti.entity;

public class Student {

	public static String college;

	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		college = "Đại học Bách Khoa";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String result = "";
		result += "Id là: " + id + "\n";
		result += "Name là: " + name + "\n";
		result += "Trường đại học: " + college + "\n";
		return result;
	}
}
