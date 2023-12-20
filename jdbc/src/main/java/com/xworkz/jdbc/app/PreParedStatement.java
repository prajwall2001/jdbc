package com.xworkz.jdbc.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreParedStatement {
public static void main(String[] args) {
	System.out.println("Invoking main in fetch......");

	String jdbcUrl = "jdbc:mysql://localhost:3306/Movies";
	String userName = "root";
	String password = "Xworkzodc@123";

	String query = "INSERT INTO MovieList(id,name,director,budget) VALUES (?,?,?,?);";
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Establishing a Connection.....");

	try {
		Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
		PreparedStatement stat=connection.prepareStatement(query);
		stat.setInt(1, 12);
		stat.setString(2, "Pruthvi");
		stat.setString(3, "Sudeep");
		stat.setLong(4, 2000000);
		stat.execute();
		stat.setInt(1, 13);
		stat.setString(2, "Reings");
		stat.setString(3, "Walker");
		stat.setLong(4, 8000000);
		stat.execute();
		stat.setInt(1, 14);
		stat.setString(2, "Mukunda murari");
		stat.setString(3, "Upendra");
		stat.setLong(4, 9000000);
		stat.execute();
		stat.setInt(1, 15);
		stat.setString(2, "FastX");
		stat.setString(3, "Pablo");
		stat.setLong(4, 900000000);
		stat.execute();
		System.out.println("Added records!!!!!!!!!!!!!");

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
