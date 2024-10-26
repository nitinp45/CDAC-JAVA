package com.demo.test;

import com.demo.thread.PrintTable;
import com.demo.thread.SumOfDigits;
import com.demo.beans.MyClass;

public class MultithreadingDemo {

	public static void main(String[] args) {
		MyClass ob1=new MyClass();
		
		PrintTable th1=new PrintTable(ob1, 5);
		PrintTable th2=new PrintTable(ob1, 7);
		SumOfDigits th3=new SumOfDigits(ob1, 723);
		Thread t=new Thread(th3);
		
		
		th1.start();
		th2.start();
		t.start();
		th1.setPriority(th1.MAX_PRIORITY);
		th2.setPriority(th2.MIN_PRIORITY);
		
//		System.out.println("kjghhgfv"+th2.getPriority());

		try {
			th1.join();
			th2.join(200);
			th1.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
