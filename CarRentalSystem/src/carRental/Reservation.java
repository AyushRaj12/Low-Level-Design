package carRental;

import java.util.Date;

import product.Vehicle;

public class Reservation {
	int reservationId;
	Vehicle vehicle;
	Date bookingDate;
	Date dateBookedFrom;
	Date dateBookedTo;
	Long fromTimeStamp;
	Long toTimeStamp;
	Location pickUpLocation;
	Location dropLocation;
	ReservationType reservationType;
	ReservationStatus reservationStatus;
	Location location;
	User user;
	
	//CRUD operations
	public int createReservation(Vehicle vehicle,User user) {
		  //generate new id
        reservationId = 12232;
        this.user=user;
        this.vehicle=vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;

        return reservationId;

	}
	
	public void updateReservation(int reservationId) {
		//update a particular reservation
	}

}
