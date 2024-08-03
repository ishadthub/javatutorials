package com.javapractice;

public class Student {

	int rollNo;
	int age;
	
	public void display1() {
		System.out.println("Welcome to all of you");
	}
	
	public void display2() {
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		Student isha = new Student();
		isha.rollNo = 20;
		isha.age = 33;
		System.out.println(isha.rollNo);
		System.out.println(isha.age);
		isha.display1();
		isha.display2();

	}

}	
