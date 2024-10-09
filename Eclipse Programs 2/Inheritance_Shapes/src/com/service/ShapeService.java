package com.service;
import java.util.Scanner;

import com.beans.Circle;
import com.beans.Rectangle;
import com.beans.Shape;
import com.beans.Triangle;

public class ShapeService {
	static Shape[] sarr;
	static int cnt;
	static {
		sarr=new Shape[10];
		cnt=0;
	}
	

	public static void acceptData(int choice) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter color");
			String color=sc.next();
			switch(choice) {
			case 1:
				System.out.println("enter base");
				float b=sc.nextFloat();
				System.out.println("enter height");
				float h=sc.nextFloat();
				System.out.println("enter side1");
				float s1=sc.nextFloat();
				System.out.println("enter side2");
				float s2=sc.nextFloat();
				sarr[cnt]=new Triangle(color,b,h,s1,s2);
				break;
			case 2:
				System.out.println("enter radius");
				float r=sc.nextFloat();
				sarr[cnt]=new Circle(color,r);
				break;
			case 3:
				System.out.println("Enter Length: ");
				float length=sc.nextFloat();
				System.out.println("Enter Breadth: ");
				float breadth=sc.nextFloat();
				sarr[cnt]=new Rectangle(color,length,breadth);
				break;
			}
			cnt++;
		
	}


	public static void calculateDetails(int i) {
		System.out.println("Area of circle:"+sarr[i].calcArea());
		System.out.println("Perimeter of circle:"+sarr[i].calcPerimeter());
		System.out.println("Area of Triangle:"+sarr[i].calcArea());
		System.out.println("Perimeter of Triangle:"+sarr[i].calcPerimeter());
		System.out.println("Area of Rectangle:"+sarr[i].calcArea());
		System.out.println("Perimeter of Rectangle:"+sarr[i].calcPerimeter());
		
	}


	public static Shape[] getAllShapes() {
		// TODO Auto-generated method stub
		return sarr;
	}

}
