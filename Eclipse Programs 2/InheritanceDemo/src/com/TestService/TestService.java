package com.TestService;
import java.util.Scanner;

import com.beans.Person;
import com.beans.Student;
import com.service.ImplemementService;
public class TestService {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("1.Accept New Data");
			System.out.println("2.Delete Student");
			System.out.println("3.Update Marks");
			System.out.println("4.Display All Graduate Students");
			System.out.println("5.Display All Master Student");
			System.out.println("6.Find Grade");
			System.out.println("7.Display All");
			System.out.println("8.Accept Data");
			System.out.println("9.Exit");
			System.out.println("Enter Choice: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("1. GraduateStudent \n 2. MasterStudent\n 3.Facutly\nchoice:");
				int ch=sc.nextInt();
				ImplemementService.addNewData(ch);
				break;
			case 2:System.out.println("Enter ID:");
			       int id = sc.nextInt();
			       boolean status = ImplemementService.deleteStudentById(id);
			       if(status)
			    	   System.out.println("Deleted sucessfully");
			       else
			    	   System.out.println("Not Found");
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
					Person[] p=ImplemementService.displayAll();
					for(Person p1:p)
					{
						if(p1!=null)
						{
							System.out.println(p1);
						}
					}
				break;
			case 8:
				break;
			case 9:System.out.println("Thanks for visiting...");
				   sc.close();
 				break;
			}	
		}while(choice!=9);		
		}
	}

