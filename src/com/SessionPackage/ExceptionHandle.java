package com.SessionPackage;

public class ExceptionHandle {
	public static void main(String[] args) {
		try {
			int a =10;
			int b= 0;
			//int c = a/b;
			Child exp = null;
			exp.add(12,23);
		}
		catch(ArithmeticException | NullPointerException exp) {
			System.out.println("Error!");
		}
		finally {
			System.out.println("!!!!!!!!!");
		}
		
	}
}
