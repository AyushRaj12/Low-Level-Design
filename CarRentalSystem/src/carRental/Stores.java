package carRental;

import java.util.ArrayList;
import java.util.List;

import product.Vehicle;
import product.VehicleType;

public class Stores {
    int storeId;
    Location location;
    VehicleInventoryManagement vehicleInventoryManagement;
    List<Reservation> reservations=new ArrayList<Reservation>();
    
    public void addVehicle(List<Vehicle> vehicles) {
         vehicleInventoryManagement=new VehicleInventoryManagement(vehicles);
    }
    
    public List<Vehicle> getVehicle(VehicleType vehicleType){
    	return vehicleInventoryManagement.getVehicles();
    }
    public Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReservation(vehicle,user);
        reservations.add(reservation);
        return reservation;
    }
    
    public boolean completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
        return true;
    }

    //update reservation


}
