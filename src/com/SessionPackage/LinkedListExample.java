package com.SessionPackage;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		
		 /**
		  * Best operation for insertion and deletion
		  * 1) Duplication is allowed
		  * 2) Insertion order is preserved
		  */
		LinkedList<String> exp = new LinkedList<>();
		exp.add("First");
		exp.add("Second");
		exp.add("Third");
		exp.add("First");
		
		System.out.println(exp);
		
		//Enhanced For Loop
		for(String value:exp) {
			System.out.println(value);
		}
		
		
	}
}

/*Notes:
 * 4 Ways to retrieve elements : Iterator(Not Pref), For loop, Enhanced For loop(Pref), Stream(Pref)
 * */
 