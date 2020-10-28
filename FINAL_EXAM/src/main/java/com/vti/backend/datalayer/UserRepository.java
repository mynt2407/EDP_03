package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.Ultils.JdbcUltils;
import com.vti.entity.Role;
import com.vti.entity.User;

public class UserRepository implements IUserRepository {
	private JdbcUltils jdbcUltils;
	private Connection connection;

	public UserRepository() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		jdbcUltils = new JdbcUltils();
	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#isUserIdExits(int)
	 */
	public boolean isUserIdExits(int id) throws SQLException, ClassNotFoundException {
		try {

			// step 2: get connect
			connection = jdbcUltils.connect();

			// Step 3: Create a statement object

			String sql = "SELECT * FROM managerusers.user " + "WHERE UserID = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// set parameter
			preparedStatement.setInt(1, id);

			// Step 4: Execute Query
			ResultSet resultSet = preparedStatement.executeQuery();

			// Step 5: Handling result set

			if (resultSet.next()) {

				return true;
			}

			return false;
		} finally {
			connection.close();
		}

	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#getUserByProjectId(int)
	 */
	@Override
	public List<User> getUserByProjectId(int id) throws Exception {

		List<User> users = new ArrayList<User>();

		try {
			// Step 2: get connect
			connection = jdbcUltils.connect();

			// Step 3: Create a statement object
			String sql = " SELECT U.UserID, P.`Role`, U.FullName, U.Email " + "FROM  Project_User P "
					+ "JOIN `User` U ON P.UserID = U.UserID " + "WHERE  ProjectID = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// set parameter
			preparedStatement.setInt(1, id);

			// Step 4: Execute SQL query
			ResultSet resultSet = preparedStatement.executeQuery();

			// Step 5: Handling result set

			while (resultSet.next()) {

				int userId = resultSet.getInt("UserID");
				String fullName = resultSet.getString("FullName");
				String email = resultSet.getString("Email");
				Role role = Role.valueOf(resultSet.getString("Role").toUpperCase());
				
				User user = new User(userId, fullName, email, role);

				users.add(user);
			}
			return users;
		} finally {
			connection.close();
		}
	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#login(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public User login(String email, String password) throws Exception {

		try {

			// step 2: get connect
			connection = jdbcUltils.connect();

			// Step 3: Create a statement object

			String sql = "SELECT UserID, FullName, Email " + "FROM `User` " + "WHERE Email = ? AND `Password` = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// set parameter
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);

			// Step 4: Execute Query

			ResultSet resultSet = preparedStatement.executeQuery();

			// Step 5: Handling result
			if (resultSet.next()) {
				User user = new User();
				user.setId(resultSet.getInt("UserID"));
				user.setFullName(resultSet.getString("FullName"));
				user.setEmail(resultSet.getString("Email"));

				return user;
			} else {
				throw new Exception("\nEmail hoac mat khau sai!Moi ban nhap lai!\n");
			}

		} finally {
			connection.close();
		}

	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#getManagerInProject()
	 */
	@Override
	public List<User> getManagerInProject() throws Exception {
		List<User> users = new ArrayList<User>();
		try {

			// step 2: get connect
			connection = jdbcUltils.connect();

			// Step 3: Create a statment object
			Statement statement = connection.createStatement();

			String sql = "SELECT U.UserID, U.FullName, U.Email, PU.`Role`, PU.ProjectID, M.ExpInYear "
					+ "FROM `User` U " + "JOIN Manager M ON U.UserID = M.UserID "
					+ "JOIN Project_User PU ON PU.UserID = M.UserID";
			//// Step 4: Execute query

			ResultSet resultSet = statement.executeQuery(sql);

			// Step 5: Handling result
			while (resultSet.next()) {
				int userId = resultSet.getInt("UserID");
				String fullName = resultSet.getString("FullName");
				String email = resultSet.getString("Email");
				Role role = Role.valueOf(resultSet.getString("Role").toUpperCase());
				
				User user = new User(userId, fullName, email, role);
				users.add(user);
			}
			return users;
		} finally {
			connection.close();
		}

	}
}
