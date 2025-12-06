package carRental;

import java.util.List;

import product.Vehicle;

public class VehicleInventoryManagement {
 
	List<Vehicle> vehicles;
	
	VehicleInventoryManagement(List<Vehicle> vehicles){
		this.vehicles=vehicles;
	}

	public List<Vehicle> getVehicles() {
		//filtering can be done here
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
}
