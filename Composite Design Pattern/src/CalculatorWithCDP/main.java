package CalculatorWithCDP;

public class main {
	public static void main(String args[]) {
  ArithematicExpression one =new Number(1);
  ArithematicExpression two =new Number(2);
  ArithematicExpression seven =new Number(7);
  
  ArithematicExpression exp1=new ExpressionComposite(one,two,Operation.ADD);
  ArithematicExpression exp2=new ExpressionComposite(seven,exp1,Operation.MULTIPLY);
   System.out.print(exp2.evaluate());
	}
	
}
