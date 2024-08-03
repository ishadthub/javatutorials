package com.javapractice;

public class Day2Assignment2 {
	
	public int sum(int a, int b) {
		int sum = a+b;
		return sum;
	}

	public int sub(int a, int b) {
		int sub = a-b;
		return sub;
	}
	
	public int div(int a, int b) {
		int div = a/b;
		return div;
	}
	
	public int multi(int a, int b) {
		int multi = a*b;
		return multi;
	}
	
	public static void main(String[] args) {
		Day2Assignment2 secondexp = new Day2Assignment2();
		int divResult = secondexp.div(10, 2);
		int subResult = secondexp.sub(divResult, 2);
		int multiResult = secondexp.multi(subResult, 2);
		int subResult1 = secondexp.sub(multiResult, 2);
		int sumResult = secondexp.sum(subResult1, 2);
		
		System.out.println("Final Result is: " + sumResult);
		
		

	}

}
