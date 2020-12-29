package com.SessionPackage;

public class UserDefinedException extends RuntimeException {//extends Exception becomes CheckedException
	
	public UserDefinedException(String msg) {
		super(msg);
		
	}
	
}
