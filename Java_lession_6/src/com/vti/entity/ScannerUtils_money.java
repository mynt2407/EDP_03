package com.vti.entity;

import java.util.Scanner;

public class ScannerUtils_money {
	

	public static float inputPositiveMoney(String erroMessage2) {
		while (true) {
			float money = ScannerUtils_money.inputMoney(erroMessage2);
			if (money < 0) {
				System.err.print(erroMessage2);
			} else {
				return money;
			}
		}
	}
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static float inputMoney(String errorMessage) {
		while (true) {
			try {
				String inputMoney = scanner.nextLine();
				inputMoney = inputMoney.trim();
				float outputMoney = Float.parseFloat(inputMoney);
				return outputMoney;
			} catch (Exception e) {
				System.err.println(errorMessage);
			}
		}
	}

}
