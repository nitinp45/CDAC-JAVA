package com.demo.test;

import com.demo.beans.Storage;
import com.demo.threads.Producer;
import com.demo.threads.Consumer;

public class TestStorage {
	public static void main(String[] args) {
		Storage s = new Storage();
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		
		p.start();
		c.start();
	}
}
