package com.demo.test;

import java.util.Scanner;

import com.test.service.ArrayService;

public class TestDSA1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {12,4,2,1,5,6};
		int arr1[]= {311,212,3,1};
		ArrayService as=new ArrayService();
		int choice=0;
		do {
			System.out.println("1.Sequential search");
			System.out.println("2.Binary search");
			System.out.println("3.Find Factorial");
			System.out.println("4.Find sum of Prime number");
			System.out.println("5.Find 2nd maximum:");
			System.out.println("6.Find 2nd minimum:");
			System.out.println("7.exit");
			System.out.println("Enter choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1 ->{
					System.out.println("Enter no. to search:");
					int val=sc.nextInt();
					int ans=as.SearchBySequential(arr,val);
					if(ans!=-1)
					{
						System.out.println("Element found at="+ans);
					}
					else {
						System.out.println("Element not found");
					}
				}
				case 2->{
					System.out.println("Enter no. to search:");
					int val=sc.nextInt();
					int ans=as.BinarySearch(0,arr1.length-1,arr1,val);
					if(ans!=-1)
					{
						System.out.println("Element found at="+ans);
					}
					else {
						System.out.println("Element not found");
					}
				}
				
				case 3->{
					System.out.println("Enter Number: ");
					int num=sc.nextInt();
					int fact = as.Factorial(num);
					
					if(num>0) {
						System.out.println("Factorial of "+ num +" is "+fact);
					}
				}
				
				case 4->{
					int res=as.FindPrimeSum(arr);
					System.out.println(res);
				}
				case 5->{
					int smax=as.FindSecondMax(arr);
					System.out.println(smax);
				}
				case 6->{
					int smin=as.FindSecondMin(arr1);
					System.out.println(smin);
				}
			}
		}while(choice!=6);

	}

}
