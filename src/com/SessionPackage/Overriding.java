package com.SessionPackage;

public class Overriding extends Overloading{
	//Method is overridden
	public int add(int a, int b) {
		return a*b;
	};
	
	public static void main(String[] args) {
		Overriding exp1 = new Overriding();
		
		System.out.println(exp1.add(1,2));
		System.out.println(exp1.add(1,2,3));
	}
}
