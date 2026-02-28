package expression;

public class NumberExpression implements AbstractExpression {

	char exp;
	
	public NumberExpression(char exp) {
		this.exp=exp;
	}
	@Override
	public int interpret(Context context) {
		// TODO Auto-generated method stub
		return context.getContext(exp);
	}

}
