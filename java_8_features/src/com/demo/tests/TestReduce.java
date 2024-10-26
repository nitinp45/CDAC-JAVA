package com.demo.tests;

import java.util.List;
import java.util.Optional;

public class TestReduce {
	public static void main(String[] args) {
		List<Integer> lst = List.of(12,10,24,34,5,6,9,44,18,15);
		
		
		//reduce function is used to convert all list sequence into one particular result and it return optional object check handle nullpointer exception

		Optional<Integer> opt=lst.stream().reduce((acc,num)->acc+num);
		
		if(opt.isPresent())
		{
			System.out.println(opt.get());
		}
		else {
			System.out.println("Not found");
		}		
	}
}
