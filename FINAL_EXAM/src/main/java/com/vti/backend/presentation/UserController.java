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
	private IUserService userService;

	/**
	 * Constructor for class UserController.
	 * 
	 * @Description: .
	 * @author: My Nguyen
	 * @create_date: Oct 27, 2020
	 * @version: 1.0
	 * @modifer: My Nguyen
	 * @modifer_date: Oct 27, 2020
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws SQLException
	 */
	public UserController() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userService = new UserService();
	}
	
	/**
	 * This method is . 
	 * 
	 * @Description: lay ra tat ca User bang cach nhap vao id project
	 * @author: My Nguyen
	 * @create_date: Oct 27, 2020
	 * @version: 1.0
	 * @modifer: My Nguyen
	 * @modifer_date: Oct 27, 2020
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public List<User> getUserByProjectId(int id) throws Exception {
		return userService.getUserByProjectId(id);
	}

	/**
	 * This method is . 
	 * 
	 * @Description: lay ra tat ca Manager
	 * @author: My Nguyen
	 * @create_date: Oct 27, 2020
	 * @version: 1.0
	 * @modifer: My Nguyen
	 * @modifer_date: Oct 27, 2020
	 * @return
	 * @throws Exception
	 * @throws ClassNotFoundException
	 */
	public List<User> getManagerInProject() throws Exception, ClassNotFoundException {
		return userService.getManagerInProject();
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
	 * @param email
	 * @param password
	 * @return
	 * @throws Exception
	 */
	public User login(String email, String password) throws Exception {
		return userService.login(email, password);
	}
	/**
	 * This method is . 
	 * 
	 * @Description: check id project da ton tai chua
	 * @author: My Nguyen
	 * @create_date: Oct 27, 2020
	 * @version: 1.0
	 * @modifer: My Nguyen
	 * @modifer_date: Oct 27, 2020
	 * @param id
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException {
		return userService.isUserIdExits(id);
	}
}
