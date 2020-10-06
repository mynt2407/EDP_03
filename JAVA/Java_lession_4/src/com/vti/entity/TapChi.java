package com.vti.entity;

import java.util.Scanner;

public class TapChi extends TaiLieu {
private int soPhatHanh;
private byte thangPHatHanh;

public TapChi() {
	super();
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Moi ban nhap So Phat Hanh: ");
	this.soPhatHanh = scanner.nextInt();
	
	System.out.print("Moi ban nhap Thang Phat Hanh: ");
	this.thangPHatHanh = scanner.nextByte();
}

public int getSoPhatHanh() {
	return soPhatHanh;
}

public void setSoPhatHanh(int soPhatHanh) {
	this.soPhatHanh = soPhatHanh;
}

public byte getThangPHatHanh() {
	return thangPHatHanh;
}

public void setThangPHatHanh(byte thangPHatHanh) {
	this.thangPHatHanh = thangPHatHanh;
}

}
