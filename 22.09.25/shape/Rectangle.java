package sh.java.shape;

import java.util.Arrays;

public class Rectangle extends Shape{
	private Point leftTop;
	private Point rightTop;
	private Point rightBottom;
	private Point leftBottom ;
	
	private Point[] points = {leftTop,rightTop,rightBottom,leftBottom};
	
	private int width;
	private int height;
	
	public Rectangle() {}
	
	public Rectangle(Point[] points) {
		
		this.points = points;
		width = points[1].getX() - points[0].getX();
		height = points[3].getY() - points[0].getY(); //Y는 밑으로 간다.
	}
	
	public Rectangle(Point leftTop, int width, int height) {
		this.points[0] = leftTop; //leftTop을 (0,0)으로 준다.
		this.points[1] = new Point(leftTop.getX() + width, leftTop.getY()); //rightTop = (width,0)
		this.points[2] = new Point(leftTop.getX() + width, leftTop.getY()+height); //rightBottom = (width,height)
		this.points[3] = new Point(leftTop.getX(),leftTop.getY()+height); //leftBottom = (0,height)
		this.width = width;
		this.height = height;
		
	}
	
	public Rectangle(Point leftTop, Point rightBottom) {
		this.points[0] = leftTop;
		this.points[1] = new Point(rightBottom.getX(),leftTop.getY());
		this.points[2] = rightBottom;
		this.points[3] = new Point(leftTop.getX(),rightBottom.getY());
		width = points[1].getX() - points[0].getX();
		height = points[3].getY() - points[0].getY(); //Y는 밑으로 간다.
	}
	
	
	@Override
	public void draw() {
	
		System.out.println("네 꼭지점이"+Arrays.toString(points) +"이고, "+ "너비가 "+this.width+"높이가 "+this.height
				+"인 사각형을 그린다.");
	}
	
	@Override
	public int getArea() {
		return width * height;
	}
	
	@Override 
	public String toString() {
		
		return "points= " + Arrays.toString(points)+ "width = " + width + ", height = "+ height;
	}
	
	
}
