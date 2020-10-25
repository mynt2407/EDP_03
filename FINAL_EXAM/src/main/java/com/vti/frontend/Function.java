package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.Utils.ScannerUtils;
import com.vti.backend.presentation.UserController;
import com.vti.entity.User;

public class Function {
	private UserController userController;

	public Function() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userController = new UserController();
	}

	public void getManager() throws ClassNotFoundException, SQLException {
		System.out.println("Mời bạn nhập vào id Project");
		int input = com.vti.Ultils.ScannerUtils.inputPositiveInt("Bạn phải nhập vào số nguyên dương! Mời nhập lại");

		try {
			System.out.println(userController.getManagerById(input));
			return;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public void getEmployee() throws ClassNotFoundException, SQLException {
		System.out.println("Mời bạn nhập vào id Project");
		int input = com.vti.Ultils.ScannerUtils.inputPositiveInt("Bạn phải nhập vào số nguyên dương! Mời nhập lại");

		try {
			System.out.println(userController.getEmployeeById(input));
			return;
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
