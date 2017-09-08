package day2;

class Shape {
	
	public double area() {
		return 0.0;
	}
	
}

class Rectangle extends Shape {
	double length;
	double breadth;
	
	public Rectangle(double length,double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double area() {
		return this.length * this.breadth;
	}
}

class Triangle extends Shape {
	double base;
	
	protected Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	double height;
	
	public double area() {
		return 0.5 * this.base * this.height;
	}
}

public class AreaCaluclator {
	public static void main(String[] args) {
		Shape a = new Triangle(10,20);
		System.out.println(a.area());
	}

}
