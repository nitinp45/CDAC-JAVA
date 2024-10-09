package com.beans;

import java.time.LocalDate;

public class MasterStudent extends Student{
	private String thesissub,degree;
	private int thesismarks;
	
	
	public MasterStudent() {
		super();
		// TODO Auto-generated constructor satub
	}


	public MasterStudent(int id, String name, String address, LocalDate bdate, int[] marks, String thesissub,
			String degree, int thesismarks) {
		super(id, name, address, bdate, marks);
		this.thesissub = thesissub;
		this.degree = degree;
		this.thesismarks = thesismarks;
	}


	public String getThesissub() {
		return thesissub;
	}


	public void setThesissub(String thesissub) {
		this.thesissub = thesissub;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public int getThesismarks() {
		return thesismarks;
	}


	public void setThesismarks(int thesismarks) {
		this.thesismarks = thesismarks;
	}


	@Override
	public String toString() {
		return super.toString()+"MasterStudent [thesissub=" + thesissub + ", degree=" + degree + ", thesismarks=" + thesismarks + "]";
	}


	

}
