package com.demo.beans;

import java.time.LocalDate;

public class Person {
	private int id;
	private String name;
	private String address;
	private LocalDate bdate;
	public Person() {
		super();
	}
	public Person(int id, String name, String address, LocalDate bdate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.bdate = bdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getBdate() {
		return bdate;
	}
	public void setBdate(LocalDate bdate) {
		this.bdate = bdate;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", bdate=" + bdate + "]";
	}
	
	
	

}
