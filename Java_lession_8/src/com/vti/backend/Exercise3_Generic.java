package com.vti.backend;

import com.vti.entity.Student_gen;

public class Exercise3_Generic {
//	Question 1: T generic (class)
//	Tạo class student có property id, name (trong đó id của student có thể
//	là int, long, float)
//	a) Tạo đối tượng student có id là int
//	b) Tạo đối tượng student có id là float
//	c) Tạo đối tượng student có id là double
	
	public static void question1() {
		Student_gen<Float> student1 = new Student_gen<Float>(2f, "Neo");
		Student_gen<Integer> student2 = new Student_gen<Integer>(2, "Neo123");
		Student_gen<Long> student3 = new Student_gen<Long>(2l, "Neo1234");

	}
}
