package task2;

import java.util.Arrays;

public class Triangle {
	private Segment[] triangle;

	public Triangle(Segment[] triangle) {
		super();
		this.triangle = triangle.clone();
	}

	public Segment[] getTriangle() {
		return triangle;
	}

	@Override
	public String toString() {
		return "Triangle [triangle=" + Arrays.toString(triangle) + "]";
	}	
}
