package com.vti.backend.presentation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.bussinesslayer.IUserService;
import com.vti.backend.bussinesslayer.UserService;
import com.vti.entity.Manager;
import com.vti.entity.Project;
import com.vti.entity.User;

public class UserController {
	IUserService userService;

	public UserController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userService = new UserService();
	}
	
	public Project getIdOfUser(int id) throws Exception {
		return userService.getIdOfUser(id);
	}

	public User getManagerById(int id) throws Exception {
		return userService.getManagerById(id);
	}

	public User getEmployeeById(int id) throws Exception {
		return userService.getEmployeeById(id);
	}

	public List<Manager> getListManger() {
		return userService.getListManger();
	}

	public User login(String email, String password) throws Exception {
		return userService.login(email, password);
	}

}
