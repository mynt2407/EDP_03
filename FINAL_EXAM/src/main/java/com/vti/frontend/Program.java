package com.vti.frontend;

import com.vti.Ultils.ScannerUtils;

public class Program {
	public static void main(String[] args)
			throws Exception {

		Function function = new Function();
		System.out.println("Moi ban nhap chuc nang muon su dung:\n" + "1: In ra User cần tìm\n" + "2: In ra Manager của dự án\n"
			 + "3: Login tài khoản\n" + "4: Thoat khoi chuong trinh\n ");

		while (true) {
			System.out.print("Moi ban nhap chuc nang: ");
			int choose = ScannerUtils.inputFunction(1, 5, "Ban chi duoc chon tu 1 --> 5. Mời nhập lại!");

			switch (choose) {
			case 1:
				function.getListUser();
				break;

			case 2:
				function.getManager();
				break;
			case 3:
				function.login();
				break;
			case 4:
				System.out.println("bạn đã thoát khỏi chương trình!");
				return;
			}
		}
	}
}
