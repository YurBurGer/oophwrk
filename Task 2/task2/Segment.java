package task2;

public class Segment{
	private Point p1,p2;

	public Segment(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	public Segment(float x1, float y1,float z1,float x2,float y2,float z2){
		this.p1=new Point(x1,y1,z1);
		this.p2=new Point(x2,y2,z2);
	}
	public Point getP1() {
		return p1;
	}
	public Point getP2() {
		return p2;
	}
	@Override
	public String toString() {
		return "Segment [p1=" + p1 + ", p2=" + p2 + "]";
	}	
}
