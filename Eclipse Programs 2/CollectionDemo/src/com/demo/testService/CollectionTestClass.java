package com.demo.testService;

import java.util.Scanner;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class CollectionTestClass {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		StudentService s=new StudentServiceImpl();
		int choice=0;
		do{
			System.out.println("1.Add new Student");
			System.out.println("2.Delete By stdID");
			System.out.println("3.Display All");
			System.out.println("4.Search by ID");
			System.out.println("5.Sort the stdList");
			System.out.println("6.exit");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:System.out.println("1. GraduateStudent \n 2. MasterStudent\n 3.Facutly\nchoice:");
						int ch=sc.nextInt();
						s.addNewStudent(ch);
						break;
				case 2:
						break;
				case 3:s.displayAll();
						break;
				case 4:
						break;
				case 5:
						break;
				case 6:sc.close();
					break;
			
			}
		}while(choice!=6);
	}

}
