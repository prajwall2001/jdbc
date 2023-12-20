package com.xworkz.rcbJdbc.service;

import java.util.List;

import com.xworkz.rcbJdbc.dto.Vehicle;

public interface AutomobileService {
	public void validateAndSave(Vehicle vehicle);

	public void validateAndSave(List<Vehicle> vehicle);
	
	public void updateAndSave(Vehicle vehicle);

	public void updateAndSave(List<Vehicle> vehicle);
	
	public void fetchAllRecords();
	
	public void fetchSingleRecord(Vehicle vehicle);
	
	public void deleteRecordsByName(String name);

}
