package t1;

public class Expression implements IExpression{

	@Override
	public IExpression Diff() {
		return null;
	}

	@Override
	public String Show() {
		return null;
	}
	public static Expression parse(String s){
		return t3.Parse.toExpression(s);
	}
}
