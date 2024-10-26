package com.demo.beans;

public class Course {
private String cname;
private int duration;
private int capacity;
private double fees;
public Course() {
	super();
}
public Course(String cname, int duration, int capacity, double fees) {
	super();
	this.cname = cname;
	this.duration = duration;
	this.capacity = capacity;
	this.fees = fees;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
@Override
public String toString() {
	return "Course [cname=" + cname + ", duration=" + duration + ", capacity=" + capacity + ", fees=" + fees + "]";
}


}
