package AcONOFF;

public class TurnAcOffCommand implements Icommand{

	AirConditioner airConditioner;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		airConditioner.turnAcOff();
		
	}

	public TurnAcOffCommand(AirConditioner airConditioner) {
		super();
		this.airConditioner = airConditioner;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		airConditioner.turnAcOn();
		System.out.println("AC is turned On");
		
	}

}
