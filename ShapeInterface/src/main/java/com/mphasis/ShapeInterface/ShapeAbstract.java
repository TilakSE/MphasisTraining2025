package com.mphasis.ShapeInterface;


public class ShapeAbstract 
{
	public abstract class Shape{
		public abstract double calculateArea();
	}
	public class Circle extends Shape{
		double radius;
		public Circle(double radius) {
			this.radius=radius;
		}
		public double calculateArea() {
			return Math.PI*radius*radius;
		}
	}
	public class Rectangle extends Shape{
		double length;
		double breadth;
		public Rectangle(double length, double breadth) {
			this.length=length;
			this.breadth=breadth;
		}
		public double calculateArea() {
			return length*breadth;
		}
	}
	public class Triangle extends Shape{
		double base;
		double height;
		public Triangle(double base,double height) {
			this.base=base;
			this.height=height;
		}
		public double calculateArea() {
			return 0.5*base*height;
		}
	}
    public static void main( String[] args )
    {
    	ShapeAbstract app = new ShapeAbstract();
        Shape circle=app.new Circle(7.0);
        Shape rectangle=app.new Rectangle(5,2);
        Shape triangle=app.new Triangle(5,2);
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
