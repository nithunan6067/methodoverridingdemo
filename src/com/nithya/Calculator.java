package com.nithya;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return add(a,b) + c;
	}
	
	public int add(int a, int b, int c, int d) {
		return add(a,b,c) + d;
	}
	
	public double add (double a, double b) { 
		return a + b;
	}
	
	public double add (double a, double b, double c) { 
		return a + b + c;
	}
}
