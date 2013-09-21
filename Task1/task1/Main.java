package task1;

public class Main {

	/**
	 * @author Yuriy Gerasimov
	 * @param args
	 */
	public static void main(String[] args) {
		Equation e1=new Equation(2,3,4);
		Equation e2=new Equation(3,6,3);
		System.out.println(e1.toString()+ e1.getSolutionNumber());
		System.out.print(e2.toString()+e2.getSolutionNumber());
	}
}
