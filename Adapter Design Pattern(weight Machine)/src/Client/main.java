package Client;
import Adapter.WeightInKgImplementation;
import Adapter.WeightMachineAdapter;
import Adaptee.WeightMachineForBabies;
public class main {
  public static void main(String args[]) {
	
	  WeightMachineAdapter weightMachineadapter=new WeightInKgImplementation(new WeightMachineForBabies());
	  System.out.print(weightMachineadapter.getWeightInKg());
  }
}
