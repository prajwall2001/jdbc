package com.xworkz.jdbc.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreParedStatementUpdate {
	public static void main(String[] args) {
		System.out.println("Invoking main in PrepareStatementUpdate......");

		String jdbcUrl = "jdbc:mysql://localhost:3306/Laptops";
		String userName = "root";  
		String password = "Xworkzodc@123";

		String query = "UPDATE LapModels SET price=? WHERE model=? ;";
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
			stat.setLong(1,65855);
			stat.setString(2, "Ideapad slim3");
			stat.executeUpdate();
			stat.setLong(1,85800);
			stat.setString(2, "Nitro");
			stat.executeUpdate();
			stat.setLong(1,75855);
			stat.setString(2, "yoga");
			stat.executeUpdate();
			stat.setLong(1,79999);
			stat.setString(2, "Predator");
			stat.executeUpdate();
			stat.setLong(1,89000);
			stat.setString(2, "Thinkpad");
			stat.executeUpdate();
			stat.setLong(1,84999);
			stat.setString(2, "Pavilion plus 16");
			stat.executeUpdate();
			stat.setLong(1,59999);
			stat.setString(2, "vivobook");
			stat.executeUpdate();
			stat.setLong(1,55555);
			stat.setString(2, "Sword");
			stat.executeUpdate();
			stat.setLong(1,99999);
			stat.setString(2, "Notebook Air");
			stat.executeUpdate();
			stat.setLong(1,109999);
			stat.setString(2, "Redmibook pro 15");
			stat.executeUpdate();
			System.out.println("Updated records!!!!!!!!!!!!!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
