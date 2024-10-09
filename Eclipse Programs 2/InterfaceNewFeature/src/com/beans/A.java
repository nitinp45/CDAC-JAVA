package com.beans;

public class A {
	private int x;

	public A() {
		super();
	}

	public A(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "A [x=" + x + "]";
	}
	

}
