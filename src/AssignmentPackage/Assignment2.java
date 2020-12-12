package AssignmentPackage;

public class Assignment2 {
	/**
	 * This method prints half pyramid
	 * @param a
	 */
	public void star(int a) {
		for (int i =0; i<a+1 ; i++) {
			for(int j =0; j<i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Assignment2 app = new Assignment2();
		app.star(7);
	}
}
