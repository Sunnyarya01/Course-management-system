package com.monitor.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		String url = "jdbc:mysql://localhost:3306/Monitor";
		try {
			conn = DriverManager.getConnection(url, "root", "root");
		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage( ));
		}
		return conn;
	}

}
