package com.javapractice;

public class ConstructorEx {

	public ConstructorEx()
	{   this(2, 3, 4);
		System.out.println("Default Constructor");
	}
	
	public ConstructorEx(int a) {
		this(2, 8);
		System.out.println("One parametrized Constructor");
	}
	
	public ConstructorEx(int a, int b) {
		this();
		System.out.println("Two parametrized Constructor");
	}
	
	public ConstructorEx(int a, int b, int c) {
		System.out.println("Three parametrized Constructor");
	}
	
	public static void main(String[] args) {
		
		ConstructorEx object = new ConstructorEx(1);
		// TODO Auto-generated method stub

	}

}
