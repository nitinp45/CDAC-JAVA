package com.demo.test;

import com.demo.beans.Course;
import com.demo.exception.CourseNotFoundException;
import com.demo.exception.DuplicateCourseFoundException;
import com.demo.exception.SmallDurationException;
import com.demo.service.CourseService;
import com.demo.service.CourseServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class TestCourseClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int choice=0;
		CourseService cs=new CourseServiceImpl();
		
		
		do {
			System.out.println("1. add new course\n2. delete course\n3. update course\n4. display all");
			System.out.println("5. display by name\n6. display based on duration\n7. display in sorted order of course name\n8. display in sorted order of duration\n9.exit\nchoice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1->{
						try {
						boolean status=cs.addNewCourse();
						System.out.println(status);
						if(status) {
							System.out.println("Added Sucessfully!");
						}
						}catch(DuplicateCourseFoundException e)
						{
							System.out.println(e.getMessage());
						}
			} 
			case 2->{
						try {
						System.out.println("Enter course name:");
						String cname=sc.next();
						boolean status=cs.deleteCourse(cname);
						if(status)
						{
							System.out.println("Deleted Sucessfully!");
						}
						}catch(CourseNotFoundException e)
						{
							
							System.out.println(e.getMessage());
						}
						
			} 
			case 3->{	
						try {
						System.out.println("Enter courrse name:");
						String cname=sc.next();
						boolean status=cs.updateCourse(cname);
						if(status)
						{
							System.out.println(" Sucessfully!");
						}
						}catch(CourseNotFoundException e)
						{
							
							System.out.println(e.getMessage());

						}
			} 
			case 4->{
						 Map<String,Course> lmap=cs.displayAll();
						 Set<String> s=lmap.keySet();
						 for(String str:s)
						 {
							 System.out.println(str+"--"+lmap.get(str));
						 }
					 
			} 
			case 5->{
						try {
						System.out.println("Enter Course Name");
						String cname=sc.next();
						Course clist=cs.displayByName(cname);
						if(clist!=null)
						{
							System.out.println(clist);
						}else {
							System.out.println("Not found");
						}
						}catch(CourseNotFoundException e)
						{
							
							System.out.println(e.getMessage());

						}
					} 
			case 6->{
						try
						{
						System.out.println("Enter Duration: ");
						int cdur=sc.nextInt();
						List<Course> dlist=cs.displayByDuration(cdur);
						if(dlist!=null)
						{
							System.out.println(dlist);
						}
						}catch(SmallDurationException e)
						{
							System.out.println(e.getMessage());
						}
					} 
			case 7->{

						 Map<String, Course> lc=cs.sortByName();
						 Set<String> s=lc.keySet();
						 for(String str:s)
						 {
							 System.out.println(str+"--"+lc.get(str));
						 }
				 
			} 
			case 8->{
						 List<Course> lc=cs.sortByDuration();
						 System.out.println(lc);
			}
			case 9->{
						System.out.println("ThankYou for visiting....");
						sc.close();
			}
			default->{
				System.out.println("Enter Valid Choice");
			}
			}
		}while(choice!=9);
	
	
	}

}
