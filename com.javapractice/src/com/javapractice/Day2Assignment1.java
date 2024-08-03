package com.javapractice;

public class Day2Assignment1 {
	
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
		Day2Assignment1 firstexp = new Day2Assignment1();
		int sumResult = firstexp.sum(10, 2);
		int multiResult = firstexp.multi(sumResult, 2);
		int subResult = firstexp.sub(multiResult, 2);
		int multiResult1 = firstexp.multi(subResult, 2);
		int finalResult = firstexp.div(multiResult1, 2);
		
		System.out.println("Final Result: " + finalResult);

	}

}
