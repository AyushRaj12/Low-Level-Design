package CalculatorWithCDP;

public class Number implements ArithematicExpression {
	int number;
	
    public Number(int number) {
	this.number=number;
    }
    
    public int evaluate() {
    	System.out.println(number);
    	return number;
    }

}
