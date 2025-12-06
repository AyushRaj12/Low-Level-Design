package decorator;
import decorator.base.BasePizza;
import decorator.base.Farmhouse;
import decorator.base.Margerita;
import decorator.base.VegDelight;
import decorator.toppings.ExtraCheese;
import decorator.toppings.Mushroom;
import decorator.toppings.ToppingDecorator;
public class main {
	public static void main(String args[]) {
		BasePizza basePizza1=new ExtraCheese(new Mushroom(new Farmhouse()));
		BasePizza basePizza2=new ExtraCheese(new Mushroom(new Margerita()));
		ToppingDecorator topping=new ExtraCheese(new Mushroom(new VegDelight())) ;
		System.out.println(basePizza1.cost());
		System.out.println(basePizza2.cost());
		System.out.println(topping.cost());
	}

}
