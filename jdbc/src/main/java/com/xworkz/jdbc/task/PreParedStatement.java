package com.xworkz.jdbc.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreParedStatement {
	public static void main(String[] args) {
		System.out.println("Invoking main in PreParedStatement......");

		String jdbcUrl = "jdbc:mysql://localhost:3306/Laptops";
		String userName = "root";
		String password = "Xworkzodc@123";

		String query = "INSERT INTO LapModels(id,name,model,price,warranty) VALUES (?,?,?,?,?);";
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
			stat.setInt(1, 1);
			stat.setString(2, "Lenovo");
			stat.setString(3, "Ideapad slim3");
			stat.setLong(4, 85000);
			stat.setInt(5, 5);
			stat.execute();
			stat.setInt(1, 2);
			stat.setString(2, "Asus");
			stat.setString(3, "vivobook");
			stat.setLong(4, 70000);
			stat.setInt(5, 2);
			stat.execute();
			stat.setInt(1, 3);
			stat.setString(2, "HP");
			stat.setString(3, "Pavilion plus 16");
			stat.setLong(4, 90000);
			stat.setInt(5, 4);
			stat.execute();
			stat.setInt(1, 4);
			stat.setString(2, "Lenovo");
			stat.setString(3, "yoga");
			stat.setLong(4, 90000);
			stat.setInt(5, 3);
			stat.execute();
			stat.setInt(1, 5);
			stat.setString(2, "Lenovo");
			stat.setString(3, "Thinkpad");
			stat.setLong(4, 65000);
			stat.setInt(5, 3);
			stat.execute();
			stat.setInt(1, 6);
			stat.setString(2, "Acer");
			stat.setString(3, "Predator");
			stat.setLong(4, 70000);
			stat.setInt(5, 3);
			stat.execute();
			stat.setInt(1, 7);
			stat.setString(2, "Acer");
			stat.setString(3, "Nitro");
			stat.setLong(4, 80000);
			stat.setInt(5, 2);
			stat.execute();
			stat.setInt(1, 8);
			stat.setString(2, "MSI");
			stat.setString(3, "Sword");
			stat.setLong(4, 68000);
			stat.setInt(5, 3);
			stat.execute();
			stat.setInt(1, 9);
			stat.setString(2, "Redmi");
			stat.setString(3, "Redmibook pro 15");
			stat.setLong(4, 55000);
			stat.setInt(5, 2);
			stat.execute();
			stat.setInt(1, 10);
			stat.setString(2, "Realme");
			stat.setString(3, "Notebook Air");
			stat.setLong(4, 88000);
			stat.setInt(5, 4);
			stat.execute();
			System.out.println("Added records!!!!!!!!!!!!!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
