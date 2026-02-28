package expression;

public class BinaryExpression implements AbstractExpression{
	
	AbstractExpression leftExpression;
	AbstractExpression rigthExpression;
	char Operator;
	
	public BinaryExpression(AbstractExpression leftExpression,AbstractExpression rigthExpression,char Operator) {
		this.leftExpression=leftExpression;
		this.rigthExpression=rigthExpression;
		this.Operator=Operator;
	}

	@Override
	public int interpret(Context context) {
		// TODO Auto-generated method stub
         switch(Operator) {
           case '*':
        	   return leftExpression.interpret(context)*rigthExpression.interpret(context);
           case '+':
        	   return leftExpression.interpret(context)+rigthExpression.interpret(context); 
         }
		return 0;
	}

}
