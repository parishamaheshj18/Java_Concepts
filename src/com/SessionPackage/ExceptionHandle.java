package com.SessionPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandle {
	public static void main(String[] args) {
		ExceptionHandle exp = new ExceptionHandle();
		//exp.add(12,23); // Would give an error because method added with throw exception
		
		try {
			FileInputStream fs = new FileInputStream("test.txt");
			//throw new RuntimeException();
			//int e =10;
			exp.add(3, 2);
			//int a =10;
			//int b= 0;
			//int c = a/b;
			
		}
		catch(ArithmeticException | NullPointerException ex) {
			System.out.println("Error!");
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(UserDefinedException e) {
			
		}
		catch(Exception e) {
			System.out.println("Super Exception happened.");
		}
		finally {
			System.out.println("!!!!!!!!!");
		}
		
		
	}
	public int add(int a, int b) throws Exception{
		int c = a+b;
		return c;
	}
}
