package com.demo.beans;

public class Course implements Comparable<Course>{
private String ename;
private double fees;
private int capacity;
private int duration;
public Course() {
	super();
}
public Course(String ename, double fees, int capacity, int duration) {
	super();
	this.ename = ename;
	this.fees = fees;
	this.capacity = capacity;
	this.duration = duration;
}

public void m1(int x) {
	System.out.println("In method m1 "+x);
}

public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
@Override
public String toString() {
	return "Course [ename=" + ename + ", fees=" + fees + ", capacity=" + capacity + ", duration=" + duration + "]";
}
@Override
public int compareTo(Course o) {
	// TODO Auto-generated method stub
	System.out.println("in compareTo method of Course "+this.ename+"-----"+o.ename);
	return this.duration-o.duration;
}

}
