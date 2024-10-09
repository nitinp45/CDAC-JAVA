package com.TestService;
import java.util.Scanner;

import com.beans.Circle;
import com.beans.Shape;
import com.beans.Triangle;
import com.service.ShapeService;
public class TestShape {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int choice=0;
		for(int i=0;i<5;i++) {
		  System.out.println("1. Triangle\n2 Circle\n3. Rectangle\n choice: ");
		  choice=sc.nextInt();
		  ShapeService.acceptData(choice);
		}
		for(int i=0;i<5;i++)
		{
			ShapeService.calculateDetails(i);
		}
		//ShapeService.calculateDetails(0);
		int cnttri=0,cntcri=0,cntrec=0;
		Shape[] sarr=ShapeService.getAllShapes();
		
		for(int i=0;i<sarr.length;i++)
		{
			if(sarr[i]instanceof Triangle) {
				cnttri++;
			}else if(sarr[i]instanceof Circle) {
				cntcri++;
			}else {
				cntrec++;
			}
		}
		System.out.println("Triangle Count: "+cnttri);
		System.out.println("Circle Count: "+cntcri);
		System.out.println("Rectangle Count: "+cntrec);
		
	}	
}
