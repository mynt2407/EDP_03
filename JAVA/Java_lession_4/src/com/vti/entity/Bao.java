package com.vti.entity;

import java.util.Date;
import java.util.Scanner;

public class Bao extends TaiLieu {
	private String ngayPhatHanh;

	public Bao() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi ban ngap vao Ngay Phat Hanh: ");
		this.ngayPhatHanh = scanner.nextLine();
	}

	public String getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(String ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

}
