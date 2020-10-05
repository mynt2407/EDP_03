package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.CanBo;
import com.vti.entity.CongNhan;
import com.vti.entity.HighSchoolStudent;
import com.vti.entity.KySu;
import com.vti.entity.NhanVien;

public class Excercise5_Inheritance {
	public static void main(String[] args) {
//		question1();
//		question2a();
//		question2b();
		question2c();
//		question3();

	}

//Question 1: inheritance
//Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
//Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ, khác), địa chỉ.
//Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
//Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
//Các nhân viên có thuộc tính riêng: công việc.
//Hãy xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp CanBo

	public static void question1() {
//		CongNhan congNhan = new CongNhan("Tran Van Toan", (byte) 20, "Male", (byte) 8);
//		System.out.println(congNhan.getName());
//		System.out.println(congNhan.getLevel());
//		System.out.println("\n");
//
//		KySu kySu = new KySu("Nguyen The Hung", (byte) 30, "Male", "manager");
//		System.out.println(kySu.getTrainingIndustry());
//		System.out.println("\n");
//
//		NhanVien nhanVien = new NhanVien("Tran Lam Anh", (byte) 37, "Female", "Diretor");
//		System.out.println(nhanVien.getWork());
//		System.out.println(nhanVien.getSex());

		KySu kySu = new KySu();
		System.out.println(kySu);
	}

//	Question 2: Tiếp tục Question 1
//	Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:
//	d) Nhập vào tên của cán bộ và delete cán bộ đó
//	e) Thoát khỏi chương trình.

//	a) Thêm mới cán bộ
	public static void question2a() {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Moi ban nhap so can bo muon nhap: ");
		int x = scanner.nextInt();

		byte y;
		for (int i = 0; i < x; i++) {
			System.out.println("Moi ban chon can bo can nhap: 1: Cong Nhan || 2: Ky Su || 3: Nhan vien");
			y = scanner.nextByte();
			CanBo canbo;
			switch (y) {
			case 1:
				canbo = new CongNhan();
				break;
			case 2:
				canbo = new KySu();
				break;
			case 3:
				canbo = new NhanVien();
				break;
			default:
				System.out.println("Ban da nhap sai. Moi ban nhap lai!");
				break;
			}
			System.out.println("\nChuc mung! Ban da tao thanh cong nguoi thu " + (i + 1));
		}
	}

//		b) Tìm kiếm theo họ tên
	public static void question2b() {

		
		CanBo canBo = new CanBo();
		System.out.println(canBo.equals("my nguyen"));
	}	
//	c) Hiện thị thông tin về danh sách các cán bộ
	public static void question2c() {
		CanBo canBo = new CanBo();
		System.out.println(canBo);
	} 

//	Question 3 (Optional): constructor inheritance
//	Tạo class abstract Person gồm các property name và tạo constructor có 1 parameter name
//	Tạo class abstract Student kế thừa Person gồm các property id, name
//	và tạo constructor có 2 parameter id, name
//	Tạo class HighSchoolStudent kế thừa Student bao gồm các property id,
//	name, clazz (Lớp đang học), desiredUniversity (trường đại học mong
//	muốn vào) và tạo constructor có 4 parameter id, name, clazz,
//	desiredUniversity.
//	Hãy khởi tạo Object HighSchoolStudent với các giá trị: id = 1, name =
//	"Nam", clazz = "Chuyên Văn", desiredUniversity = "Đại học công nghệ"

	public static void question3() {
		HighSchoolStudent highschool = new HighSchoolStudent("Nam", 1, "Chuyên Văn", "Đại học công nghệ");
		System.out.println(highschool.clazz);
		System.out.println(highschool.desiredUniversity);
	}

}
