package com.xworkz.rcbJdbc.boot;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.rcbJdbc.dto.Vehicle;
import com.xworkz.rcbJdbc.repository.AutomobileRepo;
import com.xworkz.rcbJdbc.repository.AutomobileRepoImpl;
import com.xworkz.rcbJdbc.service.AutomobileService;
import com.xworkz.rcbJdbc.service.AutomobileServiceImpl;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Running main in Runner");

		Vehicle vehicle = new Vehicle(1, "Nissan GTR", "red", "Car", 2010);
		Vehicle vehicles = new Vehicle(2, "Thar", "black", "Car", 2021);
		AutomobileRepo repos = new AutomobileRepoImpl();
		/*
		 * repos.saveVehicleDetails(vehicle); repos.saveVehicleDetails(vehicles);
		 */
		repos.updateVehicleDetails(vehicle);

		AutomobileService services = new AutomobileServiceImpl();
		List<Vehicle> vehicle1 = new ArrayList<Vehicle>();
		Vehicle vehicle2 = new Vehicle(3, "Nissan GTR", "green", "Car", 2020);
		Vehicle vehicle3 = new Vehicle(4, "BMW", "White", "Car", 2022);
		vehicle1.add(vehicle2);
		vehicle1.add(vehicle3);
		/* services.validateAndSave(vehicle1); */
		services.updateAndSavevehicle2);

		services.fetchAllRecords();
		services.fetchSingleRecord(vehicle);
		services.deleteRecordsByName("Nissan GTR");
		
	}
}