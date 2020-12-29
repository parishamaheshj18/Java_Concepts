package com.SessionPackage;


public class Singleton{
	/**
	 * Approach 1
	 */
	/*private static Singleton t = new Singleton();
	private Singleton() {
		
	}
	
	public static Singleton getTest() { //public factory method 
		return t;
	}
	
	*/
	
	/**
	 * Approach 2
	 */
	private static Singleton t = null;
	
	private Singleton() {
		System.out.println("Hello");
		
	}
	public static Singleton getTest() {
		if(t == null){
			t = new Singleton();}
		return t;	
	}
	public static void main(String[] args) {
		Singleton t_1 = Singleton.getTest();
		Singleton t_2 = Singleton.getTest();
		

	}
	
}
