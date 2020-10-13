package com.vti.backend;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.ScannerUtils;
import com.vti.entity.ScannerUtils_String;
import com.vti.entity.Student;

public class Excercise1_Collection {
	static List<Student> students = new ArrayList<Student>();
	static Scanner scanner = new Scanner(System.in);

//	Question 1: List
//	Tạo 1 student có property id, name (trong đó có 3 student có name
//	trùng nhau, id sẽ là auto increment)
//	Khai báo 1 ArrayList students, sau đó
//	a) In ra tổng số phần tử của students
//	b) Lấy phần tử thứ 4 của students
//	c) In ra phần tử đầu và phần tử cuối của students
//	d) Thêm 1 phần tử vào vị trí đầu của students
//	e) Thêm 1 phần tử vào vị trí cuối của students
//	f) Đảo ngược vị trí của students
//	g) Tạo 1 method tìm kiếm student theo id
//	h) Tạo 1 method tìm kiếm student theo name
//	i) Tạo 1 method để in ra các student có trùng tên
//	j) Xóa name của student có id = 2;
//	k) Delete student có id = 5;
//	l) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào studentCopies

	public static void getAmountOfStudent() {

		students.add(new Student("My1"));
		students.add(new Student("My2"));
		students.add(new Student("My4"));
		students.add(new Student("My5"));
		students.add(new Student("My10"));

		// Cau a:
		for (int i = 0; i < students.size(); i++) {

			System.out.println(students.get(i));
			System.out.println("-----------");
		}
	}

	// Cau b: in ra o vi tri thu 4
	public void getElement() {
		System.out.println(students.get(3));
	}

	// Cau c
	public void getFirstElement() {
		// Lay phan tu dau tien:
		System.out.println(students.get(0));

		// Lay phan tu cuoi cung
		System.out.println(students.get(students.size() - 1));
	}

	// cau d: Them vao dau tien
	public void addFrist() {
		students.add(0, new Student("Mynguyen"));
		for (int j = 0; j < students.size(); j++) {
			System.out.println(students.get(j));
			System.out.println("===============");
		}
	}

	// Cau e: add vao cuoi cung
	public void addAtLast() {
		students.add(students.size(), new Student("my123"));
		for (int k = 0; k < students.size(); k++) {
			System.out.println(students.get(k));
		}
	}

	// Cau f: Dao nguoc vi tri
	public void reverse() {
		Collections.reverse(students);
		System.out.println(students);
	}

	// Cau g: Tạo 1 method tìm kiếm student theo id
	public void findStudentById() {
		System.out.print("Moi ban nhap id: ");

		int inputId = ScannerUtils.inputPositiveInt("id can nhap phai la so nguyen duong! Moi nhap lai: ");

		for (Student student : students) {
			if (student.getId() == inputId) {
				System.out.println(student);
			}
		}
	}

//	h) Tạo 1 method tìm kiếm student theo name
	public void findByName() {
		System.out.print("Moi ban nhap ten: ");
		String name = ScannerUtils_String.inputString("Ban phai nhap vao chu! Moi nhap lai: ");
		boolean isName = false;
		
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName().equals(name) && isName == true) {
				System.out.println(students.get(i));	
				break;
			} else if(!isName) {
				System.out.println("Thong tin ban can tim khong co!");
				break;
			}

		}
	}
//	i) Tạo 1 method để in ra các student có trùng tên
	
}