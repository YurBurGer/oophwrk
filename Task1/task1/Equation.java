package task1;

public class Equation {
	private int a,b,c,d;
	public Equation(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		d=b*b-4*a*c;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	@Override
	public String toString() {
		return "Equation [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	public int getSolutionNumber(){
		if(d>0)
			return 2;
		else if(d<0)
			return 0;
		else return 1;
	}
}
