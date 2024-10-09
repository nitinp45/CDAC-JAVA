package com.beans;

public class MyClass<T> {
	private T content;

	public MyClass() {
		super();
	}

	public MyClass(T content) {
		super();
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public void displayContent()
	{
		System.out.println("Content:"+content);
	}
}
