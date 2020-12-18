package com.SessionPackage;

public final class Static_Final {
	public static int id;
	
	public void change() {
		int count = id;
		id++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		Static_Final exp = new Static_Final();
		exp.change();
		Static_Final exp1 = new Static_Final();
		exp1.change();
	}
	
}

