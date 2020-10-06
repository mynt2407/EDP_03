package com.vti.entity;

import java.util.Scanner;

import com.vti.entity.CanBo;
import com.vti.entity.CongNhan;
import com.vti.entity.KySu;
import com.vti.entity.NhanVien;

public class QLCB {

	public CanBo[] canbos;

	public QLCB() {
		canbos = new CanBo[9];
	}

	public void themMoi() {

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
				canbos[i] = canbo;
				break;
			case 2:
				canbo = new KySu();
				canbos[i] = canbo;
				break;
			case 3:
				canbo = new NhanVien();
				canbos[i] = canbo;
				break;
			default:
				System.out.println("Ban da nhap sai. Moi ban nhap lai!");
				break;
			}
			System.out.println("Chuc mung! Ban da tao thanh cong nguoi thu " + (i + 1));
		}
	}

	public void findName() {
		for (int i = 0; i < canbos.length; i++) {
			if (canbos[i].equals("my nguyen")) {
				System.out.println(canbos[i]);
			}
		}
	}

	public void print() {
		for (CanBo canBo : canbos) {
			if (canBo != null) {
				System.out.println(canBo);
			}
		}
	}

	public void delete() {
		for (int i = 0; i < canbos.length; i++) {
			if (canbos[i] != null && canbos[i].equals("my nguyen")) {
				canbos[i] = null;
				System.out.println("đã xóa thành công");
				break;
			}
		}

	}
}
