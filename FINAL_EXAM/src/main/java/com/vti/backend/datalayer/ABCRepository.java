package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.vti.Ultils.JdbcUltils;

public class ABCRepository {
	private JdbcUltils jdbcUltils;
	private Connection connection;

	public ABCRepository() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		jdbcUltils = new JdbcUltils();
	}

}
