package t1;

public class Sub extends Expression{
	IExpression left,right;
	public Sub(IExpression left, IExpression right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public IExpression Diff() {
		return (new Sub(left.Diff(),right.Diff()));
	}

	@Override
	public String Show() {
		return (left.Show()+"-("+right.Show()+')');
	}

	@Override
	public String toString() {
		return Show();
	}	
}
