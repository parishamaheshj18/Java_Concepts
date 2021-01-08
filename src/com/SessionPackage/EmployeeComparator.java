package com.SessionPackage;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	public int compare(Employee obj, Employee obj1) {
		// TODO Auto-generated method stub
		return obj.getAge() - obj1.getAge();
	}
	
	
	
}
