package com.demo.beans;

public class MyClass {
	
	synchronized public void PrintTable(int num) {
		for(int i=1 ; i<=10 ; i++) {
			System.out.println(num*i);
		}
	}
	
	  synchronized public void SumOfDigits(int num) {
		int sum=0;
		while(num!=0)
		{
			int r=num%10;
			sum+=r;
			num=num/10;
			
		}
		System.out.println("sum is="+sum);
	}

}
