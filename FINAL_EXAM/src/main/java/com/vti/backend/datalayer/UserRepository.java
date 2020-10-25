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
import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.Project;
import com.vti.entity.Role;
import com.vti.entity.User;

public class UserRepository implements IUserRepository {
	private JdbcUltils jdbcUltils;
	private Connection connection;

	public UserRepository() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		jdbcUltils = new JdbcUltils();
	}
	
	@Override

	public Project getIdOfUser(int id) throws Exception {
		try {
			// get connect
			connection = jdbcUltils.connect();

			// Step 3: Create a statment object
			Statement statement = connection.createStatement();

			// Step 4: Execute query
			String listUser = "SELECT ManagerID, EmployeeID " + "FROM managerusers.project " + "WHERE ProjectID = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(listUser);
			ResultSet resultSet = statement.executeQuery(listUser);

			// set parameter
			preparedStatement.setInt(1, id);

			// Step 5: Handling result set
			if (resultSet.next()) {
				int managerId = resultSet.getInt("ManagerID");
				int employeeId = resultSet.getInt("EmployeeID");
				Project project = new Project(managerId, employeeId);
				return project;
			} else {
				throw new Exception("ID khong ton tai!");
			}
		} finally {
			// Step 6: Close connection
			connection.close();
		}

	}

	@Override
	public List<Manager> getListManger() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User login(String email, String password) throws Exception {

		try {

			// step 2: get connect
			connection = jdbcUltils.connect();

			// Step 3: Create a statement object

			String sql = "SELECT * FROM managerusers.manager " + "WHERE Email = ? AND Password = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// set parameter
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);

			// Step 4: Execute Query

			ResultSet resultSet = preparedStatement.executeQuery();

			// Step 5: Handling result
			if (resultSet.next()) {
				int userId = resultSet.getInt("UserID");
				String fullName = resultSet.getString("FullName");
				Role role = Role.valueOf(resultSet.getString("Role"));

				User user = new User(userId, fullName, email, password, role);
				return user;
			} else {
				throw new Exception("\nTai khoan khong ton tai!");
			}

		} finally {
			connection.close();
		}

	}


	@Override
	public Manager getManagerById(int id) throws Exception {
		try {
			// Step 2: get connect
			connection = jdbcUltils.connect();

			// Step 3: Create a statement object
			String sql = "SELECT * "
					+ "FROM Manager M "
					+ "JOIN Project P ON M.ManagerID = P.ManagerID "
					+ "WHERE ProjectID = ? ";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// set parameter
			preparedStatement.setInt(1, id);

			// Step 4: Execute SQL query
			ResultSet resultSet = preparedStatement.executeQuery();

			// Step 5: Handling result set

			if (resultSet.next()) {
				int ManagerID = resultSet.getInt("ManagerID");
				String fullName = resultSet.getString("FullName");
				String email = resultSet.getString("Email");
				String password = resultSet.getString("Password");
				int ExpInYear = resultSet.getInt("ExpInYear");
				

				Manager manager = new Manager(ManagerID, fullName, email, password, ExpInYear);

				return manager;
			} else {
				throw new Exception("ID khong ton tai!");
			}

		} finally {
			connection.close();
		}
	}

	@Override
	public User getEmployeeById(int id) throws Exception {
		try {
			// Step 2: get connect
			connection = jdbcUltils.connect();

			// Step 3: Create a statement object
			String sql = "SELECT * n"
					+ "FROM Employee E "
					+ "JOIN Project P ON E.EmployeeID = P.EmployeeID "
					+ "WHERE ProjectID = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// set parameter
			preparedStatement.setInt(1, id);

			// Step 4: Execute SQL query
			ResultSet resultSet = preparedStatement.executeQuery();

			// Step 5: Handling result set

			if (resultSet.next()) {
				
				int EmployeeID = resultSet.getInt("EmployeeID");
				String fullName = resultSet.getString("FullName");
				String email = resultSet.getString("Email");
				String password = resultSet.getString("Password");
				String proSkill = resultSet.getString("ProSkill");

				Employee employee = new Employee(EmployeeID, fullName, email, password, proSkill);

				return employee;
			} else {
				throw new Exception("ID khong ton tai!");
			}

		} finally {
			connection.close();
		}
	}

	
}
