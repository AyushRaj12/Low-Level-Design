package Adapter;

import Adaptee.WeightMachine;

public class WeightInKgImplementation implements WeightMachineAdapter{

	WeightMachine weightMachine;
	
	public WeightInKgImplementation(WeightMachine weightMachine) {
		this.weightMachine=weightMachine;
	}
	
	
	@Override
	public double getWeightInKg() {
		// TODO Auto-generated method stub
		double weightinPound=weightMachine.getWeightInPounds();
		double weightInKg=weightinPound*0.45;
		return weightInKg;
	}

}
