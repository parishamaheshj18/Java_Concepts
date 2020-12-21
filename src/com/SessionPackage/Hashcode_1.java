package com.SessionPackage;


class First_class {
	public void add(int a, int b) {
		System.out.println(a+b);
	}
};

public class Hashcode_1 extends First_class {
	public static void main(String[] args) {
		//Hashcode_1 tt = new Hashcode_1();
		//System.out.println(tt.hashCode());
		String a = "Parisha";
		String b = "Parisha";
		String c = new String("Parisha");
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
		
		
		if (a==b) {
			System.out.println("a and b equal");
		}
		if (a.equals(c)) {
			System.out.println("a and c equal");
		}
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" There");
		System.out.println(sb);
		
		
	}
}
