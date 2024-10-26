package com.demo.dao;

import com.demo.beans.Course;
import com.demo.exception.CourseNotFoundException;
import com.demo.exception.DuplicateCourseFoundException;
import com.demo.exception.SmallDurationException;

import java.util.*;

public class CoursedaoImpl implements CourseDao {
	
	private static Map<String,Course> cmap;
	static {
		cmap=new HashMap<>();
		cmap.put("DAC", new Course("DAC",100,178,100000.0));
		cmap.put("IOT", new Course("IOT",110,128,10000.0));
		
	}
	
	@Override
	public boolean saveCourse(Course c) throws DuplicateCourseFoundException{
		Course c1=cmap.putIfAbsent(c.getCname(),c);
		if(c1==null)
			return true;
		throw new DuplicateCourseFoundException("Duplicate course found Exception");
			
	}
	
	@Override
	public Map<String, Course> getAll() {
		return cmap;
		
	}
	@Override
	public boolean removeCourse(String cname) throws CourseNotFoundException{
		Course c=cmap.get(cname);
		if(c==null) {

			throw new CourseNotFoundException("course not found Exception");
		}
		return cmap.remove(cname, cmap.get(cname));
		
	}
	@Override
	public boolean update(String cname, int cdur, int cap, double fees) throws CourseNotFoundException {
		Course c=cmap.get(cname);
		if(c!=null)
		{
			c.setCapacity(cap);
			c.setDuration(cdur);
			c.setFees(fees);
			return true;
		}
		throw new CourseNotFoundException("course not found Exception");
		
	}
	@Override
	public Course getName(String cname) throws CourseNotFoundException {
		Course c=cmap.get(cname);
		if(c!=null)
		{
			return c;
		}
		throw new CourseNotFoundException("course not found Exception");
	}
	@Override
	public List<Course> getDuration(int cdur) throws SmallDurationException {
		Set<Map.Entry<String, Course>> ds=cmap.entrySet();
		List<Course> clist=new ArrayList<>();
		for(Map.Entry<String, Course>map:ds) {
			if(map.getValue().getDuration()>= cdur) {
				clist.add(map.getValue());
				
			}
			else {
				throw new SmallDurationException("Small duration are found");
			}
			
		}
		return clist;
		
	}

	
	
	
	@Override
	public Map<String, Course> sortByName() {
//		Comparator<Course> obj=(c1,c2)->{
//			return c1.getCname() - c2.getCname();
//		};
//		List<Course> lst=new ArrayList<>();
//		Set<String> cset=cmap.keySet();
//		for(String course:cset) {
//			lst.add(cmap.get(course));
//			
//		}
//		
//		lst.sort(obj);
//		return lst;
		
		Map<String,Course> tmap=new TreeMap<>();
		Set<String> c=cmap.keySet();
		for(String str:c)
		{
			tmap.put(str, cmap.get(str));
		}
		return tmap;
	}
	@Override
	public List<Course> sortByDuration() {
		Comparator<Course> obj=(c1,c2)->{
			return c1.getDuration() - c2.getDuration();
		};
		List<Course> lst=new ArrayList<>();
		Set<String> cset=cmap.keySet();
		for(String course:cset) {
			lst.add(cmap.get(course));
			
		}
		
		lst.sort(obj);
		return lst;
		
	}
	
	
	

}
