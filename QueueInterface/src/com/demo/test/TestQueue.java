package com.demo.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {
		Queue<Integer> q=new PriorityQueue<>();
		
		q.add(12);
		q.add(3);
		q.add(16);
		q.add(4);
		
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());


	}

}
