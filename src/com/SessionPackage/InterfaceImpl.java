package com.SessionPackage;

public class InterfaceImpl implements InterfaceExample{

	
	public int run() {
		// TODO Auto-generated method stub
		System.out.println("Running");
		return 0;
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("Greeting");
		
	}
 
	public static void main(String[] args) {
		InterfaceImpl person = new InterfaceImpl();
		person.run();
	}

	
}
