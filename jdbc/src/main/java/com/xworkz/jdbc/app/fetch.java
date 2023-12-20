package com.xworkz.jdbc.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class fetch {
	public static void main(String[] args) {
		System.out.println("Invoking main in fetch......");

		String jdbcUrl = "jdbc:mysql://localhost:3306/Movies";
		String userName = "root";
		String password = "Xworkzodc@123";

		String query = "SELECT *FROM MovieList WHERE name='Googly'";
		String query1 = "SELECT *FROM MovieList WHERE name='KGF chapter2'";
		String query2 = "SELECT *FROM MovieList WHERE name='Vikranth rona'";
		String query3 = "SELECT *FROM MovieList WHERE name='KGF2'";
		String query4 = "SELECT *FROM MovieList WHERE name='Fast and Furious'";
		String query5 = "SELECT *FROM MovieList WHERE name='Ugram'";
		String query6 = "SELECT *FROM MovieList WHERE name='Vikram'";
		String query7= "SELECT *FROM MovieList WHERE name='Titanic'";
		String query8 = "SELECT *FROM MovieList WHERE name='Game of thrones'";

		
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
			ResultSet result = stat.executeQuery(query);
			if (result.next()) {
				System.out.println("Result in ResultSet");
				System.out.println("Movie Name:"+result.getString("name"));
				System.out.println("Id:"+result.getInt("id"));
				System.out.println("Director:"+result.getString("director"));
				System.out.println("Budget:" +result.getLong("budget"));
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			ResultSet result1 = stat.executeQuery(query1);
			if (result1.next()) {
				System.out.println("Result in ResultSet");
				System.out.println("Movie Name:"+result1.getString("name"));
				System.out.println("Id:"+result1.getInt("id"));
				System.out.println("Director:"+result1.getString("director"));
				System.out.println("Budget:" +result1.getLong("budget"));
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			ResultSet result2 = stat.executeQuery(query2);
			if (result2.next()) {
				System.out.println("Result in ResultSet");
				System.out.println("Movie Name:"+result2.getString("name"));
				System.out.println("Id:"+result2.getInt("id"));
				System.out.println("Director:"+result2.getString("director"));
				System.out.println("Budget:" +result2.getLong("budget"));
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			ResultSet result3 = stat.executeQuery(query3);
			if (result3.next()) {
				System.out.println("Result in ResultSet");
				System.out.println("Movie Name:"+result3.getString("name"));
				System.out.println("Id:"+result3.getInt("id"));
				System.out.println("Director:"+result3.getString("director"));
				System.out.println("Budget:" +result3.getLong("budget"));
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			ResultSet result4 = stat.executeQuery(query4);
			if (result4.next()) {
				System.out.println("Result in ResultSet");
				System.out.println("Movie Name:"+result4.getString("name"));
				System.out.println("Id:"+result4.getInt("id"));
				System.out.println("Director:"+result4.getString("director"));
				System.out.println("Budget:" +result4.getLong("budget"));
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			ResultSet result5 = stat.executeQuery(query5);
			if (result5.next()) {
				System.out.println("Result in ResultSet");
				System.out.println("Movie Name:"+result5.getString("name"));
				System.out.println("Id:"+result5.getInt("id"));
				System.out.println("Director:"+result5.getString("director"));
				System.out.println("Budget:" +result5.getLong("budget"));
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			ResultSet result6 = stat.executeQuery(query6);
			if (result6.next()) {
				System.out.println("Result in ResultSet");
				System.out.println("Movie Name:"+result6.getString("name"));
				System.out.println("Id:"+result6.getInt("id"));
				System.out.println("Director:"+result6.getString("director"));
				System.out.println("Budget:" +result6.getLong("budget"));
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			ResultSet result7 = stat.executeQuery(query7);
			if (result7.next()) {
				System.out.println("Result in ResultSet");
				System.out.println("Movie Name:"+result7.getString("name"));
				System.out.println("Id:"+result7.getInt("id"));
				System.out.println("Director:"+result7.getString("director"));
				System.out.println("Budget:" +result7.getLong("budget"));
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			ResultSet result8 = stat.executeQuery(query8);
			if (result8.next()) {
				System.out.println("Result in ResultSet");
				System.out.println("Movie Name:"+result8.getString("name"));
				System.out.println("Id:"+result8.getInt("id"));
				System.out.println("Director:"+result8.getString("director"));
				System.out.println("Budget:" +result8.getLong("budget"));
			}
			
			System.out.println("Fetched records!!!!!!!!!!!!!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
