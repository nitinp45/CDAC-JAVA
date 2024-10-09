package com.beans;

abstract public class Shape {
	
	private String color;

	public Shape() {
		super();
	}

	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
	protected void m1() {
		System.out.println("in shape m1()");
	}
	public  void m2() {
		System.out.println("in shape m2()");
	}
	
	abstract public float calcArea();
	
	abstract public float calcPerimeter();

}
