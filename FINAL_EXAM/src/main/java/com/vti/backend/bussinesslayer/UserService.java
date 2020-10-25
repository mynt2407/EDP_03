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

	public UserService() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userRepository = new UserRepository();
	}

	@Override
	public Project getIdOfUser(int id) throws Exception {
		return userRepository.getIdOfUser(id);
	}

	@Override
	public User getManagerById(int id) throws Exception {
		return userRepository.getManagerById(id);
	}

	@Override
	public User getEmployeeById(int id) throws Exception {
		return userRepository.getEmployeeById(id);
	}

	@Override
	public List<Manager> getListManger() {
		// TODO Auto-generated method stub
		return userRepository.getListManger();
	}

	@Override
	public User login(String email, String password) throws Exception {
		return userRepository.login(email, password);
	}

}
