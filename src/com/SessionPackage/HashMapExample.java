package com.SessionPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer,String> hsValue = new HashMap<>();
		hsValue.put(2, "Hello");
		hsValue.put(3, "There");
		hsValue.put(30, "World");
		//hsValue.put("Key1", 10); won't work
		hsValue.put(3, "dfhbv");
		System.out.println(hsValue.get(3));
		System.out.println(hsValue);
		
		System.out.println("------Approach 1------");
		Set<Map.Entry<Integer, String>> setValue = hsValue.entrySet();
		
		for(Map.Entry<Integer, String> val : setValue) {
			System.out.println(val.getKey() +":"+ val.getValue());
			
		}
		
		System.out.println("------Approach 2------");
		Set<Integer> keys = hsValue.keySet();
		for(Integer val : keys) {
			System.out.println(val + ":" + hsValue.get(val));
		}
	}
}
