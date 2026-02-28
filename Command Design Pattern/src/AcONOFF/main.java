package AcONOFF;

public class main {
 public static void main(String args[]) {
	AirConditioner airConditioner=new AirConditioner(false, 0);
	airConditioner.setTemp(26);
	Icommand icommand=new TurnAcOnCommand(airConditioner);
	MyRemoteControl myRemoteControl=new MyRemoteControl(icommand);
	myRemoteControl.pressButton();
	myRemoteControl.undo();
}
}
