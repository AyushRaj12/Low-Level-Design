package gameDesign;

public class main {
	public static void main(String args[]) {
     Robot humanRobot1=RoboticFactory.create("Humanoid");
     humanRobot1.display(1,2);
     Robot humanRobot2=RoboticFactory.create("Humanoid");
     humanRobot1.display(2,4);
     
     Robot DogRobot1=RoboticFactory.create("RoboticDog");
     humanRobot1.display(2,8);
     
     Robot DogRobot2=RoboticFactory.create("RoboticDog");
     humanRobot1.display(3,9);
	}
}
