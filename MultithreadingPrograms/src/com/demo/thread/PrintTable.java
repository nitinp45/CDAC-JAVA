package com.demo.thread;

import com.demo.beans.MyClass;

public class PrintTable extends Thread{
	//multithreading demo
	private MyClass ob;
	private int num;
	public PrintTable(MyClass ob, int num) {
		super();
		this.ob= ob;
		this.num=num;
	}
	public void run() {
		ob.PrintTable(num);
	}
	
	

}
