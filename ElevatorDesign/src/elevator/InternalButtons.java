package elevator;

public class InternalButtons {
	InternalDispatcher dispatcher = new InternalDispatcher();
	int []availableButtons= {1,2,3,4,5,6,7,8,9};
	int buttonSelected;
	public void pressButton(int destination, ElevatorCar elevatorCar) {
		// TODO Auto-generated method stub
		dispatcher.submitInternalRequest(destination,elevatorCar);
	
	}

}
