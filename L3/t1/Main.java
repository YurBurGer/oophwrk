package t1;

import t2.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IExpression a=new Div(new Number(1),new Variable("x"));
		System.out.println(a);
		System.out.println(a.Diff());
	}

}
