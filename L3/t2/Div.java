package t2;

import t1.*;

public class Div implements IExpression{
	IExpression left,right;
	public Div(IExpression left, IExpression right) {
		super();
		this.left = left;
		this.right = right;
	}
	@Override
	public IExpression Diff() {
		return new Div(new Sub(new Mul(left.Diff(),right),new Mul(left,right.Diff())),new Mul(right,right));
	}
	@Override
	public String Show() {
		return '('+left.Show()+")/("+right.Show()+')';
	}
	@Override
	public String toString() {
		return Show();
	}
	
}
