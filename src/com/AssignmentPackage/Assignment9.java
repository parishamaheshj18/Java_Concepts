package com.AssignmentPackage;

final class Assignment9 {
	private int var;
	Assignment9 (int var){
		this.var= var;
	}
	
	public Assignment9 modify(int var) {
		if(this.var==var) {
			return this;
		}
		else {
			return new Assignment9(var);
		}
	}
	
	public static void main(String[] args) {
		Assignment9 exp = new Assignment9(10);
		Assignment9 exp1 = exp.modify(100);
		Assignment9 exp2 = exp.modify(10);
		System.out.println("exp Hashcode: "+ exp.hashCode());
		System.out.println("exp1 Hashcode:"+exp1.hashCode());
		System.out.println("exp2 Hashcode:"+exp2.hashCode());

	}
}
