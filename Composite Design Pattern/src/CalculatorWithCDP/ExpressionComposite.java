package CalculatorWithCDP;

public class ExpressionComposite implements ArithematicExpression{
	
	ArithematicExpression leftExpression;
	ArithematicExpression rightExpression;
	Operation operation;
	public ExpressionComposite(ArithematicExpression leftExpression,ArithematicExpression rightExpression,Operation operation) {
		this.leftExpression=leftExpression;
		this.rightExpression=rightExpression;
		this.operation=operation;
	}
	
	public int evaluate() {
		int value=0;
		switch(operation){
		case ADD:
			value=leftExpression.evaluate()+rightExpression.evaluate();
			break;
		case SUBTRACT:
			value=leftExpression.evaluate()-rightExpression.evaluate();
			break;
		case MULTIPLY:
			value=leftExpression.evaluate()*rightExpression.evaluate();
			break;
		case DIVIDE:
			value=leftExpression.evaluate()/rightExpression.evaluate();
			break;
		}
		
		return value;
	}
}
