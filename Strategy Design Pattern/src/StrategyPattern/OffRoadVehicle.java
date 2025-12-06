package StrategyPattern;

import StrategyPattern.Strategy.SportsDriverStrategy;

public class OffRoadVehicle extends Vehicle{
OffRoadVehicle(){
	super(new SportsDriverStrategy());
}
}
