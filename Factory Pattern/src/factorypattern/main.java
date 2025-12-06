package factorypattern;

public class main {

	public static void main(String[] args) {
		ShapeFactory factory=new ShapeFactory();
		Shape shape=factory.getShape("CIRCLE");
		Shape shape1=factory.getShape("SQUARE");
		shape.draw();
		shape1.draw();
		

	}

}
