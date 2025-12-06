package StrategyPattern;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vehicle vehicle=new OffRoadVehicle();
         vehicle.drive();
         Vehicle v=new GoodsVehicle();
         v.drive();
         Vehicle v1=new SportsVehicle();
         v1.drive();
        		 
	}

}
