package com.AssignmentPackage;

public class Assignment3 {
	/**
	 * This method prints full pyramid
	 * 
	 * @param a
	 */
	public void star(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 1; j < n-i; j++) {

				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		Assignment3 app = new Assignment3();
		app.star(7);
	}
}