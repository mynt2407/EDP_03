package com.vti.entity;

import java.util.Scanner;

public class PHONE implements IPhoneMethod {
	private Contact[] contacts;
	private Scanner scanner;

	public PHONE() {
		contacts = new Contact[10];
		scanner = new Scanner(System.in);
	}

	@Override
	public void insertContact() {
		System.out.print("moi ban nhap vao so lan muon nhap: ");
		int soLan = scanner.nextInt();

		for (int i = 0; i < soLan; i++) {

			contacts[i] = new Contact();

			System.out.println("Chuc mung ban da nhap thanh cong nguoi thu " + (i + 1) + " ");
			System.out.println("\n");
		}
	}

	public void print() {
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i] != null) {
				System.out.println(contacts[i]);
			}

		}
	}

	@Override
	public void removeContact() {

		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i] != null && contacts[i].getNumber() == 967402253) {
				contacts[i] = null;
				System.out.println("Ban da xoa thanh cong!");
				break;
			}

		}

	}

	@Override
	public void updateContact() {
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i] != null && contacts[i].getNumber() == 332782798) {
				contacts[i].setNumber(123456);
				System.out.println("Chuc mung ban da update thanh cong!" + "\n" + contacts[i]);
				break;
			}
		}

	}

	@Override
	public void searchContact() {
		boolean hasInformation = false;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i] != null && contacts[i].equals("my123")) {
				System.out.println("Thong tin ban can tim la: " + "\n" + contacts[i]);
				hasInformation = true;
				break;
			}
		}

		if (!hasInformation) {
			System.out.println("Khong co thong tin ban can tim!");
		}

	}

}
