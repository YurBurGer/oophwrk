package task2;

public class Main {

	/**
	 * @author Yuriy Gerasimov
	 * @param args
	 */
	public static void main(String[] args) {
		final int triangledenisty=10;//how much triangles will be in tetradron
		final int initlength=1000;//length of base triangle
		Triangle[] t=new Triangle[triangledenisty];
		t[0]=makeTriangle(0,initlength,0);
		for(int h=1;h<t.length;h++){
			int k=t.length-h+1;
			float len=initlength;
			float x1i=len/k;
			float x2i=len-len/k;
			t[h]=makeTriangle(x1i,x2i,h);
		}
		Tetrahedron tr=new Tetrahedron(t);
		System.out.println(tr.getTetrahedron()[0].getTriangle()[0].getP1().getX());
	}
	public static Triangle makeTriangle(float x1,float x2,int z){
		final int segmentdenisty=10;//how much segments will be in trianlge
		Segment[] s=new Segment[segmentdenisty];
		Point p1=new Point(x1,0,z);
		Point p2=new Point(x2,0,z);
		s[0]=new Segment(p1,p2);
		for(int i=1;i<s.length;i++){
			int k=s.length-i+1;
			float len=Math.abs(p1.getX()-p2.getX());
			float x1i=p1.getX()+len/k;
			float x2i=p2.getX()-len/k;
			Point p1i=new Point(x1i,i,z);
			Point p2i=new Point(x2i,i,z);
			s[i]=new Segment(p1i,p2i);
		}
		Triangle t1=new Triangle(s);
		return t1;
	}
}
