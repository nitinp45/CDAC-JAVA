package com.beans;

public class Rectangle extends Shape{
	private float length,breadth;

	public Rectangle(String c, float length, float breadth) {
		super(c);
		this.length = length;
		this.breadth = breadth;
	}

	public Rectangle() {
		super();
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getBreadth() {
		return breadth;
	}

	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public float calcArea() {
		return length*breadth;
	}
	public float calcPerimeter() {
		return 2*(length*breadth);
	}

	@Override
	public String toString() {
		return super.toString()+"Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	

}
