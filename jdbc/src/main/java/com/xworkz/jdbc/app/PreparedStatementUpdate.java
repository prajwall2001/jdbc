package com.xworkz.jdbc.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementUpdate {
	public static void main(String[] args) {
		System.out.println("Invoking main in PrepareStatementUpdate......");

		String jdbcUrl = "jdbc:mysql://localhost:3306/Movies";
		String userName = "root";
		String password = "Xworkzodc@123";

		String query = "UPDATE MovieList SET budget=? WHERE name=?;";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Establishing a Connection.....");
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement stat = connection.prepareStatement(query);
			stat.setLong(1, 45425200);
			stat.setString(2, "FastX");
			stat.executeUpdate();
			System.out.println("Updated records!!!!!!!!!!!!!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
