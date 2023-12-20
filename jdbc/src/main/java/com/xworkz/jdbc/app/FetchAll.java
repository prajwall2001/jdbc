package com.xworkz.jdbc.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAll {
	public static void main(String[] args) {
		System.out.println("Invoking main in fetch......");

		String jdbcUrl = "jdbc:mysql://localhost:3306/Movies";
		String userName = "root";
		String password = "Xworkzodc@123";

		String query = "SELECT *FROM MovieList";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Establishing a Connection.....");

		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
			Statement stat = connection.createStatement();
			ResultSet ref = stat.executeQuery(query);
			while (ref.next()) {
				int id = ref.getInt("id");
				String name = ref.getString("name");
				String director = ref.getString("director");
				Long budget = ref.getLong("budget");
				System.out.println("Id:" + id + " , Name:" + name + " , Director:" + director + " , Budget:" + budget);
			} 
			System.out.println("Fetched all records!!!!!!!!!!!!!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
