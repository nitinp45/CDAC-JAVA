package com.demo.tests;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestMap {

	public static void main(String[] args) {
		List<Integer> lst = List.of(12,10,24,34,5,6,9,44,18,15);
		
//		List<Integer> l=lst.stream().map(num->num*5).collect(Collectors.toList());
//		System.out.println(l);
		Optional<Integer> l1=lst.stream().filter(num->num%5==0).findFirst();
		Optional<Integer> l2=lst.stream().filter(num->num%5==0).findAny();
		if(l1.isPresent())
		{
			System.out.println(l1.get());
		}
		else {
			System.out.println("Not found");
		}
		
		//List<Integer> l=lst.stream().map(num->num*5).collect(Collectors.toList());
//		System.out.println(l);

	}

}
