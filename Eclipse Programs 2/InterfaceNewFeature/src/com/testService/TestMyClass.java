package com.testService;

import com.beans.MyClass;
import com.services.Interface1;
import com.services.Interface2;

public class TestMyClass{

	public static void main(String[] args) {
		
		//this is Lambda expression which is used only with when there is only one abstract method in interface body
//		Interface1 obj=()->{
//			System.out.println("In m1 implementaion");
//		};
//		obj.m1();

		
		//this is anynomus class
//		Interface1 obj1=new Interface1() {
//			public void m1()
//			{
//				System.out.println("In m1 implementaion");
//			}
//			public void m2()
//			{
//				System.out.println("In m2 implementaion");
//			}
//		};
//		obj1.m1();
//		obj1.m2();
		
		
//		Interface2<Integer> c1=(a,b)->{
//			return a>b?a:b;
//		};
//		
//		int res=c1.findMax(12, 43);
//		System.out.println("The max value is="+res);
//		
//		Interface2<String> c2=(a,b)->{
//			return a.length()>b.length()?a:b;
//		};
//		String ans=c2.findMax("ketan", "Om");
//		System.out.println("The maximum string is:"+ans);
		
		MyClass<Integer> c3=new MyClass<>(12);
		
		c3.displayContent();
		
		MyClass<String> c4=new MyClass<>("Ketan");
		
		c4.displayContent();
	}


}
