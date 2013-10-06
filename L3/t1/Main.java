package t1;

import t2.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Expression a=new Div(new Number(1),new Add(new Variable('x'),new Number(1)));
		System.out.println(a);
		System.out.println(a.Diff());
	}

}
