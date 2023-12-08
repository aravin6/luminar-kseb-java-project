
package com.kseb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	final String driver = "com.mysql.cj.jdbc.Driver";
	final String url = "jdbc:mysql://localhost:3306/kseb_dummy_project";
	final String user = "root";
	final String password = "Manu@19june";
	Connection conn = null;

	public Connection getConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException sql) {
			sql.printStackTrace();
		}
		return conn;
	}
}
