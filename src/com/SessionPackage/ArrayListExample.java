package com.SessionPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListExample {

	public static void main(String[] args) {
		//Collection is the root interface Collections is the utility class

		/**
		 * Arraylist good for frequent retrieval
		 * 1) Resizable or growable array
		 * 2) Random Access interface : Retrieval time same for every element
		 */
		ArrayList exp = new ArrayList();
		exp.add(3);
		exp.add(2);
		exp.add(11);
		
		Collections.sort(exp);
		System.out.println(exp);
		
		ArrayList<Employee> arr = new ArrayList<>();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.setName("aaabc");
		emp1.setAge(63);
		emp2.setName("aahc");
		emp2.setAge(33);
		
		arr.add(emp1);
		arr.add(emp2);
		 
		//Collections.sort(arr,new EmployeeComparator());
		Collections.sort(arr,new Comparator<Employee>() {
			
			public int compare(Employee obj1, Employee obj2) {
				// TODO Auto-generated method stub
				return obj1.getName().compareTo(obj2.getName());
			}
			
		}
		);
		for(Employee emps : arr) {
			System.out.println(emps.getName());
		}
		
		
		
		
	}

}
