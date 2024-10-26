package com.demo.test;

import java.util.Deque;
import java.util.ArrayDeque;

public class TestQueueByDequeue {

	public static void main(String[] args) {

		Deque<Integer> pq=new ArrayDeque<>();
		pq.add(12);
		pq.add(7);
		pq.add(1);
		pq.add(2);
		
		System.out.println(pq);
		
	}

}
