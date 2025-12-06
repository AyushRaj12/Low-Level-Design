package StrategyPattern;

import StrategyPattern.Strategy.SportsDriverStrategy;

public class SportsVehicle extends Vehicle {
   public SportsVehicle() {
	   super(new SportsDriverStrategy());
   }
}
