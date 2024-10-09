package com.service;
import java.util.Scanner;
import com.beans.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.beans.Faculty;
import com.beans.GraduateStudent;
import com.beans.MasterStudent;
import com.beans.Person;


public class ImplemementService {
	static Person[] parr;
	static Student[] sarr;
	static int pcnt;
	static int scnt;
	
	static {
		sarr=new Student[50];
		parr=new Person[50];
		parr[0]=new Student(1,"Rohan","sangli",LocalDate.of(2003, 12, 05),new int[] {82,84});
		sarr[0]=new GraduateStudent(12, "Manjiri", "Pune", LocalDate.of(2000, 01, 03), new int[] {88,87},89);
    	sarr[1]=new GraduateStudent(13, "ketan", "Pune", LocalDate.of(1999, 02, 13), new int[] {78,75},77);
    	sarr[2]=new MasterStudent(14, "Rohit", "Mumbai", LocalDate.of(2002, 01, 03), new int[] {88,87},"accounts","BTech",89);
    	parr[1]=new Faculty(2,"om","jalgaon",LocalDate.of(2010, 01, 03),"Python");
    	scnt=3;
        pcnt=2;	
	}
	
	public static void addNewData(int ch) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:");
		int sid=sc.nextInt();
		
		System.out.println("Enter name:");
		String sname=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter address:");
		String address=sc.nextLine();
		
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
				sarr[scnt++]=new GraduateStudent(sid, sname, address, ldt, mks, marks);
			}
			else if(ch==2){
				System.out.println("Enter of theisis subject:");
				String thesissub=sc.next();
				
				System.out.println("Enter degree:");
				String degree=sc.next();
				
				System.out.println("Enter of theisis subject marks:");
				int tmarks=sc.nextInt();
				sarr[scnt++]=new MasterStudent(sid, sname, address, ldt, mks, thesissub, degree, tmarks);
				
			}
			
		}
		else {
			System.out.println("Enter the special subject:");
			String sp_subject=sc.next();
			
			parr[pcnt++]=new Faculty(sid,sname,address,ldt,sp_subject);
		}

	
		
	}
	public static Person[] displayAll() {
		return parr;
		
	}
	public static boolean deleteStudentById(int id) {
		// TODO Auto-generated method stub
		for(Person p:parr)
		{
			if(p!=null)
			{
				if(p.getId()==id)
				{
					for(int i=0;i<pcnt;i++)
					{
						for(int j=0;j<pcnt;j++)
						{
							parr[j]=parr[j+1];
							
						}
						pcnt--;
						return true;
					}
				}
			}
		}
		return false;
	}
	

}
