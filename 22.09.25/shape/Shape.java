package sh.java.shape;

public class Shape {

	private int area;

	public Shape() {
		super();
	}

	public Shape(int area) {
		super();
		this.area = area;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
	public void draw() {
		System.out.println("도형을 그린다...");
	}
}
