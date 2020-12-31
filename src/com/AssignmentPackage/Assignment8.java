package com.AssignmentPackage;

public class Assignment8 {
	public void operate(int[] arr, int target) {
		for(int i=0;i< arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+", "+arr[j]);
					
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		Assignment8 exp = new Assignment8();
		int[] arr = {2, 10, 20, 17, 6, 5};
		exp.operate(arr,22);
		
	}
}
