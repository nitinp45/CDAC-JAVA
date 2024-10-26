package com.demo.tests;

import java.util.List;
import java.util.Optional;

import com.demo.beans.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> lst=List.of(new Employee(10,"omkar",34566,345),new Employee(11,"om",45444,445),new Employee(12,"Mrunal",556655,555));

		lst.stream().filter(emp->emp.getSal() > 4000).forEach(System.out::println);
		
		
	
	}

}
