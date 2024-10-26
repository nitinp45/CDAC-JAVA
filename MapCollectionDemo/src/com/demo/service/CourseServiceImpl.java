package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import com.demo.beans.Course;
import com.demo.dao.CourseDao;
import com.demo.dao.CoursedaoImpl;
import com.demo.exception.CourseNotFoundException;
import com.demo.exception.DuplicateCourseFoundException;
import com.demo.exception.SmallDurationException;

public class CourseServiceImpl implements CourseService {
	private CourseDao cdao;
	public CourseServiceImpl() {
		cdao=new CoursedaoImpl();
	}
	@Override
	public boolean addNewCourse() throws DuplicateCourseFoundException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Course Name: ");
		String cname=sc.next();
		System.out.println("Enter Course Duration: ");
		int cdur=sc.nextInt();
		System.out.println("Enter Course capacity: ");
		int cap=sc.nextInt();
		System.out.println("Enter Course Fees:");
		double fees=sc.nextDouble();
		Course c=new Course(cname,cdur,cap,fees);
		return cdao.saveCourse(c);
		
	}
	@Override
	public Map<String, Course> displayAll() {
		return cdao.getAll();
	}
	@Override
	public boolean deleteCourse(String cname) throws CourseNotFoundException {
		return cdao.removeCourse(cname);
	}
	@Override
	public boolean updateCourse(String cname) throws CourseNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Course Duration: ");
		int cdur=sc.nextInt();
		System.out.println("Enter Course capacity: ");
		int cap=sc.nextInt();
		System.out.println("Enter Course Fees:");
		double fees=sc.nextDouble();
		return cdao.update(cname,cdur,cap,fees);
	}
	@Override
	public Course displayByName(String cname) throws CourseNotFoundException {
		return cdao.getName(cname);
	}
	@Override
	public List<Course> displayByDuration(int cdur) throws SmallDurationException {
		return cdao.getDuration(cdur);
	}
	@Override
	public Map<String, Course> sortByName() {
		
		return cdao.sortByName();
	}
	@Override
	public List<Course> sortByDuration() {
		// TODO Auto-generated method stub
		return cdao.sortByDuration();
	}
	

}
