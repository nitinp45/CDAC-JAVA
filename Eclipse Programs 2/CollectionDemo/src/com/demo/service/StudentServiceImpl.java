package com.demo.service;

import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {

	private StudentDao stdao;

	public StudentServiceImpl() {
		super();
		stdao=new StudentDaoImpl();
	}

	@Override
	public void addNewStudent(int ch) {
		stdao.addNStudent(ch);
		
	}

	@Override
	public void displayAll() {
		stdao.displayA();
		
	}


	
}
