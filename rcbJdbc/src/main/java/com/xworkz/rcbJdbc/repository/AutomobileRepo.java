package com.xworkz.rcbJdbc.repository;

import java.util.List;

import com.xworkz.rcbJdbc.dto.Vehicle;

public interface AutomobileRepo {
	public void saveVehicleDetails(Vehicle vehicle);

	public void saveVehicleDetails(List<Vehicle> vehicle);

	public void updateVehicleDetails(Vehicle vehicle);

	public void updateVehicleDetails(List<Vehicle> vehicle);
		
	public List<Vehicle> fetchAllVehicles();

	public void deleteVehicleByName(String name);

	public void fetchVehicle(Vehicle vehicle);
	
	public void deleteVehicleByName(List<String> names);
	
}
