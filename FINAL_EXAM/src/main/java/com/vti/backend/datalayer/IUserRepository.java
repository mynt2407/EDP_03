package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Manager;
import com.vti.entity.Project;
import com.vti.entity.User;

public interface IUserRepository {
	Project getIdOfUser(int id) throws Exception;

	User getManagerById(int id) throws Exception;

	User getEmployeeById(int id) throws Exception;

	List<Manager> getListManger();

	User login(String email, String password) throws Exception;

}