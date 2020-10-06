package com.vti.entity;

import java.util.Scanner;

public abstract class TaiLieu {
	private int id;
	private String tenNhaXuatban;
	private String banPhatHanh;

	public TaiLieu() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Moi ban nhap vao ma tai lieu: ");
		this.id = scanner.nextInt();
		
		System.out.print("Moi ban nhap vao ten nha Xuat Ban: ");
		this.tenNhaXuatban = scanner.nextLine();
		scanner.nextLine();
		
		System.out.print("Moi ban nhap so ban phat hanh: ");
		this.banPhatHanh = scanner.nextLine();
	}
	@Override
	public String toString() {
	String result ="";
	result += "id " + id +"\n";
	result += "Ten nha san xuat " + tenNhaXuatban +"\n";
	result += "So ban phat hanh " + banPhatHanh +"\n";
		return result;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenNhaXuatban() {
		return tenNhaXuatban;
	}
	public void setTenNhaXuatban(String tenNhaXuatban) {
		this.tenNhaXuatban = tenNhaXuatban;
	}
	public String getBanPhatHanh() {
		return banPhatHanh;
	}
	public void setBanPhatHanh(String banPhatHanh) {
		this.banPhatHanh = banPhatHanh;
	}
	
	
}
