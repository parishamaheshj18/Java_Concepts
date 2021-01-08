package com.SessionPackage;

public class Employee implements Comparable<Employee>{
	String name;
	Integer age;
	/*Employee(String name , Integer age){
		this.setAge(age);
		this.setName(name);
	}*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public int compareTo(Employee obj) {
		
		//return this.getAge() - obj.getAge();
		/* if(this.getAge() > obj.getAge()) {
			return -1;
		}else if(this.getAge() < obj.getAge()){
			return 1;
		}else{
			return 0;
		}*/
		
		return this.getName().compareTo(obj.getName());
		
		
		
	}
	
}
