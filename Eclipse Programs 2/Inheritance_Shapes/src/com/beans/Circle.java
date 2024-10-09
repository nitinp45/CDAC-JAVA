package com.beans;

public class Circle extends Shape {
	 private float radius;
	 static final float pi=3.142f;

	public Circle() {
		super();
	}

	public Circle(String c,float radius) {
		super(c);
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	public float calcArea() {
		return pi*radius*radius;
	}
	public float calcPerimeter() {
		return 2*pi*radius;
	}

	@Override
	public String toString() {
		return super.toString()+"Circle [radius=" + radius + "]";
	}
	 
}
