package elevator;

public class ElevatorCar {
   int id;
   ElevatorDisplay elevatorDisplay;
   Direction direction;
   InternalButtons internalButtons;
   int currentFloor;
   ElevatorState elevatorState;
   ElevatorDoor elevatorDoor;
   
   public ElevatorCar() {
	   elevatorDisplay=new ElevatorDisplay();
	   internalButtons=new InternalButtons();
	   direction=direction.UP;
	   currentFloor=0;
	   elevatorState=elevatorState.IDLE; 
	   elevatorDoor=new ElevatorDoor();
   }
   
   public void showDisplay() {
	  elevatorDisplay.display();
	 }
   
   public void pressButton(int destination) {
	   internalButtons.pressButton(destination,this);
   }
   
   public void setDisplay() {
	   this.elevatorDisplay.display();
   }
   
   boolean moveElevator(Direction direction,int destinationFloor) {
	   int startFloor=currentFloor;
	   if(direction==Direction.UP) {
		   for(int i=startFloor;i<=destinationFloor;i++) {
			   this.currentFloor=i;
			   setDisplay();
			   showDisplay();
			   if(i==destinationFloor) {
				   return true;
			   }
		   }
	   }
	   if(direction==Direction.DOWN) {
		   for(int i=startFloor;i>=destinationFloor;i--) {
			   this.currentFloor=i;
			   setDisplay();
			   showDisplay();
			   if(i==destinationFloor) {
				   return true;
			   }
		   }
	   }
	   return false;
   }
   
}
