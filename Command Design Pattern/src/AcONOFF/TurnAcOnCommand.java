package AcONOFF;

public class TurnAcOnCommand implements Icommand {

	AirConditioner airConditioner;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		airConditioner.turnAcOn();
		
	}

	public TurnAcOnCommand(AirConditioner airConditioner) {
		super();
		this.airConditioner = airConditioner;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		airConditioner.turnAcOff();
		System.out.println("AC is turned Off");
	}

}
