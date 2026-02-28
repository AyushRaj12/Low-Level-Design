package expression;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Context context=new Context();
		
		context.setContext('a', 1);
		context.setContext('b', 2);
		context.setContext('c', 3);
		context.setContext('d', 4);
		
		
		AbstractExpression abstractExpression=new BinaryExpression(new BinaryExpression(new NumberExpression('a'), new NumberExpression('b'), '+'),
				new BinaryExpression(new NumberExpression('c'), new NumberExpression('d'), '+'),'*');
		
		System.out.print(abstractExpression.interpret(context));
	}

}
