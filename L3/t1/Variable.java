package t1;

public class Variable extends Expression{
	String val;
	/**
	 * Constructor
	 * @param val
	 */
	public Variable(String val) {
		super();
		this.val = val;
	}
	public Variable(char val){
		super();
		this.val = Character.toString(val);	
	}
	@Override
	public IExpression Diff() {
		return new Number(1);
	}
	@Override
	public String Show() {
		return val;
	}
	@Override
	public String toString() {
		return Show();
	}
	
}
