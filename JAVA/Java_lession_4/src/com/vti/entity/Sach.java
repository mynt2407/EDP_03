package com.vti.entity;

import java.util.Scanner;

public class Sach extends TaiLieu {
	private String authorName;
	private int page;

	public Sach() {
		super();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi ban nhap vao ten tac gia: ");
		this.authorName = scanner.nextLine();

		System.out.print("Moi ban nhap vao so trang: ");
		this.page = scanner.nextInt();

	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

}
