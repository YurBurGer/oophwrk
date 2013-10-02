package t1;

public class Number implements IExpression{
	String num;
	public Number(String num) {
		super();
		this.num = num;
	}
	public Number(int num){
		this.num=Integer.toString(num);
	}
	@Override
	public IExpression Diff() {
		return new Number(0);
	}
	@Override
	public String Show() {
		return num;
	}
	@Override
	public String toString() {
		return Show();
	}
}
