package com.SessionPackage;

public class Parent {
	
	protected void add(int a, int b) {
		System.out.println(a+b);
	}
	public int c = 10;

	public static void main(String[] args) {
		Parent parent1 = new Parent();
		parent1.add(2, 3);
		
	}

}

