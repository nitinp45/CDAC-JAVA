package com.demo.thread;

import com.demo.beans.MyClass;

public class SumOfDigits implements Runnable{
	
	private MyClass ob1;
	
	private int num;

	public SumOfDigits(MyClass ob1, int num) {
		super();
		this.ob1 = ob1;
		this.num = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		ob1.SumOfDigits(num);
		
	}
	

}
