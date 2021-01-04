package com.AssignmentPackage;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add("dfg");
		arr.add(90);
		
		Iterator itr = arr.iterator();
		System.out.println(itr.next());
		arr.stream().forEach(val -> {System.out.println(val);});
	}
}
