package com.SessionPackage;

public class Overloading {
	//Constructor overloading 
	
	public Overloading() {
		System.out.println("Hello");
	};
	public Overloading(int a, int b) {
		System.out.println("Hello, total = "+ a*b);
	};
	
	//method overloading 
	
	public int add(int a, int b) {
		return a+b;
	};
	public int add(int a, int b,int c) {
		return a+b+c;
	};
	
	public static void main(String[] args) {
		Overloading exp1 = new Overloading();
		Overloading exp2 = new Overloading(10,20);
		
		System.out.println(exp1.add(1,2));
		System.out.println(exp2.add(1,2,3));
	}
	
}
