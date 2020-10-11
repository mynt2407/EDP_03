package com.vti.backend;

import com.vti.entity.Student;

public class Exercise1 {
//	Question 1: static variable
//	Khai báo 1 class student có các thuộc tính id, name, college
//	Với college là static variable.
//	Hãy khởi tạo các student sau:
//	Student có id = 1, name ="Nguyễn Văn A"
//	Student có id = 2, name = " Nguyễn Văn B "
//	Student có id = 3, name = " Nguyễn Văn C "
//	Và tất cả các student này đều học ở "Đại học bách khoa".
//	Dùng vòng for để in ra thông tin các student
//	Sau đó hãy chuyển các student này sang "Đại học công nghệ"
//	Dùng vòng for để in ra thông tin các student
	public static void question1() {
		Student student1 = new Student(1, "Nguyễn Văn A");
		Student student2 = new Student(2, "Nguyễn Văn B");
		Student student3 = new Student(3, "Nguyễn Văn C");

		Student[] students = { student1, student2, student3 };
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

		Student.college = "Đại học Công Nghệ";
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}
}
