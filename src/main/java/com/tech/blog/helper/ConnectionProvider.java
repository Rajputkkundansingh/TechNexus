package com.tech.blog.helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private static Connection con;

	public static Connection getConnection() {
		try {
			if (con == null) {
				// load driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/techblog";
				String userName = "root";
				String password = "Kundan@123";
				con = DriverManager.getConnection(url, userName, password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;

	}
}
