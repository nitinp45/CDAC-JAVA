package com.demo.dao;

import java.util.List;
import java.util.Map;

import com.demo.beans.Course;
import com.demo.exception.CourseNotFoundException;
import com.demo.exception.DuplicateCourseFoundException;
import com.demo.exception.SmallDurationException;

public interface CourseDao {

	boolean saveCourse(Course c) throws DuplicateCourseFoundException;

	Map<String, Course> getAll();

	boolean removeCourse(String cname) throws CourseNotFoundException;

	boolean update(String cname, int cdur, int cap, double fees) throws CourseNotFoundException;

	Course getName(String cname) throws CourseNotFoundException;

	List<Course> getDuration(int cdur) throws SmallDurationException;

	Map<String,Course> sortByName();

	List<Course> sortByDuration();

	

}
