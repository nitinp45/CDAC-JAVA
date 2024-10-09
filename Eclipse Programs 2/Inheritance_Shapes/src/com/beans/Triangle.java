package com.beans;

public class Triangle extends Shape {
	private float base,height,s1,s2;

	public Triangle() {
		super();
	}

	public Triangle(String c,float base, float height, float s1, float s2) {
		super(c);
		this.base = base;
		this.height = height;
		this.s1 = s1;
		this.s2 = s2;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getS1() {
		return s1;
	}

	public void setS1(float s1) {
		this.s1 = s1;
	}

	public float getS2() {
		return s2;
	}

	public void setS2(float s2) {
		this.s2 = s2;
	}
	public void m1() {
		System.out.println("in Triangle m1()");
	}
	public float calcArea() {
		return 0.5f*base*height;
	}
	@Override
	public float calcPerimeter() {
		return base+s1+s2;
	}
	public void m2() {
		System.out.println("in shape m2()");
	}

	@Override
	public String toString() {
		return super.toString()+"Triangle [base=" + base + ", height=" + height + ", s1=" + s1 + ", s2=" + s2 + "]";
	}

}
