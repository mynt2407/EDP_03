package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.Ultils.ScannerUtils;
import com.vti.backend.presentation.UserController;
import com.vti.entity.User;

public class Function {
	private UserController userController;

	public Function() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userController = new UserController();
	}

	/**
	 * This method is . 
	 * 
	 * @Description: Nhap vao id project. lay ra tat ca user
	 * @author: My Nguyen
	 * @create_date: Oct 27, 2020
	 * @version: 1.0
	 * @modifer: My Nguyen
	 * @modifer_date: Oct 27, 2020
	 * @throws Exception
	 */
	public void getListUser() throws Exception {
		while (true) {

			System.out.print("Mời bạn nhập vào id Project: ");
			int id = ScannerUtils.inputPositiveInt("Bạn phải nhập vào số nguyên dương! Mời nhập lại\n");

			if (userController.isUserIdExits(id)) {
				List<User> users = userController.getUserByProjectId(id);
				System.out.printf("%-15s %-25s %-25s %-25s\n", "ID", "Email", "Fullname", "Role");
				for (User user : users) {
					System.out.printf("%-15s %-25s %-25s %-25s\n", user.getId(), user.getEmail(), user.getFullName(),
							user.getRole());
				}
				return;
			} else {
				System.err.println("id project không tồn tại! Mời bạn nhập lại!");
			}
		}
	}

	/**
	 * This method is . 
	 * 
	 * @Description: lay ra tat ca Manager của project
	 * @author: My Nguyen
	 * @create_date: Oct 27, 2020
	 * @version: 1.0
	 * @modifer: My Nguyen
	 * @modifer_date: Oct 27, 2020
	 */
	public void getManager() {
		try {

			List<User> users = userController.getManagerInProject();
			System.out.printf("%-15s %-25s %-25s %-25s\n", "ID", "Email", "Fullname", "Role");
			for (User user : users) {
				System.out.printf("%-15s %-25s %-25s %-25s\n", user.getId(), user.getEmail(), user.getFullName(),
						user.getRole());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * This method is . 
	 * 
	 * @Description: Login tai khoan
	 * @author: My Nguyen
	 * @create_date: Oct 27, 2020
	 * @version: 1.0
	 * @modifer: My Nguyen
	 * @modifer_date: Oct 27, 2020
	 */
	public void login() {
		while (true) {
			System.out.print("Mời bạn nhập vào Email của user: ");
			String email = ScannerUtils.inputEmail("Email chưa đúng định dạng. Moi nhap lai!");

			System.out.print("Mời bạn nhập password: ");
			String password = ScannerUtils.inputPassword(
					"Password phai dai tu 6--> 12 ki tu va co it nhat 1 chu viet hoa!\nMoi ban nhap lai!");
			try {
				System.out.println(userController.login(email, password));
				System.out.println("Login successfull!");
				return;

			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
