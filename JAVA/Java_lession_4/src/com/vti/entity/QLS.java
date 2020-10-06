package com.vti.entity;

import java.util.Scanner;

import com.vti.entity.Bao;
import com.vti.entity.Sach;
import com.vti.entity.TaiLieu;
import com.vti.entity.TapChi;

public class QLS {
	public TaiLieu[] taiLieus;

	public QLS() {
		taiLieus = new TaiLieu[10];
	}

	public void themMoiSach() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi ban nhap so tai lieu muon them: ");
		int soLuong = scanner.nextInt();

		for (int i = 0; i < soLuong; i++) {
			System.out.println("Nhap 1: Tap chi || 2: Sach || 3: Bao");
			int maSo = scanner.nextInt();

			switch (maSo) {
			case 1:
				taiLieus[i] = new TapChi();
				break;
			case 2:
				taiLieus[i] = new Sach();
				break;
			case 3:
				taiLieus[i] = new Bao();
				break;
			default:
				System.out.println("Ban da nhap sai so. Moi nhap lai!");
				break;
			}
			System.out.println("Chuc mung ban da tao thanh cong tai lieu thu " + (i + 1));
		}
	}

	public void xoaTailieu() {
		for (int i = 0; i < taiLieus.length; i++) {
			if (taiLieus[i] != null && taiLieus[i].getId() == 2) {
				taiLieus[i].setId(3);
				System.out.println("Da xoa thanh cong!");
				break;
			}
		}
	}

	public void print() {
		for (TaiLieu taiLieu : taiLieus) {
			System.out.println(taiLieu);
		}
	}

	public void find() {
		for (int i = 0; i < taiLieus.length; i++) {

			if (taiLieus[i] instanceof Sach) {
				System.out.println(taiLieus[i]);
			} else if (taiLieus[i] instanceof Bao) {
				System.out.println(taiLieus[i]);
			} else if (taiLieus[i] instanceof TapChi) {
				System.out.println(taiLieus[i]);
			}
		}
	}
}
