package task2;

import java.util.Arrays;

public class Tetrahedron {
	private Triangle[] tetrahedron;

	public Tetrahedron(Triangle[] tetrahedron) {
		super();
		this.tetrahedron = tetrahedron.clone();
	}

	public Triangle[] getTetrahedron() {
		return tetrahedron;
	}

	@Override
	public String toString() {
		return "Tetrahedron [tetrahedron=" + Arrays.toString(tetrahedron) + "]";
	}	
}
