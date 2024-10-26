package com.demo.beans;

public class Employee {
	private int eid;
	private String name;
	private double sal;
	private double bonus;
	public Employee() {
		super();
	}
	public Employee(int eid, String name, double sal, double bonus) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
		this.bonus = bonus;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + ", bonus=" + bonus + "]";
	}
	
	
	
	
}
