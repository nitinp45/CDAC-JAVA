package com.beans;

import java.time.LocalDate;

public class Faculty extends Person {
	private String special_subject;

	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Faculty(int id, String name, String address, LocalDate bdate,String special_subject) {
		super(id,name,address,bdate);
		this.special_subject = special_subject;
	}

	public String getSpecial_subject() {
		return special_subject;
	}

	public void setSpecial_subject(String special_subject) {
		this.special_subject = special_subject;
	}

	@Override
	public String toString() {
		return super.toString()+"Faculty [special_subject=" + special_subject + "]";
	}

	
	
	

}
