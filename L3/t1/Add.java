package t1;

public class Add extends Expression {
	IExpression left,right;
	public Add(IExpression left, IExpression right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public IExpression Diff() {
		return (new Add(left.Diff(),right.Diff()));
	}

	@Override
	public String Show() {
		return (left.Show()+'+'+right.Show());
	}

	@Override
	public String toString() {
		return Show();
	}
	
}
