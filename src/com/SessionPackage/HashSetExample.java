package com.SessionPackage;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		/** Underlying data structure is HashTable
		 * 1) Duplication is not allowed
		 * 2) Insertion order is not preserved
		 */
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(34);
		hs.add(10);
		hs.add(100);
		for(Integer val : hs) {
			System.out.println(val);
		}
	}

}
