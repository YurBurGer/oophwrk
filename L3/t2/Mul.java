package t2;

import t1.*;

public class Mul extends Expression{
	IExpression left,right;
	public Mul(IExpression left, IExpression right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public IExpression Diff() {
		return (new Add(new Mul(left,right.Diff()),new Mul(left.Diff(),right)));
	}

	@Override
	public String Show() {
		return ('('+left.Show()+")*("+right.Show()+')');
	}

	@Override
	public String toString() {
		return Show();
	}
	
}
