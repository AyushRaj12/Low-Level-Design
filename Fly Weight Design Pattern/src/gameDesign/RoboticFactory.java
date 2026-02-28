package gameDesign;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
   
	private static Map<String, Robot> cache=new HashMap<String, Robot>();
	
	public static Robot create(String type) {
		if(cache.containsKey(type)) {
			return cache.get(type);
		}else {
			if(type=="Humanoid") {
				Sprites humanoidSprites=new Sprites();
				Robot humanoidRobot=new HumanoidRobot(type,humanoidSprites);
				cache.put(type, humanoidRobot);
		        System.out.println("Fetched from humanoid cache");
				return humanoidRobot;
			}else if(type=="RoboticDog") {
				Sprites dogSprites=new Sprites();
				Robot dogRobot=new HumanoidRobot(type,dogSprites);
				cache.put(type, dogRobot);
				System.out.println("Fetched from Dog cache");
				return dogRobot;
			}
		}
		return null;
	}
	
}
