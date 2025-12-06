package NullObjectDesign;

public class VehicleFactory {
       
	static Vehicle getVehicleObject(String v) { //factory design pattern
		if("Car".equals(v)) {
			return new Car();
		}
		return new NullObject();
	}
}
