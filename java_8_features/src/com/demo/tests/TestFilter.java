package com.demo.tests;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFilter {
	public static void main(String[] args) {
		List<Integer> lst = List.of(12,24,34,5,6,9,44,18,15);
		Predicate<Integer> pl = (num)->{System.out.println(num);   //prdeicate is a interface it is used beacz without using lambda function we can filtered the result and it return true false.Here only the it checks the condition is true or false, and we can pass anywhere in filter function
		return num%2==0;};
		
		
		Stream s=lst.stream().filter(pl);   //here we use predicate with multiple streams
		s.forEach(System.out::println);
		
		
		
		//filter uses implicity predicate interface and filter is used to get list based on some condition
		//here we used lambda funtion in filter it also return true or false.
		
//		Stream s=lst.stream().filter((num)->{System.out.println("In filter"+num);
//		return num%2==0;
//		});
//		
//		
//		s.forEach(System.out::println);
		


	}

}
