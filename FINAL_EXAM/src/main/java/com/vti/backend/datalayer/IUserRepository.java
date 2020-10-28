package com.vti.backend.datalayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.entity.Manager;
import com.vti.entity.Project;
import com.vti.entity.User;

public interface IUserRepository {

	/**
	 * This method is . 
	 * 
	 * @Description: lay tat ca user bang project id
	 * @author: My Nguyen
	 * @create_date: Oct 27, 2020
	 * @version: 1.0
	 * @modifer: My Nguyen
	 * @modifer_date: Oct 27, 2020
	 * @param id
	 * @return
	 * @throws Exception
	 */
	List<User> getUserByProjectId(int id) throws Exception;

	/**
	 * This method is . 
	 * 
	 * @Description: lay ra Manager tham gia project
	 * @author: My Nguyen
	 * @create_date: Oct 27, 2020
	 * @version: 1.0
	 * @modifer: My Nguyen
	 * @modifer_date: Oct 27, 2020
	 * @return
	 * @throws Exception
	 * @throws ClassNotFoundException
	 */
	List<User> getManagerInProject() throws Exception, ClassNotFoundException;

	/**
	 * This method is . 
	 * 
	 * @Description: login tai khoan
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
	User login(String email, String password) throws Exception;

	/**
	 * This method is . 
	 * 
	 * @Description: check xem id da ton tai chua
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
	boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException;

}