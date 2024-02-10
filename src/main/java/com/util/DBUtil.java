package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

	public static Connection createConnection() {
		Connection cn = null;
		final String DBDriver = "com.mysql.cj.jdbc.Driver";
		final String DBUrl = "jdbc:mysql://localhost:3306/userDB";
		final String username = "root";
		final String password = "password123";
		try {
			Class.forName(DBDriver);
			cn = DriverManager.getConnection(DBUrl, username, password);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}

	public static void closeAllConnections(Connection cn, PreparedStatement ps, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (cn != null) {
				cn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
