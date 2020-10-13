package com.vti.entity;

import java.util.Scanner;

public class ScannerUtils_String {

	static 	Scanner scanner = new Scanner(System.in);
	
public static String inputString(String errorMessage) {

	while (true) {
		try {
			String inputString = scanner.nextLine();
			inputString = inputString.trim();
			return inputString;
		} catch (Exception e) {
			System.err.println(errorMessage);
		}
	}
	}
}
