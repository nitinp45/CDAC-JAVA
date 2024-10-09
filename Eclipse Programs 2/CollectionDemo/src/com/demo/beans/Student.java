package com.demo.beans;

import java.time.LocalDate;
import java.util.Arrays;

public class Student extends Person {
	int[] marks=new int[2];

	public Student(int id, String name, String address, LocalDate bdate, int[] marks) {
		super(id,name,address,bdate);
		this.marks = marks;
	}
	

	public int[] getMarks() {
		return marks;
	}


	public void setMarks(int[] marks) {
		this.marks = marks;
	}


	public Student() {
		super();
	}

	@Override
	public String toString() {
		return super.toString()+"Student [marks=" + Arrays.toString(marks) + "]";
	}
	

}
