package com.demo.service;

import java.util.List;
import java.util.Map;

import com.demo.beans.Course;
import com.demo.exception.CourseNotFoundException;
import com.demo.exception.DuplicateCourseFoundException;
import com.demo.exception.SmallDurationException;

public interface CourseService {

	boolean addNewCourse() throws DuplicateCourseFoundException;

	Map<String, Course> displayAll();

	boolean deleteCourse(String cname) throws  CourseNotFoundException;

	boolean updateCourse(String cname) throws CourseNotFoundException;

	Course displayByName(String cname) throws CourseNotFoundException;

	List<Course> displayByDuration(int cdur) throws SmallDurationException;

	Map<String, Course> sortByName();

	List<Course> sortByDuration();

	

}
