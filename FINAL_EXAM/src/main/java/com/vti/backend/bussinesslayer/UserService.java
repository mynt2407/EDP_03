package com.vti.backend.bussinesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.Manager;
import com.vti.entity.Project;
import com.vti.entity.User;

public class UserService implements IUserService {
	private IUserRepository userRepository;

	/**
	 * Constructor for class UserService.
	 * 
	 * @Description: Khoi tao contructor
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
	public UserService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userRepository = new UserRepository();
	}

	
	/* 
	* @see com.vti.backend.bussinesslayer.IUserService#getUserByProjectId(int)
	*/
	@Override
	public List<User> getUserByProjectId(int id) throws Exception {
		return userRepository.getUserByProjectId(id);
	}

	/* 
	* @see com.vti.backend.bussinesslayer.IUserService#login(java.lang.String, java.lang.String)
	*/
	@Override
	public User login(String email, String password) throws Exception {
		return userRepository.login(email, password);
	}

	/* 
	* @see com.vti.backend.bussinesslayer.IUserService#getManagerInProject()
	*/
	@Override
	public List<User> getManagerInProject() throws Exception, ClassNotFoundException {
		return userRepository.getManagerInProject();
	}

	/* 
	* @see com.vti.backend.bussinesslayer.IUserService#isUserIdExits(int)
	*/
	@Override
	public boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException {
		return userRepository.isUserIdExits(id);
	}

}
