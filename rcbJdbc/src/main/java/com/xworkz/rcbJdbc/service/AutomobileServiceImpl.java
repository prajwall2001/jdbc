package com.xworkz.rcbJdbc.service;

import java.util.List;

import com.xworkz.rcbJdbc.dto.Vehicle;
import com.xworkz.rcbJdbc.repository.AutomobileRepo;
import com.xworkz.rcbJdbc.repository.AutomobileRepoImpl;

public class AutomobileServiceImpl implements AutomobileService {
	AutomobileRepo repo = new AutomobileRepoImpl();

	public AutomobileServiceImpl() {

	}

	public void validateAndSave(Vehicle vehicle) {
		if (vehicle.getName() != null && vehicle.getColor() != null && vehicle.getType() != null) {
			repo.saveVehicleDetails(vehicle);
		} else {
			System.out.println("Invalid details");
		}
	}

	public void validateAndSave(List<Vehicle> vehicle) {
		repo.saveVehicleDetails(vehicle);
	}

	public void updateAndSave(Vehicle vehicle) {
		// TODO Auto-generated method stub
		if (vehicle.getName() != null && vehicle.getColor() != null && vehicle.getType() != null) {
			repo.updateVehicleDetails(vehicle);
		} else {
			System.out.println("Invalid details");
		}
	}

	public void updateAndSave(List<Vehicle> vehicle) {
		// TODO Auto-generated method stub
		repo.updateVehicleDetails(vehicle);

	}

	public void fetchAllRecords() {
		// TODO Auto-generated method stub
		List<Vehicle> col = repo.fetchAllVehicles();
		for (Vehicle vehicles : col) {
			System.out.println("Result in ResultSet");
			System.out.println("Name:" + vehicles.getName());
			System.out.println("Color:" + vehicles.getColor());
			System.out.println("Type:" + vehicles.getType());
			System.out.println("Model:" + vehicles.getModel());
		}
	}

	public void deleteRecordsByName(String name) {
		// TODO Auto-generated method stub
		repo.deleteVehicleByName(name);
	}

	public void fetchSingleRecord(Vehicle vehicle) {
		// TODO Auto-generated method stub
		repo.fetchVehicle(vehicle);
	}
}
