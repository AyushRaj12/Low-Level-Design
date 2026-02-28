package AcONOFF;

public class AirConditioner {
 
	boolean isOn;
	int temp;
	public boolean isOn() {
		return isOn;
	}
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public AirConditioner(boolean isOn, int temp) {
		super();
		this.isOn = isOn;
		this.temp = temp;
	}
	public void turnAcOn() {
		// TODO Auto-generated method stub
		isOn=true;
		System.out.println("AC is on temp is set to"+ temp);
		
	}
	
	public void turnAcOff() {
		// TODO Auto-generated method stub
		isOn=false;
		System.out.println("AC is off temp is set to 0");
		
	}
}
