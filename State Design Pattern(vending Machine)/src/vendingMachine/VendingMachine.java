package vendingMachine;


import java.util.ArrayList;
import java.util.List;

import vendingState.State;
import vendingState.Impl.IdleState;

public class VendingMachine {

	 public State vendingMachineState;
	 public Inventory inventory;
	 public List<Coin> coinList;
	 
	 public VendingMachine(){
	        vendingMachineState = new IdleState();
	        inventory = new Inventory(10);
	        coinList = new ArrayList<>();
	    }


	public State getVendingState() {
		// TODO Auto-generated method stub
		return vendingMachineState;
		//return null;
	}
	
	public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }
	
	 public Inventory getInventory() {
	        return inventory;
	    }
	 
	 public void setInventory(Inventory inventory) {
	        this.inventory = inventory;
	    }

	    public List<Coin> getCoinList() {
	        return coinList;
	    }

	    public void setCoinList(List<Coin> coinList) {
	        this.coinList = coinList;
	    }

}
