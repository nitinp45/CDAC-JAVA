package com.demo.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import com.demo.beans.GraduateStudent;
import com.demo.beans.MasterStudent;
import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao{
	
	private static ArrayList<Student> stdList;
	static {
		stdList=new ArrayList<>();
		stdList.add(new Student(1,"Rohan","sangli",LocalDate.of(2003, 12, 05),new int[] {82,84}));
		stdList.add(new GraduateStudent(12, "Manjiri", "Pune", LocalDate.of(2000, 01, 03), new int[] {88,87},89));
	}
	
	@Override
	public void addNStudent(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		
		sc.nextLine();
		System.out.println("Enter city:");
		String address=sc.next();
		
		System.out.println("enter birth date(dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		if(ch==1 || ch==2)
		{
			int mks[]=new int[2];
			System.out.println("Enter marks of m1:");
			mks[0]=sc.nextInt();
			System.out.println("Enter marks of m2:");
			mks[1]=sc.nextInt();
			if(ch==1)
			{
				System.out.println("Enter marks of speciaL SUBJECT:");
				int marks=sc.nextInt();
				stdList.add(new GraduateStudent(id, name, address, ldt, mks, marks));
			}
			else if(ch==2){
				System.out.println("Enter of theisis subject:");
				String thesissub=sc.next();
				
				System.out.println("Enter degree:");
				String degree=sc.next();
				
				System.out.println("Enter of theisis subject marks:");
				int tmarks=sc.nextInt();	
				stdList.add(new MasterStudent(id, name, address, ldt, mks, thesissub, degree, tmarks));
			}
		}	
	}


	@Override
	public void displayA() {
		//  ArrayList<Student> students = stdao.displayA();
	    for (Student student : stdList) {
	        System.out.println(student); // Assuming you have a meaningful toString() method in the Student class
	    }
		
	}	

}
