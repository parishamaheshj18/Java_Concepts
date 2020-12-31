package com.AssignmentPackage;

public class Assignment1 {
	/**
	 * Prints multiplication table of input integer
	 * @param a
	 */
	public void table(int a) {
		for(int i=1;i<110000000;i++) {
			System.out.println(a + " * " + i +" = " + a*i);
		}
		
	}
	
	public static void main(String[] args) {
		Assignment1 app = new Assignment1();
		//System.out.println("Enter a number");
		//Scanner a = new Scanner(System.in);
		//int num = a.nextInt();
		app.table(73);
	}
}
