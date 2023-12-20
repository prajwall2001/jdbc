package com.xworkz.rcbJdbc.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.rcbJdbc.dto.Vehicle;

public class AutomobileRepoImpl implements AutomobileRepo {
	public void saveVehicleDetails(Vehicle vehicle) {
		// TODO Auto-generated method stub

		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query = "INSERT INTO Vehicles(name,color,type,model) VALUES (?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement stat = conn.prepareStatement(query);
			stat.setString(1, vehicle.getName());
			stat.setString(2, vehicle.getColor());
			stat.setString(3, vehicle.getType());
			stat.setInt(4, vehicle.getModel());
			stat.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void saveVehicleDetails(List<Vehicle> vehicle) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query = "INSERT INTO Vehicles(name,color,type,model) VALUES (?,?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement stat = conn.prepareStatement(query);
			for (Vehicle vehicles : vehicle) {
				stat.setString(1, vehicles.getName());
				stat.setString(2, vehicles.getColor());
				stat.setString(3, vehicles.getType());
				stat.setInt(4, vehicles.getModel());
				stat.execute();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateVehicleDetails(Vehicle vehicle) {
		// UPDATE
		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query = "UPDATE Vehicles SET color=?,model=? WHERE name=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement stat = conn.prepareStatement(query);
			stat.setString(1, vehicle.getColor());
			stat.setInt(2, vehicle.getModel());
			stat.setString(3, vehicle.getName());

			stat.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateVehicleDetails(List<Vehicle> vehicle) {
		// List
		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query = "UPDATE Vehicles SET color=?,model=? WHERE name=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement stat = conn.prepareStatement(query);
			for (Vehicle vehicless : vehicle) {
				stat.setString(1, vehicless.getName());
				stat.setString(2, vehicless.getColor());
				stat.setInt(3, vehicless.getModel());
				stat.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Vehicle> fetchAllVehicles() {
		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";

		String query = "SELECT *FROM Vehicles";
		List<Vehicle> vehicles = new ArrayList<Vehicle>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
			Statement stat = connection.prepareStatement(query);
			ResultSet result = stat.executeQuery(query);
			while (result.next()) {

				Vehicle vehi = new Vehicle();
				vehi.setName(result.getString("name"));
				vehi.setColor(result.getString("color"));
				vehi.setType(result.getString(4));
				vehi.setModel(result.getInt(5));
				vehicles.add(vehi);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vehicles;
	}

	public void deleteVehicleByName(String name) {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";
		String query = "DELETE FROM Vehicles WHERE name=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement stat = conn.prepareStatement(query);
			stat.setString(1, name);
			stat.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fetchVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";

		String query = "SELECT *FROM Vehicles WHERE model=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement stat = connection.prepareStatement(query);
			stat.setInt(1, vehicle.getModel());
			ResultSet result = stat.executeQuery();
			
			if (result.next()) {
				System.out.println("Name:" + result.getString("name"));
				System.out.println("Color:" + result.getString("color"));
				System.out.println("Type:" + result.getString("type"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteVehicleByName(List<String> names) {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:mysql://localhost:3306/automobile";
		String userName = "root";
		String password = "Xworkzodc@123";

		String query = "DELETE FROM Vehicles WHERE name=?";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
			PreparedStatement stat = connection.prepareStatement(query);
			
			for (String string : names) {
				stat.setString(1, string);
				stat.execute();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
