package NullObjectDesign;

public class main {
   public static void main(String args[]) {
	   Vehicle vehicle=VehicleFactory.getVehicleObject("Car");
	   Vehicle vehicle1=VehicleFactory.getVehicleObject("Bike");
	   
	   //if(vehicle!=null) {  if null object is applied
		   System.out.println(vehicle.getNumberOfSeats());
		   System.out.println( vehicle.getTankCapacity());
		   System.out.println(vehicle1.getNumberOfSeats());
		   System.out.println( vehicle1.getTankCapacity());
		   
	  // }
   }
}
