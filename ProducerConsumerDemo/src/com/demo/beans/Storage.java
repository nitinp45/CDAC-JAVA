package com.demo.beans;

public class Storage {
	private int n;
	private boolean valueset;
	public Storage() {
		super();
		valueset=false;
	}
	
	synchronized public void put(int num) {
		if(valueset) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("in put:"+ num);
		n=num;
		valueset=true;
		notify();
	}
	


synchronized public void get() {
	if(!valueset) {
		try {
			wait();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println("in get "+ n);
	valueset=false;
	notify();
}
}
